package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.d.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.q.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.j.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.d.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.d.f.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.h.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.w.*;
import org.swtk.commons.dict.wiktionary.generated.d.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.d.j.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.j.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.d.s.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.u.*;
import org.swtk.commons.dict.wiktionary.generated.d.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.d.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.d.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.w.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.k.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.d.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.d.z.e.*;
import org.swtk.commons.dict.wiktionary.generated.d.z.i.*;
import org.swtk.commons.dict.wiktionary.generated.d.z.o.*;  public final class WiktionaryTermsD {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryDAA000.terms());
set.addAll(WiktionaryDAB000.terms());
set.addAll(WiktionaryDAC000.terms());
set.addAll(WiktionaryDAD000.terms());
set.addAll(WiktionaryDAE000.terms());
set.addAll(WiktionaryDAF000.terms());
set.addAll(WiktionaryDAG000.terms());
set.addAll(WiktionaryDAH000.terms());
set.addAll(WiktionaryDAI000.terms());
set.addAll(WiktionaryDAK000.terms());
set.addAll(WiktionaryDAL000.terms());
set.addAll(WiktionaryDAM000.terms());
set.addAll(WiktionaryDAN000.terms());
set.addAll(WiktionaryDAP000.terms());
set.addAll(WiktionaryDAQ000.terms());
set.addAll(WiktionaryDAR000.terms());
set.addAll(WiktionaryDAS000.terms());
set.addAll(WiktionaryDAT000.terms());
set.addAll(WiktionaryDAU000.terms());
set.addAll(WiktionaryDAV000.terms());
set.addAll(WiktionaryDAW000.terms());
set.addAll(WiktionaryDAY000.terms());
set.addAll(WiktionaryDAZ000.terms());
set.addAll(WiktionaryDEA000.terms());
set.addAll(WiktionaryDEB000.terms());
set.addAll(WiktionaryDEC000.terms());
set.addAll(WiktionaryDED000.terms());
set.addAll(WiktionaryDEE000.terms());
set.addAll(WiktionaryDEF000.terms());
set.addAll(WiktionaryDEG000.terms());
set.addAll(WiktionaryDEH000.terms());
set.addAll(WiktionaryDEI000.terms());
set.addAll(WiktionaryDEJ000.terms());
set.addAll(WiktionaryDEK000.terms());
set.addAll(WiktionaryDEL000.terms());
set.addAll(WiktionaryDEM000.terms());
set.addAll(WiktionaryDEN000.terms());
set.addAll(WiktionaryDEO000.terms());
set.addAll(WiktionaryDEP000.terms());
set.addAll(WiktionaryDEQ000.terms());
set.addAll(WiktionaryDER000.terms());
set.addAll(WiktionaryDES000.terms());
set.addAll(WiktionaryDET000.terms());
set.addAll(WiktionaryDEU000.terms());
set.addAll(WiktionaryDEV000.terms());
set.addAll(WiktionaryDEW000.terms());
set.addAll(WiktionaryDEX000.terms());
set.addAll(WiktionaryDEZ000.terms());
set.addAll(WiktionaryDFM000.terms());
set.addAll(WiktionaryDHA000.terms());
set.addAll(WiktionaryDHE000.terms());
set.addAll(WiktionaryDHO000.terms());
set.addAll(WiktionaryDHU000.terms());
set.addAll(WiktionaryDHY000.terms());
set.addAll(WiktionaryDIA000.terms());
set.addAll(WiktionaryDIB000.terms());
set.addAll(WiktionaryDIC000.terms());
set.addAll(WiktionaryDID000.terms());
set.addAll(WiktionaryDIE000.terms());
set.addAll(WiktionaryDIF000.terms());
set.addAll(WiktionaryDIG000.terms());
set.addAll(WiktionaryDIH000.terms());
set.addAll(WiktionaryDII000.terms());
set.addAll(WiktionaryDIJ000.terms());
set.addAll(WiktionaryDIK000.terms());
set.addAll(WiktionaryDIL000.terms());
set.addAll(WiktionaryDIM000.terms());
set.addAll(WiktionaryDIN000.terms());
set.addAll(WiktionaryDIO000.terms());
set.addAll(WiktionaryDIP000.terms());
set.addAll(WiktionaryDIR000.terms());
set.addAll(WiktionaryDIS000.terms());
set.addAll(WiktionaryDIT000.terms());
set.addAll(WiktionaryDIV000.terms());
set.addAll(WiktionaryDIW000.terms());
set.addAll(WiktionaryDIX000.terms());
set.addAll(WiktionaryDJE000.terms());
set.addAll(WiktionaryDJI000.terms());
set.addAll(WiktionaryDNI000.terms());
set.addAll(WiktionaryDOB000.terms());
set.addAll(WiktionaryDOC000.terms());
set.addAll(WiktionaryDOD000.terms());
set.addAll(WiktionaryDOE000.terms());
set.addAll(WiktionaryDOG000.terms());
set.addAll(WiktionaryDOH000.terms());
set.addAll(WiktionaryDOI000.terms());
set.addAll(WiktionaryDOJ000.terms());
set.addAll(WiktionaryDOL000.terms());
set.addAll(WiktionaryDOM000.terms());
set.addAll(WiktionaryDON000.terms());
set.addAll(WiktionaryDOO000.terms());
set.addAll(WiktionaryDOP000.terms());
set.addAll(WiktionaryDOR000.terms());
set.addAll(WiktionaryDOS000.terms());
set.addAll(WiktionaryDOT000.terms());
set.addAll(WiktionaryDOU000.terms());
set.addAll(WiktionaryDOV000.terms());
set.addAll(WiktionaryDOW000.terms());
set.addAll(WiktionaryDOX000.terms());
set.addAll(WiktionaryDOY000.terms());
set.addAll(WiktionaryDOZ000.terms());
set.addAll(WiktionaryDRA000.terms());
set.addAll(WiktionaryDRE000.terms());
set.addAll(WiktionaryDRI000.terms());
set.addAll(WiktionaryDRO000.terms());
set.addAll(WiktionaryDRU000.terms());
set.addAll(WiktionaryDRY000.terms());
set.addAll(WiktionaryDSL000.terms());
set.addAll(WiktionaryDUA000.terms());
set.addAll(WiktionaryDUB000.terms());
set.addAll(WiktionaryDUC000.terms());
set.addAll(WiktionaryDUD000.terms());
set.addAll(WiktionaryDUE000.terms());
set.addAll(WiktionaryDUF000.terms());
set.addAll(WiktionaryDUG000.terms());
set.addAll(WiktionaryDUI000.terms());
set.addAll(WiktionaryDUK000.terms());
set.addAll(WiktionaryDUL000.terms());
set.addAll(WiktionaryDUM000.terms());
set.addAll(WiktionaryDUN000.terms());
set.addAll(WiktionaryDUO000.terms());
set.addAll(WiktionaryDUP000.terms());
set.addAll(WiktionaryDUR000.terms());
set.addAll(WiktionaryDUS000.terms());
set.addAll(WiktionaryDUT000.terms());
set.addAll(WiktionaryDUU000.terms());
set.addAll(WiktionaryDUV000.terms());
set.addAll(WiktionaryDWA000.terms());
set.addAll(WiktionaryDWE000.terms());
set.addAll(WiktionaryDWI000.terms());
set.addAll(WiktionaryDYD000.terms());
set.addAll(WiktionaryDYE000.terms());
set.addAll(WiktionaryDYI000.terms());
set.addAll(WiktionaryDYK000.terms());
set.addAll(WiktionaryDYN000.terms());
set.addAll(WiktionaryDYO000.terms());
set.addAll(WiktionaryDYP000.terms());
set.addAll(WiktionaryDYS000.terms());
set.addAll(WiktionaryDZE000.terms());
set.addAll(WiktionaryDZI000.terms());
set.addAll(WiktionaryDZO000.terms());  		return set; 	} }