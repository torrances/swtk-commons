package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.e.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.e.b.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.b.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.b.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.b.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.d.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.l.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.c.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.d.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.m.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.d.w.*;
import org.swtk.commons.dict.wiktionary.generated.e.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.e.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.f.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.f.f.*;
import org.swtk.commons.dict.wiktionary.generated.e.f.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.g.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.g.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.g.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.g.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.g.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.g.y.*;
import org.swtk.commons.dict.wiktionary.generated.e.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.e.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.e.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.j.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.j.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.j.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.k.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.k.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.k.k.*;
import org.swtk.commons.dict.wiktionary.generated.e.k.p.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.b.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.d.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.f.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.k.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.l.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.m.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.p.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.v.*;
import org.swtk.commons.dict.wiktionary.generated.e.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.b.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.m.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.p.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.m.y.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.d.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.f.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.j.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.k.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.l.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.m.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.n.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.q.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.v.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.y.*;
import org.swtk.commons.dict.wiktionary.generated.e.n.z.*;
import org.swtk.commons.dict.wiktionary.generated.e.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.e.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.e.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.e.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.p.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.p.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.p.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.p.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.p.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.q.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.b.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.l.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.m.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.b.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.k.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.m.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.p.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.s.z.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.t.y.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.e.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.v.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.v.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.v.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.v.z.*;
import org.swtk.commons.dict.wiktionary.generated.e.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.c.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.f.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.h.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.i.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.p.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.s.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.t.*;
import org.swtk.commons.dict.wiktionary.generated.e.x.u.*;
import org.swtk.commons.dict.wiktionary.generated.e.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.e.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.e.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.e.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.e.z.a.*;

public final class WiktionaryDbE {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("eag".equals(sub))
			return WiktionaryEAG000.get(name);
		else if ("ear".equals(sub))
			return WiktionaryEAR000.get(name);
		else if ("eas".equals(sub))
			return WiktionaryEAS000.get(name);
		else if ("eat".equals(sub))
			return WiktionaryEAT000.get(name);
		else if ("eav".equals(sub))
			return WiktionaryEAV000.get(name);
		else if ("eba".equals(sub))
			return WiktionaryEBA000.get(name);
		else if ("ebe".equals(sub))
			return WiktionaryEBE000.get(name);
		else if ("ebo".equals(sub))
			return WiktionaryEBO000.get(name);
		else if ("ebr".equals(sub))
			return WiktionaryEBR000.get(name);
		else if ("ebu".equals(sub))
			return WiktionaryEBU000.get(name);
		else if ("eca".equals(sub))
			return WiktionaryECA000.get(name);
		else if ("ecc".equals(sub))
			return WiktionaryECC000.get(name);
		else if ("ecd".equals(sub))
			return WiktionaryECD000.get(name);
		else if ("ece".equals(sub))
			return WiktionaryECE000.get(name);
		else if ("ecg".equals(sub))
			return WiktionaryECG000.get(name);
		else if ("ech".equals(sub))
			return WiktionaryECH000.get(name);
		else if ("ecl".equals(sub))
			return WiktionaryECL000.get(name);
		else if ("eco".equals(sub))
			return WiktionaryECO000.get(name);
		else if ("ect".equals(sub))
			return WiktionaryECT000.get(name);
		else if ("ecu".equals(sub))
			return WiktionaryECU000.get(name);
		else if ("eda".equals(sub))
			return WiktionaryEDA000.get(name);
		else if ("edd".equals(sub))
			return WiktionaryEDD000.get(name);
		else if ("ede".equals(sub))
			return WiktionaryEDE000.get(name);
		else if ("edg".equals(sub))
			return WiktionaryEDG000.get(name);
		else if ("edi".equals(sub))
			return WiktionaryEDI000.get(name);
		else if ("edm".equals(sub))
			return WiktionaryEDM000.get(name);
		else if ("edo".equals(sub))
			return WiktionaryEDO000.get(name);
		else if ("edu".equals(sub))
			return WiktionaryEDU000.get(name);
		else if ("edw".equals(sub))
			return WiktionaryEDW000.get(name);
		else if ("eel".equals(sub))
			return WiktionaryEEL000.get(name);
		else if ("eer".equals(sub))
			return WiktionaryEER000.get(name);
		else if ("efa".equals(sub))
			return WiktionaryEFA000.get(name);
		else if ("eff".equals(sub))
			return WiktionaryEFF000.get(name);
		else if ("eft".equals(sub))
			return WiktionaryEFT000.get(name);
		else if ("ega".equals(sub))
			return WiktionaryEGA000.get(name);
		else if ("ege".equals(sub))
			return WiktionaryEGE000.get(name);
		else if ("egg".equals(sub))
			return WiktionaryEGG000.get(name);
		else if ("ego".equals(sub))
			return WiktionaryEGO000.get(name);
		else if ("egr".equals(sub))
			return WiktionaryEGR000.get(name);
		else if ("egy".equals(sub))
			return WiktionaryEGY000.get(name);
		else if ("eif".equals(sub))
			return WiktionaryEIF000.get(name);
		else if ("eig".equals(sub))
			return WiktionaryEIG000.get(name);
		else if ("eik".equals(sub))
			return WiktionaryEIK000.get(name);
		else if ("eir".equals(sub))
			return WiktionaryEIR000.get(name);
		else if ("eis".equals(sub))
			return WiktionaryEIS000.get(name);
		else if ("eja".equals(sub))
			return WiktionaryEJA000.get(name);
		else if ("eje".equals(sub))
			return WiktionaryEJE000.get(name);
		else if ("eji".equals(sub))
			return WiktionaryEJI000.get(name);
		else if ("eka".equals(sub))
			return WiktionaryEKA000.get(name);
		else if ("eki".equals(sub))
			return WiktionaryEKI000.get(name);
		else if ("ekk".equals(sub))
			return WiktionaryEKK000.get(name);
		else if ("ekp".equals(sub))
			return WiktionaryEKP000.get(name);
		else if ("ela".equals(sub))
			return WiktionaryELA000.get(name);
		else if ("elb".equals(sub))
			return WiktionaryELB000.get(name);
		else if ("elc".equals(sub))
			return WiktionaryELC000.get(name);
		else if ("eld".equals(sub))
			return WiktionaryELD000.get(name);
		else if ("ele".equals(sub))
			return WiktionaryELE000.get(name);
		else if ("elf".equals(sub))
			return WiktionaryELF000.get(name);
		else if ("elg".equals(sub))
			return WiktionaryELG000.get(name);
		else if ("eli".equals(sub))
			return WiktionaryELI000.get(name);
		else if ("elk".equals(sub))
			return WiktionaryELK000.get(name);
		else if ("ell".equals(sub))
			return WiktionaryELL000.get(name);
		else if ("elm".equals(sub))
			return WiktionaryELM000.get(name);
		else if ("elo".equals(sub))
			return WiktionaryELO000.get(name);
		else if ("elp".equals(sub))
			return WiktionaryELP000.get(name);
		else if ("elt".equals(sub))
			return WiktionaryELT000.get(name);
		else if ("elv".equals(sub))
			return WiktionaryELV000.get(name);
		else if ("ely".equals(sub))
			return WiktionaryELY000.get(name);
		else if ("ema".equals(sub))
			return WiktionaryEMA000.get(name);
		else if ("emb".equals(sub))
			return WiktionaryEMB000.get(name);
		else if ("emc".equals(sub))
			return WiktionaryEMC000.get(name);
		else if ("eme".equals(sub))
			return WiktionaryEME000.get(name);
		else if ("emi".equals(sub))
			return WiktionaryEMI000.get(name);
		else if ("emm".equals(sub))
			return WiktionaryEMM000.get(name);
		else if ("emo".equals(sub))
			return WiktionaryEMO000.get(name);
		else if ("emp".equals(sub))
			return WiktionaryEMP000.get(name);
		else if ("ems".equals(sub))
			return WiktionaryEMS000.get(name);
		else if ("emu".equals(sub))
			return WiktionaryEMU000.get(name);
		else if ("emy".equals(sub))
			return WiktionaryEMY000.get(name);
		else if ("ena".equals(sub))
			return WiktionaryENA000.get(name);
		else if ("enc".equals(sub))
			return WiktionaryENC000.get(name);
		else if ("end".equals(sub))
			return WiktionaryEND000.get(name);
		else if ("ene".equals(sub))
			return WiktionaryENE000.get(name);
		else if ("enf".equals(sub))
			return WiktionaryENF000.get(name);
		else if ("eng".equals(sub))
			return WiktionaryENG000.get(name);
		else if ("enh".equals(sub))
			return WiktionaryENH000.get(name);
		else if ("eni".equals(sub))
			return WiktionaryENI000.get(name);
		else if ("enj".equals(sub))
			return WiktionaryENJ000.get(name);
		else if ("enk".equals(sub))
			return WiktionaryENK000.get(name);
		else if ("enl".equals(sub))
			return WiktionaryENL000.get(name);
		else if ("enm".equals(sub))
			return WiktionaryENM000.get(name);
		else if ("enn".equals(sub))
			return WiktionaryENN000.get(name);
		else if ("eno".equals(sub))
			return WiktionaryENO000.get(name);
		else if ("enq".equals(sub))
			return WiktionaryENQ000.get(name);
		else if ("enr".equals(sub))
			return WiktionaryENR000.get(name);
		else if ("ens".equals(sub))
			return WiktionaryENS000.get(name);
		else if ("ent".equals(sub))
			return WiktionaryENT000.get(name);
		else if ("enu".equals(sub))
			return WiktionaryENU000.get(name);
		else if ("env".equals(sub))
			return WiktionaryENV000.get(name);
		else if ("eny".equals(sub))
			return WiktionaryENY000.get(name);
		else if ("enz".equals(sub))
			return WiktionaryENZ000.get(name);
		else if ("eob".equals(sub))
			return WiktionaryEOB000.get(name);
		else if ("eof".equals(sub))
			return WiktionaryEOF000.get(name);
		else if ("eon".equals(sub))
			return WiktionaryEON000.get(name);
		else if ("eos".equals(sub))
			return WiktionaryEOS000.get(name);
		else if ("epa".equals(sub))
			return WiktionaryEPA000.get(name);
		else if ("epe".equals(sub))
			return WiktionaryEPE000.get(name);
		else if ("eph".equals(sub))
			return WiktionaryEPH000.get(name);
		else if ("epi".equals(sub))
			return WiktionaryEPI000.get(name);
		else if ("epo".equals(sub))
			return WiktionaryEPO000.get(name);
		else if ("epr".equals(sub))
			return WiktionaryEPR000.get(name);
		else if ("equ".equals(sub))
			return WiktionaryEQU000.get(name);
		else if ("era".equals(sub))
			return WiktionaryERA000.get(name);
		else if ("erb".equals(sub))
			return WiktionaryERB000.get(name);
		else if ("ere".equals(sub))
			return WiktionaryERE000.get(name);
		else if ("erg".equals(sub))
			return WiktionaryERG000.get(name);
		else if ("erh".equals(sub))
			return WiktionaryERH000.get(name);
		else if ("eri".equals(sub))
			return WiktionaryERI000.get(name);
		else if ("erl".equals(sub))
			return WiktionaryERL000.get(name);
		else if ("erm".equals(sub))
			return WiktionaryERM000.get(name);
		else if ("ero".equals(sub))
			return WiktionaryERO000.get(name);
		else if ("err".equals(sub))
			return WiktionaryERR000.get(name);
		else if ("ers".equals(sub))
			return WiktionaryERS000.get(name);
		else if ("eru".equals(sub))
			return WiktionaryERU000.get(name);
		else if ("ery".equals(sub))
			return WiktionaryERY000.get(name);
		else if ("esb".equals(sub))
			return WiktionaryESB000.get(name);
		else if ("esc".equals(sub))
			return WiktionaryESC000.get(name);
		else if ("esh".equals(sub))
			return WiktionaryESH000.get(name);
		else if ("esk".equals(sub))
			return WiktionaryESK000.get(name);
		else if ("esm".equals(sub))
			return WiktionaryESM000.get(name);
		else if ("eso".equals(sub))
			return WiktionaryESO000.get(name);
		else if ("esp".equals(sub))
			return WiktionaryESP000.get(name);
		else if ("ess".equals(sub))
			return WiktionaryESS000.get(name);
		else if ("est".equals(sub))
			return WiktionaryEST000.get(name);
		else if ("esz".equals(sub))
			return WiktionaryESZ000.get(name);
		else if ("eta".equals(sub))
			return WiktionaryETA000.get(name);
		else if ("etc".equals(sub))
			return WiktionaryETC000.get(name);
		else if ("ete".equals(sub))
			return WiktionaryETE000.get(name);
		else if ("eth".equals(sub))
			return WiktionaryETH000.get(name);
		else if ("eti".equals(sub))
			return WiktionaryETI000.get(name);
		else if ("eto".equals(sub))
			return WiktionaryETO000.get(name);
		else if ("ett".equals(sub))
			return WiktionaryETT000.get(name);
		else if ("ety".equals(sub))
			return WiktionaryETY000.get(name);
		else if ("eub".equals(sub))
			return WiktionaryEUB000.get(name);
		else if ("euc".equals(sub))
			return WiktionaryEUC000.get(name);
		else if ("eud".equals(sub))
			return WiktionaryEUD000.get(name);
		else if ("euf".equals(sub))
			return WiktionaryEUF000.get(name);
		else if ("eug".equals(sub))
			return WiktionaryEUG000.get(name);
		else if ("euh".equals(sub))
			return WiktionaryEUH000.get(name);
		else if ("euk".equals(sub))
			return WiktionaryEUK000.get(name);
		else if ("eul".equals(sub))
			return WiktionaryEUL000.get(name);
		else if ("eum".equals(sub))
			return WiktionaryEUM000.get(name);
		else if ("eun".equals(sub))
			return WiktionaryEUN000.get(name);
		else if ("euo".equals(sub))
			return WiktionaryEUO000.get(name);
		else if ("eup".equals(sub))
			return WiktionaryEUP000.get(name);
		else if ("eur".equals(sub))
			return WiktionaryEUR000.get(name);
		else if ("eus".equals(sub))
			return WiktionaryEUS000.get(name);
		else if ("eut".equals(sub))
			return WiktionaryEUT000.get(name);
		else if ("euv".equals(sub))
			return WiktionaryEUV000.get(name);
		else if ("eva".equals(sub))
			return WiktionaryEVA000.get(name);
		else if ("eve".equals(sub))
			return WiktionaryEVE000.get(name);
		else if ("evi".equals(sub))
			return WiktionaryEVI000.get(name);
		else if ("evo".equals(sub))
			return WiktionaryEVO000.get(name);
		else if ("evz".equals(sub))
			return WiktionaryEVZ000.get(name);
		else if ("ewa".equals(sub))
			return WiktionaryEWA000.get(name);
		else if ("ewe".equals(sub))
			return WiktionaryEWE000.get(name);
		else if ("exa".equals(sub))
			return WiktionaryEXA000.get(name);
		else if ("exc".equals(sub))
			return WiktionaryEXC000.get(name);
		else if ("exe".equals(sub))
			return WiktionaryEXE000.get(name);
		else if ("exf".equals(sub))
			return WiktionaryEXF000.get(name);
		else if ("exh".equals(sub))
			return WiktionaryEXH000.get(name);
		else if ("exi".equals(sub))
			return WiktionaryEXI000.get(name);
		else if ("exo".equals(sub))
			return WiktionaryEXO000.get(name);
		else if ("exp".equals(sub))
			return WiktionaryEXP000.get(name);
		else if ("exs".equals(sub))
			return WiktionaryEXS000.get(name);
		else if ("ext".equals(sub))
			return WiktionaryEXT000.get(name);
		else if ("exu".equals(sub))
			return WiktionaryEXU000.get(name);
		else if ("eya".equals(sub))
			return WiktionaryEYA000.get(name);
		else if ("eye".equals(sub))
			return WiktionaryEYE000.get(name);
		else if ("eyo".equals(sub))
			return WiktionaryEYO000.get(name);
		else if ("eyr".equals(sub))
			return WiktionaryEYR000.get(name);
		else if ("eza".equals(sub))
			return WiktionaryEZA000.get(name);
		return null;
	}
}