package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.q.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.q.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.o.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.t.*;

public final class WiktionaryDbQ {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("qad".equals(sub))
			return WiktionaryQAD000.get(name);
		else if ("qal".equals(sub))
			return WiktionaryQAL000.get(name);
		else if ("qan".equals(sub))
			return WiktionaryQAN000.get(name);
		else if ("qap".equals(sub))
			return WiktionaryQAP000.get(name);
		else if ("qas".equals(sub))
			return WiktionaryQAS000.get(name);
		else if ("qaw".equals(sub))
			return WiktionaryQAW000.get(name);
		else if ("qaz".equals(sub))
			return WiktionaryQAZ000.get(name);
		else if ("qig".equals(sub))
			return WiktionaryQIG000.get(name);
		else if ("qin".equals(sub))
			return WiktionaryQIN000.get(name);
		else if ("qiq".equals(sub))
			return WiktionaryQIQ000.get(name);
		else if ("qiv".equals(sub))
			return WiktionaryQIV000.get(name);
		else if ("qop".equals(sub))
			return WiktionaryQOP000.get(name);
		else if ("qua".equals(sub))
			return WiktionaryQUA000.get(name);
		else if ("que".equals(sub))
			return WiktionaryQUE000.get(name);
		else if ("qui".equals(sub))
			return WiktionaryQUI000.get(name);
		else if ("quo".equals(sub))
			return WiktionaryQUO000.get(name);
		else if ("qur".equals(sub))
			return WiktionaryQUR000.get(name);
		else if ("qut".equals(sub))
			return WiktionaryQUT000.get(name);
		return null;
	}
}