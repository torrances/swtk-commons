package org.swtk.common.dict.dto.wiktionary.adapter;

import org.swtk.common.dict.dto.wiktionary.Definition;

import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.type.EngGrammarUpperType;
import com.trimc.blogger.commons.utils.string.StringUtils;

public final class DefinitionAdapter {

	public static boolean isEmpty(Definition definition) {
		if (null == definition) return true;

		if (definition.hasText()) return false;
		if (definition.hasUpperType()) return false;

		return true;
	}

	public static String toString(Definition definition) {
		StringBuilder sb = new StringBuilder();

		sb.append("text = " + definition.getText());
		if (definition.hasPriority()) sb.append(", priority = " + definition.getPriority());
		if (definition.hasUpperType()) sb.append(", pos = " + definition.getUpperType().toString());
		if (definition.hasNounPhraseAttributes()) {
			String nounPhraseAttributes = StringUtils.toString(definition.getNounPhraseAttributes(), ",");
			sb.append(", attributes = (" + nounPhraseAttributes + ")");
		}

		return sb.toString();
	}

	public static Definition transform(String text, EngGrammarUpperType upperType, Integer priority) throws AdapterValidationException {
		Definition definition = new Definition();

		definition.setText(text);
		definition.setUpperType(upperType);
		definition.setPriority(priority);

		return definition;
	}
}
