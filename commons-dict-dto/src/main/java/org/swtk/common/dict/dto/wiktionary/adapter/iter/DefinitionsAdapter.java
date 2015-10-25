package org.swtk.common.dict.dto.wiktionary.adapter.iter;

import java.util.Iterator;

import org.swtk.common.dict.dto.wiktionary.Definition;
import org.swtk.common.dict.dto.wiktionary.adapter.DefinitionAdapter;
import org.swtk.common.dict.dto.wiktionary.iter.Definitions;

public final class DefinitionsAdapter {

	public static boolean isEmpty(Definitions definitions) {
		if (null == definitions) return true;

		for (Definition definition : definitions)
			if (!DefinitionAdapter.isEmpty(definition)) return false;

		return true;
	}

	public static String toString(Definitions definitions) {
		StringBuilder sb = new StringBuilder();

		if (!definitions.isEmpty()) sb.append(String.format("definitions (total = %s):", definitions.size()));

		Iterator<Definition> iter = definitions.iterator();
		while (iter.hasNext()) {
			sb.append("\n\t");
			sb.append(DefinitionAdapter.toString(iter.next()));
		}

		return sb.toString();
	}

	public static Definitions transform(Definition... definitions) {
		Definitions bean = new Definitions();

		bean.add(definitions);

		return bean;
	}
}
