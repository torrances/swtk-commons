package org.swtk.common.dict.dto.wiktionary.type;

public enum SynonymQualifier {

	ABBREVIATION("abbreviation", SynonymQualifierUpperType.ABBREVIATION),

	ADJECTIVE("adjective", SynonymQualifierUpperType.ADJECTIVE),
	
	ANCIENT("ancient", SynonymQualifierUpperType.ARCHAIC),

	ARCHAIC("archaic", SynonymQualifierUpperType.ARCHAIC),

	ATTRIBUTIVELY("attributively", SynonymQualifierUpperType.ADJECTIVE),

	COLLOQUIAL("colloquial", SynonymQualifierUpperType.INFORMAL),

	COUNTABLE("countable", SynonymQualifierUpperType.COUNTABLE),
	
	CRUDE("crude", SynonymQualifierUpperType.VULGAR),

	DATED("dated", SynonymQualifierUpperType.ARCHAIC),

	DEROGATORY("derogatory", SynonymQualifierUpperType.PEJORATIVE),

	DIMINUITIVE("diminutive", SynonymQualifierUpperType.INFORMAL),

	EUPHEMISM("euphemism", SynonymQualifierUpperType.INFORMAL),

	FAMILIAR("familiar", SynonymQualifierUpperType.INFORMAL),

	FORMAL("formal", SynonymQualifierUpperType.FORMAL),

	INDISTINCTLY("indistinctly", SynonymQualifierUpperType.INDISTINCTLY),

	INEXACT("inexact", SynonymQualifierUpperType.INEXACT),

	INFORMAL("informal", SynonymQualifierUpperType.INFORMAL),

	MODERN("modern", SynonymQualifierUpperType.MODERN),

	OBSOLETE("obsolete", SynonymQualifierUpperType.ARCHAIC),

	PEJORATIVE("pejorative", SynonymQualifierUpperType.PEJORATIVE),

	RARE("rare", SynonymQualifierUpperType.ARCHAIC),

	SECULAR("secular", SynonymQualifierUpperType.SECULAR),

	SLANG("slang", SynonymQualifierUpperType.INFORMAL),

	SYMBOL("symbol", SynonymQualifierUpperType.SYMBOL),

	UNCOUNTABLE("uncountable", SynonymQualifierUpperType.UNCOUNTABLE),
	
	VULGAR("vulgar", SynonymQualifierUpperType.VULGAR);

	public static SynonymQualifier find(String text) {
		for (SynonymQualifier value : SynonymQualifier.values())
			if (value.toString().equals(text)) return value;
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
