package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.k.a.b.*;
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
import org.swtk.commons.dict.wiktionary.generated.k.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.i.o.*;
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
import org.swtk.commons.dict.wiktionary.generated.k.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.k.o.i.*;
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
import org.swtk.commons.dict.wiktionary.generated.k.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.k.u.w.*;
import org.swtk.commons.dict.wiktionary.generated.k.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.k.y.u.*;  public final class WiktionaryTermsK {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryKAB000.terms());
set.addAll(WiktionaryKAD000.terms());
set.addAll(WiktionaryKAF000.terms());
set.addAll(WiktionaryKAG000.terms());
set.addAll(WiktionaryKAH000.terms());
set.addAll(WiktionaryKAI000.terms());
set.addAll(WiktionaryKAJ000.terms());
set.addAll(WiktionaryKAK000.terms());
set.addAll(WiktionaryKAL000.terms());
set.addAll(WiktionaryKAM000.terms());
set.addAll(WiktionaryKAN000.terms());
set.addAll(WiktionaryKAP000.terms());
set.addAll(WiktionaryKAR000.terms());
set.addAll(WiktionaryKAS000.terms());
set.addAll(WiktionaryKAT000.terms());
set.addAll(WiktionaryKAV000.terms());
set.addAll(WiktionaryKAW000.terms());
set.addAll(WiktionaryKAY000.terms());
set.addAll(WiktionaryKAZ000.terms());
set.addAll(WiktionaryKEB000.terms());
set.addAll(WiktionaryKED000.terms());
set.addAll(WiktionaryKEE000.terms());
set.addAll(WiktionaryKEF000.terms());
set.addAll(WiktionaryKEG000.terms());
set.addAll(WiktionaryKEI000.terms());
set.addAll(WiktionaryKEL000.terms());
set.addAll(WiktionaryKEM000.terms());
set.addAll(WiktionaryKEN000.terms());
set.addAll(WiktionaryKEP000.terms());
set.addAll(WiktionaryKER000.terms());
set.addAll(WiktionaryKES000.terms());
set.addAll(WiktionaryKET000.terms());
set.addAll(WiktionaryKEV000.terms());
set.addAll(WiktionaryKEY000.terms());
set.addAll(WiktionaryKHA000.terms());
set.addAll(WiktionaryKHE000.terms());
set.addAll(WiktionaryKHI000.terms());
set.addAll(WiktionaryKHM000.terms());
set.addAll(WiktionaryKHO000.terms());
set.addAll(WiktionaryKHU000.terms());
set.addAll(WiktionaryKIB000.terms());
set.addAll(WiktionaryKIC000.terms());
set.addAll(WiktionaryKID000.terms());
set.addAll(WiktionaryKIE000.terms());
set.addAll(WiktionaryKIK000.terms());
set.addAll(WiktionaryKIL000.terms());
set.addAll(WiktionaryKIM000.terms());
set.addAll(WiktionaryKIN000.terms());
set.addAll(WiktionaryKIO000.terms());
set.addAll(WiktionaryKIP000.terms());
set.addAll(WiktionaryKIR000.terms());
set.addAll(WiktionaryKIS000.terms());
set.addAll(WiktionaryKIT000.terms());
set.addAll(WiktionaryKIV000.terms());
set.addAll(WiktionaryKIW000.terms());
set.addAll(WiktionaryKIZ000.terms());
set.addAll(WiktionaryKKK000.terms());
set.addAll(WiktionaryKLA000.terms());
set.addAll(WiktionaryKLE000.terms());
set.addAll(WiktionaryKLI000.terms());
set.addAll(WiktionaryKLO000.terms());
set.addAll(WiktionaryKLU000.terms());
set.addAll(WiktionaryKME000.terms());
set.addAll(WiktionaryKNA000.terms());
set.addAll(WiktionaryKNE000.terms());
set.addAll(WiktionaryKNI000.terms());
set.addAll(WiktionaryKNO000.terms());
set.addAll(WiktionaryKNU000.terms());
set.addAll(WiktionaryKOA000.terms());
set.addAll(WiktionaryKOB000.terms());
set.addAll(WiktionaryKOC000.terms());
set.addAll(WiktionaryKOD000.terms());
set.addAll(WiktionaryKOF000.terms());
set.addAll(WiktionaryKOH000.terms());
set.addAll(WiktionaryKOI000.terms());
set.addAll(WiktionaryKOK000.terms());
set.addAll(WiktionaryKOL000.terms());
set.addAll(WiktionaryKOM000.terms());
set.addAll(WiktionaryKON000.terms());
set.addAll(WiktionaryKOO000.terms());
set.addAll(WiktionaryKOR000.terms());
set.addAll(WiktionaryKOS000.terms());
set.addAll(WiktionaryKOU000.terms());
set.addAll(WiktionaryKOZ000.terms());
set.addAll(WiktionaryKRA000.terms());
set.addAll(WiktionaryKRE000.terms());
set.addAll(WiktionaryKRI000.terms());
set.addAll(WiktionaryKRO000.terms());
set.addAll(WiktionaryKRU000.terms());
set.addAll(WiktionaryKRY000.terms());
set.addAll(WiktionaryKSH000.terms());
set.addAll(WiktionaryKUB000.terms());
set.addAll(WiktionaryKUD000.terms());
set.addAll(WiktionaryKUF000.terms());
set.addAll(WiktionaryKUI000.terms());
set.addAll(WiktionaryKUL000.terms());
set.addAll(WiktionaryKUM000.terms());
set.addAll(WiktionaryKUN000.terms());
set.addAll(WiktionaryKUR000.terms());
set.addAll(WiktionaryKUS000.terms());
set.addAll(WiktionaryKUT000.terms());
set.addAll(WiktionaryKUV000.terms());
set.addAll(WiktionaryKUW000.terms());
set.addAll(WiktionaryKWA000.terms());
set.addAll(WiktionaryKYA000.terms());
set.addAll(WiktionaryKYL000.terms());
set.addAll(WiktionaryKYN000.terms());
set.addAll(WiktionaryKYP000.terms());
set.addAll(WiktionaryKYR000.terms());
set.addAll(WiktionaryKYU000.terms());  		return set; 	} }