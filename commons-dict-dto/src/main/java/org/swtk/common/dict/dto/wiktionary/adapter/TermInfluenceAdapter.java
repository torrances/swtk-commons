package org.swtk.common.dict.dto.wiktionary.adapter;

import org.swtk.common.dict.dto.wiktionary.TermInfluence;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class TermInfluenceAdapter {

	public static String toString(TermInfluence bean) {
		StringBuilder sb = new StringBuilder();

		sb.append(bean.getEnglishTerm());
		sb.append(", foreign-term = " + bean.getForeignTerm());
		//		sb.append(", foreign-language = " + bean.getForeignLanguage());

		return sb.toString();
	}

	public static TermInfluence tranform(String foreignTerm, String englishTerm, String foreignLanguageCode) throws AdapterValidationException {
		TermInfluence bean = new TermInfluence();

		//		String foreignLanguage = WikiCodeLangLookup.getLangauge(foreignLanguageCode);
		//		if (!StringUtils.hasValue(foreignLanguage)) throw new AdapterValidationException("Unrecognized Langauge Code (value = %s)", foreignLanguageCode);

		bean.setEnglishTerm(englishTerm);
		bean.setForeignTerm(foreignTerm);
		//		bean.setForeignLanguage(foreignLanguage);

		return bean;
	}
}
