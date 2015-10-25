package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.p.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.j.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.p.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.p.d.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.k.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.p.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.l.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.r.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.t.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.u.*;
import org.swtk.commons.dict.wiktionary.generated.p.h.y.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.f.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.q.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.p.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.p.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.p.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.p.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.p.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.p.o.z.*;
import org.swtk.commons.dict.wiktionary.generated.p.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.p.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.p.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.p.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.s.y.*;
import org.swtk.commons.dict.wiktionary.generated.p.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.p.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.p.t.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.t.y.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.j.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.p.u.z.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.c.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.g.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.i.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.k.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.s.*;
import org.swtk.commons.dict.wiktionary.generated.p.y.t.*;

public final class WiktionaryDbP {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("pab".equals(sub))
			return WiktionaryPAB000.get(name);
		else if ("pac".equals(sub))
			return WiktionaryPAC000.get(name);
		else if ("pad".equals(sub))
			return WiktionaryPAD000.get(name);
		else if ("pae".equals(sub))
			return WiktionaryPAE000.get(name);
		else if ("pag".equals(sub))
			return WiktionaryPAG000.get(name);
		else if ("pah".equals(sub))
			return WiktionaryPAH000.get(name);
		else if ("pai".equals(sub))
			return WiktionaryPAI000.get(name);
		else if ("paj".equals(sub))
			return WiktionaryPAJ000.get(name);
		else if ("pal".equals(sub))
			return WiktionaryPAL000.get(name);
		else if ("pam".equals(sub))
			return WiktionaryPAM000.get(name);
		else if ("pan".equals(sub))
			return WiktionaryPAN000.get(name);
		else if ("pap".equals(sub))
			return WiktionaryPAP000.get(name);
		else if ("par".equals(sub))
			return WiktionaryPAR000.get(name);
		else if ("pas".equals(sub))
			return WiktionaryPAS000.get(name);
		else if ("pat".equals(sub))
			return WiktionaryPAT000.get(name);
		else if ("pau".equals(sub))
			return WiktionaryPAU000.get(name);
		else if ("pav".equals(sub))
			return WiktionaryPAV000.get(name);
		else if ("paw".equals(sub))
			return WiktionaryPAW000.get(name);
		else if ("pay".equals(sub))
			return WiktionaryPAY000.get(name);
		else if ("pdc".equals(sub))
			return WiktionaryPDC000.get(name);
		else if ("pea".equals(sub))
			return WiktionaryPEA000.get(name);
		else if ("peb".equals(sub))
			return WiktionaryPEB000.get(name);
		else if ("pec".equals(sub))
			return WiktionaryPEC000.get(name);
		else if ("ped".equals(sub))
			return WiktionaryPED000.get(name);
		else if ("pee".equals(sub))
			return WiktionaryPEE000.get(name);
		else if ("peg".equals(sub))
			return WiktionaryPEG000.get(name);
		else if ("pei".equals(sub))
			return WiktionaryPEI000.get(name);
		else if ("pek".equals(sub))
			return WiktionaryPEK000.get(name);
		else if ("pel".equals(sub))
			return WiktionaryPEL000.get(name);
		else if ("pem".equals(sub))
			return WiktionaryPEM000.get(name);
		else if ("pen".equals(sub))
			return WiktionaryPEN000.get(name);
		else if ("peo".equals(sub))
			return WiktionaryPEO000.get(name);
		else if ("pep".equals(sub))
			return WiktionaryPEP000.get(name);
		else if ("peq".equals(sub))
			return WiktionaryPEQ000.get(name);
		else if ("per".equals(sub))
			return WiktionaryPER000.get(name);
		else if ("pes".equals(sub))
			return WiktionaryPES000.get(name);
		else if ("pet".equals(sub))
			return WiktionaryPET000.get(name);
		else if ("peu".equals(sub))
			return WiktionaryPEU000.get(name);
		else if ("pew".equals(sub))
			return WiktionaryPEW000.get(name);
		else if ("pex".equals(sub))
			return WiktionaryPEX000.get(name);
		else if ("pey".equals(sub))
			return WiktionaryPEY000.get(name);
		else if ("pha".equals(sub))
			return WiktionaryPHA000.get(name);
		else if ("phe".equals(sub))
			return WiktionaryPHE000.get(name);
		else if ("phi".equals(sub))
			return WiktionaryPHI000.get(name);
		else if ("phl".equals(sub))
			return WiktionaryPHL000.get(name);
		else if ("pho".equals(sub))
			return WiktionaryPHO000.get(name);
		else if ("phr".equals(sub))
			return WiktionaryPHR000.get(name);
		else if ("pht".equals(sub))
			return WiktionaryPHT000.get(name);
		else if ("phu".equals(sub))
			return WiktionaryPHU000.get(name);
		else if ("phy".equals(sub))
			return WiktionaryPHY000.get(name);
		else if ("pia".equals(sub))
			return WiktionaryPIA000.get(name);
		else if ("pib".equals(sub))
			return WiktionaryPIB000.get(name);
		else if ("pic".equals(sub))
			return WiktionaryPIC000.get(name);
		else if ("pid".equals(sub))
			return WiktionaryPID000.get(name);
		else if ("pie".equals(sub))
			return WiktionaryPIE000.get(name);
		else if ("pif".equals(sub))
			return WiktionaryPIF000.get(name);
		else if ("pig".equals(sub))
			return WiktionaryPIG000.get(name);
		else if ("pij".equals(sub))
			return WiktionaryPIJ000.get(name);
		else if ("pik".equals(sub))
			return WiktionaryPIK000.get(name);
		else if ("pil".equals(sub))
			return WiktionaryPIL000.get(name);
		else if ("pim".equals(sub))
			return WiktionaryPIM000.get(name);
		else if ("pin".equals(sub))
			return WiktionaryPIN000.get(name);
		else if ("pio".equals(sub))
			return WiktionaryPIO000.get(name);
		else if ("pip".equals(sub))
			return WiktionaryPIP000.get(name);
		else if ("piq".equals(sub))
			return WiktionaryPIQ000.get(name);
		else if ("pir".equals(sub))
			return WiktionaryPIR000.get(name);
		else if ("pis".equals(sub))
			return WiktionaryPIS000.get(name);
		else if ("pit".equals(sub))
			return WiktionaryPIT000.get(name);
		else if ("piv".equals(sub))
			return WiktionaryPIV000.get(name);
		else if ("pix".equals(sub))
			return WiktionaryPIX000.get(name);
		else if ("piz".equals(sub))
			return WiktionaryPIZ000.get(name);
		else if ("pla".equals(sub))
			return WiktionaryPLA000.get(name);
		else if ("ple".equals(sub))
			return WiktionaryPLE000.get(name);
		else if ("pli".equals(sub))
			return WiktionaryPLI000.get(name);
		else if ("plo".equals(sub))
			return WiktionaryPLO000.get(name);
		else if ("plu".equals(sub))
			return WiktionaryPLU000.get(name);
		else if ("ply".equals(sub))
			return WiktionaryPLY000.get(name);
		else if ("pne".equals(sub))
			return WiktionaryPNE000.get(name);
		else if ("pni".equals(sub))
			return WiktionaryPNI000.get(name);
		else if ("poa".equals(sub))
			return WiktionaryPOA000.get(name);
		else if ("poc".equals(sub))
			return WiktionaryPOC000.get(name);
		else if ("pod".equals(sub))
			return WiktionaryPOD000.get(name);
		else if ("poe".equals(sub))
			return WiktionaryPOE000.get(name);
		else if ("pog".equals(sub))
			return WiktionaryPOG000.get(name);
		else if ("poh".equals(sub))
			return WiktionaryPOH000.get(name);
		else if ("poi".equals(sub))
			return WiktionaryPOI000.get(name);
		else if ("pok".equals(sub))
			return WiktionaryPOK000.get(name);
		else if ("pol".equals(sub))
			return WiktionaryPOL000.get(name);
		else if ("pom".equals(sub))
			return WiktionaryPOM000.get(name);
		else if ("pon".equals(sub))
			return WiktionaryPON000.get(name);
		else if ("poo".equals(sub))
			return WiktionaryPOO000.get(name);
		else if ("pop".equals(sub))
			return WiktionaryPOP000.get(name);
		else if ("por".equals(sub))
			return WiktionaryPOR000.get(name);
		else if ("pos".equals(sub))
			return WiktionaryPOS000.get(name);
		else if ("pot".equals(sub))
			return WiktionaryPOT000.get(name);
		else if ("pou".equals(sub))
			return WiktionaryPOU000.get(name);
		else if ("pov".equals(sub))
			return WiktionaryPOV000.get(name);
		else if ("pow".equals(sub))
			return WiktionaryPOW000.get(name);
		else if ("poz".equals(sub))
			return WiktionaryPOZ000.get(name);
		else if ("pra".equals(sub))
			return WiktionaryPRA000.get(name);
		else if ("pre".equals(sub))
			return WiktionaryPRE000.get(name);
		else if ("pri".equals(sub))
			return WiktionaryPRI000.get(name);
		else if ("pro".equals(sub))
			return WiktionaryPRO000.get(name);
		else if ("pru".equals(sub))
			return WiktionaryPRU000.get(name);
		else if ("pry".equals(sub))
			return WiktionaryPRY000.get(name);
		else if ("psc".equals(sub))
			return WiktionaryPSC000.get(name);
		else if ("pse".equals(sub))
			return WiktionaryPSE000.get(name);
		else if ("psi".equals(sub))
			return WiktionaryPSI000.get(name);
		else if ("pso".equals(sub))
			return WiktionaryPSO000.get(name);
		else if ("psy".equals(sub))
			return WiktionaryPSY000.get(name);
		else if ("pta".equals(sub))
			return WiktionaryPTA000.get(name);
		else if ("pte".equals(sub))
			return WiktionaryPTE000.get(name);
		else if ("pth".equals(sub))
			return WiktionaryPTH000.get(name);
		else if ("pto".equals(sub))
			return WiktionaryPTO000.get(name);
		else if ("pty".equals(sub))
			return WiktionaryPTY000.get(name);
		else if ("pub".equals(sub))
			return WiktionaryPUB000.get(name);
		else if ("puc".equals(sub))
			return WiktionaryPUC000.get(name);
		else if ("pud".equals(sub))
			return WiktionaryPUD000.get(name);
		else if ("pue".equals(sub))
			return WiktionaryPUE000.get(name);
		else if ("puf".equals(sub))
			return WiktionaryPUF000.get(name);
		else if ("pug".equals(sub))
			return WiktionaryPUG000.get(name);
		else if ("pui".equals(sub))
			return WiktionaryPUI000.get(name);
		else if ("puj".equals(sub))
			return WiktionaryPUJ000.get(name);
		else if ("puk".equals(sub))
			return WiktionaryPUK000.get(name);
		else if ("pul".equals(sub))
			return WiktionaryPUL000.get(name);
		else if ("pum".equals(sub))
			return WiktionaryPUM000.get(name);
		else if ("pun".equals(sub))
			return WiktionaryPUN000.get(name);
		else if ("pup".equals(sub))
			return WiktionaryPUP000.get(name);
		else if ("pur".equals(sub))
			return WiktionaryPUR000.get(name);
		else if ("pus".equals(sub))
			return WiktionaryPUS000.get(name);
		else if ("put".equals(sub))
			return WiktionaryPUT000.get(name);
		else if ("puz".equals(sub))
			return WiktionaryPUZ000.get(name);
		else if ("pyc".equals(sub))
			return WiktionaryPYC000.get(name);
		else if ("pye".equals(sub))
			return WiktionaryPYE000.get(name);
		else if ("pyg".equals(sub))
			return WiktionaryPYG000.get(name);
		else if ("pyi".equals(sub))
			return WiktionaryPYI000.get(name);
		else if ("pyk".equals(sub))
			return WiktionaryPYK000.get(name);
		else if ("pyo".equals(sub))
			return WiktionaryPYO000.get(name);
		else if ("pyr".equals(sub))
			return WiktionaryPYR000.get(name);
		else if ("pys".equals(sub))
			return WiktionaryPYS000.get(name);
		else if ("pyt".equals(sub))
			return WiktionaryPYT000.get(name);
		return null;
	}
}