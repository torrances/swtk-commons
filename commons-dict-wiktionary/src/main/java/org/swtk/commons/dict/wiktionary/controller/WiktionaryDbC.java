package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.c.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.c.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.c.c.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.d.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.d.d.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.l.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.n.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.r.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.w.*;
import org.swtk.commons.dict.wiktionary.generated.c.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.c.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.c.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.c.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.c.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.c.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.c.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.q.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.c.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.c.p.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.c.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.c.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.c.r.w.*;
import org.swtk.commons.dict.wiktionary.generated.c.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.c.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.c.w.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.b.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.t.*;
import org.swtk.commons.dict.wiktionary.generated.c.y.w.*;
import org.swtk.commons.dict.wiktionary.generated.c.z.e.*;

public final class WiktionaryDbC {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("cab".equals(sub))
			return WiktionaryCAB000.get(name);
		else if ("cac".equals(sub))
			return WiktionaryCAC000.get(name);
		else if ("cad".equals(sub))
			return WiktionaryCAD000.get(name);
		else if ("cae".equals(sub))
			return WiktionaryCAE000.get(name);
		else if ("caf".equals(sub))
			return WiktionaryCAF000.get(name);
		else if ("cag".equals(sub))
			return WiktionaryCAG000.get(name);
		else if ("cah".equals(sub))
			return WiktionaryCAH000.get(name);
		else if ("cai".equals(sub))
			return WiktionaryCAI000.get(name);
		else if ("caj".equals(sub))
			return WiktionaryCAJ000.get(name);
		else if ("cak".equals(sub))
			return WiktionaryCAK000.get(name);
		else if ("cal".equals(sub))
			return WiktionaryCAL000.get(name);
		else if ("cam".equals(sub))
			return WiktionaryCAM000.get(name);
		else if ("can".equals(sub))
			return WiktionaryCAN000.get(name);
		else if ("cao".equals(sub))
			return WiktionaryCAO000.get(name);
		else if ("cap".equals(sub))
			return WiktionaryCAP000.get(name);
		else if ("car".equals(sub))
			return WiktionaryCAR000.get(name);
		else if ("cas".equals(sub))
			return WiktionaryCAS000.get(name);
		else if ("cat".equals(sub))
			return WiktionaryCAT000.get(name);
		else if ("cau".equals(sub))
			return WiktionaryCAU000.get(name);
		else if ("cav".equals(sub))
			return WiktionaryCAV000.get(name);
		else if ("ccc".equals(sub))
			return WiktionaryCCC000.get(name);
		else if ("cda".equals(sub))
			return WiktionaryCDA000.get(name);
		else if ("cdd".equals(sub))
			return WiktionaryCDD000.get(name);
		else if ("ceb".equals(sub))
			return WiktionaryCEB000.get(name);
		else if ("cec".equals(sub))
			return WiktionaryCEC000.get(name);
		else if ("ced".equals(sub))
			return WiktionaryCED000.get(name);
		else if ("cef".equals(sub))
			return WiktionaryCEF000.get(name);
		else if ("cei".equals(sub))
			return WiktionaryCEI000.get(name);
		else if ("cel".equals(sub))
			return WiktionaryCEL000.get(name);
		else if ("cem".equals(sub))
			return WiktionaryCEM000.get(name);
		else if ("cen".equals(sub))
			return WiktionaryCEN000.get(name);
		else if ("cep".equals(sub))
			return WiktionaryCEP000.get(name);
		else if ("cer".equals(sub))
			return WiktionaryCER000.get(name);
		else if ("ces".equals(sub))
			return WiktionaryCES000.get(name);
		else if ("cet".equals(sub))
			return WiktionaryCET000.get(name);
		else if ("cev".equals(sub))
			return WiktionaryCEV000.get(name);
		else if ("cha".equals(sub))
			return WiktionaryCHA000.get(name);
		else if ("che".equals(sub))
			return WiktionaryCHE000.get(name);
		else if ("chi".equals(sub))
			return WiktionaryCHI000.get(name);
		else if ("chl".equals(sub))
			return WiktionaryCHL000.get(name);
		else if ("chn".equals(sub))
			return WiktionaryCHN000.get(name);
		else if ("cho".equals(sub))
			return WiktionaryCHO000.get(name);
		else if ("chr".equals(sub))
			return WiktionaryCHR000.get(name);
		else if ("cht".equals(sub))
			return WiktionaryCHT000.get(name);
		else if ("chu".equals(sub))
			return WiktionaryCHU000.get(name);
		else if ("chw".equals(sub))
			return WiktionaryCHW000.get(name);
		else if ("chy".equals(sub))
			return WiktionaryCHY000.get(name);
		else if ("cia".equals(sub))
			return WiktionaryCIA000.get(name);
		else if ("cic".equals(sub))
			return WiktionaryCIC000.get(name);
		else if ("cid".equals(sub))
			return WiktionaryCID000.get(name);
		else if ("cig".equals(sub))
			return WiktionaryCIG000.get(name);
		else if ("cil".equals(sub))
			return WiktionaryCIL000.get(name);
		else if ("cim".equals(sub))
			return WiktionaryCIM000.get(name);
		else if ("cin".equals(sub))
			return WiktionaryCIN000.get(name);
		else if ("cio".equals(sub))
			return WiktionaryCIO000.get(name);
		else if ("cip".equals(sub))
			return WiktionaryCIP000.get(name);
		else if ("cir".equals(sub))
			return WiktionaryCIR000.get(name);
		else if ("cis".equals(sub))
			return WiktionaryCIS000.get(name);
		else if ("cit".equals(sub))
			return WiktionaryCIT000.get(name);
		else if ("civ".equals(sub))
			return WiktionaryCIV000.get(name);
		else if ("cla".equals(sub))
			return WiktionaryCLA000.get(name);
		else if ("cle".equals(sub))
			return WiktionaryCLE000.get(name);
		else if ("cli".equals(sub))
			return WiktionaryCLI000.get(name);
		else if ("clo".equals(sub))
			return WiktionaryCLO000.get(name);
		else if ("clu".equals(sub))
			return WiktionaryCLU000.get(name);
		else if ("cly".equals(sub))
			return WiktionaryCLY000.get(name);
		else if ("cma".equals(sub))
			return WiktionaryCMA000.get(name);
		else if ("cme".equals(sub))
			return WiktionaryCME000.get(name);
		else if ("cni".equals(sub))
			return WiktionaryCNI000.get(name);
		else if ("coa".equals(sub))
			return WiktionaryCOA000.get(name);
		else if ("cob".equals(sub))
			return WiktionaryCOB000.get(name);
		else if ("coc".equals(sub))
			return WiktionaryCOC000.get(name);
		else if ("cod".equals(sub))
			return WiktionaryCOD000.get(name);
		else if ("coe".equals(sub))
			return WiktionaryCOE000.get(name);
		else if ("cof".equals(sub))
			return WiktionaryCOF000.get(name);
		else if ("cog".equals(sub))
			return WiktionaryCOG000.get(name);
		else if ("coh".equals(sub))
			return WiktionaryCOH000.get(name);
		else if ("coi".equals(sub))
			return WiktionaryCOI000.get(name);
		else if ("coj".equals(sub))
			return WiktionaryCOJ000.get(name);
		else if ("cok".equals(sub))
			return WiktionaryCOK000.get(name);
		else if ("col".equals(sub))
			return WiktionaryCOL000.get(name);
		else if ("com".equals(sub))
			return WiktionaryCOM000.get(name);
		else if ("con".equals(sub))
			return WiktionaryCON000.get(name);
		else if ("coo".equals(sub))
			return WiktionaryCOO000.get(name);
		else if ("cop".equals(sub))
			return WiktionaryCOP000.get(name);
		else if ("coq".equals(sub))
			return WiktionaryCOQ000.get(name);
		else if ("cor".equals(sub))
			return WiktionaryCOR000.get(name);
		else if ("cos".equals(sub))
			return WiktionaryCOS000.get(name);
		else if ("cot".equals(sub))
			return WiktionaryCOT000.get(name);
		else if ("cou".equals(sub))
			return WiktionaryCOU000.get(name);
		else if ("cov".equals(sub))
			return WiktionaryCOV000.get(name);
		else if ("cow".equals(sub))
			return WiktionaryCOW000.get(name);
		else if ("cox".equals(sub))
			return WiktionaryCOX000.get(name);
		else if ("coy".equals(sub))
			return WiktionaryCOY000.get(name);
		else if ("coz".equals(sub))
			return WiktionaryCOZ000.get(name);
		else if ("cpc".equals(sub))
			return WiktionaryCPC000.get(name);
		else if ("cra".equals(sub))
			return WiktionaryCRA000.get(name);
		else if ("cre".equals(sub))
			return WiktionaryCRE000.get(name);
		else if ("cri".equals(sub))
			return WiktionaryCRI000.get(name);
		else if ("cro".equals(sub))
			return WiktionaryCRO000.get(name);
		else if ("cru".equals(sub))
			return WiktionaryCRU000.get(name);
		else if ("crw".equals(sub))
			return WiktionaryCRW000.get(name);
		else if ("cry".equals(sub))
			return WiktionaryCRY000.get(name);
		else if ("csi".equals(sub))
			return WiktionaryCSI000.get(name);
		else if ("cte".equals(sub))
			return WiktionaryCTE000.get(name);
		else if ("cua".equals(sub))
			return WiktionaryCUA000.get(name);
		else if ("cub".equals(sub))
			return WiktionaryCUB000.get(name);
		else if ("cuc".equals(sub))
			return WiktionaryCUC000.get(name);
		else if ("cud".equals(sub))
			return WiktionaryCUD000.get(name);
		else if ("cui".equals(sub))
			return WiktionaryCUI000.get(name);
		else if ("cuj".equals(sub))
			return WiktionaryCUJ000.get(name);
		else if ("cul".equals(sub))
			return WiktionaryCUL000.get(name);
		else if ("cum".equals(sub))
			return WiktionaryCUM000.get(name);
		else if ("cun".equals(sub))
			return WiktionaryCUN000.get(name);
		else if ("cup".equals(sub))
			return WiktionaryCUP000.get(name);
		else if ("cur".equals(sub))
			return WiktionaryCUR000.get(name);
		else if ("cus".equals(sub))
			return WiktionaryCUS000.get(name);
		else if ("cut".equals(sub))
			return WiktionaryCUT000.get(name);
		else if ("cuv".equals(sub))
			return WiktionaryCUV000.get(name);
		else if ("cwt".equals(sub))
			return WiktionaryCWT000.get(name);
		else if ("cya".equals(sub))
			return WiktionaryCYA000.get(name);
		else if ("cyb".equals(sub))
			return WiktionaryCYB000.get(name);
		else if ("cyc".equals(sub))
			return WiktionaryCYC000.get(name);
		else if ("cyl".equals(sub))
			return WiktionaryCYL000.get(name);
		else if ("cym".equals(sub))
			return WiktionaryCYM000.get(name);
		else if ("cyn".equals(sub))
			return WiktionaryCYN000.get(name);
		else if ("cyp".equals(sub))
			return WiktionaryCYP000.get(name);
		else if ("cyr".equals(sub))
			return WiktionaryCYR000.get(name);
		else if ("cys".equals(sub))
			return WiktionaryCYS000.get(name);
		else if ("cyt".equals(sub))
			return WiktionaryCYT000.get(name);
		else if ("cyw".equals(sub))
			return WiktionaryCYW000.get(name);
		else if ("cze".equals(sub))
			return WiktionaryCZE000.get(name);
		return null;
	}
}