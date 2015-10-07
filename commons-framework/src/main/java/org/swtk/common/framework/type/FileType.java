package org.swtk.common.framework.type;

public enum FileType {

	CSV("csv", "csv"),

	JSON("json", "json"),

	MONGODB267_JSON("mongodb267", "json"),

	TSV("tsv", "tsv"),

	TXT("txt", "txt"),

	XML("xml", "xml");

	private String	extension;

	private String	name;

	private FileType(String name, String extension) {
		setName(name);
		setExtension(extension);
	}

	public String getExtension() {
		return extension;
	}

	public String getName() {
		return name;
	}

	private void setExtension(String extension) {
		this.extension = extension;
	}

	private void setName(String name) {
		this.name = name;
	}
}
