package org.swtk.common.dict.dto.wiktionary.adapter;

import org.swtk.common.dict.dto.wiktionary.Synonym;
import org.swtk.common.dict.dto.wiktionary.type.SynonymQualifier;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class SynonymAdapter {

	public static boolean isEmpty(Synonym bean) {
		if (null == bean) return true;
		
		if (bean.hasText()) return false;

		return true;
	}

	public static String toString(Synonym synonym) {
		StringBuilder sb = new StringBuilder();

		sb.append("text = " + synonym.getText());
		if (synonym.hasSynonymQualifier()) sb.append(", qualifier = " + synonym.getSynonymQualifier());

		return sb.toString();
	}

	public static Synonym transform(String text) throws AdapterValidationException {
		Synonym bean = new Synonym();

		bean.setText(text);

		return bean;
	}

	public static Synonym transform(String text, String synonymQualifier) throws AdapterValidationException {
		Synonym bean = new Synonym();

		bean.setText(text);
		bean.setSynonymQualifier(SynonymQualifier.find(synonymQualifier));

		if (!bean.hasSynonymQualifier()) throw new AdapterValidationException("Synonym Qualifier not recognized (value = %s)", synonymQualifier);

		return bean;
	}
}
