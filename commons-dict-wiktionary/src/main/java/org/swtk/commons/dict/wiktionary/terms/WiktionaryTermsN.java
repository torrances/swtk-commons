package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.n.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.n.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.n.b.a.*;
import org.swtk.commons.dict.wiktionary.generated.n.d.u.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.n.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.n.g.a.*;
import org.swtk.commons.dict.wiktionary.generated.n.g.w.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.h.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.u.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.n.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.n.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.n.s.a.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.q.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.n.v.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.u.*;  public final class WiktionaryTermsN {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryNAA000.terms());
set.addAll(WiktionaryNAB000.terms());
set.addAll(WiktionaryNAC000.terms());
set.addAll(WiktionaryNAD000.terms());
set.addAll(WiktionaryNAE000.terms());
set.addAll(WiktionaryNAF000.terms());
set.addAll(WiktionaryNAG000.terms());
set.addAll(WiktionaryNAH000.terms());
set.addAll(WiktionaryNAI000.terms());
set.addAll(WiktionaryNAK000.terms());
set.addAll(WiktionaryNAM000.terms());
set.addAll(WiktionaryNAN000.terms());
set.addAll(WiktionaryNAO000.terms());
set.addAll(WiktionaryNAP000.terms());
set.addAll(WiktionaryNAR000.terms());
set.addAll(WiktionaryNAS000.terms());
set.addAll(WiktionaryNAT000.terms());
set.addAll(WiktionaryNAU000.terms());
set.addAll(WiktionaryNAV000.terms());
set.addAll(WiktionaryNAY000.terms());
set.addAll(WiktionaryNAZ000.terms());
set.addAll(WiktionaryNBA000.terms());
set.addAll(WiktionaryNDU000.terms());
set.addAll(WiktionaryNEA000.terms());
set.addAll(WiktionaryNEB000.terms());
set.addAll(WiktionaryNEC000.terms());
set.addAll(WiktionaryNED000.terms());
set.addAll(WiktionaryNEE000.terms());
set.addAll(WiktionaryNEG000.terms());
set.addAll(WiktionaryNEI000.terms());
set.addAll(WiktionaryNEL000.terms());
set.addAll(WiktionaryNEM000.terms());
set.addAll(WiktionaryNEN000.terms());
set.addAll(WiktionaryNEO000.terms());
set.addAll(WiktionaryNEP000.terms());
set.addAll(WiktionaryNER000.terms());
set.addAll(WiktionaryNES000.terms());
set.addAll(WiktionaryNET000.terms());
set.addAll(WiktionaryNEU000.terms());
set.addAll(WiktionaryNEV000.terms());
set.addAll(WiktionaryNEW000.terms());
set.addAll(WiktionaryNEX000.terms());
set.addAll(WiktionaryNGA000.terms());
set.addAll(WiktionaryNGW000.terms());
set.addAll(WiktionaryNIA000.terms());
set.addAll(WiktionaryNIB000.terms());
set.addAll(WiktionaryNIC000.terms());
set.addAll(WiktionaryNID000.terms());
set.addAll(WiktionaryNIE000.terms());
set.addAll(WiktionaryNIF000.terms());
set.addAll(WiktionaryNIG000.terms());
set.addAll(WiktionaryNIH000.terms());
set.addAll(WiktionaryNIK000.terms());
set.addAll(WiktionaryNIL000.terms());
set.addAll(WiktionaryNIM000.terms());
set.addAll(WiktionaryNIN000.terms());
set.addAll(WiktionaryNIO000.terms());
set.addAll(WiktionaryNIP000.terms());
set.addAll(WiktionaryNIQ000.terms());
set.addAll(WiktionaryNIR000.terms());
set.addAll(WiktionaryNIS000.terms());
set.addAll(WiktionaryNIT000.terms());
set.addAll(WiktionaryNIU000.terms());
set.addAll(WiktionaryNIV000.terms());
set.addAll(WiktionaryNIX000.terms());
set.addAll(WiktionaryNIZ000.terms());
set.addAll(WiktionaryNOB000.terms());
set.addAll(WiktionaryNOC000.terms());
set.addAll(WiktionaryNOD000.terms());
set.addAll(WiktionaryNOE000.terms());
set.addAll(WiktionaryNOG000.terms());
set.addAll(WiktionaryNOI000.terms());
set.addAll(WiktionaryNOK000.terms());
set.addAll(WiktionaryNOL000.terms());
set.addAll(WiktionaryNOM000.terms());
set.addAll(WiktionaryNON000.terms());
set.addAll(WiktionaryNOO000.terms());
set.addAll(WiktionaryNOP000.terms());
set.addAll(WiktionaryNOR000.terms());
set.addAll(WiktionaryNOS000.terms());
set.addAll(WiktionaryNOT000.terms());
set.addAll(WiktionaryNOU000.terms());
set.addAll(WiktionaryNOV000.terms());
set.addAll(WiktionaryNOW000.terms());
set.addAll(WiktionaryNOX000.terms());
set.addAll(WiktionaryNOY000.terms());
set.addAll(WiktionaryNOZ000.terms());
set.addAll(WiktionaryNSA000.terms());
set.addAll(WiktionaryNUB000.terms());
set.addAll(WiktionaryNUC000.terms());
set.addAll(WiktionaryNUD000.terms());
set.addAll(WiktionaryNUE000.terms());
set.addAll(WiktionaryNUF000.terms());
set.addAll(WiktionaryNUG000.terms());
set.addAll(WiktionaryNUI000.terms());
set.addAll(WiktionaryNUK000.terms());
set.addAll(WiktionaryNUL000.terms());
set.addAll(WiktionaryNUM000.terms());
set.addAll(WiktionaryNUN000.terms());
set.addAll(WiktionaryNUQ000.terms());
set.addAll(WiktionaryNUR000.terms());
set.addAll(WiktionaryNUT000.terms());
set.addAll(WiktionaryNUX000.terms());
set.addAll(WiktionaryNVC000.terms());
set.addAll(WiktionaryNYA000.terms());
set.addAll(WiktionaryNYC000.terms());
set.addAll(WiktionaryNYE000.terms());
set.addAll(WiktionaryNYL000.terms());
set.addAll(WiktionaryNYM000.terms());
set.addAll(WiktionaryNYN000.terms());
set.addAll(WiktionaryNYO000.terms());
set.addAll(WiktionaryNYS000.terms());
set.addAll(WiktionaryNYU000.terms());  		return set; 	} }