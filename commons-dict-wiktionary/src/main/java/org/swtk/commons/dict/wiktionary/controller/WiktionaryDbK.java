package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.k.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.k.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.k.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.k.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.k.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.k.h.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.k.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.w.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.k.k.k.*;
import org.swtk.commons.dict.wiktionary.generated.k.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.k.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.k.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.k.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.k.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.k.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.k.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.k.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.k.n.u.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.k.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.k.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.k.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.k.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.k.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.k.s.h.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.w.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.u.*;

public final class WiktionaryDbK {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("kab".equals(sub))
			return WiktionaryKAB000.get(name);
		else if ("kad".equals(sub))
			return WiktionaryKAD000.get(name);
		else if ("kaf".equals(sub))
			return WiktionaryKAF000.get(name);
		else if ("kag".equals(sub))
			return WiktionaryKAG000.get(name);
		else if ("kah".equals(sub))
			return WiktionaryKAH000.get(name);
		else if ("kai".equals(sub))
			return WiktionaryKAI000.get(name);
		else if ("kaj".equals(sub))
			return WiktionaryKAJ000.get(name);
		else if ("kak".equals(sub))
			return WiktionaryKAK000.get(name);
		else if ("kal".equals(sub))
			return WiktionaryKAL000.get(name);
		else if ("kam".equals(sub))
			return WiktionaryKAM000.get(name);
		else if ("kan".equals(sub))
			return WiktionaryKAN000.get(name);
		else if ("kap".equals(sub))
			return WiktionaryKAP000.get(name);
		else if ("kar".equals(sub))
			return WiktionaryKAR000.get(name);
		else if ("kas".equals(sub))
			return WiktionaryKAS000.get(name);
		else if ("kat".equals(sub))
			return WiktionaryKAT000.get(name);
		else if ("kav".equals(sub))
			return WiktionaryKAV000.get(name);
		else if ("kaw".equals(sub))
			return WiktionaryKAW000.get(name);
		else if ("kay".equals(sub))
			return WiktionaryKAY000.get(name);
		else if ("kaz".equals(sub))
			return WiktionaryKAZ000.get(name);
		else if ("keb".equals(sub))
			return WiktionaryKEB000.get(name);
		else if ("ked".equals(sub))
			return WiktionaryKED000.get(name);
		else if ("kee".equals(sub))
			return WiktionaryKEE000.get(name);
		else if ("kef".equals(sub))
			return WiktionaryKEF000.get(name);
		else if ("keg".equals(sub))
			return WiktionaryKEG000.get(name);
		else if ("kei".equals(sub))
			return WiktionaryKEI000.get(name);
		else if ("kel".equals(sub))
			return WiktionaryKEL000.get(name);
		else if ("kem".equals(sub))
			return WiktionaryKEM000.get(name);
		else if ("ken".equals(sub))
			return WiktionaryKEN000.get(name);
		else if ("kep".equals(sub))
			return WiktionaryKEP000.get(name);
		else if ("ker".equals(sub))
			return WiktionaryKER000.get(name);
		else if ("kes".equals(sub))
			return WiktionaryKES000.get(name);
		else if ("ket".equals(sub))
			return WiktionaryKET000.get(name);
		else if ("kev".equals(sub))
			return WiktionaryKEV000.get(name);
		else if ("key".equals(sub))
			return WiktionaryKEY000.get(name);
		else if ("kha".equals(sub))
			return WiktionaryKHA000.get(name);
		else if ("khe".equals(sub))
			return WiktionaryKHE000.get(name);
		else if ("khi".equals(sub))
			return WiktionaryKHI000.get(name);
		else if ("khm".equals(sub))
			return WiktionaryKHM000.get(name);
		else if ("kho".equals(sub))
			return WiktionaryKHO000.get(name);
		else if ("khu".equals(sub))
			return WiktionaryKHU000.get(name);
		else if ("kib".equals(sub))
			return WiktionaryKIB000.get(name);
		else if ("kic".equals(sub))
			return WiktionaryKIC000.get(name);
		else if ("kid".equals(sub))
			return WiktionaryKID000.get(name);
		else if ("kie".equals(sub))
			return WiktionaryKIE000.get(name);
		else if ("kil".equals(sub))
			return WiktionaryKIL000.get(name);
		else if ("kim".equals(sub))
			return WiktionaryKIM000.get(name);
		else if ("kin".equals(sub))
			return WiktionaryKIN000.get(name);
		else if ("kip".equals(sub))
			return WiktionaryKIP000.get(name);
		else if ("kir".equals(sub))
			return WiktionaryKIR000.get(name);
		else if ("kis".equals(sub))
			return WiktionaryKIS000.get(name);
		else if ("kit".equals(sub))
			return WiktionaryKIT000.get(name);
		else if ("kiv".equals(sub))
			return WiktionaryKIV000.get(name);
		else if ("kiw".equals(sub))
			return WiktionaryKIW000.get(name);
		else if ("kiz".equals(sub))
			return WiktionaryKIZ000.get(name);
		else if ("kkk".equals(sub))
			return WiktionaryKKK000.get(name);
		else if ("kla".equals(sub))
			return WiktionaryKLA000.get(name);
		else if ("kle".equals(sub))
			return WiktionaryKLE000.get(name);
		else if ("kli".equals(sub))
			return WiktionaryKLI000.get(name);
		else if ("klo".equals(sub))
			return WiktionaryKLO000.get(name);
		else if ("klu".equals(sub))
			return WiktionaryKLU000.get(name);
		else if ("kme".equals(sub))
			return WiktionaryKME000.get(name);
		else if ("kna".equals(sub))
			return WiktionaryKNA000.get(name);
		else if ("kne".equals(sub))
			return WiktionaryKNE000.get(name);
		else if ("kni".equals(sub))
			return WiktionaryKNI000.get(name);
		else if ("kno".equals(sub))
			return WiktionaryKNO000.get(name);
		else if ("knu".equals(sub))
			return WiktionaryKNU000.get(name);
		else if ("koa".equals(sub))
			return WiktionaryKOA000.get(name);
		else if ("kob".equals(sub))
			return WiktionaryKOB000.get(name);
		else if ("kod".equals(sub))
			return WiktionaryKOD000.get(name);
		else if ("kof".equals(sub))
			return WiktionaryKOF000.get(name);
		else if ("koh".equals(sub))
			return WiktionaryKOH000.get(name);
		else if ("kok".equals(sub))
			return WiktionaryKOK000.get(name);
		else if ("kol".equals(sub))
			return WiktionaryKOL000.get(name);
		else if ("kom".equals(sub))
			return WiktionaryKOM000.get(name);
		else if ("kon".equals(sub))
			return WiktionaryKON000.get(name);
		else if ("koo".equals(sub))
			return WiktionaryKOO000.get(name);
		else if ("kor".equals(sub))
			return WiktionaryKOR000.get(name);
		else if ("kos".equals(sub))
			return WiktionaryKOS000.get(name);
		else if ("kou".equals(sub))
			return WiktionaryKOU000.get(name);
		else if ("koz".equals(sub))
			return WiktionaryKOZ000.get(name);
		else if ("kra".equals(sub))
			return WiktionaryKRA000.get(name);
		else if ("kre".equals(sub))
			return WiktionaryKRE000.get(name);
		else if ("kri".equals(sub))
			return WiktionaryKRI000.get(name);
		else if ("kro".equals(sub))
			return WiktionaryKRO000.get(name);
		else if ("kru".equals(sub))
			return WiktionaryKRU000.get(name);
		else if ("kry".equals(sub))
			return WiktionaryKRY000.get(name);
		else if ("ksh".equals(sub))
			return WiktionaryKSH000.get(name);
		else if ("kub".equals(sub))
			return WiktionaryKUB000.get(name);
		else if ("kud".equals(sub))
			return WiktionaryKUD000.get(name);
		else if ("kuf".equals(sub))
			return WiktionaryKUF000.get(name);
		else if ("kui".equals(sub))
			return WiktionaryKUI000.get(name);
		else if ("kum".equals(sub))
			return WiktionaryKUM000.get(name);
		else if ("kun".equals(sub))
			return WiktionaryKUN000.get(name);
		else if ("kur".equals(sub))
			return WiktionaryKUR000.get(name);
		else if ("kut".equals(sub))
			return WiktionaryKUT000.get(name);
		else if ("kuw".equals(sub))
			return WiktionaryKUW000.get(name);
		else if ("kya".equals(sub))
			return WiktionaryKYA000.get(name);
		else if ("kyl".equals(sub))
			return WiktionaryKYL000.get(name);
		else if ("kyn".equals(sub))
			return WiktionaryKYN000.get(name);
		else if ("kyp".equals(sub))
			return WiktionaryKYP000.get(name);
		else if ("kyr".equals(sub))
			return WiktionaryKYR000.get(name);
		else if ("kyu".equals(sub))
			return WiktionaryKYU000.get(name);
		return null;
	}
}