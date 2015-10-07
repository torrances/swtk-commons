package org.swtk.common.framework.type;

public enum Alpha {

	A("a", 'a'),

	B("b", 'b'),

	C("c", 'c'),

	D("d", 'd'),

	E("e", 'e'),

	F("f", 'f'),

	G("g", 'g'),

	H("h", 'h'),

	I("i", 'i'),

	J("j", 'j'),

	K("k", 'k'),

	L("l", 'l'),

	M("m", 'm'),

	N("n", 'n'),

	O("o", 'o'),

	P("p", 'p'),

	Q("q", 'q'),

	R("r", 'r'),

	S("s", 's'),

	T("t", 't'),

	U("u", 'u'),

	V("v", 'v'),

	W("w", 'w'),

	X("x", 'x'),

	Y("y", 'y'),

	Z("z", 'z');

	public static Alpha find(char token) {
		for (Alpha alpha : Alpha.values())
			if (token == alpha.getCh()) return alpha;
		return null;
	}

	public static Alpha find(String token) {
		for (Alpha alpha : Alpha.values())
			if (alpha.lower().equalsIgnoreCase(token)) return alpha;
		return null;
	}

	public static String[] lower(Alpha... alphas) {
		String[] arr = new String[alphas.length];

		for (int i = 0; i < alphas.length; i++)
			arr[i] = alphas[i].lower();

		return arr;
	}

	public static String[] upper(Alpha... alphas) {
		String[] arr = new String[alphas.length];

		for (int i = 0; i < alphas.length; i++)
			arr[i] = alphas[i].upper();

		return arr;
	}

	private char	ch;

	private String	token;

	private Alpha(String token, char ch) {
		setToken(token);
		setCh(ch);
	}

	public char ch() {
		return getCh();
	}

	private char getCh() {
		return ch;
	}

	private String getToken() {
		return token;
	}

	public String lower() {
		return getToken().toLowerCase();
	}

	private void setCh(char ch) {
		this.ch = ch;
	}

	private void setToken(String token) {
		this.token = token;
	}

	public String upper() {
		return getToken().toUpperCase();
	}
}
