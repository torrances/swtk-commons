package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.g.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.g.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.g.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.g.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.g.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.g.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.g.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.g.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.g.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.g.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.g.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.g.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.g.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.g.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.g.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.g.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.g.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.g.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.h.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.q.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.y.*;
import org.swtk.commons.dict.wiktionary.generated.g.u.z.*;
import org.swtk.commons.dict.wiktionary.generated.g.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.g.w.i.*;
import org.swtk.commons.dict.wiktionary.generated.g.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.g.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.g.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.g.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.g.y.v.*;

public final class WiktionaryDbG {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("gab".equals(sub))
			return WiktionaryGAB000.get(name);
		else if ("gad".equals(sub))
			return WiktionaryGAD000.get(name);
		else if ("gae".equals(sub))
			return WiktionaryGAE000.get(name);
		else if ("gaf".equals(sub))
			return WiktionaryGAF000.get(name);
		else if ("gag".equals(sub))
			return WiktionaryGAG000.get(name);
		else if ("gai".equals(sub))
			return WiktionaryGAI000.get(name);
		else if ("gaj".equals(sub))
			return WiktionaryGAJ000.get(name);
		else if ("gal".equals(sub))
			return WiktionaryGAL000.get(name);
		else if ("gam".equals(sub))
			return WiktionaryGAM000.get(name);
		else if ("gan".equals(sub))
			return WiktionaryGAN000.get(name);
		else if ("gao".equals(sub))
			return WiktionaryGAO000.get(name);
		else if ("gap".equals(sub))
			return WiktionaryGAP000.get(name);
		else if ("gar".equals(sub))
			return WiktionaryGAR000.get(name);
		else if ("gas".equals(sub))
			return WiktionaryGAS000.get(name);
		else if ("gat".equals(sub))
			return WiktionaryGAT000.get(name);
		else if ("gau".equals(sub))
			return WiktionaryGAU000.get(name);
		else if ("gav".equals(sub))
			return WiktionaryGAV000.get(name);
		else if ("gay".equals(sub))
			return WiktionaryGAY000.get(name);
		else if ("gaz".equals(sub))
			return WiktionaryGAZ000.get(name);
		else if ("gea".equals(sub))
			return WiktionaryGEA000.get(name);
		else if ("gee".equals(sub))
			return WiktionaryGEE000.get(name);
		else if ("geh".equals(sub))
			return WiktionaryGEH000.get(name);
		else if ("gei".equals(sub))
			return WiktionaryGEI000.get(name);
		else if ("gel".equals(sub))
			return WiktionaryGEL000.get(name);
		else if ("gem".equals(sub))
			return WiktionaryGEM000.get(name);
		else if ("gen".equals(sub))
			return WiktionaryGEN000.get(name);
		else if ("geo".equals(sub))
			return WiktionaryGEO000.get(name);
		else if ("gep".equals(sub))
			return WiktionaryGEP000.get(name);
		else if ("ger".equals(sub))
			return WiktionaryGER000.get(name);
		else if ("ges".equals(sub))
			return WiktionaryGES000.get(name);
		else if ("gew".equals(sub))
			return WiktionaryGEW000.get(name);
		else if ("gey".equals(sub))
			return WiktionaryGEY000.get(name);
		else if ("ghe".equals(sub))
			return WiktionaryGHE000.get(name);
		else if ("gho".equals(sub))
			return WiktionaryGHO000.get(name);
		else if ("gia".equals(sub))
			return WiktionaryGIA000.get(name);
		else if ("gib".equals(sub))
			return WiktionaryGIB000.get(name);
		else if ("gic".equals(sub))
			return WiktionaryGIC000.get(name);
		else if ("gid".equals(sub))
			return WiktionaryGID000.get(name);
		else if ("gie".equals(sub))
			return WiktionaryGIE000.get(name);
		else if ("gif".equals(sub))
			return WiktionaryGIF000.get(name);
		else if ("gig".equals(sub))
			return WiktionaryGIG000.get(name);
		else if ("gil".equals(sub))
			return WiktionaryGIL000.get(name);
		else if ("gim".equals(sub))
			return WiktionaryGIM000.get(name);
		else if ("gin".equals(sub))
			return WiktionaryGIN000.get(name);
		else if ("gip".equals(sub))
			return WiktionaryGIP000.get(name);
		else if ("gir".equals(sub))
			return WiktionaryGIR000.get(name);
		else if ("gis".equals(sub))
			return WiktionaryGIS000.get(name);
		else if ("git".equals(sub))
			return WiktionaryGIT000.get(name);
		else if ("giv".equals(sub))
			return WiktionaryGIV000.get(name);
		else if ("giz".equals(sub))
			return WiktionaryGIZ000.get(name);
		else if ("gla".equals(sub))
			return WiktionaryGLA000.get(name);
		else if ("gle".equals(sub))
			return WiktionaryGLE000.get(name);
		else if ("gli".equals(sub))
			return WiktionaryGLI000.get(name);
		else if ("glo".equals(sub))
			return WiktionaryGLO000.get(name);
		else if ("glu".equals(sub))
			return WiktionaryGLU000.get(name);
		else if ("gly".equals(sub))
			return WiktionaryGLY000.get(name);
		else if ("gna".equals(sub))
			return WiktionaryGNA000.get(name);
		else if ("gno".equals(sub))
			return WiktionaryGNO000.get(name);
		else if ("goa".equals(sub))
			return WiktionaryGOA000.get(name);
		else if ("gob".equals(sub))
			return WiktionaryGOB000.get(name);
		else if ("goc".equals(sub))
			return WiktionaryGOC000.get(name);
		else if ("god".equals(sub))
			return WiktionaryGOD000.get(name);
		else if ("goe".equals(sub))
			return WiktionaryGOE000.get(name);
		else if ("gog".equals(sub))
			return WiktionaryGOG000.get(name);
		else if ("goi".equals(sub))
			return WiktionaryGOI000.get(name);
		else if ("goj".equals(sub))
			return WiktionaryGOJ000.get(name);
		else if ("gok".equals(sub))
			return WiktionaryGOK000.get(name);
		else if ("gol".equals(sub))
			return WiktionaryGOL000.get(name);
		else if ("gom".equals(sub))
			return WiktionaryGOM000.get(name);
		else if ("gon".equals(sub))
			return WiktionaryGON000.get(name);
		else if ("goo".equals(sub))
			return WiktionaryGOO000.get(name);
		else if ("gop".equals(sub))
			return WiktionaryGOP000.get(name);
		else if ("gor".equals(sub))
			return WiktionaryGOR000.get(name);
		else if ("gos".equals(sub))
			return WiktionaryGOS000.get(name);
		else if ("got".equals(sub))
			return WiktionaryGOT000.get(name);
		else if ("gou".equals(sub))
			return WiktionaryGOU000.get(name);
		else if ("gov".equals(sub))
			return WiktionaryGOV000.get(name);
		else if ("gow".equals(sub))
			return WiktionaryGOW000.get(name);
		else if ("gra".equals(sub))
			return WiktionaryGRA000.get(name);
		else if ("gre".equals(sub))
			return WiktionaryGRE000.get(name);
		else if ("gri".equals(sub))
			return WiktionaryGRI000.get(name);
		else if ("gro".equals(sub))
			return WiktionaryGRO000.get(name);
		else if ("gru".equals(sub))
			return WiktionaryGRU000.get(name);
		else if ("gry".equals(sub))
			return WiktionaryGRY000.get(name);
		else if ("gua".equals(sub))
			return WiktionaryGUA000.get(name);
		else if ("gub".equals(sub))
			return WiktionaryGUB000.get(name);
		else if ("gue".equals(sub))
			return WiktionaryGUE000.get(name);
		else if ("guf".equals(sub))
			return WiktionaryGUF000.get(name);
		else if ("gug".equals(sub))
			return WiktionaryGUG000.get(name);
		else if ("guh".equals(sub))
			return WiktionaryGUH000.get(name);
		else if ("gui".equals(sub))
			return WiktionaryGUI000.get(name);
		else if ("gul".equals(sub))
			return WiktionaryGUL000.get(name);
		else if ("gum".equals(sub))
			return WiktionaryGUM000.get(name);
		else if ("gun".equals(sub))
			return WiktionaryGUN000.get(name);
		else if ("guq".equals(sub))
			return WiktionaryGUQ000.get(name);
		else if ("gur".equals(sub))
			return WiktionaryGUR000.get(name);
		else if ("gus".equals(sub))
			return WiktionaryGUS000.get(name);
		else if ("gut".equals(sub))
			return WiktionaryGUT000.get(name);
		else if ("guy".equals(sub))
			return WiktionaryGUY000.get(name);
		else if ("guz".equals(sub))
			return WiktionaryGUZ000.get(name);
		else if ("gwe".equals(sub))
			return WiktionaryGWE000.get(name);
		else if ("gwi".equals(sub))
			return WiktionaryGWI000.get(name);
		else if ("gym".equals(sub))
			return WiktionaryGYM000.get(name);
		else if ("gyn".equals(sub))
			return WiktionaryGYN000.get(name);
		else if ("gyp".equals(sub))
			return WiktionaryGYP000.get(name);
		else if ("gyr".equals(sub))
			return WiktionaryGYR000.get(name);
		else if ("gyv".equals(sub))
			return WiktionaryGYV000.get(name);
		return null;
	}
}