package org.swtk.common.dict.dto.wordnet.adapter;

import java.util.Collection;

import org.swtk.common.dict.dto.wordnet.DataNoun;
import org.swtk.common.dict.dto.wordnet.DataNounFrames;
import org.swtk.common.dict.utils.WordnetAdapterUtils;

import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.utils.string.StringUtils;

public final class DataNounAdapter {

	public static String toString(DataNoun bean) {
		StringBuilder sb = new StringBuilder();

		sb.append("id = " + bean.getId());
		sb.append(", term = " + bean.getTerm());
		sb.append(", pos = " + bean.getUpperType());
		sb.append(", synonyms = " + StringUtils.toString(bean.getSynonyms(), ";"));
		sb.append(", frames = " + bean.getDataNounFrames().toString());

		return sb.toString();
	}

	public static DataNoun transform(String id, String term, String pos, Collection<String> synonyms, DataNounFrames dataNounFrames) throws AdapterValidationException {
		DataNoun bean = new DataNoun();

		bean.setId(transformId(id));
		bean.setTerm(transformTerm(term));
		bean.setUpperType(WordnetAdapterUtils.transformPos(pos));
		bean.setDataNounFrames(dataNounFrames);

		return bean;
	}

	public static String transformId(String id) throws AdapterValidationException {
		return id;
	}

	public static String transformTerm(String term) throws AdapterValidationException {
		return term;
	}
}
