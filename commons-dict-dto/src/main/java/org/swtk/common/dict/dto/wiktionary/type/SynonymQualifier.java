package org.swtk.common.dict.dto.wiktionary.type;

public enum SynonymQualifier {

	OBSOLETE("obsolete"), RARE("rare"), UNCOUNTABLE("uncountable"), COUNTABLE("countable"), ADJECTIVE("adjective"), INDISTINCTLY("indistinctly");

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
