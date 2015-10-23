package org.swtk.common.dict.dto.wiktionary.adapter;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.common.dict.dto.wiktionary.adapter.iter.DefinitionsAdapter;
import org.swtk.common.dict.dto.wiktionary.adapter.iter.SynonymsAdapter;

public final class EntryAdapter {

	public static boolean isEmpty(Entry entry) {
		if (null == entry) return true;
		
		if (!EtymologyAdapter.isEmpty(entry.getEtymology())) return false;
		if (!DefinitionsAdapter.isEmpty(entry.getDefinitions())) return false;
		if (!SynonymsAdapter.isEmpty(entry.getSynonyms())) return false;
		if (!entry.getSeeAlso().isEmpty()) return false;

		return true;
	}

	public static String toString(Entry entry) {
		StringBuilder sb = new StringBuilder();

		return sb.toString();
	}
}
