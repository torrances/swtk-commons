package org.swtk.common.dict.types;

public enum ScopeType {

	INDIVIDUAL("I"), MACROLANGUAGE("M"), SPECIAL("S");

	public static ScopeType find(String code) {
		for (ScopeType value : ScopeType.values())
			if (value.toString().equalsIgnoreCase(code)) return value;
		return null;
	}

	private String code;

	private ScopeType(String code) {
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
