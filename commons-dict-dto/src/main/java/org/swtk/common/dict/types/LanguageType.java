package org.swtk.common.dict.types;

public enum LanguageType {

	ANCIENT("A"), CONSTRUCTED("C"), EXTINCT("E"), HISTORICAL("H"), LIVING("L"), SPECIAL("S");

	public static LanguageType find(String code) {
		for (LanguageType value : LanguageType.values())
			if (value.toString().equalsIgnoreCase(code)) return value;
		return null;
	}

	private String code;

	private LanguageType(String code) {
		setCode(code);
	}

	private String getCode() {
		return code;
	}

	private void setCode(String code) {
		this.code = code;
	}

	public String toString() {
		return getCode();
	}
}
