package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.i.a.i.*;
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
import org.swtk.commons.dict.wiktionary.generated.i.g.b.*;
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
import org.swtk.commons.dict.wiktionary.generated.i.z.t.*;  public final class WiktionaryTermsI {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryIAI000.terms());
set.addAll(WiktionaryIAM000.terms());
set.addAll(WiktionaryIAN000.terms());
set.addAll(WiktionaryIAT000.terms());
set.addAll(WiktionaryIBE000.terms());
set.addAll(WiktionaryIBI000.terms());
set.addAll(WiktionaryIBO000.terms());
set.addAll(WiktionaryIBR000.terms());
set.addAll(WiktionaryICA000.terms());
set.addAll(WiktionaryICE000.terms());
set.addAll(WiktionaryICH000.terms());
set.addAll(WiktionaryICI000.terms());
set.addAll(WiktionaryICK000.terms());
set.addAll(WiktionaryICO000.terms());
set.addAll(WiktionaryICT000.terms());
set.addAll(WiktionaryIDA000.terms());
set.addAll(WiktionaryIDE000.terms());
set.addAll(WiktionaryIDI000.terms());
set.addAll(WiktionaryIDL000.terms());
set.addAll(WiktionaryIDO000.terms());
set.addAll(WiktionaryIET000.terms());
set.addAll(WiktionaryIFF000.terms());
set.addAll(WiktionaryIFO000.terms());
set.addAll(WiktionaryIGB000.terms());
set.addAll(WiktionaryIGN000.terms());
set.addAll(WiktionaryIGU000.terms());
set.addAll(WiktionaryIKE000.terms());
set.addAll(WiktionaryIKR000.terms());
set.addAll(WiktionaryILE000.terms());
set.addAll(WiktionaryILI000.terms());
set.addAll(WiktionaryILL000.terms());
set.addAll(WiktionaryILM000.terms());
set.addAll(WiktionaryIMA000.terms());
set.addAll(WiktionaryIMB000.terms());
set.addAll(WiktionaryIMI000.terms());
set.addAll(WiktionaryIMM000.terms());
set.addAll(WiktionaryIMP000.terms());
set.addAll(WiktionaryINA000.terms());
set.addAll(WiktionaryINB000.terms());
set.addAll(WiktionaryINC000.terms());
set.addAll(WiktionaryIND000.terms());
set.addAll(WiktionaryINE000.terms());
set.addAll(WiktionaryINF000.terms());
set.addAll(WiktionaryING000.terms());
set.addAll(WiktionaryINH000.terms());
set.addAll(WiktionaryINI000.terms());
set.addAll(WiktionaryINJ000.terms());
set.addAll(WiktionaryINK000.terms());
set.addAll(WiktionaryINL000.terms());
set.addAll(WiktionaryINM000.terms());
set.addAll(WiktionaryINN000.terms());
set.addAll(WiktionaryINO000.terms());
set.addAll(WiktionaryINP000.terms());
set.addAll(WiktionaryINQ000.terms());
set.addAll(WiktionaryINR000.terms());
set.addAll(WiktionaryINS000.terms());
set.addAll(WiktionaryINT000.terms());
set.addAll(WiktionaryINU000.terms());
set.addAll(WiktionaryINV000.terms());
set.addAll(WiktionaryINW000.terms());
set.addAll(WiktionaryIOD000.terms());
set.addAll(WiktionaryIOL000.terms());
set.addAll(WiktionaryION000.terms());
set.addAll(WiktionaryIOT000.terms());
set.addAll(WiktionaryIOW000.terms());
set.addAll(WiktionaryIPH000.terms());
set.addAll(WiktionaryIPR000.terms());
set.addAll(WiktionaryIPS000.terms());
set.addAll(WiktionaryIQA000.terms());
set.addAll(WiktionaryIQU000.terms());
set.addAll(WiktionaryIRA000.terms());
set.addAll(WiktionaryIRC000.terms());
set.addAll(WiktionaryIRE000.terms());
set.addAll(WiktionaryIRI000.terms());
set.addAll(WiktionaryIRK000.terms());
set.addAll(WiktionaryIRO000.terms());
set.addAll(WiktionaryIRR000.terms());
set.addAll(WiktionaryIRU000.terms());
set.addAll(WiktionaryIRV000.terms());
set.addAll(WiktionaryISA000.terms());
set.addAll(WiktionaryISC000.terms());
set.addAll(WiktionaryISH000.terms());
set.addAll(WiktionaryISI000.terms());
set.addAll(WiktionaryISL000.terms());
set.addAll(WiktionaryISM000.terms());
set.addAll(WiktionaryISO000.terms());
set.addAll(WiktionaryISR000.terms());
set.addAll(WiktionaryISS000.terms());
set.addAll(WiktionaryIST000.terms());
set.addAll(WiktionaryITA000.terms());
set.addAll(WiktionaryITC000.terms());
set.addAll(WiktionaryITE000.terms());
set.addAll(WiktionaryITH000.terms());
set.addAll(WiktionaryITI000.terms());
set.addAll(WiktionaryITO000.terms());
set.addAll(WiktionaryITS000.terms());
set.addAll(WiktionaryITT000.terms());
set.addAll(WiktionaryIVA000.terms());
set.addAll(WiktionaryIVO000.terms());
set.addAll(WiktionaryIWA000.terms());
set.addAll(WiktionaryIXA000.terms());
set.addAll(WiktionaryIYA000.terms());
set.addAll(WiktionaryIZM000.terms());
set.addAll(WiktionaryIZT000.terms());  		return set; 	} }