package org.swtk.common.dict.dto.wiktionary.type;

public enum SynonymQualifier {

	ABBREVIATION("abbreviation", SynonymQualifierUpperType.ABBREVIATION),

	ADJECTIVE("adjective", SynonymQualifierUpperType.ADJECTIVE),

	ANCIENT("ancient", SynonymQualifierUpperType.ARCHAIC),

	ANGLICISM("anglicism", SynonymQualifierUpperType.OTHER),

	ANIMAL("animal", SynonymQualifierUpperType.OTHER),

	ARCHAIC("archaic", SynonymQualifierUpperType.ARCHAIC),

	ATTRIBUTIVELY("attributively", SynonymQualifierUpperType.ADJECTIVE),
	
	BELIEVERS("believers", SynonymQualifierUpperType.OTHER),
	
	BOTANY("botany", SynonymQualifierUpperType.OTHER),

	COLLOQUIAL("colloquial", SynonymQualifierUpperType.INFORMAL),

	COMPUTING("computing", SynonymQualifierUpperType.OTHER),
	
	COUNTABLE("countable", SynonymQualifierUpperType.COUNTABLE),

	CRUDE("crude", SynonymQualifierUpperType.VULGAR),

	DATED("dated", SynonymQualifierUpperType.ARCHAIC),

	DEAD("dead", SynonymQualifierUpperType.OTHER),

	DEROGATORY("derogatory", SynonymQualifierUpperType.PEJORATIVE),

	DIALETICAL("dialectal", SynonymQualifierUpperType.OTHER),

	DIMINUITIVE("diminutive", SynonymQualifierUpperType.INFORMAL),

	EUPHEMISM("euphemism", SynonymQualifierUpperType.INFORMAL),

	EUPHEMISTIC("euphemistic", SynonymQualifierUpperType.INFORMAL),
	
	FAMILIAR("familiar", SynonymQualifierUpperType.INFORMAL),

	FANTASY("fantasy", SynonymQualifierUpperType.OTHER),

	FEMALE("female", SynonymQualifierUpperType.OTHER),

	FORMAL("formal", SynonymQualifierUpperType.FORMAL),

	INANIMATES("inanimates", SynonymQualifierUpperType.OTHER),

	INDISTINCTLY("indistinctly", SynonymQualifierUpperType.INDISTINCTLY),

	INEXACT("inexact", SynonymQualifierUpperType.INEXACT),

	INFORMAL("informal", SynonymQualifierUpperType.INFORMAL),

	LEGAL("legal", SynonymQualifierUpperType.OTHER),

	LESS_COMMON("less common", SynonymQualifierUpperType.ARCHAIC),

	LOOSELY("loosely", SynonymQualifierUpperType.OTHER),

	MALE("male", SynonymQualifierUpperType.OTHER),

	MODERN("modern", SynonymQualifierUpperType.MODERN),

	MONOTHEISTIC("monotheistic", SynonymQualifierUpperType.OTHER),

	NONSTANDARD("nonstandard", SynonymQualifierUpperType.ARCHAIC),

	NOUN("noun", SynonymQualifierUpperType.OTHER),

	OBSOLETE("obsolete", SynonymQualifierUpperType.ARCHAIC),

	PEJORATIVE("pejorative", SynonymQualifierUpperType.PEJORATIVE),

	PHILATELIC("philatelic", SynonymQualifierUpperType.OTHER),

	PLURAL("plural", SynonymQualifierUpperType.OTHER),

	POLYTHEISTIC("polytheistic", SynonymQualifierUpperType.OTHER),

	PROFESSIONAL("professional", SynonymQualifierUpperType.OTHER),

	RAPIDLY("rapidly", SynonymQualifierUpperType.OTHER),

	RARE("rare", SynonymQualifierUpperType.ARCHAIC),

	RECOMMENDABLE("recommendable", SynonymQualifierUpperType.OTHER),

	SCIENTIFIC("scientific", SynonymQualifierUpperType.OTHER),

	SECULAR("secular", SynonymQualifierUpperType.SECULAR),

	SLANG("slang", SynonymQualifierUpperType.INFORMAL),

	STANDARD("standard", SynonymQualifierUpperType.OTHER),

	STRONG("strong", SynonymQualifierUpperType.OTHER),

	STRONGER("stronger", SynonymQualifierUpperType.OTHER),

	SYMBOL("symbol", SynonymQualifierUpperType.SYMBOL),

	UNCOUNTABLE("uncountable", SynonymQualifierUpperType.UNCOUNTABLE),

	UNUSUAL("unusual", SynonymQualifierUpperType.ARCHAIC),

	US("US", SynonymQualifierUpperType.OTHER),

	VICTORY("victory", SynonymQualifierUpperType.OTHER),

	VULGAR("vulgar", SynonymQualifierUpperType.VULGAR);

	public static SynonymQualifier find(String text) {
		for (SynonymQualifier value : SynonymQualifier.values())
			if (value.toString().equals(text))
				return value;
		return null;
	}

	private String name;

	private SynonymQualifierUpperType upperType;

	private SynonymQualifier(String name, SynonymQualifierUpperType upperType) {
		setName(name);
		setUpperType(upperType);
	}

	private String getName() {
		return name;
	}

	public SynonymQualifierUpperType getUpperType() {
		return upperType;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setUpperType(SynonymQualifierUpperType upperType) {
		this.upperType = upperType;
	}

	public String toString() {
		return getName();
	}
}
