package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.f.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.f.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.f.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.f.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.f.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.f.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.f.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.f.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.f.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.f.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.f.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.f.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.f.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.f.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.f.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.f.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.f.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.f.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.f.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.f.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.f.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.f.y.r.*;

public final class WiktionaryDbF {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("faa".equals(sub))
			return WiktionaryFAA000.get(name);
		else if ("fab".equals(sub))
			return WiktionaryFAB000.get(name);
		else if ("fac".equals(sub))
			return WiktionaryFAC000.get(name);
		else if ("fad".equals(sub))
			return WiktionaryFAD000.get(name);
		else if ("faf".equals(sub))
			return WiktionaryFAF000.get(name);
		else if ("fag".equals(sub))
			return WiktionaryFAG000.get(name);
		else if ("fah".equals(sub))
			return WiktionaryFAH000.get(name);
		else if ("fai".equals(sub))
			return WiktionaryFAI000.get(name);
		else if ("faj".equals(sub))
			return WiktionaryFAJ000.get(name);
		else if ("fak".equals(sub))
			return WiktionaryFAK000.get(name);
		else if ("fal".equals(sub))
			return WiktionaryFAL000.get(name);
		else if ("fam".equals(sub))
			return WiktionaryFAM000.get(name);
		else if ("fan".equals(sub))
			return WiktionaryFAN000.get(name);
		else if ("far".equals(sub))
			return WiktionaryFAR000.get(name);
		else if ("fas".equals(sub))
			return WiktionaryFAS000.get(name);
		else if ("fat".equals(sub))
			return WiktionaryFAT000.get(name);
		else if ("fau".equals(sub))
			return WiktionaryFAU000.get(name);
		else if ("fav".equals(sub))
			return WiktionaryFAV000.get(name);
		else if ("fax".equals(sub))
			return WiktionaryFAX000.get(name);
		else if ("fea".equals(sub))
			return WiktionaryFEA000.get(name);
		else if ("feb".equals(sub))
			return WiktionaryFEB000.get(name);
		else if ("fec".equals(sub))
			return WiktionaryFEC000.get(name);
		else if ("fed".equals(sub))
			return WiktionaryFED000.get(name);
		else if ("fee".equals(sub))
			return WiktionaryFEE000.get(name);
		else if ("fei".equals(sub))
			return WiktionaryFEI000.get(name);
		else if ("fel".equals(sub))
			return WiktionaryFEL000.get(name);
		else if ("fem".equals(sub))
			return WiktionaryFEM000.get(name);
		else if ("fen".equals(sub))
			return WiktionaryFEN000.get(name);
		else if ("feo".equals(sub))
			return WiktionaryFEO000.get(name);
		else if ("fep".equals(sub))
			return WiktionaryFEP000.get(name);
		else if ("fer".equals(sub))
			return WiktionaryFER000.get(name);
		else if ("fes".equals(sub))
			return WiktionaryFES000.get(name);
		else if ("fet".equals(sub))
			return WiktionaryFET000.get(name);
		else if ("feu".equals(sub))
			return WiktionaryFEU000.get(name);
		else if ("fev".equals(sub))
			return WiktionaryFEV000.get(name);
		else if ("few".equals(sub))
			return WiktionaryFEW000.get(name);
		else if ("fey".equals(sub))
			return WiktionaryFEY000.get(name);
		else if ("fia".equals(sub))
			return WiktionaryFIA000.get(name);
		else if ("fib".equals(sub))
			return WiktionaryFIB000.get(name);
		else if ("fic".equals(sub))
			return WiktionaryFIC000.get(name);
		else if ("fid".equals(sub))
			return WiktionaryFID000.get(name);
		else if ("fie".equals(sub))
			return WiktionaryFIE000.get(name);
		else if ("fif".equals(sub))
			return WiktionaryFIF000.get(name);
		else if ("fig".equals(sub))
			return WiktionaryFIG000.get(name);
		else if ("fil".equals(sub))
			return WiktionaryFIL000.get(name);
		else if ("fin".equals(sub))
			return WiktionaryFIN000.get(name);
		else if ("fio".equals(sub))
			return WiktionaryFIO000.get(name);
		else if ("fiq".equals(sub))
			return WiktionaryFIQ000.get(name);
		else if ("fir".equals(sub))
			return WiktionaryFIR000.get(name);
		else if ("fis".equals(sub))
			return WiktionaryFIS000.get(name);
		else if ("fit".equals(sub))
			return WiktionaryFIT000.get(name);
		else if ("fiv".equals(sub))
			return WiktionaryFIV000.get(name);
		else if ("fix".equals(sub))
			return WiktionaryFIX000.get(name);
		else if ("fiz".equals(sub))
			return WiktionaryFIZ000.get(name);
		else if ("fla".equals(sub))
			return WiktionaryFLA000.get(name);
		else if ("fle".equals(sub))
			return WiktionaryFLE000.get(name);
		else if ("fli".equals(sub))
			return WiktionaryFLI000.get(name);
		else if ("flo".equals(sub))
			return WiktionaryFLO000.get(name);
		else if ("flu".equals(sub))
			return WiktionaryFLU000.get(name);
		else if ("fly".equals(sub))
			return WiktionaryFLY000.get(name);
		else if ("fma".equals(sub))
			return WiktionaryFMA000.get(name);
		else if ("foa".equals(sub))
			return WiktionaryFOA000.get(name);
		else if ("foc".equals(sub))
			return WiktionaryFOC000.get(name);
		else if ("fod".equals(sub))
			return WiktionaryFOD000.get(name);
		else if ("foe".equals(sub))
			return WiktionaryFOE000.get(name);
		else if ("fog".equals(sub))
			return WiktionaryFOG000.get(name);
		else if ("foi".equals(sub))
			return WiktionaryFOI000.get(name);
		else if ("fol".equals(sub))
			return WiktionaryFOL000.get(name);
		else if ("fom".equals(sub))
			return WiktionaryFOM000.get(name);
		else if ("fon".equals(sub))
			return WiktionaryFON000.get(name);
		else if ("foo".equals(sub))
			return WiktionaryFOO000.get(name);
		else if ("for".equals(sub))
			return WiktionaryFOR000.get(name);
		else if ("fos".equals(sub))
			return WiktionaryFOS000.get(name);
		else if ("fou".equals(sub))
			return WiktionaryFOU000.get(name);
		else if ("fow".equals(sub))
			return WiktionaryFOW000.get(name);
		else if ("fox".equals(sub))
			return WiktionaryFOX000.get(name);
		else if ("fra".equals(sub))
			return WiktionaryFRA000.get(name);
		else if ("fre".equals(sub))
			return WiktionaryFRE000.get(name);
		else if ("fri".equals(sub))
			return WiktionaryFRI000.get(name);
		else if ("fro".equals(sub))
			return WiktionaryFRO000.get(name);
		else if ("fru".equals(sub))
			return WiktionaryFRU000.get(name);
		else if ("fsc".equals(sub))
			return WiktionaryFSC000.get(name);
		else if ("fuc".equals(sub))
			return WiktionaryFUC000.get(name);
		else if ("fud".equals(sub))
			return WiktionaryFUD000.get(name);
		else if ("fue".equals(sub))
			return WiktionaryFUE000.get(name);
		else if ("fug".equals(sub))
			return WiktionaryFUG000.get(name);
		else if ("fuj".equals(sub))
			return WiktionaryFUJ000.get(name);
		else if ("ful".equals(sub))
			return WiktionaryFUL000.get(name);
		else if ("fum".equals(sub))
			return WiktionaryFUM000.get(name);
		else if ("fun".equals(sub))
			return WiktionaryFUN000.get(name);
		else if ("fur".equals(sub))
			return WiktionaryFUR000.get(name);
		else if ("fus".equals(sub))
			return WiktionaryFUS000.get(name);
		else if ("fut".equals(sub))
			return WiktionaryFUT000.get(name);
		else if ("fyl".equals(sub))
			return WiktionaryFYL000.get(name);
		else if ("fyn".equals(sub))
			return WiktionaryFYN000.get(name);
		else if ("fyr".equals(sub))
			return WiktionaryFYR000.get(name);
		return null;
	}
}