package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.l.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.j.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.q.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.h.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.s.*;

public final class WiktionaryDbL {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("laa".equals(sub))
			return WiktionaryLAA000.get(name);
		else if ("lab".equals(sub))
			return WiktionaryLAB000.get(name);
		else if ("lac".equals(sub))
			return WiktionaryLAC000.get(name);
		else if ("lad".equals(sub))
			return WiktionaryLAD000.get(name);
		else if ("lae".equals(sub))
			return WiktionaryLAE000.get(name);
		else if ("laf".equals(sub))
			return WiktionaryLAF000.get(name);
		else if ("lag".equals(sub))
			return WiktionaryLAG000.get(name);
		else if ("lah".equals(sub))
			return WiktionaryLAH000.get(name);
		else if ("lai".equals(sub))
			return WiktionaryLAI000.get(name);
		else if ("lak".equals(sub))
			return WiktionaryLAK000.get(name);
		else if ("lal".equals(sub))
			return WiktionaryLAL000.get(name);
		else if ("lam".equals(sub))
			return WiktionaryLAM000.get(name);
		else if ("lan".equals(sub))
			return WiktionaryLAN000.get(name);
		else if ("lao".equals(sub))
			return WiktionaryLAO000.get(name);
		else if ("lap".equals(sub))
			return WiktionaryLAP000.get(name);
		else if ("lar".equals(sub))
			return WiktionaryLAR000.get(name);
		else if ("las".equals(sub))
			return WiktionaryLAS000.get(name);
		else if ("lat".equals(sub))
			return WiktionaryLAT000.get(name);
		else if ("lau".equals(sub))
			return WiktionaryLAU000.get(name);
		else if ("lav".equals(sub))
			return WiktionaryLAV000.get(name);
		else if ("law".equals(sub))
			return WiktionaryLAW000.get(name);
		else if ("lax".equals(sub))
			return WiktionaryLAX000.get(name);
		else if ("lay".equals(sub))
			return WiktionaryLAY000.get(name);
		else if ("laz".equals(sub))
			return WiktionaryLAZ000.get(name);
		else if ("lea".equals(sub))
			return WiktionaryLEA000.get(name);
		else if ("leb".equals(sub))
			return WiktionaryLEB000.get(name);
		else if ("lec".equals(sub))
			return WiktionaryLEC000.get(name);
		else if ("led".equals(sub))
			return WiktionaryLED000.get(name);
		else if ("lee".equals(sub))
			return WiktionaryLEE000.get(name);
		else if ("lef".equals(sub))
			return WiktionaryLEF000.get(name);
		else if ("leg".equals(sub))
			return WiktionaryLEG000.get(name);
		else if ("lei".equals(sub))
			return WiktionaryLEI000.get(name);
		else if ("lem".equals(sub))
			return WiktionaryLEM000.get(name);
		else if ("len".equals(sub))
			return WiktionaryLEN000.get(name);
		else if ("leo".equals(sub))
			return WiktionaryLEO000.get(name);
		else if ("lep".equals(sub))
			return WiktionaryLEP000.get(name);
		else if ("les".equals(sub))
			return WiktionaryLES000.get(name);
		else if ("let".equals(sub))
			return WiktionaryLET000.get(name);
		else if ("leu".equals(sub))
			return WiktionaryLEU000.get(name);
		else if ("lev".equals(sub))
			return WiktionaryLEV000.get(name);
		else if ("lex".equals(sub))
			return WiktionaryLEX000.get(name);
		else if ("lez".equals(sub))
			return WiktionaryLEZ000.get(name);
		else if ("lha".equals(sub))
			return WiktionaryLHA000.get(name);
		else if ("lia".equals(sub))
			return WiktionaryLIA000.get(name);
		else if ("lib".equals(sub))
			return WiktionaryLIB000.get(name);
		else if ("lic".equals(sub))
			return WiktionaryLIC000.get(name);
		else if ("lid".equals(sub))
			return WiktionaryLID000.get(name);
		else if ("lie".equals(sub))
			return WiktionaryLIE000.get(name);
		else if ("lif".equals(sub))
			return WiktionaryLIF000.get(name);
		else if ("lig".equals(sub))
			return WiktionaryLIG000.get(name);
		else if ("lik".equals(sub))
			return WiktionaryLIK000.get(name);
		else if ("lil".equals(sub))
			return WiktionaryLIL000.get(name);
		else if ("lim".equals(sub))
			return WiktionaryLIM000.get(name);
		else if ("lin".equals(sub))
			return WiktionaryLIN000.get(name);
		else if ("lio".equals(sub))
			return WiktionaryLIO000.get(name);
		else if ("lip".equals(sub))
			return WiktionaryLIP000.get(name);
		else if ("liq".equals(sub))
			return WiktionaryLIQ000.get(name);
		else if ("lis".equals(sub))
			return WiktionaryLIS000.get(name);
		else if ("lit".equals(sub))
			return WiktionaryLIT000.get(name);
		else if ("liv".equals(sub))
			return WiktionaryLIV000.get(name);
		else if ("liz".equals(sub))
			return WiktionaryLIZ000.get(name);
		else if ("lju".equals(sub))
			return WiktionaryLJU000.get(name);
		else if ("lla".equals(sub))
			return WiktionaryLLA000.get(name);
		else if ("llo".equals(sub))
			return WiktionaryLLO000.get(name);
		else if ("loa".equals(sub))
			return WiktionaryLOA000.get(name);
		else if ("lob".equals(sub))
			return WiktionaryLOB000.get(name);
		else if ("loc".equals(sub))
			return WiktionaryLOC000.get(name);
		else if ("lod".equals(sub))
			return WiktionaryLOD000.get(name);
		else if ("loe".equals(sub))
			return WiktionaryLOE000.get(name);
		else if ("lof".equals(sub))
			return WiktionaryLOF000.get(name);
		else if ("log".equals(sub))
			return WiktionaryLOG000.get(name);
		else if ("loi".equals(sub))
			return WiktionaryLOI000.get(name);
		else if ("lok".equals(sub))
			return WiktionaryLOK000.get(name);
		else if ("lol".equals(sub))
			return WiktionaryLOL000.get(name);
		else if ("lom".equals(sub))
			return WiktionaryLOM000.get(name);
		else if ("lon".equals(sub))
			return WiktionaryLON000.get(name);
		else if ("loo".equals(sub))
			return WiktionaryLOO000.get(name);
		else if ("lop".equals(sub))
			return WiktionaryLOP000.get(name);
		else if ("loq".equals(sub))
			return WiktionaryLOQ000.get(name);
		else if ("lor".equals(sub))
			return WiktionaryLOR000.get(name);
		else if ("los".equals(sub))
			return WiktionaryLOS000.get(name);
		else if ("lot".equals(sub))
			return WiktionaryLOT000.get(name);
		else if ("lou".equals(sub))
			return WiktionaryLOU000.get(name);
		else if ("lov".equals(sub))
			return WiktionaryLOV000.get(name);
		else if ("low".equals(sub))
			return WiktionaryLOW000.get(name);
		else if ("lox".equals(sub))
			return WiktionaryLOX000.get(name);
		else if ("loy".equals(sub))
			return WiktionaryLOY000.get(name);
		else if ("loz".equals(sub))
			return WiktionaryLOZ000.get(name);
		else if ("lua".equals(sub))
			return WiktionaryLUA000.get(name);
		else if ("lub".equals(sub))
			return WiktionaryLUB000.get(name);
		else if ("luc".equals(sub))
			return WiktionaryLUC000.get(name);
		else if ("lud".equals(sub))
			return WiktionaryLUD000.get(name);
		else if ("lue".equals(sub))
			return WiktionaryLUE000.get(name);
		else if ("luf".equals(sub))
			return WiktionaryLUF000.get(name);
		else if ("lug".equals(sub))
			return WiktionaryLUG000.get(name);
		else if ("luh".equals(sub))
			return WiktionaryLUH000.get(name);
		else if ("luj".equals(sub))
			return WiktionaryLUJ000.get(name);
		else if ("luk".equals(sub))
			return WiktionaryLUK000.get(name);
		else if ("lul".equals(sub))
			return WiktionaryLUL000.get(name);
		else if ("lum".equals(sub))
			return WiktionaryLUM000.get(name);
		else if ("lun".equals(sub))
			return WiktionaryLUN000.get(name);
		else if ("lup".equals(sub))
			return WiktionaryLUP000.get(name);
		else if ("lur".equals(sub))
			return WiktionaryLUR000.get(name);
		else if ("lus".equals(sub))
			return WiktionaryLUS000.get(name);
		else if ("lut".equals(sub))
			return WiktionaryLUT000.get(name);
		else if ("luv".equals(sub))
			return WiktionaryLUV000.get(name);
		else if ("lux".equals(sub))
			return WiktionaryLUX000.get(name);
		else if ("lva".equals(sub))
			return WiktionaryLVA000.get(name);
		else if ("lya".equals(sub))
			return WiktionaryLYA000.get(name);
		else if ("lyc".equals(sub))
			return WiktionaryLYC000.get(name);
		else if ("lyd".equals(sub))
			return WiktionaryLYD000.get(name);
		else if ("lym".equals(sub))
			return WiktionaryLYM000.get(name);
		else if ("lyn".equals(sub))
			return WiktionaryLYN000.get(name);
		else if ("lyo".equals(sub))
			return WiktionaryLYO000.get(name);
		else if ("lyr".equals(sub))
			return WiktionaryLYR000.get(name);
		else if ("lys".equals(sub))
			return WiktionaryLYS000.get(name);
		return null;
	}
}