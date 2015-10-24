package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.x.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.x.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.x.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.x.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.x.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.x.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.x.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.x.y.s.*;

public final class WiktionaryDbX {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("xan".equals(sub))
			return WiktionaryXAN000.get(name);
		else if ("xeb".equals(sub))
			return WiktionaryXEB000.get(name);
		else if ("xen".equals(sub))
			return WiktionaryXEN000.get(name);
		else if ("xer".equals(sub))
			return WiktionaryXER000.get(name);
		else if ("xia".equals(sub))
			return WiktionaryXIA000.get(name);
		else if ("xma".equals(sub))
			return WiktionaryXMA000.get(name);
		else if ("xna".equals(sub))
			return WiktionaryXNA000.get(name);
		else if ("xno".equals(sub))
			return WiktionaryXNO000.get(name);
		else if ("xoa".equals(sub))
			return WiktionaryXOA000.get(name);
		else if ("xyl".equals(sub))
			return WiktionaryXYL000.get(name);
		else if ("xyr".equals(sub))
			return WiktionaryXYR000.get(name);
		else if ("xys".equals(sub))
			return WiktionaryXYS000.get(name);
		return null;
	}
}