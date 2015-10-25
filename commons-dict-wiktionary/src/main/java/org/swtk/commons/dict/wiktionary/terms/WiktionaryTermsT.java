package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.t.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.b.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.t.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.t.j.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.u.*;
import org.swtk.commons.dict.wiktionary.generated.t.s.w.*;
import org.swtk.commons.dict.wiktionary.generated.t.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.q.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.t.u.y.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.w.o.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.i.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.k.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.t.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.t.z.a.*;
import org.swtk.commons.dict.wiktionary.generated.t.z.e.*;
import org.swtk.commons.dict.wiktionary.generated.t.z.i.*;  public final class WiktionaryTermsT {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryTAA000.terms());
set.addAll(WiktionaryTAB000.terms());
set.addAll(WiktionaryTAC000.terms());
set.addAll(WiktionaryTAD000.terms());
set.addAll(WiktionaryTAE000.terms());
set.addAll(WiktionaryTAF000.terms());
set.addAll(WiktionaryTAG000.terms());
set.addAll(WiktionaryTAH000.terms());
set.addAll(WiktionaryTAI000.terms());
set.addAll(WiktionaryTAJ000.terms());
set.addAll(WiktionaryTAK000.terms());
set.addAll(WiktionaryTAL000.terms());
set.addAll(WiktionaryTAM000.terms());
set.addAll(WiktionaryTAN000.terms());
set.addAll(WiktionaryTAO000.terms());
set.addAll(WiktionaryTAP000.terms());
set.addAll(WiktionaryTAQ000.terms());
set.addAll(WiktionaryTAR000.terms());
set.addAll(WiktionaryTAS000.terms());
set.addAll(WiktionaryTAT000.terms());
set.addAll(WiktionaryTAU000.terms());
set.addAll(WiktionaryTAV000.terms());
set.addAll(WiktionaryTAW000.terms());
set.addAll(WiktionaryTAX000.terms());
set.addAll(WiktionaryTBI000.terms());
set.addAll(WiktionaryTCH000.terms());
set.addAll(WiktionaryTEA000.terms());
set.addAll(WiktionaryTEB000.terms());
set.addAll(WiktionaryTEC000.terms());
set.addAll(WiktionaryTED000.terms());
set.addAll(WiktionaryTEE000.terms());
set.addAll(WiktionaryTEG000.terms());
set.addAll(WiktionaryTEH000.terms());
set.addAll(WiktionaryTEI000.terms());
set.addAll(WiktionaryTEK000.terms());
set.addAll(WiktionaryTEL000.terms());
set.addAll(WiktionaryTEM000.terms());
set.addAll(WiktionaryTEN000.terms());
set.addAll(WiktionaryTEO000.terms());
set.addAll(WiktionaryTEP000.terms());
set.addAll(WiktionaryTEQ000.terms());
set.addAll(WiktionaryTER000.terms());
set.addAll(WiktionaryTES000.terms());
set.addAll(WiktionaryTET000.terms());
set.addAll(WiktionaryTEU000.terms());
set.addAll(WiktionaryTEW000.terms());
set.addAll(WiktionaryTEX000.terms());
set.addAll(WiktionaryTEZ000.terms());
set.addAll(WiktionaryTHA000.terms());
set.addAll(WiktionaryTHE000.terms());
set.addAll(WiktionaryTHI000.terms());
set.addAll(WiktionaryTHN000.terms());
set.addAll(WiktionaryTHO000.terms());
set.addAll(WiktionaryTHR000.terms());
set.addAll(WiktionaryTHU000.terms());
set.addAll(WiktionaryTHW000.terms());
set.addAll(WiktionaryTHY000.terms());
set.addAll(WiktionaryTIA000.terms());
set.addAll(WiktionaryTIB000.terms());
set.addAll(WiktionaryTIC000.terms());
set.addAll(WiktionaryTID000.terms());
set.addAll(WiktionaryTIE000.terms());
set.addAll(WiktionaryTIF000.terms());
set.addAll(WiktionaryTIG000.terms());
set.addAll(WiktionaryTIK000.terms());
set.addAll(WiktionaryTIL000.terms());
set.addAll(WiktionaryTIM000.terms());
set.addAll(WiktionaryTIN000.terms());
set.addAll(WiktionaryTIO000.terms());
set.addAll(WiktionaryTIP000.terms());
set.addAll(WiktionaryTIQ000.terms());
set.addAll(WiktionaryTIR000.terms());
set.addAll(WiktionaryTIS000.terms());
set.addAll(WiktionaryTIT000.terms());
set.addAll(WiktionaryTIV000.terms());
set.addAll(WiktionaryTIZ000.terms());
set.addAll(WiktionaryTJA000.terms());
set.addAll(WiktionaryTLA000.terms());
set.addAll(WiktionaryTME000.terms());
set.addAll(WiktionaryTOA000.terms());
set.addAll(WiktionaryTOB000.terms());
set.addAll(WiktionaryTOC000.terms());
set.addAll(WiktionaryTOD000.terms());
set.addAll(WiktionaryTOE000.terms());
set.addAll(WiktionaryTOF000.terms());
set.addAll(WiktionaryTOG000.terms());
set.addAll(WiktionaryTOI000.terms());
set.addAll(WiktionaryTOK000.terms());
set.addAll(WiktionaryTOL000.terms());
set.addAll(WiktionaryTOM000.terms());
set.addAll(WiktionaryTON000.terms());
set.addAll(WiktionaryTOO000.terms());
set.addAll(WiktionaryTOP000.terms());
set.addAll(WiktionaryTOQ000.terms());
set.addAll(WiktionaryTOR000.terms());
set.addAll(WiktionaryTOS000.terms());
set.addAll(WiktionaryTOT000.terms());
set.addAll(WiktionaryTOU000.terms());
set.addAll(WiktionaryTOV000.terms());
set.addAll(WiktionaryTOW000.terms());
set.addAll(WiktionaryTOX000.terms());
set.addAll(WiktionaryTOY000.terms());
set.addAll(WiktionaryTRA000.terms());
set.addAll(WiktionaryTRE000.terms());
set.addAll(WiktionaryTRI000.terms());
set.addAll(WiktionaryTRO000.terms());
set.addAll(WiktionaryTRU000.terms());
set.addAll(WiktionaryTRY000.terms());
set.addAll(WiktionaryTSA000.terms());
set.addAll(WiktionaryTSC000.terms());
set.addAll(WiktionaryTSE000.terms());
set.addAll(WiktionaryTSI000.terms());
set.addAll(WiktionaryTSO000.terms());
set.addAll(WiktionaryTSR000.terms());
set.addAll(WiktionaryTSU000.terms());
set.addAll(WiktionaryTSW000.terms());
set.addAll(WiktionaryTTE000.terms());
set.addAll(WiktionaryTUA000.terms());
set.addAll(WiktionaryTUB000.terms());
set.addAll(WiktionaryTUC000.terms());
set.addAll(WiktionaryTUD000.terms());
set.addAll(WiktionaryTUE000.terms());
set.addAll(WiktionaryTUG000.terms());
set.addAll(WiktionaryTUI000.terms());
set.addAll(WiktionaryTUL000.terms());
set.addAll(WiktionaryTUM000.terms());
set.addAll(WiktionaryTUN000.terms());
set.addAll(WiktionaryTUP000.terms());
set.addAll(WiktionaryTUQ000.terms());
set.addAll(WiktionaryTUR000.terms());
set.addAll(WiktionaryTUS000.terms());
set.addAll(WiktionaryTUT000.terms());
set.addAll(WiktionaryTUV000.terms());
set.addAll(WiktionaryTUX000.terms());
set.addAll(WiktionaryTUY000.terms());
set.addAll(WiktionaryTWA000.terms());
set.addAll(WiktionaryTWE000.terms());
set.addAll(WiktionaryTWI000.terms());
set.addAll(WiktionaryTWO000.terms());
set.addAll(WiktionaryTYC000.terms());
set.addAll(WiktionaryTYI000.terms());
set.addAll(WiktionaryTYK000.terms());
set.addAll(WiktionaryTYL000.terms());
set.addAll(WiktionaryTYM000.terms());
set.addAll(WiktionaryTYN000.terms());
set.addAll(WiktionaryTYP000.terms());
set.addAll(WiktionaryTYR000.terms());
set.addAll(WiktionaryTZA000.terms());
set.addAll(WiktionaryTZE000.terms());
set.addAll(WiktionaryTZI000.terms());  		return set; 	} }