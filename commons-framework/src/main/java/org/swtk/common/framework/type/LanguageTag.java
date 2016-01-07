package org.swtk.common.framework.type;

import com.trimc.blogger.commons.LogManager;

public enum LanguageTag {

	ENGLISH("en"),

	ENGLISH_UK("en_UK"),
	
	ENGLISH_US("en_US"),
	
	GREEK("el_GR"),

	SPANISH("es");

	public static LogManager	logger	= new LogManager(LanguageTag.class);

	public static LanguageTag find(String name) {
		for (LanguageTag value : LanguageTag.values())
			if (value.toString().equalsIgnoreCase(name)) return value;

		logger.error("LanguageTag not Recognized (name = %s)", name);
		return null;
	}

	private String	name;

	private LanguageTag(String name) {
		setName(name);
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}
}
