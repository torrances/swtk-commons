package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.x.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.x.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.x.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.x.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.x.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.x.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.x.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.x.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.x.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.x.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.x.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.x.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.x.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.x.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.x.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.x.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.x.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.x.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.x.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.x.y.s.*;  public final class WiktionaryTermsX {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryXAC000.terms());
set.addAll(WiktionaryXAN000.terms());
set.addAll(WiktionaryXAV000.terms());
set.addAll(WiktionaryXEB000.terms());
set.addAll(WiktionaryXEN000.terms());
set.addAll(WiktionaryXER000.terms());
set.addAll(WiktionaryXIA000.terms());
set.addAll(WiktionaryXIB000.terms());
set.addAll(WiktionaryXIL000.terms());
set.addAll(WiktionaryXIM000.terms());
set.addAll(WiktionaryXIN000.terms());
set.addAll(WiktionaryXIP000.terms());
set.addAll(WiktionaryXMA000.terms());
set.addAll(WiktionaryXNA000.terms());
set.addAll(WiktionaryXNO000.terms());
set.addAll(WiktionaryXOA000.terms());
set.addAll(WiktionaryXOL000.terms());
set.addAll(WiktionaryXON000.terms());
set.addAll(WiktionaryXTI000.terms());
set.addAll(WiktionaryXYL000.terms());
set.addAll(WiktionaryXYN000.terms());
set.addAll(WiktionaryXYR000.terms());
set.addAll(WiktionaryXYS000.terms());  		return set; 	} }