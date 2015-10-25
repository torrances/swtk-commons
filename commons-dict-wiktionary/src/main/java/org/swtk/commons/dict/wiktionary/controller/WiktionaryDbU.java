package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.u.b.e.*;
import org.swtk.commons.dict.wiktionary.generated.u.b.i.*;
import org.swtk.commons.dict.wiktionary.generated.u.b.u.*;
import org.swtk.commons.dict.wiktionary.generated.u.c.k.*;
import org.swtk.commons.dict.wiktionary.generated.u.d.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.d.d.*;
import org.swtk.commons.dict.wiktionary.generated.u.d.o.*;
import org.swtk.commons.dict.wiktionary.generated.u.f.o.*;
import org.swtk.commons.dict.wiktionary.generated.u.g.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.g.l.*;
import org.swtk.commons.dict.wiktionary.generated.u.h.l.*;
import org.swtk.commons.dict.wiktionary.generated.u.j.j.*;
import org.swtk.commons.dict.wiktionary.generated.u.k.e.*;
import org.swtk.commons.dict.wiktionary.generated.u.k.i.*;
import org.swtk.commons.dict.wiktionary.generated.u.k.r.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.c.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.n.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.s.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.t.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.u.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.u.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.m.b.*;
import org.swtk.commons.dict.wiktionary.generated.u.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.u.m.m.*;
import org.swtk.commons.dict.wiktionary.generated.u.m.p.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.b.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.c.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.d.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.f.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.g.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.h.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.j.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.k.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.l.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.m.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.n.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.p.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.q.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.r.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.s.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.t.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.u.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.v.*;
import org.swtk.commons.dict.wiktionary.generated.u.n.w.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.b.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.c.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.d.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.f.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.g.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.h.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.k.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.l.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.m.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.p.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.s.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.t.*;
import org.swtk.commons.dict.wiktionary.generated.u.p.w.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.b.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.c.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.g.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.m.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.r.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.s.*;
import org.swtk.commons.dict.wiktionary.generated.u.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.u.s.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.u.s.h.*;
import org.swtk.commons.dict.wiktionary.generated.u.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.u.s.q.*;
import org.swtk.commons.dict.wiktionary.generated.u.s.t.*;
import org.swtk.commons.dict.wiktionary.generated.u.s.u.*;
import org.swtk.commons.dict.wiktionary.generated.u.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.u.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.u.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.u.t.r.*;
import org.swtk.commons.dict.wiktionary.generated.u.t.t.*;
import org.swtk.commons.dict.wiktionary.generated.u.v.e.*;
import org.swtk.commons.dict.wiktionary.generated.u.x.o.*;
import org.swtk.commons.dict.wiktionary.generated.u.y.g.*;
import org.swtk.commons.dict.wiktionary.generated.u.z.h.*;

public final class WiktionaryDbU {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("ube".equals(sub))
			return WiktionaryUBE000.get(name);
		else if ("ubi".equals(sub))
			return WiktionaryUBI000.get(name);
		else if ("ubu".equals(sub))
			return WiktionaryUBU000.get(name);
		else if ("uck".equals(sub))
			return WiktionaryUCK000.get(name);
		else if ("uda".equals(sub))
			return WiktionaryUDA000.get(name);
		else if ("udd".equals(sub))
			return WiktionaryUDD000.get(name);
		else if ("udo".equals(sub))
			return WiktionaryUDO000.get(name);
		else if ("ufo".equals(sub))
			return WiktionaryUFO000.get(name);
		else if ("uga".equals(sub))
			return WiktionaryUGA000.get(name);
		else if ("ugl".equals(sub))
			return WiktionaryUGL000.get(name);
		else if ("uhl".equals(sub))
			return WiktionaryUHL000.get(name);
		else if ("ujj".equals(sub))
			return WiktionaryUJJ000.get(name);
		else if ("uke".equals(sub))
			return WiktionaryUKE000.get(name);
		else if ("uki".equals(sub))
			return WiktionaryUKI000.get(name);
		else if ("ukr".equals(sub))
			return WiktionaryUKR000.get(name);
		else if ("ula".equals(sub))
			return WiktionaryULA000.get(name);
		else if ("ulc".equals(sub))
			return WiktionaryULC000.get(name);
		else if ("uln".equals(sub))
			return WiktionaryULN000.get(name);
		else if ("ulo".equals(sub))
			return WiktionaryULO000.get(name);
		else if ("uls".equals(sub))
			return WiktionaryULS000.get(name);
		else if ("ult".equals(sub))
			return WiktionaryULT000.get(name);
		else if ("ulu".equals(sub))
			return WiktionaryULU000.get(name);
		else if ("uly".equals(sub))
			return WiktionaryULY000.get(name);
		else if ("uma".equals(sub))
			return WiktionaryUMA000.get(name);
		else if ("umb".equals(sub))
			return WiktionaryUMB000.get(name);
		else if ("ume".equals(sub))
			return WiktionaryUME000.get(name);
		else if ("umm".equals(sub))
			return WiktionaryUMM000.get(name);
		else if ("ump".equals(sub))
			return WiktionaryUMP000.get(name);
		else if ("una".equals(sub))
			return WiktionaryUNA000.get(name);
		else if ("unb".equals(sub))
			return WiktionaryUNB000.get(name);
		else if ("unc".equals(sub))
			return WiktionaryUNC000.get(name);
		else if ("und".equals(sub))
			return WiktionaryUND000.get(name);
		else if ("une".equals(sub))
			return WiktionaryUNE000.get(name);
		else if ("unf".equals(sub))
			return WiktionaryUNF000.get(name);
		else if ("ung".equals(sub))
			return WiktionaryUNG000.get(name);
		else if ("unh".equals(sub))
			return WiktionaryUNH000.get(name);
		else if ("uni".equals(sub))
			return WiktionaryUNI000.get(name);
		else if ("unj".equals(sub))
			return WiktionaryUNJ000.get(name);
		else if ("unk".equals(sub))
			return WiktionaryUNK000.get(name);
		else if ("unl".equals(sub))
			return WiktionaryUNL000.get(name);
		else if ("unm".equals(sub))
			return WiktionaryUNM000.get(name);
		else if ("unn".equals(sub))
			return WiktionaryUNN000.get(name);
		else if ("uno".equals(sub))
			return WiktionaryUNO000.get(name);
		else if ("unp".equals(sub))
			return WiktionaryUNP000.get(name);
		else if ("unq".equals(sub))
			return WiktionaryUNQ000.get(name);
		else if ("unr".equals(sub))
			return WiktionaryUNR000.get(name);
		else if ("uns".equals(sub))
			return WiktionaryUNS000.get(name);
		else if ("unt".equals(sub))
			return WiktionaryUNT000.get(name);
		else if ("unu".equals(sub))
			return WiktionaryUNU000.get(name);
		else if ("unv".equals(sub))
			return WiktionaryUNV000.get(name);
		else if ("unw".equals(sub))
			return WiktionaryUNW000.get(name);
		else if ("upb".equals(sub))
			return WiktionaryUPB000.get(name);
		else if ("upc".equals(sub))
			return WiktionaryUPC000.get(name);
		else if ("upd".equals(sub))
			return WiktionaryUPD000.get(name);
		else if ("upf".equals(sub))
			return WiktionaryUPF000.get(name);
		else if ("upg".equals(sub))
			return WiktionaryUPG000.get(name);
		else if ("uph".equals(sub))
			return WiktionaryUPH000.get(name);
		else if ("upk".equals(sub))
			return WiktionaryUPK000.get(name);
		else if ("upl".equals(sub))
			return WiktionaryUPL000.get(name);
		else if ("upm".equals(sub))
			return WiktionaryUPM000.get(name);
		else if ("upp".equals(sub))
			return WiktionaryUPP000.get(name);
		else if ("upr".equals(sub))
			return WiktionaryUPR000.get(name);
		else if ("ups".equals(sub))
			return WiktionaryUPS000.get(name);
		else if ("upt".equals(sub))
			return WiktionaryUPT000.get(name);
		else if ("upw".equals(sub))
			return WiktionaryUPW000.get(name);
		else if ("ura".equals(sub))
			return WiktionaryURA000.get(name);
		else if ("urb".equals(sub))
			return WiktionaryURB000.get(name);
		else if ("urc".equals(sub))
			return WiktionaryURC000.get(name);
		else if ("ure".equals(sub))
			return WiktionaryURE000.get(name);
		else if ("urg".equals(sub))
			return WiktionaryURG000.get(name);
		else if ("uri".equals(sub))
			return WiktionaryURI000.get(name);
		else if ("urm".equals(sub))
			return WiktionaryURM000.get(name);
		else if ("uro".equals(sub))
			return WiktionaryURO000.get(name);
		else if ("urr".equals(sub))
			return WiktionaryURR000.get(name);
		else if ("urs".equals(sub))
			return WiktionaryURS000.get(name);
		else if ("uru".equals(sub))
			return WiktionaryURU000.get(name);
		else if ("usa".equals(sub))
			return WiktionaryUSA000.get(name);
		else if ("use".equals(sub))
			return WiktionaryUSE000.get(name);
		else if ("ush".equals(sub))
			return WiktionaryUSH000.get(name);
		else if ("uso".equals(sub))
			return WiktionaryUSO000.get(name);
		else if ("usq".equals(sub))
			return WiktionaryUSQ000.get(name);
		else if ("ust".equals(sub))
			return WiktionaryUST000.get(name);
		else if ("usu".equals(sub))
			return WiktionaryUSU000.get(name);
		else if ("uta".equals(sub))
			return WiktionaryUTA000.get(name);
		else if ("uth".equals(sub))
			return WiktionaryUTH000.get(name);
		else if ("uti".equals(sub))
			return WiktionaryUTI000.get(name);
		else if ("utr".equals(sub))
			return WiktionaryUTR000.get(name);
		else if ("utt".equals(sub))
			return WiktionaryUTT000.get(name);
		else if ("uve".equals(sub))
			return WiktionaryUVE000.get(name);
		else if ("uxo".equals(sub))
			return WiktionaryUXO000.get(name);
		else if ("uyg".equals(sub))
			return WiktionaryUYG000.get(name);
		else if ("uzh".equals(sub))
			return WiktionaryUZH000.get(name);
		return null;
	}
}