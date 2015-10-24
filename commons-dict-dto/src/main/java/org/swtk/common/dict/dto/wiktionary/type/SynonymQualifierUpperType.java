package org.swtk.common.dict.dto.wiktionary.type;

public enum SynonymQualifierUpperType {

	ABBREVIATION("abbreviation"),

	ADJECTIVE("adjective"),

	ARCHAIC("archaic"),

	// ATTRIBUTIVELY("attributively"), ADJ

	COLLOQUIAL("colloquial"),

	COUNTABLE("countable"),

	// pejorative, transitive, INTRANSITIVE, botany, ancient, standard, poetic, casual

	// 	CRUDE("crude"), VULGAR

	// DATED("dated"), ARCHAIC

	// DEROGATORY("derogatory"), PEJORARIVE

	PEJORATIVE("pejorative"),

	DIMINUITIVE("diminutive"),

	EUPHEMISM("euphemism"),

	// FAMILIAR("familiar"), INFORMAL

	FORMAL("formal"),

	INDISTINCTLY("indistinctly"),

	INEXACT("inexact"),

	INFORMAL("informal"),

	MODERN("modern"),

	// OBSOLETE("obsolete"), ARCHAIC

	// RARE("rare"),  ARCHAIC 

	SECULAR("secular"),

	// SLANG("slang"), INFORMAL

	SYMBOL("symbol"),

	UNCOUNTABLE("uncountable"),

	VULGAR("vulgar");

	public static SynonymQualifierUpperType find(String text) {
		for (SynonymQualifierUpperType value : SynonymQualifierUpperType.values())
			if (value.toString().equals(text)) return value;
		return null;
	}

	private String name;

	private SynonymQualifierUpperType(String name) {
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
