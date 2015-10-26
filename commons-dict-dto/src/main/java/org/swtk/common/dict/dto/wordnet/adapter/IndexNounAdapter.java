package org.swtk.common.dict.dto.wordnet.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.swtk.common.dict.dto.wordnet.IndexNoun;

import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.type.EngGrammarUpperType;
import com.trimc.blogger.commons.utils.SetUtils;
import com.trimc.blogger.commons.utils.string.StringUtils;

public final class IndexNounAdapter {

	public static String toString(IndexNoun bean) {
		StringBuilder sb = new StringBuilder();

		sb.append("term = " + bean.getTerm());
		sb.append(", pos = " + bean.getUpperType());
		sb.append(", synset-count = " + bean.getSynsetCount());
		sb.append(", IDs = " + StringUtils.toString(bean.getIds(), ";"));

		return sb.toString();
	}

	public static IndexNoun transform(String line) throws AdapterValidationException {

		try {

			/*  Index File Format:
			 * 		<https://wordnet.princeton.edu/man/wndb.5WN.html>
			 * 		lemma  pos  synset_cnt  p_cnt  [ptr_symbol...]  sense_cnt  tagsense_cnt   synset_offset  [synset_offset...]	*/
			String[] tokens = line.split(" ");
			String lemma = tokens[0];
			String pos = tokens[1];
			String synsetCnt = tokens[2];

			/*	there can be multiple synsetOffset values
			 * 	each value is 8 chars long
			 * 	the list starts at the end of the array	*/
			List<String> list = new ArrayList<String>();
			for (int i = tokens.length - 1; i >= 0; i--) {
				if (8 == tokens[i].length()) list.add(tokens[i]);
				else break;
			}

			return transform(lemma, pos, synsetCnt, list);

		} catch (AdapterValidationException e) {
			throw new AdapterValidationException("Unexpected Index.Noun Record (line = %s)", line);
		}
	}

	public static IndexNoun transform(String lemma, String pos, String synsetCnt, Collection<String> ids) throws AdapterValidationException {
		IndexNoun bean = new IndexNoun();

		bean.setTerm(transformLemma(lemma));
		bean.setUpperType(transformPos(pos));
		bean.setSynsetCount(transformSynsetCnt(synsetCnt));
		bean.setIds(ids);

		return bean;
	}

	public static IndexNoun transform(String lemma, String pos, String synsetCnt, String... synsetOffsets) throws AdapterValidationException {
		return transform(lemma, pos, synsetCnt, SetUtils.toSet(synsetOffsets));
	}

	private static String transformLemma(String text) {
		text = text.replaceAll("_", " ");
		text = StringUtils.trim(text).toLowerCase();

		return text;
	}

	private static EngGrammarUpperType transformPos(String text) throws AdapterValidationException {
		if ("n".equalsIgnoreCase(text)) return EngGrammarUpperType.NOUN;
		if ("v".equalsIgnoreCase(text)) return EngGrammarUpperType.VERB;
		if ("a".equalsIgnoreCase(text)) return EngGrammarUpperType.ADJECTIVE;
		if ("r".equalsIgnoreCase(text)) return EngGrammarUpperType.ADVERB;
		throw new AdapterValidationException("Part-of-Speech not recognized (value = %s)", text);
	}

	private static Integer transformSynsetCnt(String synsetCnt) throws AdapterValidationException {
		try {
			return Integer.parseInt(synsetCnt);
		} catch (NumberFormatException e) {
			throw new AdapterValidationException("Unexpected Synset Count Format (value = %s)", synsetCnt);
		}
	}
}
