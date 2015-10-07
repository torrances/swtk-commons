package org.swtk.common.dict;

public enum DictionaryName {

	ADJECTIVES("adjectivesDictionary"),

	MEASUREMENT_WORDS("measurementWordsDictionary"),

	NOUN_PHRASES("nounPhrasesDictionary"),

	STOP_WORDS("stopWordsDictionary");

	private String	beanId;

	private DictionaryName(String beanId) {
		setBeanId(beanId);
	}

	private String getBeanId() {
		return beanId;
	}

	private void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	@Override
	public String toString() {
		return getBeanId();
	}
}
