package org.swtk.common.dict.dto.stopwords.adapter;

import org.swtk.common.dict.dto.stopwords.Stopword;
import org.swtk.common.framework.type.LanguageTag;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class StopwordAdapter {

	public static Stopword transform(String text, LanguageTag languageTag) throws AdapterValidationException {
		Stopword stopword = new Stopword();
		
		stopword.setText(text);
		stopword.setLanguageTag(languageTag);
		
		return stopword;
	}
}
