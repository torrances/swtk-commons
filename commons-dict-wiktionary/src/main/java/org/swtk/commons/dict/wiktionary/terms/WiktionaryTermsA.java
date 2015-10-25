package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.a.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.j.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.x.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.q.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.j.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.z.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.z.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.j.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.x.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.z.*;
import org.swtk.commons.dict.wiktionary.generated.a.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.q.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.q.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.y.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.u.*;  public final class WiktionaryTermsA {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryAAC000.terms());
set.addAll(WiktionaryAAD000.terms());
set.addAll(WiktionaryAAL000.terms());
set.addAll(WiktionaryAAN000.terms());
set.addAll(WiktionaryAAR000.terms());
set.addAll(WiktionaryABA000.terms());
set.addAll(WiktionaryABB000.terms());
set.addAll(WiktionaryABD000.terms());
set.addAll(WiktionaryABE000.terms());
set.addAll(WiktionaryABF000.terms());
set.addAll(WiktionaryABG000.terms());
set.addAll(WiktionaryABH000.terms());
set.addAll(WiktionaryABI000.terms());
set.addAll(WiktionaryABJ000.terms());
set.addAll(WiktionaryABK000.terms());
set.addAll(WiktionaryABL000.terms());
set.addAll(WiktionaryABM000.terms());
set.addAll(WiktionaryABN000.terms());
set.addAll(WiktionaryABO000.terms());
set.addAll(WiktionaryABR000.terms());
set.addAll(WiktionaryABS000.terms());
set.addAll(WiktionaryABU000.terms());
set.addAll(WiktionaryABV000.terms());
set.addAll(WiktionaryABW000.terms());
set.addAll(WiktionaryABX000.terms());
set.addAll(WiktionaryABY000.terms());
set.addAll(WiktionaryACA000.terms());
set.addAll(WiktionaryACC000.terms());
set.addAll(WiktionaryACE000.terms());
set.addAll(WiktionaryACH000.terms());
set.addAll(WiktionaryACI000.terms());
set.addAll(WiktionaryACK000.terms());
set.addAll(WiktionaryACL000.terms());
set.addAll(WiktionaryACM000.terms());
set.addAll(WiktionaryACN000.terms());
set.addAll(WiktionaryACO000.terms());
set.addAll(WiktionaryACQ000.terms());
set.addAll(WiktionaryACR000.terms());
set.addAll(WiktionaryACT000.terms());
set.addAll(WiktionaryACU000.terms());
set.addAll(WiktionaryACY000.terms());
set.addAll(WiktionaryADA000.terms());
set.addAll(WiktionaryADD000.terms());
set.addAll(WiktionaryADE000.terms());
set.addAll(WiktionaryADH000.terms());
set.addAll(WiktionaryADI000.terms());
set.addAll(WiktionaryADJ000.terms());
set.addAll(WiktionaryADL000.terms());
set.addAll(WiktionaryADM000.terms());
set.addAll(WiktionaryADN000.terms());
set.addAll(WiktionaryADO000.terms());
set.addAll(WiktionaryADP000.terms());
set.addAll(WiktionaryADR000.terms());
set.addAll(WiktionaryADS000.terms());
set.addAll(WiktionaryADU000.terms());
set.addAll(WiktionaryADV000.terms());
set.addAll(WiktionaryADW000.terms());
set.addAll(WiktionaryADY000.terms());
set.addAll(WiktionaryADZ000.terms());
set.addAll(WiktionaryAEA000.terms());
set.addAll(WiktionaryAEC000.terms());
set.addAll(WiktionaryAED000.terms());
set.addAll(WiktionaryAEG000.terms());
set.addAll(WiktionaryAEN000.terms());
set.addAll(WiktionaryAEO000.terms());
set.addAll(WiktionaryAEQ000.terms());
set.addAll(WiktionaryAER000.terms());
set.addAll(WiktionaryAES000.terms());
set.addAll(WiktionaryAET000.terms());
set.addAll(WiktionaryAEV000.terms());
set.addAll(WiktionaryAFC000.terms());
set.addAll(WiktionaryAFF000.terms());
set.addAll(WiktionaryAFG000.terms());
set.addAll(WiktionaryAFI000.terms());
set.addAll(WiktionaryAFL000.terms());
set.addAll(WiktionaryAFO000.terms());
set.addAll(WiktionaryAFR000.terms());
set.addAll(WiktionaryAFT000.terms());
set.addAll(WiktionaryAFZ000.terms());
set.addAll(WiktionaryAGA000.terms());
set.addAll(WiktionaryAGD000.terms());
set.addAll(WiktionaryAGE000.terms());
set.addAll(WiktionaryAGF000.terms());
set.addAll(WiktionaryAGG000.terms());
set.addAll(WiktionaryAGI000.terms());
set.addAll(WiktionaryAGL000.terms());
set.addAll(WiktionaryAGN000.terms());
set.addAll(WiktionaryAGO000.terms());
set.addAll(WiktionaryAGR000.terms());
set.addAll(WiktionaryAGU000.terms());
set.addAll(WiktionaryAHA000.terms());
set.addAll(WiktionaryAHI000.terms());
set.addAll(WiktionaryAHL000.terms());
set.addAll(WiktionaryAHM000.terms());
set.addAll(WiktionaryAHO000.terms());
set.addAll(WiktionaryAHW000.terms());
set.addAll(WiktionaryAIB000.terms());
set.addAll(WiktionaryAIC000.terms());
set.addAll(WiktionaryAID000.terms());
set.addAll(WiktionaryAIG000.terms());
set.addAll(WiktionaryAIK000.terms());
set.addAll(WiktionaryAIL000.terms());
set.addAll(WiktionaryAIM000.terms());
set.addAll(WiktionaryAIN000.terms());
set.addAll(WiktionaryAIO000.terms());
set.addAll(WiktionaryAIR000.terms());
set.addAll(WiktionaryAIS000.terms());
set.addAll(WiktionaryAIT000.terms());
set.addAll(WiktionaryAIW000.terms());
set.addAll(WiktionaryAJA000.terms());
set.addAll(WiktionaryAJM000.terms());
set.addAll(WiktionaryAJO000.terms());
set.addAll(WiktionaryAJV000.terms());
set.addAll(WiktionaryAKA000.terms());
set.addAll(WiktionaryAKH000.terms());
set.addAll(WiktionaryAKO000.terms());
set.addAll(WiktionaryAKS000.terms());
set.addAll(WiktionaryAKU000.terms());
set.addAll(WiktionaryALA000.terms());
set.addAll(WiktionaryALB000.terms());
set.addAll(WiktionaryALC000.terms());
set.addAll(WiktionaryALD000.terms());
set.addAll(WiktionaryALE000.terms());
set.addAll(WiktionaryALF000.terms());
set.addAll(WiktionaryALG000.terms());
set.addAll(WiktionaryALH000.terms());
set.addAll(WiktionaryALI000.terms());
set.addAll(WiktionaryALJ000.terms());
set.addAll(WiktionaryALK000.terms());
set.addAll(WiktionaryALL000.terms());
set.addAll(WiktionaryALM000.terms());
set.addAll(WiktionaryALO000.terms());
set.addAll(WiktionaryALP000.terms());
set.addAll(WiktionaryALR000.terms());
set.addAll(WiktionaryALS000.terms());
set.addAll(WiktionaryALT000.terms());
set.addAll(WiktionaryALU000.terms());
set.addAll(WiktionaryALV000.terms());
set.addAll(WiktionaryALW000.terms());
set.addAll(WiktionaryALY000.terms());
set.addAll(WiktionaryAMA000.terms());
set.addAll(WiktionaryAMB000.terms());
set.addAll(WiktionaryAME000.terms());
set.addAll(WiktionaryAMF000.terms());
set.addAll(WiktionaryAMH000.terms());
set.addAll(WiktionaryAMI000.terms());
set.addAll(WiktionaryAML000.terms());
set.addAll(WiktionaryAMM000.terms());
set.addAll(WiktionaryAMN000.terms());
set.addAll(WiktionaryAMO000.terms());
set.addAll(WiktionaryAMP000.terms());
set.addAll(WiktionaryAMR000.terms());
set.addAll(WiktionaryAMS000.terms());
set.addAll(WiktionaryAMT000.terms());
set.addAll(WiktionaryAMU000.terms());
set.addAll(WiktionaryAMY000.terms());
set.addAll(WiktionaryANA000.terms());
set.addAll(WiktionaryANC000.terms());
set.addAll(WiktionaryAND000.terms());
set.addAll(WiktionaryANE000.terms());
set.addAll(WiktionaryANF000.terms());
set.addAll(WiktionaryANG000.terms());
set.addAll(WiktionaryANH000.terms());
set.addAll(WiktionaryANI000.terms());
set.addAll(WiktionaryANK000.terms());
set.addAll(WiktionaryANL000.terms());
set.addAll(WiktionaryANN000.terms());
set.addAll(WiktionaryANO000.terms());
set.addAll(WiktionaryANS000.terms());
set.addAll(WiktionaryANT000.terms());
set.addAll(WiktionaryANU000.terms());
set.addAll(WiktionaryANX000.terms());
set.addAll(WiktionaryANY000.terms());
set.addAll(WiktionaryANZ000.terms());
set.addAll(WiktionaryAOR000.terms());
set.addAll(WiktionaryAOT000.terms());
set.addAll(WiktionaryAPA000.terms());
set.addAll(WiktionaryAPE000.terms());
set.addAll(WiktionaryAPF000.terms());
set.addAll(WiktionaryAPH000.terms());
set.addAll(WiktionaryAPI000.terms());
set.addAll(WiktionaryAPL000.terms());
set.addAll(WiktionaryAPN000.terms());
set.addAll(WiktionaryAPO000.terms());
set.addAll(WiktionaryAPP000.terms());
set.addAll(WiktionaryAPR000.terms());
set.addAll(WiktionaryAPS000.terms());
set.addAll(WiktionaryAPT000.terms());
set.addAll(WiktionaryAPU000.terms());
set.addAll(WiktionaryAPY000.terms());
set.addAll(WiktionaryAQU000.terms());
set.addAll(WiktionaryARA000.terms());
set.addAll(WiktionaryARB000.terms());
set.addAll(WiktionaryARC000.terms());
set.addAll(WiktionaryARD000.terms());
set.addAll(WiktionaryARE000.terms());
set.addAll(WiktionaryARF000.terms());
set.addAll(WiktionaryARG000.terms());
set.addAll(WiktionaryARH000.terms());
set.addAll(WiktionaryARI000.terms());
set.addAll(WiktionaryARK000.terms());
set.addAll(WiktionaryARM000.terms());
set.addAll(WiktionaryARN000.terms());
set.addAll(WiktionaryARO000.terms());
set.addAll(WiktionaryARP000.terms());
set.addAll(WiktionaryARQ000.terms());
set.addAll(WiktionaryARR000.terms());
set.addAll(WiktionaryARS000.terms());
set.addAll(WiktionaryART000.terms());
set.addAll(WiktionaryARU000.terms());
set.addAll(WiktionaryARV000.terms());
set.addAll(WiktionaryARY000.terms());
set.addAll(WiktionaryASA000.terms());
set.addAll(WiktionaryASB000.terms());
set.addAll(WiktionaryASC000.terms());
set.addAll(WiktionaryASE000.terms());
set.addAll(WiktionaryASH000.terms());
set.addAll(WiktionaryASI000.terms());
set.addAll(WiktionaryASK000.terms());
set.addAll(WiktionaryASO000.terms());
set.addAll(WiktionaryASP000.terms());
set.addAll(WiktionaryASS000.terms());
set.addAll(WiktionaryAST000.terms());
set.addAll(WiktionaryASU000.terms());
set.addAll(WiktionaryASY000.terms());
set.addAll(WiktionaryATA000.terms());
set.addAll(WiktionaryATE000.terms());
set.addAll(WiktionaryATH000.terms());
set.addAll(WiktionaryATI000.terms());
set.addAll(WiktionaryATL000.terms());
set.addAll(WiktionaryATM000.terms());
set.addAll(WiktionaryATO000.terms());
set.addAll(WiktionaryATP000.terms());
set.addAll(WiktionaryATR000.terms());
set.addAll(WiktionaryATT000.terms());
set.addAll(WiktionaryATY000.terms());
set.addAll(WiktionaryAUB000.terms());
set.addAll(WiktionaryAUC000.terms());
set.addAll(WiktionaryAUD000.terms());
set.addAll(WiktionaryAUF000.terms());
set.addAll(WiktionaryAUG000.terms());
set.addAll(WiktionaryAUK000.terms());
set.addAll(WiktionaryAUL000.terms());
set.addAll(WiktionaryAUN000.terms());
set.addAll(WiktionaryAUR000.terms());
set.addAll(WiktionaryAUS000.terms());
set.addAll(WiktionaryAUT000.terms());
set.addAll(WiktionaryAUV000.terms());
set.addAll(WiktionaryAUX000.terms());
set.addAll(WiktionaryAVA000.terms());
set.addAll(WiktionaryAVE000.terms());
set.addAll(WiktionaryAVG000.terms());
set.addAll(WiktionaryAVI000.terms());
set.addAll(WiktionaryAVL000.terms());
set.addAll(WiktionaryAVO000.terms());
set.addAll(WiktionaryAWA000.terms());
set.addAll(WiktionaryAWE000.terms());
set.addAll(WiktionaryAWK000.terms());
set.addAll(WiktionaryAWN000.terms());
set.addAll(WiktionaryAXH000.terms());
set.addAll(WiktionaryAXI000.terms());
set.addAll(WiktionaryAXL000.terms());
set.addAll(WiktionaryAXO000.terms());
set.addAll(WiktionaryAYA000.terms());
set.addAll(WiktionaryAYM000.terms());
set.addAll(WiktionaryAYR000.terms());
set.addAll(WiktionaryAYU000.terms());
set.addAll(WiktionaryAZA000.terms());
set.addAll(WiktionaryAZB000.terms());
set.addAll(WiktionaryAZE000.terms());
set.addAll(WiktionaryAZI000.terms());
set.addAll(WiktionaryAZL000.terms());
set.addAll(WiktionaryAZO000.terms());
set.addAll(WiktionaryAZT000.terms());
set.addAll(WiktionaryAZU000.terms());  		return set; 	} }