package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.m.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.q.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.m.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.m.b.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.m.b.u.*;
import org.swtk.commons.dict.wiktionary.generated.m.c.c.*;
import org.swtk.commons.dict.wiktionary.generated.m.c.w.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.m.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.m.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.m.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.m.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.m.m.o.*;
import org.swtk.commons.dict.wiktionary.generated.m.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.m.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.m.p.t.*;
import org.swtk.commons.dict.wiktionary.generated.m.r.s.*;
import org.swtk.commons.dict.wiktionary.generated.m.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.h.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.u.*;
import org.swtk.commons.dict.wiktionary.generated.m.u.z.*;
import org.swtk.commons.dict.wiktionary.generated.m.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.k.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.t.*;
import org.swtk.commons.dict.wiktionary.generated.m.y.x.*;
import org.swtk.commons.dict.wiktionary.generated.m.z.e.*;

public final class WiktionaryDbM {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("maa".equals(sub))
			return WiktionaryMAA000.get(name);
		else if ("mab".equals(sub))
			return WiktionaryMAB000.get(name);
		else if ("mac".equals(sub))
			return WiktionaryMAC000.get(name);
		else if ("mad".equals(sub))
			return WiktionaryMAD000.get(name);
		else if ("mae".equals(sub))
			return WiktionaryMAE000.get(name);
		else if ("maf".equals(sub))
			return WiktionaryMAF000.get(name);
		else if ("mag".equals(sub))
			return WiktionaryMAG000.get(name);
		else if ("mah".equals(sub))
			return WiktionaryMAH000.get(name);
		else if ("mai".equals(sub))
			return WiktionaryMAI000.get(name);
		else if ("maj".equals(sub))
			return WiktionaryMAJ000.get(name);
		else if ("mak".equals(sub))
			return WiktionaryMAK000.get(name);
		else if ("mal".equals(sub))
			return WiktionaryMAL000.get(name);
		else if ("mam".equals(sub))
			return WiktionaryMAM000.get(name);
		else if ("man".equals(sub))
			return WiktionaryMAN000.get(name);
		else if ("map".equals(sub))
			return WiktionaryMAP000.get(name);
		else if ("maq".equals(sub))
			return WiktionaryMAQ000.get(name);
		else if ("mar".equals(sub))
			return WiktionaryMAR000.get(name);
		else if ("mas".equals(sub))
			return WiktionaryMAS000.get(name);
		else if ("mat".equals(sub))
			return WiktionaryMAT000.get(name);
		else if ("mau".equals(sub))
			return WiktionaryMAU000.get(name);
		else if ("mav".equals(sub))
			return WiktionaryMAV000.get(name);
		else if ("maw".equals(sub))
			return WiktionaryMAW000.get(name);
		else if ("max".equals(sub))
			return WiktionaryMAX000.get(name);
		else if ("may".equals(sub))
			return WiktionaryMAY000.get(name);
		else if ("maz".equals(sub))
			return WiktionaryMAZ000.get(name);
		else if ("mba".equals(sub))
			return WiktionaryMBA000.get(name);
		else if ("mbo".equals(sub))
			return WiktionaryMBO000.get(name);
		else if ("mbu".equals(sub))
			return WiktionaryMBU000.get(name);
		else if ("mcc".equals(sub))
			return WiktionaryMCC000.get(name);
		else if ("mcw".equals(sub))
			return WiktionaryMCW000.get(name);
		else if ("mea".equals(sub))
			return WiktionaryMEA000.get(name);
		else if ("meb".equals(sub))
			return WiktionaryMEB000.get(name);
		else if ("mec".equals(sub))
			return WiktionaryMEC000.get(name);
		else if ("med".equals(sub))
			return WiktionaryMED000.get(name);
		else if ("mee".equals(sub))
			return WiktionaryMEE000.get(name);
		else if ("meg".equals(sub))
			return WiktionaryMEG000.get(name);
		else if ("mei".equals(sub))
			return WiktionaryMEI000.get(name);
		else if ("mel".equals(sub))
			return WiktionaryMEL000.get(name);
		else if ("mem".equals(sub))
			return WiktionaryMEM000.get(name);
		else if ("men".equals(sub))
			return WiktionaryMEN000.get(name);
		else if ("meo".equals(sub))
			return WiktionaryMEO000.get(name);
		else if ("mep".equals(sub))
			return WiktionaryMEP000.get(name);
		else if ("mer".equals(sub))
			return WiktionaryMER000.get(name);
		else if ("mes".equals(sub))
			return WiktionaryMES000.get(name);
		else if ("met".equals(sub))
			return WiktionaryMET000.get(name);
		else if ("mex".equals(sub))
			return WiktionaryMEX000.get(name);
		else if ("mez".equals(sub))
			return WiktionaryMEZ000.get(name);
		else if ("mho".equals(sub))
			return WiktionaryMHO000.get(name);
		else if ("mia".equals(sub))
			return WiktionaryMIA000.get(name);
		else if ("mib".equals(sub))
			return WiktionaryMIB000.get(name);
		else if ("mic".equals(sub))
			return WiktionaryMIC000.get(name);
		else if ("mid".equals(sub))
			return WiktionaryMID000.get(name);
		else if ("mif".equals(sub))
			return WiktionaryMIF000.get(name);
		else if ("mig".equals(sub))
			return WiktionaryMIG000.get(name);
		else if ("mij".equals(sub))
			return WiktionaryMIJ000.get(name);
		else if ("mik".equals(sub))
			return WiktionaryMIK000.get(name);
		else if ("mil".equals(sub))
			return WiktionaryMIL000.get(name);
		else if ("mim".equals(sub))
			return WiktionaryMIM000.get(name);
		else if ("min".equals(sub))
			return WiktionaryMIN000.get(name);
		else if ("mir".equals(sub))
			return WiktionaryMIR000.get(name);
		else if ("mis".equals(sub))
			return WiktionaryMIS000.get(name);
		else if ("mit".equals(sub))
			return WiktionaryMIT000.get(name);
		else if ("mix".equals(sub))
			return WiktionaryMIX000.get(name);
		else if ("miz".equals(sub))
			return WiktionaryMIZ000.get(name);
		else if ("mlo".equals(sub))
			return WiktionaryMLO000.get(name);
		else if ("mmo".equals(sub))
			return WiktionaryMMO000.get(name);
		else if ("mne".equals(sub))
			return WiktionaryMNE000.get(name);
		else if ("moa".equals(sub))
			return WiktionaryMOA000.get(name);
		else if ("mob".equals(sub))
			return WiktionaryMOB000.get(name);
		else if ("moc".equals(sub))
			return WiktionaryMOC000.get(name);
		else if ("mod".equals(sub))
			return WiktionaryMOD000.get(name);
		else if ("moe".equals(sub))
			return WiktionaryMOE000.get(name);
		else if ("mof".equals(sub))
			return WiktionaryMOF000.get(name);
		else if ("mog".equals(sub))
			return WiktionaryMOG000.get(name);
		else if ("moh".equals(sub))
			return WiktionaryMOH000.get(name);
		else if ("moi".equals(sub))
			return WiktionaryMOI000.get(name);
		else if ("moj".equals(sub))
			return WiktionaryMOJ000.get(name);
		else if ("mok".equals(sub))
			return WiktionaryMOK000.get(name);
		else if ("mol".equals(sub))
			return WiktionaryMOL000.get(name);
		else if ("mom".equals(sub))
			return WiktionaryMOM000.get(name);
		else if ("mon".equals(sub))
			return WiktionaryMON000.get(name);
		else if ("moo".equals(sub))
			return WiktionaryMOO000.get(name);
		else if ("mop".equals(sub))
			return WiktionaryMOP000.get(name);
		else if ("mor".equals(sub))
			return WiktionaryMOR000.get(name);
		else if ("mos".equals(sub))
			return WiktionaryMOS000.get(name);
		else if ("mot".equals(sub))
			return WiktionaryMOT000.get(name);
		else if ("mou".equals(sub))
			return WiktionaryMOU000.get(name);
		else if ("mov".equals(sub))
			return WiktionaryMOV000.get(name);
		else if ("mow".equals(sub))
			return WiktionaryMOW000.get(name);
		else if ("mox".equals(sub))
			return WiktionaryMOX000.get(name);
		else if ("moz".equals(sub))
			return WiktionaryMOZ000.get(name);
		else if ("mpt".equals(sub))
			return WiktionaryMPT000.get(name);
		else if ("mrs".equals(sub))
			return WiktionaryMRS000.get(name);
		else if ("mse".equals(sub))
			return WiktionaryMSE000.get(name);
		else if ("mua".equals(sub))
			return WiktionaryMUA000.get(name);
		else if ("muc".equals(sub))
			return WiktionaryMUC000.get(name);
		else if ("mud".equals(sub))
			return WiktionaryMUD000.get(name);
		else if ("muf".equals(sub))
			return WiktionaryMUF000.get(name);
		else if ("mug".equals(sub))
			return WiktionaryMUG000.get(name);
		else if ("muh".equals(sub))
			return WiktionaryMUH000.get(name);
		else if ("muj".equals(sub))
			return WiktionaryMUJ000.get(name);
		else if ("muk".equals(sub))
			return WiktionaryMUK000.get(name);
		else if ("mul".equals(sub))
			return WiktionaryMUL000.get(name);
		else if ("mum".equals(sub))
			return WiktionaryMUM000.get(name);
		else if ("mun".equals(sub))
			return WiktionaryMUN000.get(name);
		else if ("mup".equals(sub))
			return WiktionaryMUP000.get(name);
		else if ("mur".equals(sub))
			return WiktionaryMUR000.get(name);
		else if ("mus".equals(sub))
			return WiktionaryMUS000.get(name);
		else if ("mut".equals(sub))
			return WiktionaryMUT000.get(name);
		else if ("muu".equals(sub))
			return WiktionaryMUU000.get(name);
		else if ("muz".equals(sub))
			return WiktionaryMUZ000.get(name);
		else if ("mwa".equals(sub))
			return WiktionaryMWA000.get(name);
		else if ("mya".equals(sub))
			return WiktionaryMYA000.get(name);
		else if ("myc".equals(sub))
			return WiktionaryMYC000.get(name);
		else if ("mye".equals(sub))
			return WiktionaryMYE000.get(name);
		else if ("myk".equals(sub))
			return WiktionaryMYK000.get(name);
		else if ("myo".equals(sub))
			return WiktionaryMYO000.get(name);
		else if ("myr".equals(sub))
			return WiktionaryMYR000.get(name);
		else if ("mys".equals(sub))
			return WiktionaryMYS000.get(name);
		else if ("myt".equals(sub))
			return WiktionaryMYT000.get(name);
		else if ("myx".equals(sub))
			return WiktionaryMYX000.get(name);
		else if ("mze".equals(sub))
			return WiktionaryMZE000.get(name);
		return null;
	}
}