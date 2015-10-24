package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.v.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.v.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.v.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.v.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.v.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.v.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.v.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.v.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.v.r.b.*;
import org.swtk.commons.dict.wiktionary.generated.v.r.d.*;
import org.swtk.commons.dict.wiktionary.generated.v.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.v.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.v.y.o.*;

public final class WiktionaryDbV {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("vaa".equals(sub))
			return WiktionaryVAA000.get(name);
		else if ("vac".equals(sub))
			return WiktionaryVAC000.get(name);
		else if ("vag".equals(sub))
			return WiktionaryVAG000.get(name);
		else if ("vai".equals(sub))
			return WiktionaryVAI000.get(name);
		else if ("vaj".equals(sub))
			return WiktionaryVAJ000.get(name);
		else if ("val".equals(sub))
			return WiktionaryVAL000.get(name);
		else if ("van".equals(sub))
			return WiktionaryVAN000.get(name);
		else if ("vap".equals(sub))
			return WiktionaryVAP000.get(name);
		else if ("var".equals(sub))
			return WiktionaryVAR000.get(name);
		else if ("vas".equals(sub))
			return WiktionaryVAS000.get(name);
		else if ("vat".equals(sub))
			return WiktionaryVAT000.get(name);
		else if ("vau".equals(sub))
			return WiktionaryVAU000.get(name);
		else if ("vav".equals(sub))
			return WiktionaryVAV000.get(name);
		else if ("vea".equals(sub))
			return WiktionaryVEA000.get(name);
		else if ("vec".equals(sub))
			return WiktionaryVEC000.get(name);
		else if ("ved".equals(sub))
			return WiktionaryVED000.get(name);
		else if ("vee".equals(sub))
			return WiktionaryVEE000.get(name);
		else if ("veg".equals(sub))
			return WiktionaryVEG000.get(name);
		else if ("veh".equals(sub))
			return WiktionaryVEH000.get(name);
		else if ("vei".equals(sub))
			return WiktionaryVEI000.get(name);
		else if ("vel".equals(sub))
			return WiktionaryVEL000.get(name);
		else if ("ven".equals(sub))
			return WiktionaryVEN000.get(name);
		else if ("ver".equals(sub))
			return WiktionaryVER000.get(name);
		else if ("ves".equals(sub))
			return WiktionaryVES000.get(name);
		else if ("vet".equals(sub))
			return WiktionaryVET000.get(name);
		else if ("vex".equals(sub))
			return WiktionaryVEX000.get(name);
		else if ("via".equals(sub))
			return WiktionaryVIA000.get(name);
		else if ("vib".equals(sub))
			return WiktionaryVIB000.get(name);
		else if ("vic".equals(sub))
			return WiktionaryVIC000.get(name);
		else if ("vid".equals(sub))
			return WiktionaryVID000.get(name);
		else if ("vie".equals(sub))
			return WiktionaryVIE000.get(name);
		else if ("vig".equals(sub))
			return WiktionaryVIG000.get(name);
		else if ("vil".equals(sub))
			return WiktionaryVIL000.get(name);
		else if ("vin".equals(sub))
			return WiktionaryVIN000.get(name);
		else if ("vio".equals(sub))
			return WiktionaryVIO000.get(name);
		else if ("vip".equals(sub))
			return WiktionaryVIP000.get(name);
		else if ("vir".equals(sub))
			return WiktionaryVIR000.get(name);
		else if ("vis".equals(sub))
			return WiktionaryVIS000.get(name);
		else if ("vit".equals(sub))
			return WiktionaryVIT000.get(name);
		else if ("viv".equals(sub))
			return WiktionaryVIV000.get(name);
		else if ("vix".equals(sub))
			return WiktionaryVIX000.get(name);
		else if ("viz".equals(sub))
			return WiktionaryVIZ000.get(name);
		else if ("vla".equals(sub))
			return WiktionaryVLA000.get(name);
		else if ("vlo".equals(sub))
			return WiktionaryVLO000.get(name);
		else if ("voc".equals(sub))
			return WiktionaryVOC000.get(name);
		else if ("vog".equals(sub))
			return WiktionaryVOG000.get(name);
		else if ("voi".equals(sub))
			return WiktionaryVOI000.get(name);
		else if ("vok".equals(sub))
			return WiktionaryVOK000.get(name);
		else if ("vol".equals(sub))
			return WiktionaryVOL000.get(name);
		else if ("vom".equals(sub))
			return WiktionaryVOM000.get(name);
		else if ("vor".equals(sub))
			return WiktionaryVOR000.get(name);
		else if ("vot".equals(sub))
			return WiktionaryVOT000.get(name);
		else if ("vou".equals(sub))
			return WiktionaryVOU000.get(name);
		else if ("vow".equals(sub))
			return WiktionaryVOW000.get(name);
		else if ("vox".equals(sub))
			return WiktionaryVOX000.get(name);
		else if ("voy".equals(sub))
			return WiktionaryVOY000.get(name);
		else if ("vra".equals(sub))
			return WiktionaryVRA000.get(name);
		else if ("vrb".equals(sub))
			return WiktionaryVRB000.get(name);
		else if ("vrd".equals(sub))
			return WiktionaryVRD000.get(name);
		else if ("vul".equals(sub))
			return WiktionaryVUL000.get(name);
		else if ("vur".equals(sub))
			return WiktionaryVUR000.get(name);
		else if ("vyo".equals(sub))
			return WiktionaryVYO000.get(name);
		return null;
	}
}