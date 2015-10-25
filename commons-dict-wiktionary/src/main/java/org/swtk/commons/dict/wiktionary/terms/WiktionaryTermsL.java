package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.l.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.l.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.j.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.q.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.l.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.h.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.l.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.l.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.l.y.s.*;  public final class WiktionaryTermsL {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryLAA000.terms());
set.addAll(WiktionaryLAB000.terms());
set.addAll(WiktionaryLAC000.terms());
set.addAll(WiktionaryLAD000.terms());
set.addAll(WiktionaryLAE000.terms());
set.addAll(WiktionaryLAF000.terms());
set.addAll(WiktionaryLAG000.terms());
set.addAll(WiktionaryLAH000.terms());
set.addAll(WiktionaryLAI000.terms());
set.addAll(WiktionaryLAK000.terms());
set.addAll(WiktionaryLAL000.terms());
set.addAll(WiktionaryLAM000.terms());
set.addAll(WiktionaryLAN000.terms());
set.addAll(WiktionaryLAO000.terms());
set.addAll(WiktionaryLAP000.terms());
set.addAll(WiktionaryLAR000.terms());
set.addAll(WiktionaryLAS000.terms());
set.addAll(WiktionaryLAT000.terms());
set.addAll(WiktionaryLAU000.terms());
set.addAll(WiktionaryLAV000.terms());
set.addAll(WiktionaryLAW000.terms());
set.addAll(WiktionaryLAX000.terms());
set.addAll(WiktionaryLAY000.terms());
set.addAll(WiktionaryLAZ000.terms());
set.addAll(WiktionaryLEA000.terms());
set.addAll(WiktionaryLEB000.terms());
set.addAll(WiktionaryLEC000.terms());
set.addAll(WiktionaryLED000.terms());
set.addAll(WiktionaryLEE000.terms());
set.addAll(WiktionaryLEF000.terms());
set.addAll(WiktionaryLEG000.terms());
set.addAll(WiktionaryLEH000.terms());
set.addAll(WiktionaryLEI000.terms());
set.addAll(WiktionaryLEM000.terms());
set.addAll(WiktionaryLEN000.terms());
set.addAll(WiktionaryLEO000.terms());
set.addAll(WiktionaryLEP000.terms());
set.addAll(WiktionaryLER000.terms());
set.addAll(WiktionaryLES000.terms());
set.addAll(WiktionaryLET000.terms());
set.addAll(WiktionaryLEU000.terms());
set.addAll(WiktionaryLEV000.terms());
set.addAll(WiktionaryLEW000.terms());
set.addAll(WiktionaryLEX000.terms());
set.addAll(WiktionaryLEZ000.terms());
set.addAll(WiktionaryLHA000.terms());
set.addAll(WiktionaryLIA000.terms());
set.addAll(WiktionaryLIB000.terms());
set.addAll(WiktionaryLIC000.terms());
set.addAll(WiktionaryLID000.terms());
set.addAll(WiktionaryLIE000.terms());
set.addAll(WiktionaryLIF000.terms());
set.addAll(WiktionaryLIG000.terms());
set.addAll(WiktionaryLIK000.terms());
set.addAll(WiktionaryLIL000.terms());
set.addAll(WiktionaryLIM000.terms());
set.addAll(WiktionaryLIN000.terms());
set.addAll(WiktionaryLIO000.terms());
set.addAll(WiktionaryLIP000.terms());
set.addAll(WiktionaryLIQ000.terms());
set.addAll(WiktionaryLIS000.terms());
set.addAll(WiktionaryLIT000.terms());
set.addAll(WiktionaryLIV000.terms());
set.addAll(WiktionaryLIZ000.terms());
set.addAll(WiktionaryLJU000.terms());
set.addAll(WiktionaryLLA000.terms());
set.addAll(WiktionaryLLO000.terms());
set.addAll(WiktionaryLOA000.terms());
set.addAll(WiktionaryLOB000.terms());
set.addAll(WiktionaryLOC000.terms());
set.addAll(WiktionaryLOD000.terms());
set.addAll(WiktionaryLOE000.terms());
set.addAll(WiktionaryLOF000.terms());
set.addAll(WiktionaryLOG000.terms());
set.addAll(WiktionaryLOI000.terms());
set.addAll(WiktionaryLOJ000.terms());
set.addAll(WiktionaryLOK000.terms());
set.addAll(WiktionaryLOL000.terms());
set.addAll(WiktionaryLOM000.terms());
set.addAll(WiktionaryLON000.terms());
set.addAll(WiktionaryLOO000.terms());
set.addAll(WiktionaryLOP000.terms());
set.addAll(WiktionaryLOQ000.terms());
set.addAll(WiktionaryLOR000.terms());
set.addAll(WiktionaryLOS000.terms());
set.addAll(WiktionaryLOT000.terms());
set.addAll(WiktionaryLOU000.terms());
set.addAll(WiktionaryLOV000.terms());
set.addAll(WiktionaryLOW000.terms());
set.addAll(WiktionaryLOX000.terms());
set.addAll(WiktionaryLOY000.terms());
set.addAll(WiktionaryLOZ000.terms());
set.addAll(WiktionaryLUA000.terms());
set.addAll(WiktionaryLUB000.terms());
set.addAll(WiktionaryLUC000.terms());
set.addAll(WiktionaryLUD000.terms());
set.addAll(WiktionaryLUE000.terms());
set.addAll(WiktionaryLUF000.terms());
set.addAll(WiktionaryLUG000.terms());
set.addAll(WiktionaryLUH000.terms());
set.addAll(WiktionaryLUJ000.terms());
set.addAll(WiktionaryLUK000.terms());
set.addAll(WiktionaryLUL000.terms());
set.addAll(WiktionaryLUM000.terms());
set.addAll(WiktionaryLUN000.terms());
set.addAll(WiktionaryLUP000.terms());
set.addAll(WiktionaryLUR000.terms());
set.addAll(WiktionaryLUS000.terms());
set.addAll(WiktionaryLUT000.terms());
set.addAll(WiktionaryLUV000.terms());
set.addAll(WiktionaryLUX000.terms());
set.addAll(WiktionaryLVA000.terms());
set.addAll(WiktionaryLYA000.terms());
set.addAll(WiktionaryLYC000.terms());
set.addAll(WiktionaryLYD000.terms());
set.addAll(WiktionaryLYM000.terms());
set.addAll(WiktionaryLYN000.terms());
set.addAll(WiktionaryLYO000.terms());
set.addAll(WiktionaryLYR000.terms());
set.addAll(WiktionaryLYS000.terms());  		return set; 	} }