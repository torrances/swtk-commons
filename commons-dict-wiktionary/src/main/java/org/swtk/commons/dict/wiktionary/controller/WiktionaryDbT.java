package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.t.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.b.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.t.j.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.z.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.z.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.z.i.*;

public final class WiktionaryDbT {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("taa".equals(sub))
			return WiktionaryTAA000.get(name);
		else if ("tab".equals(sub))
			return WiktionaryTAB000.get(name);
		else if ("tac".equals(sub))
			return WiktionaryTAC000.get(name);
		else if ("tad".equals(sub))
			return WiktionaryTAD000.get(name);
		else if ("tae".equals(sub))
			return WiktionaryTAE000.get(name);
		else if ("tag".equals(sub))
			return WiktionaryTAG000.get(name);
		else if ("tah".equals(sub))
			return WiktionaryTAH000.get(name);
		else if ("tai".equals(sub))
			return WiktionaryTAI000.get(name);
		else if ("taj".equals(sub))
			return WiktionaryTAJ000.get(name);
		else if ("tak".equals(sub))
			return WiktionaryTAK000.get(name);
		else if ("tal".equals(sub))
			return WiktionaryTAL000.get(name);
		else if ("tam".equals(sub))
			return WiktionaryTAM000.get(name);
		else if ("tan".equals(sub))
			return WiktionaryTAN000.get(name);
		else if ("tao".equals(sub))
			return WiktionaryTAO000.get(name);
		else if ("tap".equals(sub))
			return WiktionaryTAP000.get(name);
		else if ("taq".equals(sub))
			return WiktionaryTAQ000.get(name);
		else if ("tar".equals(sub))
			return WiktionaryTAR000.get(name);
		else if ("tas".equals(sub))
			return WiktionaryTAS000.get(name);
		else if ("tat".equals(sub))
			return WiktionaryTAT000.get(name);
		else if ("tau".equals(sub))
			return WiktionaryTAU000.get(name);
		else if ("tav".equals(sub))
			return WiktionaryTAV000.get(name);
		else if ("taw".equals(sub))
			return WiktionaryTAW000.get(name);
		else if ("tax".equals(sub))
			return WiktionaryTAX000.get(name);
		else if ("tbi".equals(sub))
			return WiktionaryTBI000.get(name);
		else if ("tch".equals(sub))
			return WiktionaryTCH000.get(name);
		else if ("tea".equals(sub))
			return WiktionaryTEA000.get(name);
		else if ("teb".equals(sub))
			return WiktionaryTEB000.get(name);
		else if ("tec".equals(sub))
			return WiktionaryTEC000.get(name);
		else if ("ted".equals(sub))
			return WiktionaryTED000.get(name);
		else if ("tee".equals(sub))
			return WiktionaryTEE000.get(name);
		else if ("teg".equals(sub))
			return WiktionaryTEG000.get(name);
		else if ("teh".equals(sub))
			return WiktionaryTEH000.get(name);
		else if ("tei".equals(sub))
			return WiktionaryTEI000.get(name);
		else if ("tek".equals(sub))
			return WiktionaryTEK000.get(name);
		else if ("tel".equals(sub))
			return WiktionaryTEL000.get(name);
		else if ("tem".equals(sub))
			return WiktionaryTEM000.get(name);
		else if ("ten".equals(sub))
			return WiktionaryTEN000.get(name);
		else if ("teo".equals(sub))
			return WiktionaryTEO000.get(name);
		else if ("tep".equals(sub))
			return WiktionaryTEP000.get(name);
		else if ("ter".equals(sub))
			return WiktionaryTER000.get(name);
		else if ("tes".equals(sub))
			return WiktionaryTES000.get(name);
		else if ("tet".equals(sub))
			return WiktionaryTET000.get(name);
		else if ("teu".equals(sub))
			return WiktionaryTEU000.get(name);
		else if ("tew".equals(sub))
			return WiktionaryTEW000.get(name);
		else if ("tex".equals(sub))
			return WiktionaryTEX000.get(name);
		else if ("tez".equals(sub))
			return WiktionaryTEZ000.get(name);
		else if ("tha".equals(sub))
			return WiktionaryTHA000.get(name);
		else if ("the".equals(sub))
			return WiktionaryTHE000.get(name);
		else if ("thi".equals(sub))
			return WiktionaryTHI000.get(name);
		else if ("thn".equals(sub))
			return WiktionaryTHN000.get(name);
		else if ("tho".equals(sub))
			return WiktionaryTHO000.get(name);
		else if ("thr".equals(sub))
			return WiktionaryTHR000.get(name);
		else if ("thu".equals(sub))
			return WiktionaryTHU000.get(name);
		else if ("thw".equals(sub))
			return WiktionaryTHW000.get(name);
		else if ("thy".equals(sub))
			return WiktionaryTHY000.get(name);
		else if ("tia".equals(sub))
			return WiktionaryTIA000.get(name);
		else if ("tib".equals(sub))
			return WiktionaryTIB000.get(name);
		else if ("tic".equals(sub))
			return WiktionaryTIC000.get(name);
		else if ("tid".equals(sub))
			return WiktionaryTID000.get(name);
		else if ("tie".equals(sub))
			return WiktionaryTIE000.get(name);
		else if ("tif".equals(sub))
			return WiktionaryTIF000.get(name);
		else if ("tig".equals(sub))
			return WiktionaryTIG000.get(name);
		else if ("tik".equals(sub))
			return WiktionaryTIK000.get(name);
		else if ("til".equals(sub))
			return WiktionaryTIL000.get(name);
		else if ("tim".equals(sub))
			return WiktionaryTIM000.get(name);
		else if ("tin".equals(sub))
			return WiktionaryTIN000.get(name);
		else if ("tio".equals(sub))
			return WiktionaryTIO000.get(name);
		else if ("tip".equals(sub))
			return WiktionaryTIP000.get(name);
		else if ("tiq".equals(sub))
			return WiktionaryTIQ000.get(name);
		else if ("tir".equals(sub))
			return WiktionaryTIR000.get(name);
		else if ("tis".equals(sub))
			return WiktionaryTIS000.get(name);
		else if ("tit".equals(sub))
			return WiktionaryTIT000.get(name);
		else if ("tiv".equals(sub))
			return WiktionaryTIV000.get(name);
		else if ("tiz".equals(sub))
			return WiktionaryTIZ000.get(name);
		else if ("tja".equals(sub))
			return WiktionaryTJA000.get(name);
		else if ("toa".equals(sub))
			return WiktionaryTOA000.get(name);
		else if ("tob".equals(sub))
			return WiktionaryTOB000.get(name);
		else if ("toc".equals(sub))
			return WiktionaryTOC000.get(name);
		else if ("tod".equals(sub))
			return WiktionaryTOD000.get(name);
		else if ("toe".equals(sub))
			return WiktionaryTOE000.get(name);
		else if ("tof".equals(sub))
			return WiktionaryTOF000.get(name);
		else if ("tog".equals(sub))
			return WiktionaryTOG000.get(name);
		else if ("toi".equals(sub))
			return WiktionaryTOI000.get(name);
		else if ("tok".equals(sub))
			return WiktionaryTOK000.get(name);
		else if ("tol".equals(sub))
			return WiktionaryTOL000.get(name);
		else if ("tom".equals(sub))
			return WiktionaryTOM000.get(name);
		else if ("ton".equals(sub))
			return WiktionaryTON000.get(name);
		else if ("too".equals(sub))
			return WiktionaryTOO000.get(name);
		else if ("top".equals(sub))
			return WiktionaryTOP000.get(name);
		else if ("tor".equals(sub))
			return WiktionaryTOR000.get(name);
		else if ("tos".equals(sub))
			return WiktionaryTOS000.get(name);
		else if ("tot".equals(sub))
			return WiktionaryTOT000.get(name);
		else if ("tou".equals(sub))
			return WiktionaryTOU000.get(name);
		else if ("tov".equals(sub))
			return WiktionaryTOV000.get(name);
		else if ("tow".equals(sub))
			return WiktionaryTOW000.get(name);
		else if ("tox".equals(sub))
			return WiktionaryTOX000.get(name);
		else if ("toy".equals(sub))
			return WiktionaryTOY000.get(name);
		else if ("tra".equals(sub))
			return WiktionaryTRA000.get(name);
		else if ("tre".equals(sub))
			return WiktionaryTRE000.get(name);
		else if ("tri".equals(sub))
			return WiktionaryTRI000.get(name);
		else if ("tro".equals(sub))
			return WiktionaryTRO000.get(name);
		else if ("tru".equals(sub))
			return WiktionaryTRU000.get(name);
		else if ("try".equals(sub))
			return WiktionaryTRY000.get(name);
		else if ("tsa".equals(sub))
			return WiktionaryTSA000.get(name);
		else if ("tsc".equals(sub))
			return WiktionaryTSC000.get(name);
		else if ("tse".equals(sub))
			return WiktionaryTSE000.get(name);
		else if ("tsi".equals(sub))
			return WiktionaryTSI000.get(name);
		else if ("tso".equals(sub))
			return WiktionaryTSO000.get(name);
		else if ("tsr".equals(sub))
			return WiktionaryTSR000.get(name);
		else if ("tsu".equals(sub))
			return WiktionaryTSU000.get(name);
		else if ("tte".equals(sub))
			return WiktionaryTTE000.get(name);
		else if ("tua".equals(sub))
			return WiktionaryTUA000.get(name);
		else if ("tub".equals(sub))
			return WiktionaryTUB000.get(name);
		else if ("tuc".equals(sub))
			return WiktionaryTUC000.get(name);
		else if ("tug".equals(sub))
			return WiktionaryTUG000.get(name);
		else if ("tui".equals(sub))
			return WiktionaryTUI000.get(name);
		else if ("tul".equals(sub))
			return WiktionaryTUL000.get(name);
		else if ("tum".equals(sub))
			return WiktionaryTUM000.get(name);
		else if ("tun".equals(sub))
			return WiktionaryTUN000.get(name);
		else if ("tup".equals(sub))
			return WiktionaryTUP000.get(name);
		else if ("tuq".equals(sub))
			return WiktionaryTUQ000.get(name);
		else if ("tur".equals(sub))
			return WiktionaryTUR000.get(name);
		else if ("tus".equals(sub))
			return WiktionaryTUS000.get(name);
		else if ("tut".equals(sub))
			return WiktionaryTUT000.get(name);
		else if ("tux".equals(sub))
			return WiktionaryTUX000.get(name);
		else if ("tuy".equals(sub))
			return WiktionaryTUY000.get(name);
		else if ("twa".equals(sub))
			return WiktionaryTWA000.get(name);
		else if ("twe".equals(sub))
			return WiktionaryTWE000.get(name);
		else if ("twi".equals(sub))
			return WiktionaryTWI000.get(name);
		else if ("two".equals(sub))
			return WiktionaryTWO000.get(name);
		else if ("tyc".equals(sub))
			return WiktionaryTYC000.get(name);
		else if ("tyi".equals(sub))
			return WiktionaryTYI000.get(name);
		else if ("tyl".equals(sub))
			return WiktionaryTYL000.get(name);
		else if ("tym".equals(sub))
			return WiktionaryTYM000.get(name);
		else if ("typ".equals(sub))
			return WiktionaryTYP000.get(name);
		else if ("tyr".equals(sub))
			return WiktionaryTYR000.get(name);
		else if ("tza".equals(sub))
			return WiktionaryTZA000.get(name);
		else if ("tze".equals(sub))
			return WiktionaryTZE000.get(name);
		else if ("tzi".equals(sub))
			return WiktionaryTZI000.get(name);
		return null;
	}
}