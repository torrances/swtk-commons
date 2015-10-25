package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.o.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.o.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.d.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.f.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.j.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.m.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.r.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.b.v.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.c.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.c.u.*;
import org.swtk.commons.dict.wiktionary.generated.o.d.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.d.d.*;
import org.swtk.commons.dict.wiktionary.generated.o.d.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.d.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.d.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.o.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.o.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.f.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.f.f.*;
import org.swtk.commons.dict.wiktionary.generated.o.g.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.g.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.h.m.*;
import org.swtk.commons.dict.wiktionary.generated.o.h.n.*;
import org.swtk.commons.dict.wiktionary.generated.o.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.o.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.o.j.u.*;
import org.swtk.commons.dict.wiktionary.generated.o.k.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.k.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.k.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.k.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.k.r.*;
import org.swtk.commons.dict.wiktionary.generated.o.k.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.k.u.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.d.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.f.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.m.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.b.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.m.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.n.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.m.p.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.c.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.f.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.n.y.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.h.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.p.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.p.u.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.c.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.d.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.g.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.m.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.n.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.p.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.w.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.o.r.z.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.h.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.m.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.p.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.s.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.o.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.t.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.t.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.o.u.z.*;
import org.swtk.commons.dict.wiktionary.generated.o.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.v.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.v.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.v.o.*;
import org.swtk.commons.dict.wiktionary.generated.o.v.u.*;
import org.swtk.commons.dict.wiktionary.generated.o.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.w.l.*;
import org.swtk.commons.dict.wiktionary.generated.o.w.n.*;
import org.swtk.commons.dict.wiktionary.generated.o.w.y.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.a.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.b.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.f.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.h.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.i.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.p.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.x.y.*;
import org.swtk.commons.dict.wiktionary.generated.o.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.o.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.o.z.o.*;

public final class WiktionaryDbO {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("oaf".equals(sub))
			return WiktionaryOAF000.get(name);
		else if ("oas".equals(sub))
			return WiktionaryOAS000.get(name);
		else if ("oat".equals(sub))
			return WiktionaryOAT000.get(name);
		else if ("oba".equals(sub))
			return WiktionaryOBA000.get(name);
		else if ("obd".equals(sub))
			return WiktionaryOBD000.get(name);
		else if ("obe".equals(sub))
			return WiktionaryOBE000.get(name);
		else if ("obf".equals(sub))
			return WiktionaryOBF000.get(name);
		else if ("obi".equals(sub))
			return WiktionaryOBI000.get(name);
		else if ("obj".equals(sub))
			return WiktionaryOBJ000.get(name);
		else if ("obl".equals(sub))
			return WiktionaryOBL000.get(name);
		else if ("obm".equals(sub))
			return WiktionaryOBM000.get(name);
		else if ("obo".equals(sub))
			return WiktionaryOBO000.get(name);
		else if ("obr".equals(sub))
			return WiktionaryOBR000.get(name);
		else if ("obs".equals(sub))
			return WiktionaryOBS000.get(name);
		else if ("obt".equals(sub))
			return WiktionaryOBT000.get(name);
		else if ("obv".equals(sub))
			return WiktionaryOBV000.get(name);
		else if ("oca".equals(sub))
			return WiktionaryOCA000.get(name);
		else if ("occ".equals(sub))
			return WiktionaryOCC000.get(name);
		else if ("oce".equals(sub))
			return WiktionaryOCE000.get(name);
		else if ("och".equals(sub))
			return WiktionaryOCH000.get(name);
		else if ("oci".equals(sub))
			return WiktionaryOCI000.get(name);
		else if ("oco".equals(sub))
			return WiktionaryOCO000.get(name);
		else if ("oct".equals(sub))
			return WiktionaryOCT000.get(name);
		else if ("ocu".equals(sub))
			return WiktionaryOCU000.get(name);
		else if ("oda".equals(sub))
			return WiktionaryODA000.get(name);
		else if ("odd".equals(sub))
			return WiktionaryODD000.get(name);
		else if ("ode".equals(sub))
			return WiktionaryODE000.get(name);
		else if ("odi".equals(sub))
			return WiktionaryODI000.get(name);
		else if ("odo".equals(sub))
			return WiktionaryODO000.get(name);
		else if ("oed".equals(sub))
			return WiktionaryOED000.get(name);
		else if ("oei".equals(sub))
			return WiktionaryOEI000.get(name);
		else if ("oen".equals(sub))
			return WiktionaryOEN000.get(name);
		else if ("oes".equals(sub))
			return WiktionaryOES000.get(name);
		else if ("ofa".equals(sub))
			return WiktionaryOFA000.get(name);
		else if ("off".equals(sub))
			return WiktionaryOFF000.get(name);
		else if ("ogi".equals(sub))
			return WiktionaryOGI000.get(name);
		else if ("ogl".equals(sub))
			return WiktionaryOGL000.get(name);
		else if ("ohi".equals(sub))
			return WiktionaryOHI000.get(name);
		else if ("ohm".equals(sub))
			return WiktionaryOHM000.get(name);
		else if ("ohn".equals(sub))
			return WiktionaryOHN000.get(name);
		else if ("oik".equals(sub))
			return WiktionaryOIK000.get(name);
		else if ("oil".equals(sub))
			return WiktionaryOIL000.get(name);
		else if ("oin".equals(sub))
			return WiktionaryOIN000.get(name);
		else if ("oju".equals(sub))
			return WiktionaryOJU000.get(name);
		else if ("oka".equals(sub))
			return WiktionaryOKA000.get(name);
		else if ("oki".equals(sub))
			return WiktionaryOKI000.get(name);
		else if ("okl".equals(sub))
			return WiktionaryOKL000.get(name);
		else if ("oko".equals(sub))
			return WiktionaryOKO000.get(name);
		else if ("okr".equals(sub))
			return WiktionaryOKR000.get(name);
		else if ("okt".equals(sub))
			return WiktionaryOKT000.get(name);
		else if ("oku".equals(sub))
			return WiktionaryOKU000.get(name);
		else if ("ola".equals(sub))
			return WiktionaryOLA000.get(name);
		else if ("old".equals(sub))
			return WiktionaryOLD000.get(name);
		else if ("ole".equals(sub))
			return WiktionaryOLE000.get(name);
		else if ("olf".equals(sub))
			return WiktionaryOLF000.get(name);
		else if ("oli".equals(sub))
			return WiktionaryOLI000.get(name);
		else if ("olm".equals(sub))
			return WiktionaryOLM000.get(name);
		else if ("olo".equals(sub))
			return WiktionaryOLO000.get(name);
		else if ("oly".equals(sub))
			return WiktionaryOLY000.get(name);
		else if ("oma".equals(sub))
			return WiktionaryOMA000.get(name);
		else if ("omb".equals(sub))
			return WiktionaryOMB000.get(name);
		else if ("ome".equals(sub))
			return WiktionaryOME000.get(name);
		else if ("omi".equals(sub))
			return WiktionaryOMI000.get(name);
		else if ("omm".equals(sub))
			return WiktionaryOMM000.get(name);
		else if ("omn".equals(sub))
			return WiktionaryOMN000.get(name);
		else if ("omo".equals(sub))
			return WiktionaryOMO000.get(name);
		else if ("omp".equals(sub))
			return WiktionaryOMP000.get(name);
		else if ("ona".equals(sub))
			return WiktionaryONA000.get(name);
		else if ("onc".equals(sub))
			return WiktionaryONC000.get(name);
		else if ("one".equals(sub))
			return WiktionaryONE000.get(name);
		else if ("onf".equals(sub))
			return WiktionaryONF000.get(name);
		else if ("oni".equals(sub))
			return WiktionaryONI000.get(name);
		else if ("onl".equals(sub))
			return WiktionaryONL000.get(name);
		else if ("ono".equals(sub))
			return WiktionaryONO000.get(name);
		else if ("ons".equals(sub))
			return WiktionaryONS000.get(name);
		else if ("ont".equals(sub))
			return WiktionaryONT000.get(name);
		else if ("ony".equals(sub))
			return WiktionaryONY000.get(name);
		else if ("oob".equals(sub))
			return WiktionaryOOB000.get(name);
		else if ("ooc".equals(sub))
			return WiktionaryOOC000.get(name);
		else if ("ood".equals(sub))
			return WiktionaryOOD000.get(name);
		else if ("oog".equals(sub))
			return WiktionaryOOG000.get(name);
		else if ("ooi".equals(sub))
			return WiktionaryOOI000.get(name);
		else if ("ool".equals(sub))
			return WiktionaryOOL000.get(name);
		else if ("oom".equals(sub))
			return WiktionaryOOM000.get(name);
		else if ("oon".equals(sub))
			return WiktionaryOON000.get(name);
		else if ("oop".equals(sub))
			return WiktionaryOOP000.get(name);
		else if ("oos".equals(sub))
			return WiktionaryOOS000.get(name);
		else if ("oot".equals(sub))
			return WiktionaryOOT000.get(name);
		else if ("ooz".equals(sub))
			return WiktionaryOOZ000.get(name);
		else if ("opa".equals(sub))
			return WiktionaryOPA000.get(name);
		else if ("ope".equals(sub))
			return WiktionaryOPE000.get(name);
		else if ("oph".equals(sub))
			return WiktionaryOPH000.get(name);
		else if ("opi".equals(sub))
			return WiktionaryOPI000.get(name);
		else if ("opo".equals(sub))
			return WiktionaryOPO000.get(name);
		else if ("opp".equals(sub))
			return WiktionaryOPP000.get(name);
		else if ("opr".equals(sub))
			return WiktionaryOPR000.get(name);
		else if ("ops".equals(sub))
			return WiktionaryOPS000.get(name);
		else if ("opt".equals(sub))
			return WiktionaryOPT000.get(name);
		else if ("opu".equals(sub))
			return WiktionaryOPU000.get(name);
		else if ("ora".equals(sub))
			return WiktionaryORA000.get(name);
		else if ("orc".equals(sub))
			return WiktionaryORC000.get(name);
		else if ("ord".equals(sub))
			return WiktionaryORD000.get(name);
		else if ("ore".equals(sub))
			return WiktionaryORE000.get(name);
		else if ("org".equals(sub))
			return WiktionaryORG000.get(name);
		else if ("ori".equals(sub))
			return WiktionaryORI000.get(name);
		else if ("orl".equals(sub))
			return WiktionaryORL000.get(name);
		else if ("orm".equals(sub))
			return WiktionaryORM000.get(name);
		else if ("orn".equals(sub))
			return WiktionaryORN000.get(name);
		else if ("oro".equals(sub))
			return WiktionaryORO000.get(name);
		else if ("orp".equals(sub))
			return WiktionaryORP000.get(name);
		else if ("ort".equals(sub))
			return WiktionaryORT000.get(name);
		else if ("oru".equals(sub))
			return WiktionaryORU000.get(name);
		else if ("orw".equals(sub))
			return WiktionaryORW000.get(name);
		else if ("ory".equals(sub))
			return WiktionaryORY000.get(name);
		else if ("orz".equals(sub))
			return WiktionaryORZ000.get(name);
		else if ("osc".equals(sub))
			return WiktionaryOSC000.get(name);
		else if ("ose".equals(sub))
			return WiktionaryOSE000.get(name);
		else if ("osh".equals(sub))
			return WiktionaryOSH000.get(name);
		else if ("osi".equals(sub))
			return WiktionaryOSI000.get(name);
		else if ("osm".equals(sub))
			return WiktionaryOSM000.get(name);
		else if ("osp".equals(sub))
			return WiktionaryOSP000.get(name);
		else if ("oss".equals(sub))
			return WiktionaryOSS000.get(name);
		else if ("ost".equals(sub))
			return WiktionaryOST000.get(name);
		else if ("ota".equals(sub))
			return WiktionaryOTA000.get(name);
		else if ("oth".equals(sub))
			return WiktionaryOTH000.get(name);
		else if ("oti".equals(sub))
			return WiktionaryOTI000.get(name);
		else if ("oto".equals(sub))
			return WiktionaryOTO000.get(name);
		else if ("ott".equals(sub))
			return WiktionaryOTT000.get(name);
		else if ("oua".equals(sub))
			return WiktionaryOUA000.get(name);
		else if ("oub".equals(sub))
			return WiktionaryOUB000.get(name);
		else if ("ouc".equals(sub))
			return WiktionaryOUC000.get(name);
		else if ("oug".equals(sub))
			return WiktionaryOUG000.get(name);
		else if ("ous".equals(sub))
			return WiktionaryOUS000.get(name);
		else if ("out".equals(sub))
			return WiktionaryOUT000.get(name);
		else if ("ouv".equals(sub))
			return WiktionaryOUV000.get(name);
		else if ("ouz".equals(sub))
			return WiktionaryOUZ000.get(name);
		else if ("ova".equals(sub))
			return WiktionaryOVA000.get(name);
		else if ("ove".equals(sub))
			return WiktionaryOVE000.get(name);
		else if ("ovi".equals(sub))
			return WiktionaryOVI000.get(name);
		else if ("ovo".equals(sub))
			return WiktionaryOVO000.get(name);
		else if ("ovu".equals(sub))
			return WiktionaryOVU000.get(name);
		else if ("owe".equals(sub))
			return WiktionaryOWE000.get(name);
		else if ("owl".equals(sub))
			return WiktionaryOWL000.get(name);
		else if ("own".equals(sub))
			return WiktionaryOWN000.get(name);
		else if ("owy".equals(sub))
			return WiktionaryOWY000.get(name);
		else if ("oxa".equals(sub))
			return WiktionaryOXA000.get(name);
		else if ("oxb".equals(sub))
			return WiktionaryOXB000.get(name);
		else if ("oxe".equals(sub))
			return WiktionaryOXE000.get(name);
		else if ("oxf".equals(sub))
			return WiktionaryOXF000.get(name);
		else if ("oxh".equals(sub))
			return WiktionaryOXH000.get(name);
		else if ("oxi".equals(sub))
			return WiktionaryOXI000.get(name);
		else if ("oxp".equals(sub))
			return WiktionaryOXP000.get(name);
		else if ("oxs".equals(sub))
			return WiktionaryOXS000.get(name);
		else if ("oxy".equals(sub))
			return WiktionaryOXY000.get(name);
		else if ("oye".equals(sub))
			return WiktionaryOYE000.get(name);
		else if ("oys".equals(sub))
			return WiktionaryOYS000.get(name);
		else if ("ozo".equals(sub))
			return WiktionaryOZO000.get(name);
		return null;
	}
}