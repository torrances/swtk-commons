package org.swtk.common.dict.dto.stopwords;

import org.swtk.common.framework.type.LanguageTag;

public class Stopword {

	private LanguageTag languageTag;
	
	private String text;

	public LanguageTag getLanguageTag() {
		return languageTag;
	}

	public String getText() {
		return text;
	}

	public void setLanguageTag(LanguageTag languageTag) {
		this.languageTag = languageTag;
	}

	public void setText(String text) {
		this.text = text;
	}
}
