package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.r.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.r.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.r.b.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.b.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.j.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.r.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.r.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.r.k.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.q.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.r.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.r.p.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.r.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.r.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.r.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.r.y.u.*;
import org.swtk.commons.dict.wiktionary.generated.r.z.e.*;  public final class WiktionaryTermsR {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryRAB000.terms());
set.addAll(WiktionaryRAC000.terms());
set.addAll(WiktionaryRAD000.terms());
set.addAll(WiktionaryRAE000.terms());
set.addAll(WiktionaryRAF000.terms());
set.addAll(WiktionaryRAG000.terms());
set.addAll(WiktionaryRAI000.terms());
set.addAll(WiktionaryRAK000.terms());
set.addAll(WiktionaryRAL000.terms());
set.addAll(WiktionaryRAM000.terms());
set.addAll(WiktionaryRAN000.terms());
set.addAll(WiktionaryRAP000.terms());
set.addAll(WiktionaryRAR000.terms());
set.addAll(WiktionaryRAS000.terms());
set.addAll(WiktionaryRAT000.terms());
set.addAll(WiktionaryRAU000.terms());
set.addAll(WiktionaryRAV000.terms());
set.addAll(WiktionaryRAW000.terms());
set.addAll(WiktionaryRAZ000.terms());
set.addAll(WiktionaryRBG000.terms());
set.addAll(WiktionaryRBS000.terms());
set.addAll(WiktionaryREA000.terms());
set.addAll(WiktionaryREB000.terms());
set.addAll(WiktionaryREC000.terms());
set.addAll(WiktionaryRED000.terms());
set.addAll(WiktionaryREE000.terms());
set.addAll(WiktionaryREF000.terms());
set.addAll(WiktionaryREG000.terms());
set.addAll(WiktionaryREH000.terms());
set.addAll(WiktionaryREI000.terms());
set.addAll(WiktionaryREJ000.terms());
set.addAll(WiktionaryREL000.terms());
set.addAll(WiktionaryREM000.terms());
set.addAll(WiktionaryREN000.terms());
set.addAll(WiktionaryREO000.terms());
set.addAll(WiktionaryREP000.terms());
set.addAll(WiktionaryREQ000.terms());
set.addAll(WiktionaryRER000.terms());
set.addAll(WiktionaryRES000.terms());
set.addAll(WiktionaryRET000.terms());
set.addAll(WiktionaryREU000.terms());
set.addAll(WiktionaryREV000.terms());
set.addAll(WiktionaryREW000.terms());
set.addAll(WiktionaryREX000.terms());
set.addAll(WiktionaryREY000.terms());
set.addAll(WiktionaryRHA000.terms());
set.addAll(WiktionaryRHE000.terms());
set.addAll(WiktionaryRHI000.terms());
set.addAll(WiktionaryRHO000.terms());
set.addAll(WiktionaryRHU000.terms());
set.addAll(WiktionaryRHY000.terms());
set.addAll(WiktionaryRIA000.terms());
set.addAll(WiktionaryRIB000.terms());
set.addAll(WiktionaryRIC000.terms());
set.addAll(WiktionaryRID000.terms());
set.addAll(WiktionaryRIE000.terms());
set.addAll(WiktionaryRIF000.terms());
set.addAll(WiktionaryRIG000.terms());
set.addAll(WiktionaryRIJ000.terms());
set.addAll(WiktionaryRIK000.terms());
set.addAll(WiktionaryRIL000.terms());
set.addAll(WiktionaryRIM000.terms());
set.addAll(WiktionaryRIN000.terms());
set.addAll(WiktionaryRIO000.terms());
set.addAll(WiktionaryRIP000.terms());
set.addAll(WiktionaryRIS000.terms());
set.addAll(WiktionaryRIT000.terms());
set.addAll(WiktionaryRIV000.terms());
set.addAll(WiktionaryRIX000.terms());
set.addAll(WiktionaryRKA000.terms());
set.addAll(WiktionaryROA000.terms());
set.addAll(WiktionaryROB000.terms());
set.addAll(WiktionaryROC000.terms());
set.addAll(WiktionaryROD000.terms());
set.addAll(WiktionaryROE000.terms());
set.addAll(WiktionaryROG000.terms());
set.addAll(WiktionaryROI000.terms());
set.addAll(WiktionaryROK000.terms());
set.addAll(WiktionaryROL000.terms());
set.addAll(WiktionaryROM000.terms());
set.addAll(WiktionaryRON000.terms());
set.addAll(WiktionaryROO000.terms());
set.addAll(WiktionaryROP000.terms());
set.addAll(WiktionaryROQ000.terms());
set.addAll(WiktionaryROR000.terms());
set.addAll(WiktionaryROS000.terms());
set.addAll(WiktionaryROT000.terms());
set.addAll(WiktionaryROU000.terms());
set.addAll(WiktionaryROW000.terms());
set.addAll(WiktionaryROX000.terms());
set.addAll(WiktionaryROY000.terms());
set.addAll(WiktionaryROZ000.terms());
set.addAll(WiktionaryRPG000.terms());
set.addAll(WiktionaryRUB000.terms());
set.addAll(WiktionaryRUC000.terms());
set.addAll(WiktionaryRUD000.terms());
set.addAll(WiktionaryRUE000.terms());
set.addAll(WiktionaryRUF000.terms());
set.addAll(WiktionaryRUG000.terms());
set.addAll(WiktionaryRUI000.terms());
set.addAll(WiktionaryRUL000.terms());
set.addAll(WiktionaryRUM000.terms());
set.addAll(WiktionaryRUN000.terms());
set.addAll(WiktionaryRUP000.terms());
set.addAll(WiktionaryRUR000.terms());
set.addAll(WiktionaryRUS000.terms());
set.addAll(WiktionaryRUT000.terms());
set.addAll(WiktionaryRVA000.terms());
set.addAll(WiktionaryRWA000.terms());
set.addAll(WiktionaryRYA000.terms());
set.addAll(WiktionaryRYE000.terms());
set.addAll(WiktionaryRYU000.terms());
set.addAll(WiktionaryRZE000.terms());  		return set; 	} }