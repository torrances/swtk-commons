package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.z.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.z.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.z.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.z.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.z.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.z.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.z.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.z.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.z.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.z.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.z.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.z.u.h.*;
import org.swtk.commons.dict.wiktionary.generated.z.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.z.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.z.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.z.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.z.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.z.y.g.*;
import org.swtk.commons.dict.wiktionary.generated.z.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.z.y.t.*;

public final class WiktionaryDbZ {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("zaa".equals(sub))
			return WiktionaryZAA000.get(name);
		else if ("zab".equals(sub))
			return WiktionaryZAB000.get(name);
		else if ("zac".equals(sub))
			return WiktionaryZAC000.get(name);
		else if ("zad".equals(sub))
			return WiktionaryZAD000.get(name);
		else if ("zag".equals(sub))
			return WiktionaryZAG000.get(name);
		else if ("zai".equals(sub))
			return WiktionaryZAI000.get(name);
		else if ("zal".equals(sub))
			return WiktionaryZAL000.get(name);
		else if ("zam".equals(sub))
			return WiktionaryZAM000.get(name);
		else if ("zan".equals(sub))
			return WiktionaryZAN000.get(name);
		else if ("zap".equals(sub))
			return WiktionaryZAP000.get(name);
		else if ("zar".equals(sub))
			return WiktionaryZAR000.get(name);
		else if ("zaw".equals(sub))
			return WiktionaryZAW000.get(name);
		else if ("zaz".equals(sub))
			return WiktionaryZAZ000.get(name);
		else if ("zea".equals(sub))
			return WiktionaryZEA000.get(name);
		else if ("zeb".equals(sub))
			return WiktionaryZEB000.get(name);
		else if ("zee".equals(sub))
			return WiktionaryZEE000.get(name);
		else if ("zei".equals(sub))
			return WiktionaryZEI000.get(name);
		else if ("zel".equals(sub))
			return WiktionaryZEL000.get(name);
		else if ("zem".equals(sub))
			return WiktionaryZEM000.get(name);
		else if ("zen".equals(sub))
			return WiktionaryZEN000.get(name);
		else if ("zeo".equals(sub))
			return WiktionaryZEO000.get(name);
		else if ("zep".equals(sub))
			return WiktionaryZEP000.get(name);
		else if ("zer".equals(sub))
			return WiktionaryZER000.get(name);
		else if ("zes".equals(sub))
			return WiktionaryZES000.get(name);
		else if ("zeu".equals(sub))
			return WiktionaryZEU000.get(name);
		else if ("zey".equals(sub))
			return WiktionaryZEY000.get(name);
		else if ("zha".equals(sub))
			return WiktionaryZHA000.get(name);
		else if ("zhe".equals(sub))
			return WiktionaryZHE000.get(name);
		else if ("zhy".equals(sub))
			return WiktionaryZHY000.get(name);
		else if ("zic".equals(sub))
			return WiktionaryZIC000.get(name);
		else if ("zil".equals(sub))
			return WiktionaryZIL000.get(name);
		else if ("zim".equals(sub))
			return WiktionaryZIM000.get(name);
		else if ("zin".equals(sub))
			return WiktionaryZIN000.get(name);
		else if ("zio".equals(sub))
			return WiktionaryZIO000.get(name);
		else if ("zip".equals(sub))
			return WiktionaryZIP000.get(name);
		else if ("zir".equals(sub))
			return WiktionaryZIR000.get(name);
		else if ("zit".equals(sub))
			return WiktionaryZIT000.get(name);
		else if ("ziv".equals(sub))
			return WiktionaryZIV000.get(name);
		else if ("zlo".equals(sub))
			return WiktionaryZLO000.get(name);
		else if ("zoa".equals(sub))
			return WiktionaryZOA000.get(name);
		else if ("zoe".equals(sub))
			return WiktionaryZOE000.get(name);
		else if ("zok".equals(sub))
			return WiktionaryZOK000.get(name);
		else if ("zol".equals(sub))
			return WiktionaryZOL000.get(name);
		else if ("zon".equals(sub))
			return WiktionaryZON000.get(name);
		else if ("zoo".equals(sub))
			return WiktionaryZOO000.get(name);
		else if ("zop".equals(sub))
			return WiktionaryZOP000.get(name);
		else if ("zor".equals(sub))
			return WiktionaryZOR000.get(name);
		else if ("zos".equals(sub))
			return WiktionaryZOS000.get(name);
		else if ("zou".equals(sub))
			return WiktionaryZOU000.get(name);
		else if ("zub".equals(sub))
			return WiktionaryZUB000.get(name);
		else if ("zug".equals(sub))
			return WiktionaryZUG000.get(name);
		else if ("zuh".equals(sub))
			return WiktionaryZUH000.get(name);
		else if ("zui".equals(sub))
			return WiktionaryZUI000.get(name);
		else if ("zul".equals(sub))
			return WiktionaryZUL000.get(name);
		else if ("zun".equals(sub))
			return WiktionaryZUN000.get(name);
		else if ("zur".equals(sub))
			return WiktionaryZUR000.get(name);
		else if ("zyd".equals(sub))
			return WiktionaryZYD000.get(name);
		else if ("zyg".equals(sub))
			return WiktionaryZYG000.get(name);
		else if ("zym".equals(sub))
			return WiktionaryZYM000.get(name);
		else if ("zyt".equals(sub))
			return WiktionaryZYT000.get(name);
		return null;
	}
}