package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.w.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.q.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.w.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.w.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.w.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.w.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.w.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.w.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.w.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.w.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.w.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.w.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.w.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.w.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.w.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.w.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.w.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.w.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.w.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.w.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.w.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.w.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.w.y.t.*;
import org.swtk.commons.dict.wiktionary.generated.w.y.v.*;

public final class WiktionaryDbW {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("waa".equals(sub))
			return WiktionaryWAA000.get(name);
		else if ("wac".equals(sub))
			return WiktionaryWAC000.get(name);
		else if ("wad".equals(sub))
			return WiktionaryWAD000.get(name);
		else if ("waf".equals(sub))
			return WiktionaryWAF000.get(name);
		else if ("wag".equals(sub))
			return WiktionaryWAG000.get(name);
		else if ("wah".equals(sub))
			return WiktionaryWAH000.get(name);
		else if ("wai".equals(sub))
			return WiktionaryWAI000.get(name);
		else if ("wak".equals(sub))
			return WiktionaryWAK000.get(name);
		else if ("wal".equals(sub))
			return WiktionaryWAL000.get(name);
		else if ("wam".equals(sub))
			return WiktionaryWAM000.get(name);
		else if ("wan".equals(sub))
			return WiktionaryWAN000.get(name);
		else if ("wap".equals(sub))
			return WiktionaryWAP000.get(name);
		else if ("waq".equals(sub))
			return WiktionaryWAQ000.get(name);
		else if ("war".equals(sub))
			return WiktionaryWAR000.get(name);
		else if ("was".equals(sub))
			return WiktionaryWAS000.get(name);
		else if ("wat".equals(sub))
			return WiktionaryWAT000.get(name);
		else if ("wav".equals(sub))
			return WiktionaryWAV000.get(name);
		else if ("wax".equals(sub))
			return WiktionaryWAX000.get(name);
		else if ("way".equals(sub))
			return WiktionaryWAY000.get(name);
		else if ("waz".equals(sub))
			return WiktionaryWAZ000.get(name);
		else if ("wea".equals(sub))
			return WiktionaryWEA000.get(name);
		else if ("web".equals(sub))
			return WiktionaryWEB000.get(name);
		else if ("wed".equals(sub))
			return WiktionaryWED000.get(name);
		else if ("wee".equals(sub))
			return WiktionaryWEE000.get(name);
		else if ("weg".equals(sub))
			return WiktionaryWEG000.get(name);
		else if ("wei".equals(sub))
			return WiktionaryWEI000.get(name);
		else if ("wel".equals(sub))
			return WiktionaryWEL000.get(name);
		else if ("wen".equals(sub))
			return WiktionaryWEN000.get(name);
		else if ("wer".equals(sub))
			return WiktionaryWER000.get(name);
		else if ("wes".equals(sub))
			return WiktionaryWES000.get(name);
		else if ("wet".equals(sub))
			return WiktionaryWET000.get(name);
		else if ("wha".equals(sub))
			return WiktionaryWHA000.get(name);
		else if ("whe".equals(sub))
			return WiktionaryWHE000.get(name);
		else if ("whi".equals(sub))
			return WiktionaryWHI000.get(name);
		else if ("who".equals(sub))
			return WiktionaryWHO000.get(name);
		else if ("whu".equals(sub))
			return WiktionaryWHU000.get(name);
		else if ("wic".equals(sub))
			return WiktionaryWIC000.get(name);
		else if ("wid".equals(sub))
			return WiktionaryWID000.get(name);
		else if ("wif".equals(sub))
			return WiktionaryWIF000.get(name);
		else if ("wig".equals(sub))
			return WiktionaryWIG000.get(name);
		else if ("wik".equals(sub))
			return WiktionaryWIK000.get(name);
		else if ("wil".equals(sub))
			return WiktionaryWIL000.get(name);
		else if ("wim".equals(sub))
			return WiktionaryWIM000.get(name);
		else if ("win".equals(sub))
			return WiktionaryWIN000.get(name);
		else if ("wip".equals(sub))
			return WiktionaryWIP000.get(name);
		else if ("wir".equals(sub))
			return WiktionaryWIR000.get(name);
		else if ("wis".equals(sub))
			return WiktionaryWIS000.get(name);
		else if ("wit".equals(sub))
			return WiktionaryWIT000.get(name);
		else if ("wiz".equals(sub))
			return WiktionaryWIZ000.get(name);
		else if ("wla".equals(sub))
			return WiktionaryWLA000.get(name);
		else if ("woa".equals(sub))
			return WiktionaryWOA000.get(name);
		else if ("wob".equals(sub))
			return WiktionaryWOB000.get(name);
		else if ("wod".equals(sub))
			return WiktionaryWOD000.get(name);
		else if ("wog".equals(sub))
			return WiktionaryWOG000.get(name);
		else if ("wok".equals(sub))
			return WiktionaryWOK000.get(name);
		else if ("wol".equals(sub))
			return WiktionaryWOL000.get(name);
		else if ("wom".equals(sub))
			return WiktionaryWOM000.get(name);
		else if ("won".equals(sub))
			return WiktionaryWON000.get(name);
		else if ("woo".equals(sub))
			return WiktionaryWOO000.get(name);
		else if ("wor".equals(sub))
			return WiktionaryWOR000.get(name);
		else if ("wou".equals(sub))
			return WiktionaryWOU000.get(name);
		else if ("wow".equals(sub))
			return WiktionaryWOW000.get(name);
		else if ("wra".equals(sub))
			return WiktionaryWRA000.get(name);
		else if ("wre".equals(sub))
			return WiktionaryWRE000.get(name);
		else if ("wri".equals(sub))
			return WiktionaryWRI000.get(name);
		else if ("wro".equals(sub))
			return WiktionaryWRO000.get(name);
		else if ("wry".equals(sub))
			return WiktionaryWRY000.get(name);
		else if ("wud".equals(sub))
			return WiktionaryWUD000.get(name);
		else if ("wul".equals(sub))
			return WiktionaryWUL000.get(name);
		else if ("wus".equals(sub))
			return WiktionaryWUS000.get(name);
		else if ("wyn".equals(sub))
			return WiktionaryWYN000.get(name);
		else if ("wyo".equals(sub))
			return WiktionaryWYO000.get(name);
		else if ("wyt".equals(sub))
			return WiktionaryWYT000.get(name);
		else if ("wyv".equals(sub))
			return WiktionaryWYV000.get(name);
		return null;
	}
}