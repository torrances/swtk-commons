package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.b.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.b.a.g.*;
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
import org.swtk.commons.dict.wiktionary.generated.b.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.b.e.z.*;
import org.swtk.commons.dict.wiktionary.generated.b.h.e.*;
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
import org.swtk.commons.dict.wiktionary.generated.b.u.i.*;
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
import org.swtk.commons.dict.wiktionary.generated.b.y.g.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.t.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.w.*;
import org.swtk.commons.dict.wiktionary.generated.b.y.z.*;

public final class WiktionaryDbB {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("baa".equals(sub))
			return WiktionaryBAA000.get(name);
		else if ("bab".equals(sub))
			return WiktionaryBAB000.get(name);
		else if ("bac".equals(sub))
			return WiktionaryBAC000.get(name);
		else if ("bad".equals(sub))
			return WiktionaryBAD000.get(name);
		else if ("baf".equals(sub))
			return WiktionaryBAF000.get(name);
		else if ("bag".equals(sub))
			return WiktionaryBAG000.get(name);
		else if ("bai".equals(sub))
			return WiktionaryBAI000.get(name);
		else if ("baj".equals(sub))
			return WiktionaryBAJ000.get(name);
		else if ("bak".equals(sub))
			return WiktionaryBAK000.get(name);
		else if ("bal".equals(sub))
			return WiktionaryBAL000.get(name);
		else if ("bam".equals(sub))
			return WiktionaryBAM000.get(name);
		else if ("ban".equals(sub))
			return WiktionaryBAN000.get(name);
		else if ("bao".equals(sub))
			return WiktionaryBAO000.get(name);
		else if ("bap".equals(sub))
			return WiktionaryBAP000.get(name);
		else if ("bar".equals(sub))
			return WiktionaryBAR000.get(name);
		else if ("bas".equals(sub))
			return WiktionaryBAS000.get(name);
		else if ("bat".equals(sub))
			return WiktionaryBAT000.get(name);
		else if ("bau".equals(sub))
			return WiktionaryBAU000.get(name);
		else if ("bav".equals(sub))
			return WiktionaryBAV000.get(name);
		else if ("baw".equals(sub))
			return WiktionaryBAW000.get(name);
		else if ("bay".equals(sub))
			return WiktionaryBAY000.get(name);
		else if ("baz".equals(sub))
			return WiktionaryBAZ000.get(name);
		else if ("bde".equals(sub))
			return WiktionaryBDE000.get(name);
		else if ("bea".equals(sub))
			return WiktionaryBEA000.get(name);
		else if ("beb".equals(sub))
			return WiktionaryBEB000.get(name);
		else if ("bec".equals(sub))
			return WiktionaryBEC000.get(name);
		else if ("bed".equals(sub))
			return WiktionaryBED000.get(name);
		else if ("bee".equals(sub))
			return WiktionaryBEE000.get(name);
		else if ("beg".equals(sub))
			return WiktionaryBEG000.get(name);
		else if ("beh".equals(sub))
			return WiktionaryBEH000.get(name);
		else if ("bek".equals(sub))
			return WiktionaryBEK000.get(name);
		else if ("bel".equals(sub))
			return WiktionaryBEL000.get(name);
		else if ("bem".equals(sub))
			return WiktionaryBEM000.get(name);
		else if ("ben".equals(sub))
			return WiktionaryBEN000.get(name);
		else if ("ber".equals(sub))
			return WiktionaryBER000.get(name);
		else if ("bes".equals(sub))
			return WiktionaryBES000.get(name);
		else if ("bet".equals(sub))
			return WiktionaryBET000.get(name);
		else if ("bev".equals(sub))
			return WiktionaryBEV000.get(name);
		else if ("bew".equals(sub))
			return WiktionaryBEW000.get(name);
		else if ("bey".equals(sub))
			return WiktionaryBEY000.get(name);
		else if ("bez".equals(sub))
			return WiktionaryBEZ000.get(name);
		else if ("bhe".equals(sub))
			return WiktionaryBHE000.get(name);
		else if ("bia".equals(sub))
			return WiktionaryBIA000.get(name);
		else if ("bib".equals(sub))
			return WiktionaryBIB000.get(name);
		else if ("bic".equals(sub))
			return WiktionaryBIC000.get(name);
		else if ("bid".equals(sub))
			return WiktionaryBID000.get(name);
		else if ("bie".equals(sub))
			return WiktionaryBIE000.get(name);
		else if ("bif".equals(sub))
			return WiktionaryBIF000.get(name);
		else if ("big".equals(sub))
			return WiktionaryBIG000.get(name);
		else if ("bij".equals(sub))
			return WiktionaryBIJ000.get(name);
		else if ("bik".equals(sub))
			return WiktionaryBIK000.get(name);
		else if ("bil".equals(sub))
			return WiktionaryBIL000.get(name);
		else if ("bim".equals(sub))
			return WiktionaryBIM000.get(name);
		else if ("bin".equals(sub))
			return WiktionaryBIN000.get(name);
		else if ("bio".equals(sub))
			return WiktionaryBIO000.get(name);
		else if ("bip".equals(sub))
			return WiktionaryBIP000.get(name);
		else if ("bir".equals(sub))
			return WiktionaryBIR000.get(name);
		else if ("bis".equals(sub))
			return WiktionaryBIS000.get(name);
		else if ("bit".equals(sub))
			return WiktionaryBIT000.get(name);
		else if ("biv".equals(sub))
			return WiktionaryBIV000.get(name);
		else if ("bix".equals(sub))
			return WiktionaryBIX000.get(name);
		else if ("biz".equals(sub))
			return WiktionaryBIZ000.get(name);
		else if ("bja".equals(sub))
			return WiktionaryBJA000.get(name);
		else if ("bla".equals(sub))
			return WiktionaryBLA000.get(name);
		else if ("ble".equals(sub))
			return WiktionaryBLE000.get(name);
		else if ("bli".equals(sub))
			return WiktionaryBLI000.get(name);
		else if ("blo".equals(sub))
			return WiktionaryBLO000.get(name);
		else if ("blu".equals(sub))
			return WiktionaryBLU000.get(name);
		else if ("boa".equals(sub))
			return WiktionaryBOA000.get(name);
		else if ("bob".equals(sub))
			return WiktionaryBOB000.get(name);
		else if ("boc".equals(sub))
			return WiktionaryBOC000.get(name);
		else if ("bod".equals(sub))
			return WiktionaryBOD000.get(name);
		else if ("boe".equals(sub))
			return WiktionaryBOE000.get(name);
		else if ("bof".equals(sub))
			return WiktionaryBOF000.get(name);
		else if ("bog".equals(sub))
			return WiktionaryBOG000.get(name);
		else if ("boh".equals(sub))
			return WiktionaryBOH000.get(name);
		else if ("boi".equals(sub))
			return WiktionaryBOI000.get(name);
		else if ("bok".equals(sub))
			return WiktionaryBOK000.get(name);
		else if ("bol".equals(sub))
			return WiktionaryBOL000.get(name);
		else if ("bom".equals(sub))
			return WiktionaryBOM000.get(name);
		else if ("bon".equals(sub))
			return WiktionaryBON000.get(name);
		else if ("boo".equals(sub))
			return WiktionaryBOO000.get(name);
		else if ("bop".equals(sub))
			return WiktionaryBOP000.get(name);
		else if ("bor".equals(sub))
			return WiktionaryBOR000.get(name);
		else if ("bos".equals(sub))
			return WiktionaryBOS000.get(name);
		else if ("bot".equals(sub))
			return WiktionaryBOT000.get(name);
		else if ("bou".equals(sub))
			return WiktionaryBOU000.get(name);
		else if ("bov".equals(sub))
			return WiktionaryBOV000.get(name);
		else if ("bow".equals(sub))
			return WiktionaryBOW000.get(name);
		else if ("box".equals(sub))
			return WiktionaryBOX000.get(name);
		else if ("boy".equals(sub))
			return WiktionaryBOY000.get(name);
		else if ("boz".equals(sub))
			return WiktionaryBOZ000.get(name);
		else if ("bra".equals(sub))
			return WiktionaryBRA000.get(name);
		else if ("bre".equals(sub))
			return WiktionaryBRE000.get(name);
		else if ("bri".equals(sub))
			return WiktionaryBRI000.get(name);
		else if ("bro".equals(sub))
			return WiktionaryBRO000.get(name);
		else if ("bru".equals(sub))
			return WiktionaryBRU000.get(name);
		else if ("bry".equals(sub))
			return WiktionaryBRY000.get(name);
		else if ("bua".equals(sub))
			return WiktionaryBUA000.get(name);
		else if ("bub".equals(sub))
			return WiktionaryBUB000.get(name);
		else if ("buc".equals(sub))
			return WiktionaryBUC000.get(name);
		else if ("bud".equals(sub))
			return WiktionaryBUD000.get(name);
		else if ("buf".equals(sub))
			return WiktionaryBUF000.get(name);
		else if ("bug".equals(sub))
			return WiktionaryBUG000.get(name);
		else if ("bui".equals(sub))
			return WiktionaryBUI000.get(name);
		else if ("buk".equals(sub))
			return WiktionaryBUK000.get(name);
		else if ("bul".equals(sub))
			return WiktionaryBUL000.get(name);
		else if ("bum".equals(sub))
			return WiktionaryBUM000.get(name);
		else if ("bun".equals(sub))
			return WiktionaryBUN000.get(name);
		else if ("buo".equals(sub))
			return WiktionaryBUO000.get(name);
		else if ("bup".equals(sub))
			return WiktionaryBUP000.get(name);
		else if ("bur".equals(sub))
			return WiktionaryBUR000.get(name);
		else if ("bus".equals(sub))
			return WiktionaryBUS000.get(name);
		else if ("but".equals(sub))
			return WiktionaryBUT000.get(name);
		else if ("bux".equals(sub))
			return WiktionaryBUX000.get(name);
		else if ("buy".equals(sub))
			return WiktionaryBUY000.get(name);
		else if ("buz".equals(sub))
			return WiktionaryBUZ000.get(name);
		else if ("bwa".equals(sub))
			return WiktionaryBWA000.get(name);
		else if ("byg".equals(sub))
			return WiktionaryBYG000.get(name);
		else if ("byl".equals(sub))
			return WiktionaryBYL000.get(name);
		else if ("byp".equals(sub))
			return WiktionaryBYP000.get(name);
		else if ("byr".equals(sub))
			return WiktionaryBYR000.get(name);
		else if ("bys".equals(sub))
			return WiktionaryBYS000.get(name);
		else if ("byt".equals(sub))
			return WiktionaryBYT000.get(name);
		else if ("byw".equals(sub))
			return WiktionaryBYW000.get(name);
		else if ("byz".equals(sub))
			return WiktionaryBYZ000.get(name);
		return null;
	}
}