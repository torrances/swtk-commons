package org.swtk.common.dict.dto.wiktionary.type;

public enum SynonymQualifier {

	ABBREVIATION("abbreviation"),

	ADJECTIVE("adjective"),

	ARCHAIC("archaic"),

	ATTRIBUTIVELY("attributively"),

	COLLOQUIAL("colloquial"),

	COUNTABLE("countable"),

	CRUDE("crude"),

	DATED("dated"),

	DEROGATORY("derogatory"),

	DIMINUITIVE("diminutive"),

	EUPHEMISM("euphemism"),

	FAMILIAR("familiar"),

	FORMAL("formal"),

	INDISTINCTLY("indistinctly"),

	INEXACT("inexact"),

	INFORMAL("informal"),

	MODERN("modern"),

	OBSOLETE("obsolete"),

	RARE("rare"),

	SECULAR("secular"),

	SLANG("slang"),

	SYMBOL("symbol"),

	UNCOUNTABLE("uncountable"),

	VULGAR("vulgar");

	public static SynonymQualifier find(String text) {
		for (SynonymQualifier value : SynonymQualifier.values())
			if (value.toString().equals(text)) return value;
		return null;
	}

	private String name;

	private SynonymQualifier(String name) {
		setName(name);
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return getName();
	}
}
