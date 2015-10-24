package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.j.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.j.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.j.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.j.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.j.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.h.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.j.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.j.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.j.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.j.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.j.y.n.*;

public final class WiktionaryDbJ {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("jab".equals(sub))
			return WiktionaryJAB000.get(name);
		else if ("jac".equals(sub))
			return WiktionaryJAC000.get(name);
		else if ("jag".equals(sub))
			return WiktionaryJAG000.get(name);
		else if ("jai".equals(sub))
			return WiktionaryJAI000.get(name);
		else if ("jak".equals(sub))
			return WiktionaryJAK000.get(name);
		else if ("jal".equals(sub))
			return WiktionaryJAL000.get(name);
		else if ("jam".equals(sub))
			return WiktionaryJAM000.get(name);
		else if ("jan".equals(sub))
			return WiktionaryJAN000.get(name);
		else if ("jap".equals(sub))
			return WiktionaryJAP000.get(name);
		else if ("jar".equals(sub))
			return WiktionaryJAR000.get(name);
		else if ("jas".equals(sub))
			return WiktionaryJAS000.get(name);
		else if ("jau".equals(sub))
			return WiktionaryJAU000.get(name);
		else if ("jav".equals(sub))
			return WiktionaryJAV000.get(name);
		else if ("jaw".equals(sub))
			return WiktionaryJAW000.get(name);
		else if ("jay".equals(sub))
			return WiktionaryJAY000.get(name);
		else if ("jaz".equals(sub))
			return WiktionaryJAZ000.get(name);
		else if ("jea".equals(sub))
			return WiktionaryJEA000.get(name);
		else if ("jed".equals(sub))
			return WiktionaryJED000.get(name);
		else if ("jee".equals(sub))
			return WiktionaryJEE000.get(name);
		else if ("jef".equals(sub))
			return WiktionaryJEF000.get(name);
		else if ("jeg".equals(sub))
			return WiktionaryJEG000.get(name);
		else if ("jek".equals(sub))
			return WiktionaryJEK000.get(name);
		else if ("jel".equals(sub))
			return WiktionaryJEL000.get(name);
		else if ("jem".equals(sub))
			return WiktionaryJEM000.get(name);
		else if ("jen".equals(sub))
			return WiktionaryJEN000.get(name);
		else if ("jeo".equals(sub))
			return WiktionaryJEO000.get(name);
		else if ("jer".equals(sub))
			return WiktionaryJER000.get(name);
		else if ("jes".equals(sub))
			return WiktionaryJES000.get(name);
		else if ("jet".equals(sub))
			return WiktionaryJET000.get(name);
		else if ("jew".equals(sub))
			return WiktionaryJEW000.get(name);
		else if ("jha".equals(sub))
			return WiktionaryJHA000.get(name);
		else if ("jhe".equals(sub))
			return WiktionaryJHE000.get(name);
		else if ("jic".equals(sub))
			return WiktionaryJIC000.get(name);
		else if ("jif".equals(sub))
			return WiktionaryJIF000.get(name);
		else if ("jig".equals(sub))
			return WiktionaryJIG000.get(name);
		else if ("jih".equals(sub))
			return WiktionaryJIH000.get(name);
		else if ("jil".equals(sub))
			return WiktionaryJIL000.get(name);
		else if ("jim".equals(sub))
			return WiktionaryJIM000.get(name);
		else if ("jin".equals(sub))
			return WiktionaryJIN000.get(name);
		else if ("jir".equals(sub))
			return WiktionaryJIR000.get(name);
		else if ("jis".equals(sub))
			return WiktionaryJIS000.get(name);
		else if ("jit".equals(sub))
			return WiktionaryJIT000.get(name);
		else if ("jna".equals(sub))
			return WiktionaryJNA000.get(name);
		else if ("joa".equals(sub))
			return WiktionaryJOA000.get(name);
		else if ("job".equals(sub))
			return WiktionaryJOB000.get(name);
		else if ("joc".equals(sub))
			return WiktionaryJOC000.get(name);
		else if ("jog".equals(sub))
			return WiktionaryJOG000.get(name);
		else if ("joh".equals(sub))
			return WiktionaryJOH000.get(name);
		else if ("joi".equals(sub))
			return WiktionaryJOI000.get(name);
		else if ("joj".equals(sub))
			return WiktionaryJOJ000.get(name);
		else if ("jok".equals(sub))
			return WiktionaryJOK000.get(name);
		else if ("jol".equals(sub))
			return WiktionaryJOL000.get(name);
		else if ("jon".equals(sub))
			return WiktionaryJON000.get(name);
		else if ("jor".equals(sub))
			return WiktionaryJOR000.get(name);
		else if ("jos".equals(sub))
			return WiktionaryJOS000.get(name);
		else if ("jot".equals(sub))
			return WiktionaryJOT000.get(name);
		else if ("jou".equals(sub))
			return WiktionaryJOU000.get(name);
		else if ("jov".equals(sub))
			return WiktionaryJOV000.get(name);
		else if ("joy".equals(sub))
			return WiktionaryJOY000.get(name);
		else if ("jub".equals(sub))
			return WiktionaryJUB000.get(name);
		else if ("jud".equals(sub))
			return WiktionaryJUD000.get(name);
		else if ("jug".equals(sub))
			return WiktionaryJUG000.get(name);
		else if ("jui".equals(sub))
			return WiktionaryJUI000.get(name);
		else if ("juj".equals(sub))
			return WiktionaryJUJ000.get(name);
		else if ("jum".equals(sub))
			return WiktionaryJUM000.get(name);
		else if ("jun".equals(sub))
			return WiktionaryJUN000.get(name);
		else if ("jus".equals(sub))
			return WiktionaryJUS000.get(name);
		else if ("jux".equals(sub))
			return WiktionaryJUX000.get(name);
		else if ("jyn".equals(sub))
			return WiktionaryJYN000.get(name);
		return null;
	}
}