package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.n.a.a.*;
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
import org.swtk.commons.dict.wiktionary.generated.n.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.n.u.i.*;
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
import org.swtk.commons.dict.wiktionary.generated.n.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.n.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.n.y.u.*;

public final class WiktionaryDbN {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("naa".equals(sub))
			return WiktionaryNAA000.get(name);
		else if ("nab".equals(sub))
			return WiktionaryNAB000.get(name);
		else if ("nac".equals(sub))
			return WiktionaryNAC000.get(name);
		else if ("nad".equals(sub))
			return WiktionaryNAD000.get(name);
		else if ("nae".equals(sub))
			return WiktionaryNAE000.get(name);
		else if ("naf".equals(sub))
			return WiktionaryNAF000.get(name);
		else if ("nag".equals(sub))
			return WiktionaryNAG000.get(name);
		else if ("nah".equals(sub))
			return WiktionaryNAH000.get(name);
		else if ("nai".equals(sub))
			return WiktionaryNAI000.get(name);
		else if ("nak".equals(sub))
			return WiktionaryNAK000.get(name);
		else if ("nam".equals(sub))
			return WiktionaryNAM000.get(name);
		else if ("nan".equals(sub))
			return WiktionaryNAN000.get(name);
		else if ("nao".equals(sub))
			return WiktionaryNAO000.get(name);
		else if ("nap".equals(sub))
			return WiktionaryNAP000.get(name);
		else if ("nar".equals(sub))
			return WiktionaryNAR000.get(name);
		else if ("nas".equals(sub))
			return WiktionaryNAS000.get(name);
		else if ("nat".equals(sub))
			return WiktionaryNAT000.get(name);
		else if ("nau".equals(sub))
			return WiktionaryNAU000.get(name);
		else if ("nav".equals(sub))
			return WiktionaryNAV000.get(name);
		else if ("nay".equals(sub))
			return WiktionaryNAY000.get(name);
		else if ("naz".equals(sub))
			return WiktionaryNAZ000.get(name);
		else if ("nba".equals(sub))
			return WiktionaryNBA000.get(name);
		else if ("ndu".equals(sub))
			return WiktionaryNDU000.get(name);
		else if ("nea".equals(sub))
			return WiktionaryNEA000.get(name);
		else if ("neb".equals(sub))
			return WiktionaryNEB000.get(name);
		else if ("nec".equals(sub))
			return WiktionaryNEC000.get(name);
		else if ("ned".equals(sub))
			return WiktionaryNED000.get(name);
		else if ("nee".equals(sub))
			return WiktionaryNEE000.get(name);
		else if ("neg".equals(sub))
			return WiktionaryNEG000.get(name);
		else if ("nei".equals(sub))
			return WiktionaryNEI000.get(name);
		else if ("nel".equals(sub))
			return WiktionaryNEL000.get(name);
		else if ("neo".equals(sub))
			return WiktionaryNEO000.get(name);
		else if ("nep".equals(sub))
			return WiktionaryNEP000.get(name);
		else if ("ner".equals(sub))
			return WiktionaryNER000.get(name);
		else if ("nes".equals(sub))
			return WiktionaryNES000.get(name);
		else if ("net".equals(sub))
			return WiktionaryNET000.get(name);
		else if ("neu".equals(sub))
			return WiktionaryNEU000.get(name);
		else if ("nev".equals(sub))
			return WiktionaryNEV000.get(name);
		else if ("new".equals(sub))
			return WiktionaryNEW000.get(name);
		else if ("nex".equals(sub))
			return WiktionaryNEX000.get(name);
		else if ("nga".equals(sub))
			return WiktionaryNGA000.get(name);
		else if ("ngw".equals(sub))
			return WiktionaryNGW000.get(name);
		else if ("nia".equals(sub))
			return WiktionaryNIA000.get(name);
		else if ("nib".equals(sub))
			return WiktionaryNIB000.get(name);
		else if ("nic".equals(sub))
			return WiktionaryNIC000.get(name);
		else if ("nid".equals(sub))
			return WiktionaryNID000.get(name);
		else if ("nie".equals(sub))
			return WiktionaryNIE000.get(name);
		else if ("nif".equals(sub))
			return WiktionaryNIF000.get(name);
		else if ("nig".equals(sub))
			return WiktionaryNIG000.get(name);
		else if ("nih".equals(sub))
			return WiktionaryNIH000.get(name);
		else if ("nik".equals(sub))
			return WiktionaryNIK000.get(name);
		else if ("nil".equals(sub))
			return WiktionaryNIL000.get(name);
		else if ("nim".equals(sub))
			return WiktionaryNIM000.get(name);
		else if ("nin".equals(sub))
			return WiktionaryNIN000.get(name);
		else if ("nio".equals(sub))
			return WiktionaryNIO000.get(name);
		else if ("nip".equals(sub))
			return WiktionaryNIP000.get(name);
		else if ("niq".equals(sub))
			return WiktionaryNIQ000.get(name);
		else if ("nir".equals(sub))
			return WiktionaryNIR000.get(name);
		else if ("nis".equals(sub))
			return WiktionaryNIS000.get(name);
		else if ("nit".equals(sub))
			return WiktionaryNIT000.get(name);
		else if ("niu".equals(sub))
			return WiktionaryNIU000.get(name);
		else if ("niv".equals(sub))
			return WiktionaryNIV000.get(name);
		else if ("nix".equals(sub))
			return WiktionaryNIX000.get(name);
		else if ("niz".equals(sub))
			return WiktionaryNIZ000.get(name);
		else if ("nob".equals(sub))
			return WiktionaryNOB000.get(name);
		else if ("noc".equals(sub))
			return WiktionaryNOC000.get(name);
		else if ("nod".equals(sub))
			return WiktionaryNOD000.get(name);
		else if ("noe".equals(sub))
			return WiktionaryNOE000.get(name);
		else if ("nog".equals(sub))
			return WiktionaryNOG000.get(name);
		else if ("noi".equals(sub))
			return WiktionaryNOI000.get(name);
		else if ("nol".equals(sub))
			return WiktionaryNOL000.get(name);
		else if ("nom".equals(sub))
			return WiktionaryNOM000.get(name);
		else if ("non".equals(sub))
			return WiktionaryNON000.get(name);
		else if ("noo".equals(sub))
			return WiktionaryNOO000.get(name);
		else if ("nop".equals(sub))
			return WiktionaryNOP000.get(name);
		else if ("nor".equals(sub))
			return WiktionaryNOR000.get(name);
		else if ("nos".equals(sub))
			return WiktionaryNOS000.get(name);
		else if ("not".equals(sub))
			return WiktionaryNOT000.get(name);
		else if ("nou".equals(sub))
			return WiktionaryNOU000.get(name);
		else if ("nov".equals(sub))
			return WiktionaryNOV000.get(name);
		else if ("now".equals(sub))
			return WiktionaryNOW000.get(name);
		else if ("nox".equals(sub))
			return WiktionaryNOX000.get(name);
		else if ("noy".equals(sub))
			return WiktionaryNOY000.get(name);
		else if ("noz".equals(sub))
			return WiktionaryNOZ000.get(name);
		else if ("nsa".equals(sub))
			return WiktionaryNSA000.get(name);
		else if ("nuc".equals(sub))
			return WiktionaryNUC000.get(name);
		else if ("nud".equals(sub))
			return WiktionaryNUD000.get(name);
		else if ("nue".equals(sub))
			return WiktionaryNUE000.get(name);
		else if ("nuf".equals(sub))
			return WiktionaryNUF000.get(name);
		else if ("nug".equals(sub))
			return WiktionaryNUG000.get(name);
		else if ("nui".equals(sub))
			return WiktionaryNUI000.get(name);
		else if ("nul".equals(sub))
			return WiktionaryNUL000.get(name);
		else if ("num".equals(sub))
			return WiktionaryNUM000.get(name);
		else if ("nun".equals(sub))
			return WiktionaryNUN000.get(name);
		else if ("nuq".equals(sub))
			return WiktionaryNUQ000.get(name);
		else if ("nur".equals(sub))
			return WiktionaryNUR000.get(name);
		else if ("nut".equals(sub))
			return WiktionaryNUT000.get(name);
		else if ("nux".equals(sub))
			return WiktionaryNUX000.get(name);
		else if ("nvc".equals(sub))
			return WiktionaryNVC000.get(name);
		else if ("nya".equals(sub))
			return WiktionaryNYA000.get(name);
		else if ("nyc".equals(sub))
			return WiktionaryNYC000.get(name);
		else if ("nye".equals(sub))
			return WiktionaryNYE000.get(name);
		else if ("nym".equals(sub))
			return WiktionaryNYM000.get(name);
		else if ("nyn".equals(sub))
			return WiktionaryNYN000.get(name);
		else if ("nyo".equals(sub))
			return WiktionaryNYO000.get(name);
		else if ("nys".equals(sub))
			return WiktionaryNYS000.get(name);
		else if ("nyu".equals(sub))
			return WiktionaryNYU000.get(name);
		return null;
	}
}