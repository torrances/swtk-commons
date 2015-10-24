package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.d.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.d.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.h.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.d.j.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.w.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.z.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.z.i.*;

public final class WiktionaryDbD {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("daa".equals(sub))
			return WiktionaryDAA000.get(name);
		else if ("dab".equals(sub))
			return WiktionaryDAB000.get(name);
		else if ("dac".equals(sub))
			return WiktionaryDAC000.get(name);
		else if ("dad".equals(sub))
			return WiktionaryDAD000.get(name);
		else if ("dae".equals(sub))
			return WiktionaryDAE000.get(name);
		else if ("daf".equals(sub))
			return WiktionaryDAF000.get(name);
		else if ("dag".equals(sub))
			return WiktionaryDAG000.get(name);
		else if ("dai".equals(sub))
			return WiktionaryDAI000.get(name);
		else if ("dal".equals(sub))
			return WiktionaryDAL000.get(name);
		else if ("dam".equals(sub))
			return WiktionaryDAM000.get(name);
		else if ("dan".equals(sub))
			return WiktionaryDAN000.get(name);
		else if ("dap".equals(sub))
			return WiktionaryDAP000.get(name);
		else if ("dar".equals(sub))
			return WiktionaryDAR000.get(name);
		else if ("das".equals(sub))
			return WiktionaryDAS000.get(name);
		else if ("dat".equals(sub))
			return WiktionaryDAT000.get(name);
		else if ("dau".equals(sub))
			return WiktionaryDAU000.get(name);
		else if ("dav".equals(sub))
			return WiktionaryDAV000.get(name);
		else if ("daw".equals(sub))
			return WiktionaryDAW000.get(name);
		else if ("day".equals(sub))
			return WiktionaryDAY000.get(name);
		else if ("daz".equals(sub))
			return WiktionaryDAZ000.get(name);
		else if ("dea".equals(sub))
			return WiktionaryDEA000.get(name);
		else if ("deb".equals(sub))
			return WiktionaryDEB000.get(name);
		else if ("dec".equals(sub))
			return WiktionaryDEC000.get(name);
		else if ("ded".equals(sub))
			return WiktionaryDED000.get(name);
		else if ("dee".equals(sub))
			return WiktionaryDEE000.get(name);
		else if ("def".equals(sub))
			return WiktionaryDEF000.get(name);
		else if ("deg".equals(sub))
			return WiktionaryDEG000.get(name);
		else if ("deh".equals(sub))
			return WiktionaryDEH000.get(name);
		else if ("dei".equals(sub))
			return WiktionaryDEI000.get(name);
		else if ("dek".equals(sub))
			return WiktionaryDEK000.get(name);
		else if ("del".equals(sub))
			return WiktionaryDEL000.get(name);
		else if ("dem".equals(sub))
			return WiktionaryDEM000.get(name);
		else if ("den".equals(sub))
			return WiktionaryDEN000.get(name);
		else if ("deo".equals(sub))
			return WiktionaryDEO000.get(name);
		else if ("dep".equals(sub))
			return WiktionaryDEP000.get(name);
		else if ("deq".equals(sub))
			return WiktionaryDEQ000.get(name);
		else if ("der".equals(sub))
			return WiktionaryDER000.get(name);
		else if ("des".equals(sub))
			return WiktionaryDES000.get(name);
		else if ("det".equals(sub))
			return WiktionaryDET000.get(name);
		else if ("deu".equals(sub))
			return WiktionaryDEU000.get(name);
		else if ("dev".equals(sub))
			return WiktionaryDEV000.get(name);
		else if ("dew".equals(sub))
			return WiktionaryDEW000.get(name);
		else if ("dex".equals(sub))
			return WiktionaryDEX000.get(name);
		else if ("dez".equals(sub))
			return WiktionaryDEZ000.get(name);
		else if ("dho".equals(sub))
			return WiktionaryDHO000.get(name);
		else if ("dhy".equals(sub))
			return WiktionaryDHY000.get(name);
		else if ("dia".equals(sub))
			return WiktionaryDIA000.get(name);
		else if ("dib".equals(sub))
			return WiktionaryDIB000.get(name);
		else if ("dic".equals(sub))
			return WiktionaryDIC000.get(name);
		else if ("did".equals(sub))
			return WiktionaryDID000.get(name);
		else if ("die".equals(sub))
			return WiktionaryDIE000.get(name);
		else if ("dif".equals(sub))
			return WiktionaryDIF000.get(name);
		else if ("dig".equals(sub))
			return WiktionaryDIG000.get(name);
		else if ("dih".equals(sub))
			return WiktionaryDIH000.get(name);
		else if ("dii".equals(sub))
			return WiktionaryDII000.get(name);
		else if ("dij".equals(sub))
			return WiktionaryDIJ000.get(name);
		else if ("dik".equals(sub))
			return WiktionaryDIK000.get(name);
		else if ("dil".equals(sub))
			return WiktionaryDIL000.get(name);
		else if ("dim".equals(sub))
			return WiktionaryDIM000.get(name);
		else if ("din".equals(sub))
			return WiktionaryDIN000.get(name);
		else if ("dio".equals(sub))
			return WiktionaryDIO000.get(name);
		else if ("dip".equals(sub))
			return WiktionaryDIP000.get(name);
		else if ("dir".equals(sub))
			return WiktionaryDIR000.get(name);
		else if ("dis".equals(sub))
			return WiktionaryDIS000.get(name);
		else if ("dit".equals(sub))
			return WiktionaryDIT000.get(name);
		else if ("div".equals(sub))
			return WiktionaryDIV000.get(name);
		else if ("dix".equals(sub))
			return WiktionaryDIX000.get(name);
		else if ("dji".equals(sub))
			return WiktionaryDJI000.get(name);
		else if ("dob".equals(sub))
			return WiktionaryDOB000.get(name);
		else if ("doc".equals(sub))
			return WiktionaryDOC000.get(name);
		else if ("dod".equals(sub))
			return WiktionaryDOD000.get(name);
		else if ("doe".equals(sub))
			return WiktionaryDOE000.get(name);
		else if ("dog".equals(sub))
			return WiktionaryDOG000.get(name);
		else if ("doi".equals(sub))
			return WiktionaryDOI000.get(name);
		else if ("doj".equals(sub))
			return WiktionaryDOJ000.get(name);
		else if ("dok".equals(sub))
			return WiktionaryDOK000.get(name);
		else if ("dol".equals(sub))
			return WiktionaryDOL000.get(name);
		else if ("dom".equals(sub))
			return WiktionaryDOM000.get(name);
		else if ("don".equals(sub))
			return WiktionaryDON000.get(name);
		else if ("doo".equals(sub))
			return WiktionaryDOO000.get(name);
		else if ("dop".equals(sub))
			return WiktionaryDOP000.get(name);
		else if ("dor".equals(sub))
			return WiktionaryDOR000.get(name);
		else if ("dos".equals(sub))
			return WiktionaryDOS000.get(name);
		else if ("dot".equals(sub))
			return WiktionaryDOT000.get(name);
		else if ("dou".equals(sub))
			return WiktionaryDOU000.get(name);
		else if ("dov".equals(sub))
			return WiktionaryDOV000.get(name);
		else if ("dow".equals(sub))
			return WiktionaryDOW000.get(name);
		else if ("doy".equals(sub))
			return WiktionaryDOY000.get(name);
		else if ("doz".equals(sub))
			return WiktionaryDOZ000.get(name);
		else if ("dra".equals(sub))
			return WiktionaryDRA000.get(name);
		else if ("dre".equals(sub))
			return WiktionaryDRE000.get(name);
		else if ("dri".equals(sub))
			return WiktionaryDRI000.get(name);
		else if ("dro".equals(sub))
			return WiktionaryDRO000.get(name);
		else if ("dru".equals(sub))
			return WiktionaryDRU000.get(name);
		else if ("dry".equals(sub))
			return WiktionaryDRY000.get(name);
		else if ("dua".equals(sub))
			return WiktionaryDUA000.get(name);
		else if ("dub".equals(sub))
			return WiktionaryDUB000.get(name);
		else if ("duc".equals(sub))
			return WiktionaryDUC000.get(name);
		else if ("dud".equals(sub))
			return WiktionaryDUD000.get(name);
		else if ("due".equals(sub))
			return WiktionaryDUE000.get(name);
		else if ("dui".equals(sub))
			return WiktionaryDUI000.get(name);
		else if ("dul".equals(sub))
			return WiktionaryDUL000.get(name);
		else if ("dum".equals(sub))
			return WiktionaryDUM000.get(name);
		else if ("dun".equals(sub))
			return WiktionaryDUN000.get(name);
		else if ("duo".equals(sub))
			return WiktionaryDUO000.get(name);
		else if ("dup".equals(sub))
			return WiktionaryDUP000.get(name);
		else if ("dur".equals(sub))
			return WiktionaryDUR000.get(name);
		else if ("dus".equals(sub))
			return WiktionaryDUS000.get(name);
		else if ("dut".equals(sub))
			return WiktionaryDUT000.get(name);
		else if ("duu".equals(sub))
			return WiktionaryDUU000.get(name);
		else if ("duv".equals(sub))
			return WiktionaryDUV000.get(name);
		else if ("dwa".equals(sub))
			return WiktionaryDWA000.get(name);
		else if ("dwe".equals(sub))
			return WiktionaryDWE000.get(name);
		else if ("dwi".equals(sub))
			return WiktionaryDWI000.get(name);
		else if ("dyd".equals(sub))
			return WiktionaryDYD000.get(name);
		else if ("dye".equals(sub))
			return WiktionaryDYE000.get(name);
		else if ("dyk".equals(sub))
			return WiktionaryDYK000.get(name);
		else if ("dyn".equals(sub))
			return WiktionaryDYN000.get(name);
		else if ("dyo".equals(sub))
			return WiktionaryDYO000.get(name);
		else if ("dys".equals(sub))
			return WiktionaryDYS000.get(name);
		else if ("dze".equals(sub))
			return WiktionaryDZE000.get(name);
		else if ("dzi".equals(sub))
			return WiktionaryDZI000.get(name);
		return null;
	}
}