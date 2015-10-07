package org.swtk.common.framework.type;

public enum Statement {

	/* what next; what if? 
	 * eg. 'what if deformation occurs?' */
	CAUSAL_CONSEQUENCE("causal-consequence", 10),

	/* what?
	 * eg. 'what time will we leave?' */
	CONCEPT_COMPLETION_WHAT("concept-completion-what", 11),

	/* when? 
	 * eg. 'when does X happen?' */
	CONCEPT_COMPLETION_WHEN("concept-completion-when", 12),

	/* where? 
	 * eg. where will X happen? */
	CONCEPT_COMPLETION_WHERE("concept-completion-where", 13),

	/* who? 
	 * eg. who is on the board of directors? */
	CONCEPT_COMPLETION_WHO("concept-completion-who", 14),

	/* what does X mean? 
	 * eg. 'what is X?' */
	DEFINITION("definition", 20),

	/* what disables X from occuring? 
	 * eg. 'what prevents slip' */
	DISABLEMENT("disablement", 30),

	/* what enabled X to occur? 
	 * eg. 'when does X happen' */
	ENABLEMENT("enablement", 40),

	/* what are the properties of X? */
	FEATURE_SPECIFICATION("feature-specification", 50),

	/* how did an agent do X? */
	PROCEDURAL("procedural", 60),

	/* invites a yes or no answer 
	 * eg. 'can gold corrode */
	VERIFICATION("verification", 70);

	public static Statement find(Integer type) {
		for (Statement value : Statement.values()) {
			if (value.getType() == type) return value;
		}

		return null;
	}

	public static Statement find(String name) {
		for (Statement value : Statement.values()) {
			if (value.getName().equalsIgnoreCase(name)) return value;
		}

		return (name.contains(" ")) ? find(name.replaceAll(" ", "-")) : null;
	}

	private String	name;

	private Integer	type;

	private Statement(String name, Integer type) {
		setName(name);
		setType(type);
	}

	public String getName() {
		return name;
	}

	public Integer getType() {
		return type;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setType(Integer type) {
		this.type = type;
	}
}
