package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.h.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.h.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.j.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.h.j.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.s.*;  public final class WiktionaryTermsH {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryHAA000.terms());
set.addAll(WiktionaryHAB000.terms());
set.addAll(WiktionaryHAC000.terms());
set.addAll(WiktionaryHAD000.terms());
set.addAll(WiktionaryHAE000.terms());
set.addAll(WiktionaryHAF000.terms());
set.addAll(WiktionaryHAG000.terms());
set.addAll(WiktionaryHAH000.terms());
set.addAll(WiktionaryHAI000.terms());
set.addAll(WiktionaryHAK000.terms());
set.addAll(WiktionaryHAL000.terms());
set.addAll(WiktionaryHAM000.terms());
set.addAll(WiktionaryHAN000.terms());
set.addAll(WiktionaryHAO000.terms());
set.addAll(WiktionaryHAP000.terms());
set.addAll(WiktionaryHAR000.terms());
set.addAll(WiktionaryHAS000.terms());
set.addAll(WiktionaryHAT000.terms());
set.addAll(WiktionaryHAU000.terms());
set.addAll(WiktionaryHAV000.terms());
set.addAll(WiktionaryHAW000.terms());
set.addAll(WiktionaryHAX000.terms());
set.addAll(WiktionaryHAY000.terms());
set.addAll(WiktionaryHAZ000.terms());
set.addAll(WiktionaryHBO000.terms());
set.addAll(WiktionaryHEA000.terms());
set.addAll(WiktionaryHEB000.terms());
set.addAll(WiktionaryHEC000.terms());
set.addAll(WiktionaryHED000.terms());
set.addAll(WiktionaryHEE000.terms());
set.addAll(WiktionaryHEF000.terms());
set.addAll(WiktionaryHEG000.terms());
set.addAll(WiktionaryHEI000.terms());
set.addAll(WiktionaryHEJ000.terms());
set.addAll(WiktionaryHEL000.terms());
set.addAll(WiktionaryHEM000.terms());
set.addAll(WiktionaryHEN000.terms());
set.addAll(WiktionaryHEO000.terms());
set.addAll(WiktionaryHEP000.terms());
set.addAll(WiktionaryHER000.terms());
set.addAll(WiktionaryHES000.terms());
set.addAll(WiktionaryHET000.terms());
set.addAll(WiktionaryHEU000.terms());
set.addAll(WiktionaryHEW000.terms());
set.addAll(WiktionaryHEX000.terms());
set.addAll(WiktionaryHEY000.terms());
set.addAll(WiktionaryHIA000.terms());
set.addAll(WiktionaryHIB000.terms());
set.addAll(WiktionaryHIC000.terms());
set.addAll(WiktionaryHID000.terms());
set.addAll(WiktionaryHIE000.terms());
set.addAll(WiktionaryHIG000.terms());
set.addAll(WiktionaryHIJ000.terms());
set.addAll(WiktionaryHIK000.terms());
set.addAll(WiktionaryHIL000.terms());
set.addAll(WiktionaryHIM000.terms());
set.addAll(WiktionaryHIN000.terms());
set.addAll(WiktionaryHIP000.terms());
set.addAll(WiktionaryHIR000.terms());
set.addAll(WiktionaryHIS000.terms());
set.addAll(WiktionaryHIT000.terms());
set.addAll(WiktionaryHIV000.terms());
set.addAll(WiktionaryHIX000.terms());
set.addAll(WiktionaryHIZ000.terms());
set.addAll(WiktionaryHJE000.terms());
set.addAll(WiktionaryHOA000.terms());
set.addAll(WiktionaryHOB000.terms());
set.addAll(WiktionaryHOC000.terms());
set.addAll(WiktionaryHOD000.terms());
set.addAll(WiktionaryHOE000.terms());
set.addAll(WiktionaryHOG000.terms());
set.addAll(WiktionaryHOH000.terms());
set.addAll(WiktionaryHOI000.terms());
set.addAll(WiktionaryHOJ000.terms());
set.addAll(WiktionaryHOK000.terms());
set.addAll(WiktionaryHOL000.terms());
set.addAll(WiktionaryHOM000.terms());
set.addAll(WiktionaryHON000.terms());
set.addAll(WiktionaryHOO000.terms());
set.addAll(WiktionaryHOP000.terms());
set.addAll(WiktionaryHOR000.terms());
set.addAll(WiktionaryHOS000.terms());
set.addAll(WiktionaryHOT000.terms());
set.addAll(WiktionaryHOU000.terms());
set.addAll(WiktionaryHOV000.terms());
set.addAll(WiktionaryHOW000.terms());
set.addAll(WiktionaryHOX000.terms());
set.addAll(WiktionaryHOY000.terms());
set.addAll(WiktionaryHRY000.terms());
set.addAll(WiktionaryHSI000.terms());
set.addAll(WiktionaryHUA000.terms());
set.addAll(WiktionaryHUB000.terms());
set.addAll(WiktionaryHUC000.terms());
set.addAll(WiktionaryHUD000.terms());
set.addAll(WiktionaryHUE000.terms());
set.addAll(WiktionaryHUF000.terms());
set.addAll(WiktionaryHUG000.terms());
set.addAll(WiktionaryHUI000.terms());
set.addAll(WiktionaryHUL000.terms());
set.addAll(WiktionaryHUM000.terms());
set.addAll(WiktionaryHUN000.terms());
set.addAll(WiktionaryHUP000.terms());
set.addAll(WiktionaryHUR000.terms());
set.addAll(WiktionaryHUS000.terms());
set.addAll(WiktionaryHUT000.terms());
set.addAll(WiktionaryHUX000.terms());
set.addAll(WiktionaryHYA000.terms());
set.addAll(WiktionaryHYB000.terms());
set.addAll(WiktionaryHYD000.terms());
set.addAll(WiktionaryHYE000.terms());
set.addAll(WiktionaryHYG000.terms());
set.addAll(WiktionaryHYL000.terms());
set.addAll(WiktionaryHYM000.terms());
set.addAll(WiktionaryHYO000.terms());
set.addAll(WiktionaryHYP000.terms());
set.addAll(WiktionaryHYR000.terms());
set.addAll(WiktionaryHYS000.terms());  		return set; 	} }