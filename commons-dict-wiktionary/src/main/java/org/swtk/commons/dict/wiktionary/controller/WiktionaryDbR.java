package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.r.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.r.b.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.b.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.j.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.r.k.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.r.p.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.y.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.z.e.*;

public final class WiktionaryDbR {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("rab".equals(sub))
			return WiktionaryRAB000.get(name);
		else if ("rac".equals(sub))
			return WiktionaryRAC000.get(name);
		else if ("rad".equals(sub))
			return WiktionaryRAD000.get(name);
		else if ("rae".equals(sub))
			return WiktionaryRAE000.get(name);
		else if ("raf".equals(sub))
			return WiktionaryRAF000.get(name);
		else if ("rag".equals(sub))
			return WiktionaryRAG000.get(name);
		else if ("rai".equals(sub))
			return WiktionaryRAI000.get(name);
		else if ("rak".equals(sub))
			return WiktionaryRAK000.get(name);
		else if ("ral".equals(sub))
			return WiktionaryRAL000.get(name);
		else if ("ram".equals(sub))
			return WiktionaryRAM000.get(name);
		else if ("ran".equals(sub))
			return WiktionaryRAN000.get(name);
		else if ("rap".equals(sub))
			return WiktionaryRAP000.get(name);
		else if ("rar".equals(sub))
			return WiktionaryRAR000.get(name);
		else if ("ras".equals(sub))
			return WiktionaryRAS000.get(name);
		else if ("rat".equals(sub))
			return WiktionaryRAT000.get(name);
		else if ("rau".equals(sub))
			return WiktionaryRAU000.get(name);
		else if ("rav".equals(sub))
			return WiktionaryRAV000.get(name);
		else if ("raw".equals(sub))
			return WiktionaryRAW000.get(name);
		else if ("raz".equals(sub))
			return WiktionaryRAZ000.get(name);
		else if ("rbg".equals(sub))
			return WiktionaryRBG000.get(name);
		else if ("rbs".equals(sub))
			return WiktionaryRBS000.get(name);
		else if ("rea".equals(sub))
			return WiktionaryREA000.get(name);
		else if ("reb".equals(sub))
			return WiktionaryREB000.get(name);
		else if ("rec".equals(sub))
			return WiktionaryREC000.get(name);
		else if ("red".equals(sub))
			return WiktionaryRED000.get(name);
		else if ("ree".equals(sub))
			return WiktionaryREE000.get(name);
		else if ("ref".equals(sub))
			return WiktionaryREF000.get(name);
		else if ("reg".equals(sub))
			return WiktionaryREG000.get(name);
		else if ("reh".equals(sub))
			return WiktionaryREH000.get(name);
		else if ("rei".equals(sub))
			return WiktionaryREI000.get(name);
		else if ("rej".equals(sub))
			return WiktionaryREJ000.get(name);
		else if ("rel".equals(sub))
			return WiktionaryREL000.get(name);
		else if ("rem".equals(sub))
			return WiktionaryREM000.get(name);
		else if ("ren".equals(sub))
			return WiktionaryREN000.get(name);
		else if ("reo".equals(sub))
			return WiktionaryREO000.get(name);
		else if ("rep".equals(sub))
			return WiktionaryREP000.get(name);
		else if ("req".equals(sub))
			return WiktionaryREQ000.get(name);
		else if ("rer".equals(sub))
			return WiktionaryRER000.get(name);
		else if ("res".equals(sub))
			return WiktionaryRES000.get(name);
		else if ("ret".equals(sub))
			return WiktionaryRET000.get(name);
		else if ("reu".equals(sub))
			return WiktionaryREU000.get(name);
		else if ("rev".equals(sub))
			return WiktionaryREV000.get(name);
		else if ("rew".equals(sub))
			return WiktionaryREW000.get(name);
		else if ("rex".equals(sub))
			return WiktionaryREX000.get(name);
		else if ("rha".equals(sub))
			return WiktionaryRHA000.get(name);
		else if ("rhe".equals(sub))
			return WiktionaryRHE000.get(name);
		else if ("rhi".equals(sub))
			return WiktionaryRHI000.get(name);
		else if ("rho".equals(sub))
			return WiktionaryRHO000.get(name);
		else if ("rhu".equals(sub))
			return WiktionaryRHU000.get(name);
		else if ("rhy".equals(sub))
			return WiktionaryRHY000.get(name);
		else if ("ria".equals(sub))
			return WiktionaryRIA000.get(name);
		else if ("rib".equals(sub))
			return WiktionaryRIB000.get(name);
		else if ("ric".equals(sub))
			return WiktionaryRIC000.get(name);
		else if ("rid".equals(sub))
			return WiktionaryRID000.get(name);
		else if ("rie".equals(sub))
			return WiktionaryRIE000.get(name);
		else if ("rif".equals(sub))
			return WiktionaryRIF000.get(name);
		else if ("rig".equals(sub))
			return WiktionaryRIG000.get(name);
		else if ("rij".equals(sub))
			return WiktionaryRIJ000.get(name);
		else if ("rik".equals(sub))
			return WiktionaryRIK000.get(name);
		else if ("rim".equals(sub))
			return WiktionaryRIM000.get(name);
		else if ("rin".equals(sub))
			return WiktionaryRIN000.get(name);
		else if ("rio".equals(sub))
			return WiktionaryRIO000.get(name);
		else if ("rip".equals(sub))
			return WiktionaryRIP000.get(name);
		else if ("ris".equals(sub))
			return WiktionaryRIS000.get(name);
		else if ("rit".equals(sub))
			return WiktionaryRIT000.get(name);
		else if ("riv".equals(sub))
			return WiktionaryRIV000.get(name);
		else if ("rix".equals(sub))
			return WiktionaryRIX000.get(name);
		else if ("rka".equals(sub))
			return WiktionaryRKA000.get(name);
		else if ("roa".equals(sub))
			return WiktionaryROA000.get(name);
		else if ("rob".equals(sub))
			return WiktionaryROB000.get(name);
		else if ("roc".equals(sub))
			return WiktionaryROC000.get(name);
		else if ("rod".equals(sub))
			return WiktionaryROD000.get(name);
		else if ("roe".equals(sub))
			return WiktionaryROE000.get(name);
		else if ("rog".equals(sub))
			return WiktionaryROG000.get(name);
		else if ("roi".equals(sub))
			return WiktionaryROI000.get(name);
		else if ("rok".equals(sub))
			return WiktionaryROK000.get(name);
		else if ("rol".equals(sub))
			return WiktionaryROL000.get(name);
		else if ("rom".equals(sub))
			return WiktionaryROM000.get(name);
		else if ("ron".equals(sub))
			return WiktionaryRON000.get(name);
		else if ("roo".equals(sub))
			return WiktionaryROO000.get(name);
		else if ("rop".equals(sub))
			return WiktionaryROP000.get(name);
		else if ("ror".equals(sub))
			return WiktionaryROR000.get(name);
		else if ("ros".equals(sub))
			return WiktionaryROS000.get(name);
		else if ("rot".equals(sub))
			return WiktionaryROT000.get(name);
		else if ("rou".equals(sub))
			return WiktionaryROU000.get(name);
		else if ("row".equals(sub))
			return WiktionaryROW000.get(name);
		else if ("rox".equals(sub))
			return WiktionaryROX000.get(name);
		else if ("roy".equals(sub))
			return WiktionaryROY000.get(name);
		else if ("roz".equals(sub))
			return WiktionaryROZ000.get(name);
		else if ("rpg".equals(sub))
			return WiktionaryRPG000.get(name);
		else if ("rub".equals(sub))
			return WiktionaryRUB000.get(name);
		else if ("ruc".equals(sub))
			return WiktionaryRUC000.get(name);
		else if ("rud".equals(sub))
			return WiktionaryRUD000.get(name);
		else if ("rue".equals(sub))
			return WiktionaryRUE000.get(name);
		else if ("ruf".equals(sub))
			return WiktionaryRUF000.get(name);
		else if ("rug".equals(sub))
			return WiktionaryRUG000.get(name);
		else if ("rul".equals(sub))
			return WiktionaryRUL000.get(name);
		else if ("rum".equals(sub))
			return WiktionaryRUM000.get(name);
		else if ("run".equals(sub))
			return WiktionaryRUN000.get(name);
		else if ("rup".equals(sub))
			return WiktionaryRUP000.get(name);
		else if ("rur".equals(sub))
			return WiktionaryRUR000.get(name);
		else if ("rus".equals(sub))
			return WiktionaryRUS000.get(name);
		else if ("rut".equals(sub))
			return WiktionaryRUT000.get(name);
		else if ("rva".equals(sub))
			return WiktionaryRVA000.get(name);
		else if ("rwa".equals(sub))
			return WiktionaryRWA000.get(name);
		else if ("rya".equals(sub))
			return WiktionaryRYA000.get(name);
		else if ("rye".equals(sub))
			return WiktionaryRYE000.get(name);
		else if ("ryu".equals(sub))
			return WiktionaryRYU000.get(name);
		else if ("rze".equals(sub))
			return WiktionaryRZE000.get(name);
		return null;
	}
}