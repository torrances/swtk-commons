package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.s.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.q.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.c.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.j.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.s.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.f.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.g.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.t.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.s.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.s.j.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.k.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.k.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.k.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.k.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.k.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.k.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.m.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.m.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.m.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.n.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.s.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.h.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.p.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.q.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.f.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.u.*;
import org.swtk.commons.dict.wiktionary.generated.s.t.y.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.s.u.z.*;
import org.swtk.commons.dict.wiktionary.generated.s.v.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.s.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.s.w.i.*;
import org.swtk.commons.dict.wiktionary.generated.s.w.o.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.b.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.s.y.z.*;
import org.swtk.commons.dict.wiktionary.generated.s.z.a.*;

public final class WiktionaryDbS {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("saa".equals(sub))
			return WiktionarySAA000.get(name);
		else if ("sab".equals(sub))
			return WiktionarySAB000.get(name);
		else if ("sac".equals(sub))
			return WiktionarySAC000.get(name);
		else if ("sad".equals(sub))
			return WiktionarySAD000.get(name);
		else if ("saf".equals(sub))
			return WiktionarySAF000.get(name);
		else if ("sag".equals(sub))
			return WiktionarySAG000.get(name);
		else if ("sah".equals(sub))
			return WiktionarySAH000.get(name);
		else if ("sai".equals(sub))
			return WiktionarySAI000.get(name);
		else if ("sak".equals(sub))
			return WiktionarySAK000.get(name);
		else if ("sal".equals(sub))
			return WiktionarySAL000.get(name);
		else if ("sam".equals(sub))
			return WiktionarySAM000.get(name);
		else if ("san".equals(sub))
			return WiktionarySAN000.get(name);
		else if ("sap".equals(sub))
			return WiktionarySAP000.get(name);
		else if ("saq".equals(sub))
			return WiktionarySAQ000.get(name);
		else if ("sar".equals(sub))
			return WiktionarySAR000.get(name);
		else if ("sas".equals(sub))
			return WiktionarySAS000.get(name);
		else if ("sat".equals(sub))
			return WiktionarySAT000.get(name);
		else if ("sau".equals(sub))
			return WiktionarySAU000.get(name);
		else if ("sav".equals(sub))
			return WiktionarySAV000.get(name);
		else if ("saw".equals(sub))
			return WiktionarySAW000.get(name);
		else if ("sax".equals(sub))
			return WiktionarySAX000.get(name);
		else if ("say".equals(sub))
			return WiktionarySAY000.get(name);
		else if ("saz".equals(sub))
			return WiktionarySAZ000.get(name);
		else if ("sca".equals(sub))
			return WiktionarySCA000.get(name);
		else if ("sce".equals(sub))
			return WiktionarySCE000.get(name);
		else if ("sch".equals(sub))
			return WiktionarySCH000.get(name);
		else if ("sci".equals(sub))
			return WiktionarySCI000.get(name);
		else if ("scl".equals(sub))
			return WiktionarySCL000.get(name);
		else if ("sco".equals(sub))
			return WiktionarySCO000.get(name);
		else if ("scr".equals(sub))
			return WiktionarySCR000.get(name);
		else if ("scu".equals(sub))
			return WiktionarySCU000.get(name);
		else if ("scy".equals(sub))
			return WiktionarySCY000.get(name);
		else if ("sea".equals(sub))
			return WiktionarySEA000.get(name);
		else if ("seb".equals(sub))
			return WiktionarySEB000.get(name);
		else if ("sec".equals(sub))
			return WiktionarySEC000.get(name);
		else if ("sed".equals(sub))
			return WiktionarySED000.get(name);
		else if ("see".equals(sub))
			return WiktionarySEE000.get(name);
		else if ("seg".equals(sub))
			return WiktionarySEG000.get(name);
		else if ("sei".equals(sub))
			return WiktionarySEI000.get(name);
		else if ("sej".equals(sub))
			return WiktionarySEJ000.get(name);
		else if ("sek".equals(sub))
			return WiktionarySEK000.get(name);
		else if ("sel".equals(sub))
			return WiktionarySEL000.get(name);
		else if ("sem".equals(sub))
			return WiktionarySEM000.get(name);
		else if ("sen".equals(sub))
			return WiktionarySEN000.get(name);
		else if ("sep".equals(sub))
			return WiktionarySEP000.get(name);
		else if ("seq".equals(sub))
			return WiktionarySEQ000.get(name);
		else if ("ser".equals(sub))
			return WiktionarySER000.get(name);
		else if ("ses".equals(sub))
			return WiktionarySES000.get(name);
		else if ("set".equals(sub))
			return WiktionarySET000.get(name);
		else if ("sev".equals(sub))
			return WiktionarySEV000.get(name);
		else if ("sew".equals(sub))
			return WiktionarySEW000.get(name);
		else if ("sex".equals(sub))
			return WiktionarySEX000.get(name);
		else if ("sey".equals(sub))
			return WiktionarySEY000.get(name);
		else if ("sfe".equals(sub))
			return WiktionarySFE000.get(name);
		else if ("sgu".equals(sub))
			return WiktionarySGU000.get(name);
		else if ("sha".equals(sub))
			return WiktionarySHA000.get(name);
		else if ("shc".equals(sub))
			return WiktionarySHC000.get(name);
		else if ("she".equals(sub))
			return WiktionarySHE000.get(name);
		else if ("shi".equals(sub))
			return WiktionarySHI000.get(name);
		else if ("sho".equals(sub))
			return WiktionarySHO000.get(name);
		else if ("shr".equals(sub))
			return WiktionarySHR000.get(name);
		else if ("sht".equals(sub))
			return WiktionarySHT000.get(name);
		else if ("shu".equals(sub))
			return WiktionarySHU000.get(name);
		else if ("shy".equals(sub))
			return WiktionarySHY000.get(name);
		else if ("sia".equals(sub))
			return WiktionarySIA000.get(name);
		else if ("sib".equals(sub))
			return WiktionarySIB000.get(name);
		else if ("sic".equals(sub))
			return WiktionarySIC000.get(name);
		else if ("sid".equals(sub))
			return WiktionarySID000.get(name);
		else if ("sie".equals(sub))
			return WiktionarySIE000.get(name);
		else if ("sig".equals(sub))
			return WiktionarySIG000.get(name);
		else if ("sik".equals(sub))
			return WiktionarySIK000.get(name);
		else if ("sil".equals(sub))
			return WiktionarySIL000.get(name);
		else if ("sim".equals(sub))
			return WiktionarySIM000.get(name);
		else if ("sin".equals(sub))
			return WiktionarySIN000.get(name);
		else if ("sip".equals(sub))
			return WiktionarySIP000.get(name);
		else if ("sir".equals(sub))
			return WiktionarySIR000.get(name);
		else if ("sis".equals(sub))
			return WiktionarySIS000.get(name);
		else if ("sit".equals(sub))
			return WiktionarySIT000.get(name);
		else if ("six".equals(sub))
			return WiktionarySIX000.get(name);
		else if ("siz".equals(sub))
			return WiktionarySIZ000.get(name);
		else if ("sja".equals(sub))
			return WiktionarySJA000.get(name);
		else if ("ska".equals(sub))
			return WiktionarySKA000.get(name);
		else if ("ske".equals(sub))
			return WiktionarySKE000.get(name);
		else if ("ski".equals(sub))
			return WiktionarySKI000.get(name);
		else if ("sko".equals(sub))
			return WiktionarySKO000.get(name);
		else if ("sku".equals(sub))
			return WiktionarySKU000.get(name);
		else if ("sky".equals(sub))
			return WiktionarySKY000.get(name);
		else if ("sla".equals(sub))
			return WiktionarySLA000.get(name);
		else if ("sle".equals(sub))
			return WiktionarySLE000.get(name);
		else if ("sli".equals(sub))
			return WiktionarySLI000.get(name);
		else if ("slo".equals(sub))
			return WiktionarySLO000.get(name);
		else if ("slu".equals(sub))
			return WiktionarySLU000.get(name);
		else if ("sly".equals(sub))
			return WiktionarySLY000.get(name);
		else if ("sma".equals(sub))
			return WiktionarySMA000.get(name);
		else if ("sme".equals(sub))
			return WiktionarySME000.get(name);
		else if ("smi".equals(sub))
			return WiktionarySMI000.get(name);
		else if ("smo".equals(sub))
			return WiktionarySMO000.get(name);
		else if ("smu".equals(sub))
			return WiktionarySMU000.get(name);
		else if ("sna".equals(sub))
			return WiktionarySNA000.get(name);
		else if ("sne".equals(sub))
			return WiktionarySNE000.get(name);
		else if ("sni".equals(sub))
			return WiktionarySNI000.get(name);
		else if ("sno".equals(sub))
			return WiktionarySNO000.get(name);
		else if ("snu".equals(sub))
			return WiktionarySNU000.get(name);
		else if ("soa".equals(sub))
			return WiktionarySOA000.get(name);
		else if ("sob".equals(sub))
			return WiktionarySOB000.get(name);
		else if ("soc".equals(sub))
			return WiktionarySOC000.get(name);
		else if ("sod".equals(sub))
			return WiktionarySOD000.get(name);
		else if ("sof".equals(sub))
			return WiktionarySOF000.get(name);
		else if ("soi".equals(sub))
			return WiktionarySOI000.get(name);
		else if ("soj".equals(sub))
			return WiktionarySOJ000.get(name);
		else if ("sok".equals(sub))
			return WiktionarySOK000.get(name);
		else if ("sol".equals(sub))
			return WiktionarySOL000.get(name);
		else if ("som".equals(sub))
			return WiktionarySOM000.get(name);
		else if ("son".equals(sub))
			return WiktionarySON000.get(name);
		else if ("soo".equals(sub))
			return WiktionarySOO000.get(name);
		else if ("sop".equals(sub))
			return WiktionarySOP000.get(name);
		else if ("sor".equals(sub))
			return WiktionarySOR000.get(name);
		else if ("sot".equals(sub))
			return WiktionarySOT000.get(name);
		else if ("sou".equals(sub))
			return WiktionarySOU000.get(name);
		else if ("sov".equals(sub))
			return WiktionarySOV000.get(name);
		else if ("sow".equals(sub))
			return WiktionarySOW000.get(name);
		else if ("soy".equals(sub))
			return WiktionarySOY000.get(name);
		else if ("spa".equals(sub))
			return WiktionarySPA000.get(name);
		else if ("spc".equals(sub))
			return WiktionarySPC000.get(name);
		else if ("spe".equals(sub))
			return WiktionarySPE000.get(name);
		else if ("sph".equals(sub))
			return WiktionarySPH000.get(name);
		else if ("spi".equals(sub))
			return WiktionarySPI000.get(name);
		else if ("spl".equals(sub))
			return WiktionarySPL000.get(name);
		else if ("spo".equals(sub))
			return WiktionarySPO000.get(name);
		else if ("spr".equals(sub))
			return WiktionarySPR000.get(name);
		else if ("spu".equals(sub))
			return WiktionarySPU000.get(name);
		else if ("spy".equals(sub))
			return WiktionarySPY000.get(name);
		else if ("squ".equals(sub))
			return WiktionarySQU000.get(name);
		else if ("sre".equals(sub))
			return WiktionarySRE000.get(name);
		else if ("sri".equals(sub))
			return WiktionarySRI000.get(name);
		else if ("sru".equals(sub))
			return WiktionarySRU000.get(name);
		else if ("sta".equals(sub))
			return WiktionarySTA000.get(name);
		else if ("ste".equals(sub))
			return WiktionarySTE000.get(name);
		else if ("stf".equals(sub))
			return WiktionarySTF000.get(name);
		else if ("sth".equals(sub))
			return WiktionarySTH000.get(name);
		else if ("sti".equals(sub))
			return WiktionarySTI000.get(name);
		else if ("sto".equals(sub))
			return WiktionarySTO000.get(name);
		else if ("str".equals(sub))
			return WiktionarySTR000.get(name);
		else if ("stu".equals(sub))
			return WiktionarySTU000.get(name);
		else if ("sty".equals(sub))
			return WiktionarySTY000.get(name);
		else if ("sua".equals(sub))
			return WiktionarySUA000.get(name);
		else if ("sub".equals(sub))
			return WiktionarySUB000.get(name);
		else if ("suc".equals(sub))
			return WiktionarySUC000.get(name);
		else if ("sud".equals(sub))
			return WiktionarySUD000.get(name);
		else if ("sue".equals(sub))
			return WiktionarySUE000.get(name);
		else if ("suf".equals(sub))
			return WiktionarySUF000.get(name);
		else if ("sug".equals(sub))
			return WiktionarySUG000.get(name);
		else if ("sui".equals(sub))
			return WiktionarySUI000.get(name);
		else if ("suj".equals(sub))
			return WiktionarySUJ000.get(name);
		else if ("suk".equals(sub))
			return WiktionarySUK000.get(name);
		else if ("sul".equals(sub))
			return WiktionarySUL000.get(name);
		else if ("sum".equals(sub))
			return WiktionarySUM000.get(name);
		else if ("sun".equals(sub))
			return WiktionarySUN000.get(name);
		else if ("sup".equals(sub))
			return WiktionarySUP000.get(name);
		else if ("sur".equals(sub))
			return WiktionarySUR000.get(name);
		else if ("sus".equals(sub))
			return WiktionarySUS000.get(name);
		else if ("sut".equals(sub))
			return WiktionarySUT000.get(name);
		else if ("suz".equals(sub))
			return WiktionarySUZ000.get(name);
		else if ("sve".equals(sub))
			return WiktionarySVE000.get(name);
		else if ("swa".equals(sub))
			return WiktionarySWA000.get(name);
		else if ("swe".equals(sub))
			return WiktionarySWE000.get(name);
		else if ("swi".equals(sub))
			return WiktionarySWI000.get(name);
		else if ("swo".equals(sub))
			return WiktionarySWO000.get(name);
		else if ("syb".equals(sub))
			return WiktionarySYB000.get(name);
		else if ("syc".equals(sub))
			return WiktionarySYC000.get(name);
		else if ("syd".equals(sub))
			return WiktionarySYD000.get(name);
		else if ("syl".equals(sub))
			return WiktionarySYL000.get(name);
		else if ("sym".equals(sub))
			return WiktionarySYM000.get(name);
		else if ("syn".equals(sub))
			return WiktionarySYN000.get(name);
		else if ("syp".equals(sub))
			return WiktionarySYP000.get(name);
		else if ("syr".equals(sub))
			return WiktionarySYR000.get(name);
		else if ("sys".equals(sub))
			return WiktionarySYS000.get(name);
		else if ("syz".equals(sub))
			return WiktionarySYZ000.get(name);
		else if ("sza".equals(sub))
			return WiktionarySZA000.get(name);
		return null;
	}
}