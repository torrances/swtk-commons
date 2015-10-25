package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.b.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.b.d.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.d.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.j.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.b.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.b.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.b.j.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.b.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.b.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.f.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.b.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.b.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.b.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.b.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.h.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.y.*;
import org.swtk.commons.dict.wiktionary.generated.b.u.z.*;
import org.swtk.commons.dict.wiktionary.generated.b.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.w.i.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.w.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.z.*;  public final class WiktionaryTermsB {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryBAA000.terms());
set.addAll(WiktionaryBAB000.terms());
set.addAll(WiktionaryBAC000.terms());
set.addAll(WiktionaryBAD000.terms());
set.addAll(WiktionaryBAE000.terms());
set.addAll(WiktionaryBAF000.terms());
set.addAll(WiktionaryBAG000.terms());
set.addAll(WiktionaryBAH000.terms());
set.addAll(WiktionaryBAI000.terms());
set.addAll(WiktionaryBAJ000.terms());
set.addAll(WiktionaryBAK000.terms());
set.addAll(WiktionaryBAL000.terms());
set.addAll(WiktionaryBAM000.terms());
set.addAll(WiktionaryBAN000.terms());
set.addAll(WiktionaryBAO000.terms());
set.addAll(WiktionaryBAP000.terms());
set.addAll(WiktionaryBAR000.terms());
set.addAll(WiktionaryBAS000.terms());
set.addAll(WiktionaryBAT000.terms());
set.addAll(WiktionaryBAU000.terms());
set.addAll(WiktionaryBAV000.terms());
set.addAll(WiktionaryBAW000.terms());
set.addAll(WiktionaryBAY000.terms());
set.addAll(WiktionaryBAZ000.terms());
set.addAll(WiktionaryBDE000.terms());
set.addAll(WiktionaryBDS000.terms());
set.addAll(WiktionaryBEA000.terms());
set.addAll(WiktionaryBEB000.terms());
set.addAll(WiktionaryBEC000.terms());
set.addAll(WiktionaryBED000.terms());
set.addAll(WiktionaryBEE000.terms());
set.addAll(WiktionaryBEF000.terms());
set.addAll(WiktionaryBEG000.terms());
set.addAll(WiktionaryBEH000.terms());
set.addAll(WiktionaryBEI000.terms());
set.addAll(WiktionaryBEJ000.terms());
set.addAll(WiktionaryBEL000.terms());
set.addAll(WiktionaryBEM000.terms());
set.addAll(WiktionaryBEN000.terms());
set.addAll(WiktionaryBEO000.terms());
set.addAll(WiktionaryBER000.terms());
set.addAll(WiktionaryBES000.terms());
set.addAll(WiktionaryBET000.terms());
set.addAll(WiktionaryBEV000.terms());
set.addAll(WiktionaryBEW000.terms());
set.addAll(WiktionaryBEY000.terms());
set.addAll(WiktionaryBEZ000.terms());
set.addAll(WiktionaryBHA000.terms());
set.addAll(WiktionaryBHE000.terms());
set.addAll(WiktionaryBHO000.terms());
set.addAll(WiktionaryBHU000.terms());
set.addAll(WiktionaryBIA000.terms());
set.addAll(WiktionaryBIB000.terms());
set.addAll(WiktionaryBIC000.terms());
set.addAll(WiktionaryBID000.terms());
set.addAll(WiktionaryBIE000.terms());
set.addAll(WiktionaryBIF000.terms());
set.addAll(WiktionaryBIG000.terms());
set.addAll(WiktionaryBIJ000.terms());
set.addAll(WiktionaryBIK000.terms());
set.addAll(WiktionaryBIL000.terms());
set.addAll(WiktionaryBIM000.terms());
set.addAll(WiktionaryBIN000.terms());
set.addAll(WiktionaryBIO000.terms());
set.addAll(WiktionaryBIP000.terms());
set.addAll(WiktionaryBIR000.terms());
set.addAll(WiktionaryBIS000.terms());
set.addAll(WiktionaryBIT000.terms());
set.addAll(WiktionaryBIV000.terms());
set.addAll(WiktionaryBIX000.terms());
set.addAll(WiktionaryBIZ000.terms());
set.addAll(WiktionaryBJA000.terms());
set.addAll(WiktionaryBLA000.terms());
set.addAll(WiktionaryBLE000.terms());
set.addAll(WiktionaryBLI000.terms());
set.addAll(WiktionaryBLO000.terms());
set.addAll(WiktionaryBLU000.terms());
set.addAll(WiktionaryBLY000.terms());
set.addAll(WiktionaryBOA000.terms());
set.addAll(WiktionaryBOB000.terms());
set.addAll(WiktionaryBOC000.terms());
set.addAll(WiktionaryBOD000.terms());
set.addAll(WiktionaryBOE000.terms());
set.addAll(WiktionaryBOF000.terms());
set.addAll(WiktionaryBOG000.terms());
set.addAll(WiktionaryBOH000.terms());
set.addAll(WiktionaryBOI000.terms());
set.addAll(WiktionaryBOK000.terms());
set.addAll(WiktionaryBOL000.terms());
set.addAll(WiktionaryBOM000.terms());
set.addAll(WiktionaryBON000.terms());
set.addAll(WiktionaryBOO000.terms());
set.addAll(WiktionaryBOP000.terms());
set.addAll(WiktionaryBOR000.terms());
set.addAll(WiktionaryBOS000.terms());
set.addAll(WiktionaryBOT000.terms());
set.addAll(WiktionaryBOU000.terms());
set.addAll(WiktionaryBOV000.terms());
set.addAll(WiktionaryBOW000.terms());
set.addAll(WiktionaryBOX000.terms());
set.addAll(WiktionaryBOY000.terms());
set.addAll(WiktionaryBOZ000.terms());
set.addAll(WiktionaryBRA000.terms());
set.addAll(WiktionaryBRE000.terms());
set.addAll(WiktionaryBRI000.terms());
set.addAll(WiktionaryBRO000.terms());
set.addAll(WiktionaryBRU000.terms());
set.addAll(WiktionaryBRY000.terms());
set.addAll(WiktionaryBUA000.terms());
set.addAll(WiktionaryBUB000.terms());
set.addAll(WiktionaryBUC000.terms());
set.addAll(WiktionaryBUD000.terms());
set.addAll(WiktionaryBUF000.terms());
set.addAll(WiktionaryBUG000.terms());
set.addAll(WiktionaryBUH000.terms());
set.addAll(WiktionaryBUI000.terms());
set.addAll(WiktionaryBUJ000.terms());
set.addAll(WiktionaryBUK000.terms());
set.addAll(WiktionaryBUL000.terms());
set.addAll(WiktionaryBUM000.terms());
set.addAll(WiktionaryBUN000.terms());
set.addAll(WiktionaryBUO000.terms());
set.addAll(WiktionaryBUP000.terms());
set.addAll(WiktionaryBUR000.terms());
set.addAll(WiktionaryBUS000.terms());
set.addAll(WiktionaryBUT000.terms());
set.addAll(WiktionaryBUX000.terms());
set.addAll(WiktionaryBUY000.terms());
set.addAll(WiktionaryBUZ000.terms());
set.addAll(WiktionaryBWA000.terms());
set.addAll(WiktionaryBWI000.terms());
set.addAll(WiktionaryBYE000.terms());
set.addAll(WiktionaryBYG000.terms());
set.addAll(WiktionaryBYL000.terms());
set.addAll(WiktionaryBYO000.terms());
set.addAll(WiktionaryBYP000.terms());
set.addAll(WiktionaryBYR000.terms());
set.addAll(WiktionaryBYS000.terms());
set.addAll(WiktionaryBYT000.terms());
set.addAll(WiktionaryBYW000.terms());
set.addAll(WiktionaryBYZ000.terms());  		return set; 	} }