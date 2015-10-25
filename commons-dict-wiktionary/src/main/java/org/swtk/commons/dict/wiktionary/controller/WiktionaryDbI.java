package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.i.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.i.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.i.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.i.b.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.b.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.b.r.*;
import org.swtk.commons.dict.wiktionary.generated.i.c.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.c.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.i.c.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.c.k.*;
import org.swtk.commons.dict.wiktionary.generated.i.c.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.c.t.*;
import org.swtk.commons.dict.wiktionary.generated.i.d.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.d.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.d.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.d.l.*;
import org.swtk.commons.dict.wiktionary.generated.i.d.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.i.f.f.*;
import org.swtk.commons.dict.wiktionary.generated.i.f.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.g.n.*;
import org.swtk.commons.dict.wiktionary.generated.i.g.u.*;
import org.swtk.commons.dict.wiktionary.generated.i.k.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.k.r.*;
import org.swtk.commons.dict.wiktionary.generated.i.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.l.l.*;
import org.swtk.commons.dict.wiktionary.generated.i.l.m.*;
import org.swtk.commons.dict.wiktionary.generated.i.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.m.b.*;
import org.swtk.commons.dict.wiktionary.generated.i.m.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.m.m.*;
import org.swtk.commons.dict.wiktionary.generated.i.m.p.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.b.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.c.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.d.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.f.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.g.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.h.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.j.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.k.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.l.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.m.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.n.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.p.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.q.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.r.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.s.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.t.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.u.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.v.*;
import org.swtk.commons.dict.wiktionary.generated.i.n.w.*;
import org.swtk.commons.dict.wiktionary.generated.i.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.i.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.i.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.i.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.i.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.i.p.h.*;
import org.swtk.commons.dict.wiktionary.generated.i.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.i.p.s.*;
import org.swtk.commons.dict.wiktionary.generated.i.q.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.q.u.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.c.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.k.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.r.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.i.r.v.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.h.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.l.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.m.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.r.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.s.*;
import org.swtk.commons.dict.wiktionary.generated.i.s.t.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.c.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.s.*;
import org.swtk.commons.dict.wiktionary.generated.i.t.t.*;
import org.swtk.commons.dict.wiktionary.generated.i.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.v.o.*;
import org.swtk.commons.dict.wiktionary.generated.i.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.x.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.i.z.m.*;
import org.swtk.commons.dict.wiktionary.generated.i.z.t.*;

public final class WiktionaryDbI {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("iai".equals(sub))
			return WiktionaryIAI000.get(name);
		else if ("iam".equals(sub))
			return WiktionaryIAM000.get(name);
		else if ("ian".equals(sub))
			return WiktionaryIAN000.get(name);
		else if ("iat".equals(sub))
			return WiktionaryIAT000.get(name);
		else if ("ibe".equals(sub))
			return WiktionaryIBE000.get(name);
		else if ("ibi".equals(sub))
			return WiktionaryIBI000.get(name);
		else if ("ibo".equals(sub))
			return WiktionaryIBO000.get(name);
		else if ("ibr".equals(sub))
			return WiktionaryIBR000.get(name);
		else if ("ica".equals(sub))
			return WiktionaryICA000.get(name);
		else if ("ice".equals(sub))
			return WiktionaryICE000.get(name);
		else if ("ich".equals(sub))
			return WiktionaryICH000.get(name);
		else if ("ici".equals(sub))
			return WiktionaryICI000.get(name);
		else if ("ick".equals(sub))
			return WiktionaryICK000.get(name);
		else if ("ico".equals(sub))
			return WiktionaryICO000.get(name);
		else if ("ict".equals(sub))
			return WiktionaryICT000.get(name);
		else if ("ida".equals(sub))
			return WiktionaryIDA000.get(name);
		else if ("ide".equals(sub))
			return WiktionaryIDE000.get(name);
		else if ("idi".equals(sub))
			return WiktionaryIDI000.get(name);
		else if ("idl".equals(sub))
			return WiktionaryIDL000.get(name);
		else if ("ido".equals(sub))
			return WiktionaryIDO000.get(name);
		else if ("iet".equals(sub))
			return WiktionaryIET000.get(name);
		else if ("iff".equals(sub))
			return WiktionaryIFF000.get(name);
		else if ("ifo".equals(sub))
			return WiktionaryIFO000.get(name);
		else if ("ign".equals(sub))
			return WiktionaryIGN000.get(name);
		else if ("igu".equals(sub))
			return WiktionaryIGU000.get(name);
		else if ("ike".equals(sub))
			return WiktionaryIKE000.get(name);
		else if ("ikr".equals(sub))
			return WiktionaryIKR000.get(name);
		else if ("ile".equals(sub))
			return WiktionaryILE000.get(name);
		else if ("ili".equals(sub))
			return WiktionaryILI000.get(name);
		else if ("ill".equals(sub))
			return WiktionaryILL000.get(name);
		else if ("ilm".equals(sub))
			return WiktionaryILM000.get(name);
		else if ("ima".equals(sub))
			return WiktionaryIMA000.get(name);
		else if ("imb".equals(sub))
			return WiktionaryIMB000.get(name);
		else if ("imi".equals(sub))
			return WiktionaryIMI000.get(name);
		else if ("imm".equals(sub))
			return WiktionaryIMM000.get(name);
		else if ("imp".equals(sub))
			return WiktionaryIMP000.get(name);
		else if ("ina".equals(sub))
			return WiktionaryINA000.get(name);
		else if ("inb".equals(sub))
			return WiktionaryINB000.get(name);
		else if ("inc".equals(sub))
			return WiktionaryINC000.get(name);
		else if ("ind".equals(sub))
			return WiktionaryIND000.get(name);
		else if ("ine".equals(sub))
			return WiktionaryINE000.get(name);
		else if ("inf".equals(sub))
			return WiktionaryINF000.get(name);
		else if ("ing".equals(sub))
			return WiktionaryING000.get(name);
		else if ("inh".equals(sub))
			return WiktionaryINH000.get(name);
		else if ("ini".equals(sub))
			return WiktionaryINI000.get(name);
		else if ("inj".equals(sub))
			return WiktionaryINJ000.get(name);
		else if ("ink".equals(sub))
			return WiktionaryINK000.get(name);
		else if ("inl".equals(sub))
			return WiktionaryINL000.get(name);
		else if ("inm".equals(sub))
			return WiktionaryINM000.get(name);
		else if ("inn".equals(sub))
			return WiktionaryINN000.get(name);
		else if ("ino".equals(sub))
			return WiktionaryINO000.get(name);
		else if ("inp".equals(sub))
			return WiktionaryINP000.get(name);
		else if ("inq".equals(sub))
			return WiktionaryINQ000.get(name);
		else if ("inr".equals(sub))
			return WiktionaryINR000.get(name);
		else if ("ins".equals(sub))
			return WiktionaryINS000.get(name);
		else if ("int".equals(sub))
			return WiktionaryINT000.get(name);
		else if ("inu".equals(sub))
			return WiktionaryINU000.get(name);
		else if ("inv".equals(sub))
			return WiktionaryINV000.get(name);
		else if ("inw".equals(sub))
			return WiktionaryINW000.get(name);
		else if ("iod".equals(sub))
			return WiktionaryIOD000.get(name);
		else if ("iol".equals(sub))
			return WiktionaryIOL000.get(name);
		else if ("ion".equals(sub))
			return WiktionaryION000.get(name);
		else if ("iot".equals(sub))
			return WiktionaryIOT000.get(name);
		else if ("iow".equals(sub))
			return WiktionaryIOW000.get(name);
		else if ("iph".equals(sub))
			return WiktionaryIPH000.get(name);
		else if ("ipr".equals(sub))
			return WiktionaryIPR000.get(name);
		else if ("ips".equals(sub))
			return WiktionaryIPS000.get(name);
		else if ("iqa".equals(sub))
			return WiktionaryIQA000.get(name);
		else if ("iqu".equals(sub))
			return WiktionaryIQU000.get(name);
		else if ("ira".equals(sub))
			return WiktionaryIRA000.get(name);
		else if ("irc".equals(sub))
			return WiktionaryIRC000.get(name);
		else if ("ire".equals(sub))
			return WiktionaryIRE000.get(name);
		else if ("iri".equals(sub))
			return WiktionaryIRI000.get(name);
		else if ("irk".equals(sub))
			return WiktionaryIRK000.get(name);
		else if ("iro".equals(sub))
			return WiktionaryIRO000.get(name);
		else if ("irr".equals(sub))
			return WiktionaryIRR000.get(name);
		else if ("iru".equals(sub))
			return WiktionaryIRU000.get(name);
		else if ("irv".equals(sub))
			return WiktionaryIRV000.get(name);
		else if ("isa".equals(sub))
			return WiktionaryISA000.get(name);
		else if ("isc".equals(sub))
			return WiktionaryISC000.get(name);
		else if ("ish".equals(sub))
			return WiktionaryISH000.get(name);
		else if ("isi".equals(sub))
			return WiktionaryISI000.get(name);
		else if ("isl".equals(sub))
			return WiktionaryISL000.get(name);
		else if ("ism".equals(sub))
			return WiktionaryISM000.get(name);
		else if ("iso".equals(sub))
			return WiktionaryISO000.get(name);
		else if ("isr".equals(sub))
			return WiktionaryISR000.get(name);
		else if ("iss".equals(sub))
			return WiktionaryISS000.get(name);
		else if ("ist".equals(sub))
			return WiktionaryIST000.get(name);
		else if ("ita".equals(sub))
			return WiktionaryITA000.get(name);
		else if ("itc".equals(sub))
			return WiktionaryITC000.get(name);
		else if ("ite".equals(sub))
			return WiktionaryITE000.get(name);
		else if ("ith".equals(sub))
			return WiktionaryITH000.get(name);
		else if ("iti".equals(sub))
			return WiktionaryITI000.get(name);
		else if ("ito".equals(sub))
			return WiktionaryITO000.get(name);
		else if ("its".equals(sub))
			return WiktionaryITS000.get(name);
		else if ("itt".equals(sub))
			return WiktionaryITT000.get(name);
		else if ("iva".equals(sub))
			return WiktionaryIVA000.get(name);
		else if ("ivo".equals(sub))
			return WiktionaryIVO000.get(name);
		else if ("iwa".equals(sub))
			return WiktionaryIWA000.get(name);
		else if ("ixa".equals(sub))
			return WiktionaryIXA000.get(name);
		else if ("iya".equals(sub))
			return WiktionaryIYA000.get(name);
		else if ("izm".equals(sub))
			return WiktionaryIZM000.get(name);
		else if ("izt".equals(sub))
			return WiktionaryIZT000.get(name);
		return null;
	}
}