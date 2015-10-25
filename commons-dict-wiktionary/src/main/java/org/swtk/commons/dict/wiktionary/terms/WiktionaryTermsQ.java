package org.swtk.commons.dict.wiktionary.terms;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.commons.dict.wiktionary.generated.q.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.q.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.q.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.q.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.o.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.q.u.t.*;  public final class WiktionaryTermsQ {  	public static Collection<String> terms() { 		Set<String> set = new TreeSet<String>();  		set.addAll(WiktionaryQAD000.terms());
set.addAll(WiktionaryQAL000.terms());
set.addAll(WiktionaryQAN000.terms());
set.addAll(WiktionaryQAP000.terms());
set.addAll(WiktionaryQAS000.terms());
set.addAll(WiktionaryQAT000.terms());
set.addAll(WiktionaryQAW000.terms());
set.addAll(WiktionaryQAZ000.terms());
set.addAll(WiktionaryQIG000.terms());
set.addAll(WiktionaryQIN000.terms());
set.addAll(WiktionaryQIQ000.terms());
set.addAll(WiktionaryQIV000.terms());
set.addAll(WiktionaryQOP000.terms());
set.addAll(WiktionaryQUA000.terms());
set.addAll(WiktionaryQUE000.terms());
set.addAll(WiktionaryQUI000.terms());
set.addAll(WiktionaryQUO000.terms());
set.addAll(WiktionaryQUR000.terms());
set.addAll(WiktionaryQUT000.terms());  		return set; 	} }