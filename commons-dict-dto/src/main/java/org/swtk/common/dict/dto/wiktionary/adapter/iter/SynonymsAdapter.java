package org.swtk.common.dict.dto.wiktionary.adapter.iter;

import java.util.Iterator;

import org.swtk.common.dict.dto.wiktionary.Synonym;
import org.swtk.common.dict.dto.wiktionary.adapter.SynonymAdapter;
import org.swtk.common.dict.dto.wiktionary.iter.Synonyms;

public final class SynonymsAdapter {

	public static boolean isEmpty(Synonyms synonyms) {
		if (null == synonyms) return true;

		for (Synonym synonym : synonyms)
			if (!SynonymAdapter.isEmpty(synonym)) return false;

		return true;
	}

	public static String toString(Synonyms synonyms) {
		StringBuilder sb = new StringBuilder();

		if (!synonyms.isEmpty()) sb.append(String.format("definitions (total = %s):\n", synonyms.size()));

		Iterator<Synonym> iter = synonyms.iterator();
		while (iter.hasNext()) {
			sb.append("\n\t");
			sb.append(SynonymAdapter.toString(iter.next()));
		}

		return sb.toString();
	}
}
