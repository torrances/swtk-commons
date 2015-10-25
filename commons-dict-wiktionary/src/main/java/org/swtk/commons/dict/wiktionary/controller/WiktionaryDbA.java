package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.a.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.j.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.x.*;
import org.swtk.commons.dict.wiktionary.generated.a.b.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.q.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.c.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.j.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.d.z.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.q.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.e.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.f.z.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.g.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.h.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.i.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.j.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.k.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.j.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.w.*;
import org.swtk.commons.dict.wiktionary.generated.a.l.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.m.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.x.*;
import org.swtk.commons.dict.wiktionary.generated.a.n.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.p.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.q.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.q.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.u.*;
import org.swtk.commons.dict.wiktionary.generated.a.s.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.m.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.p.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.t.y.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.d.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.f.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.v.*;
import org.swtk.commons.dict.wiktionary.generated.a.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.g.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.v.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.k.*;
import org.swtk.commons.dict.wiktionary.generated.a.w.n.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.h.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.x.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.a.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.b.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.e.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.i.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.l.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.o.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.t.*;
import org.swtk.commons.dict.wiktionary.generated.a.z.u.*;

public final class WiktionaryDbA {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("aac".equals(sub))
			return WiktionaryAAC000.get(name);
		else if ("aad".equals(sub))
			return WiktionaryAAD000.get(name);
		else if ("aal".equals(sub))
			return WiktionaryAAL000.get(name);
		else if ("aan".equals(sub))
			return WiktionaryAAN000.get(name);
		else if ("aar".equals(sub))
			return WiktionaryAAR000.get(name);
		else if ("aba".equals(sub))
			return WiktionaryABA000.get(name);
		else if ("abb".equals(sub))
			return WiktionaryABB000.get(name);
		else if ("abd".equals(sub))
			return WiktionaryABD000.get(name);
		else if ("abe".equals(sub))
			return WiktionaryABE000.get(name);
		else if ("abf".equals(sub))
			return WiktionaryABF000.get(name);
		else if ("abg".equals(sub))
			return WiktionaryABG000.get(name);
		else if ("abh".equals(sub))
			return WiktionaryABH000.get(name);
		else if ("abi".equals(sub))
			return WiktionaryABI000.get(name);
		else if ("abj".equals(sub))
			return WiktionaryABJ000.get(name);
		else if ("abk".equals(sub))
			return WiktionaryABK000.get(name);
		else if ("abl".equals(sub))
			return WiktionaryABL000.get(name);
		else if ("abm".equals(sub))
			return WiktionaryABM000.get(name);
		else if ("abn".equals(sub))
			return WiktionaryABN000.get(name);
		else if ("abo".equals(sub))
			return WiktionaryABO000.get(name);
		else if ("abr".equals(sub))
			return WiktionaryABR000.get(name);
		else if ("abs".equals(sub))
			return WiktionaryABS000.get(name);
		else if ("abu".equals(sub))
			return WiktionaryABU000.get(name);
		else if ("abv".equals(sub))
			return WiktionaryABV000.get(name);
		else if ("abw".equals(sub))
			return WiktionaryABW000.get(name);
		else if ("abx".equals(sub))
			return WiktionaryABX000.get(name);
		else if ("aby".equals(sub))
			return WiktionaryABY000.get(name);
		else if ("aca".equals(sub))
			return WiktionaryACA000.get(name);
		else if ("acc".equals(sub))
			return WiktionaryACC000.get(name);
		else if ("ace".equals(sub))
			return WiktionaryACE000.get(name);
		else if ("ach".equals(sub))
			return WiktionaryACH000.get(name);
		else if ("aci".equals(sub))
			return WiktionaryACI000.get(name);
		else if ("ack".equals(sub))
			return WiktionaryACK000.get(name);
		else if ("acl".equals(sub))
			return WiktionaryACL000.get(name);
		else if ("acm".equals(sub))
			return WiktionaryACM000.get(name);
		else if ("aco".equals(sub))
			return WiktionaryACO000.get(name);
		else if ("acq".equals(sub))
			return WiktionaryACQ000.get(name);
		else if ("acr".equals(sub))
			return WiktionaryACR000.get(name);
		else if ("act".equals(sub))
			return WiktionaryACT000.get(name);
		else if ("acu".equals(sub))
			return WiktionaryACU000.get(name);
		else if ("acy".equals(sub))
			return WiktionaryACY000.get(name);
		else if ("ada".equals(sub))
			return WiktionaryADA000.get(name);
		else if ("add".equals(sub))
			return WiktionaryADD000.get(name);
		else if ("ade".equals(sub))
			return WiktionaryADE000.get(name);
		else if ("adh".equals(sub))
			return WiktionaryADH000.get(name);
		else if ("adi".equals(sub))
			return WiktionaryADI000.get(name);
		else if ("adj".equals(sub))
			return WiktionaryADJ000.get(name);
		else if ("adl".equals(sub))
			return WiktionaryADL000.get(name);
		else if ("adm".equals(sub))
			return WiktionaryADM000.get(name);
		else if ("adn".equals(sub))
			return WiktionaryADN000.get(name);
		else if ("ado".equals(sub))
			return WiktionaryADO000.get(name);
		else if ("adp".equals(sub))
			return WiktionaryADP000.get(name);
		else if ("adr".equals(sub))
			return WiktionaryADR000.get(name);
		else if ("ads".equals(sub))
			return WiktionaryADS000.get(name);
		else if ("adu".equals(sub))
			return WiktionaryADU000.get(name);
		else if ("adv".equals(sub))
			return WiktionaryADV000.get(name);
		else if ("adw".equals(sub))
			return WiktionaryADW000.get(name);
		else if ("ady".equals(sub))
			return WiktionaryADY000.get(name);
		else if ("adz".equals(sub))
			return WiktionaryADZ000.get(name);
		else if ("aea".equals(sub))
			return WiktionaryAEA000.get(name);
		else if ("aec".equals(sub))
			return WiktionaryAEC000.get(name);
		else if ("aed".equals(sub))
			return WiktionaryAED000.get(name);
		else if ("aeg".equals(sub))
			return WiktionaryAEG000.get(name);
		else if ("aen".equals(sub))
			return WiktionaryAEN000.get(name);
		else if ("aeo".equals(sub))
			return WiktionaryAEO000.get(name);
		else if ("aeq".equals(sub))
			return WiktionaryAEQ000.get(name);
		else if ("aer".equals(sub))
			return WiktionaryAER000.get(name);
		else if ("aes".equals(sub))
			return WiktionaryAES000.get(name);
		else if ("aet".equals(sub))
			return WiktionaryAET000.get(name);
		else if ("aev".equals(sub))
			return WiktionaryAEV000.get(name);
		else if ("afc".equals(sub))
			return WiktionaryAFC000.get(name);
		else if ("aff".equals(sub))
			return WiktionaryAFF000.get(name);
		else if ("afg".equals(sub))
			return WiktionaryAFG000.get(name);
		else if ("afi".equals(sub))
			return WiktionaryAFI000.get(name);
		else if ("afl".equals(sub))
			return WiktionaryAFL000.get(name);
		else if ("afo".equals(sub))
			return WiktionaryAFO000.get(name);
		else if ("afr".equals(sub))
			return WiktionaryAFR000.get(name);
		else if ("aft".equals(sub))
			return WiktionaryAFT000.get(name);
		else if ("afz".equals(sub))
			return WiktionaryAFZ000.get(name);
		else if ("aga".equals(sub))
			return WiktionaryAGA000.get(name);
		else if ("agd".equals(sub))
			return WiktionaryAGD000.get(name);
		else if ("age".equals(sub))
			return WiktionaryAGE000.get(name);
		else if ("agf".equals(sub))
			return WiktionaryAGF000.get(name);
		else if ("agg".equals(sub))
			return WiktionaryAGG000.get(name);
		else if ("agi".equals(sub))
			return WiktionaryAGI000.get(name);
		else if ("agl".equals(sub))
			return WiktionaryAGL000.get(name);
		else if ("agn".equals(sub))
			return WiktionaryAGN000.get(name);
		else if ("ago".equals(sub))
			return WiktionaryAGO000.get(name);
		else if ("agr".equals(sub))
			return WiktionaryAGR000.get(name);
		else if ("agu".equals(sub))
			return WiktionaryAGU000.get(name);
		else if ("aha".equals(sub))
			return WiktionaryAHA000.get(name);
		else if ("ahi".equals(sub))
			return WiktionaryAHI000.get(name);
		else if ("ahl".equals(sub))
			return WiktionaryAHL000.get(name);
		else if ("ahm".equals(sub))
			return WiktionaryAHM000.get(name);
		else if ("aho".equals(sub))
			return WiktionaryAHO000.get(name);
		else if ("ahw".equals(sub))
			return WiktionaryAHW000.get(name);
		else if ("aib".equals(sub))
			return WiktionaryAIB000.get(name);
		else if ("aic".equals(sub))
			return WiktionaryAIC000.get(name);
		else if ("aid".equals(sub))
			return WiktionaryAID000.get(name);
		else if ("aig".equals(sub))
			return WiktionaryAIG000.get(name);
		else if ("ail".equals(sub))
			return WiktionaryAIL000.get(name);
		else if ("aim".equals(sub))
			return WiktionaryAIM000.get(name);
		else if ("ain".equals(sub))
			return WiktionaryAIN000.get(name);
		else if ("aio".equals(sub))
			return WiktionaryAIO000.get(name);
		else if ("air".equals(sub))
			return WiktionaryAIR000.get(name);
		else if ("ait".equals(sub))
			return WiktionaryAIT000.get(name);
		else if ("aiw".equals(sub))
			return WiktionaryAIW000.get(name);
		else if ("aja".equals(sub))
			return WiktionaryAJA000.get(name);
		else if ("ajm".equals(sub))
			return WiktionaryAJM000.get(name);
		else if ("ajo".equals(sub))
			return WiktionaryAJO000.get(name);
		else if ("ajv".equals(sub))
			return WiktionaryAJV000.get(name);
		else if ("aka".equals(sub))
			return WiktionaryAKA000.get(name);
		else if ("akh".equals(sub))
			return WiktionaryAKH000.get(name);
		else if ("ako".equals(sub))
			return WiktionaryAKO000.get(name);
		else if ("aks".equals(sub))
			return WiktionaryAKS000.get(name);
		else if ("aku".equals(sub))
			return WiktionaryAKU000.get(name);
		else if ("ala".equals(sub))
			return WiktionaryALA000.get(name);
		else if ("alb".equals(sub))
			return WiktionaryALB000.get(name);
		else if ("alc".equals(sub))
			return WiktionaryALC000.get(name);
		else if ("ald".equals(sub))
			return WiktionaryALD000.get(name);
		else if ("ale".equals(sub))
			return WiktionaryALE000.get(name);
		else if ("alf".equals(sub))
			return WiktionaryALF000.get(name);
		else if ("alg".equals(sub))
			return WiktionaryALG000.get(name);
		else if ("alh".equals(sub))
			return WiktionaryALH000.get(name);
		else if ("ali".equals(sub))
			return WiktionaryALI000.get(name);
		else if ("alj".equals(sub))
			return WiktionaryALJ000.get(name);
		else if ("alk".equals(sub))
			return WiktionaryALK000.get(name);
		else if ("all".equals(sub))
			return WiktionaryALL000.get(name);
		else if ("alm".equals(sub))
			return WiktionaryALM000.get(name);
		else if ("alo".equals(sub))
			return WiktionaryALO000.get(name);
		else if ("alp".equals(sub))
			return WiktionaryALP000.get(name);
		else if ("alr".equals(sub))
			return WiktionaryALR000.get(name);
		else if ("als".equals(sub))
			return WiktionaryALS000.get(name);
		else if ("alt".equals(sub))
			return WiktionaryALT000.get(name);
		else if ("alu".equals(sub))
			return WiktionaryALU000.get(name);
		else if ("alv".equals(sub))
			return WiktionaryALV000.get(name);
		else if ("alw".equals(sub))
			return WiktionaryALW000.get(name);
		else if ("aly".equals(sub))
			return WiktionaryALY000.get(name);
		else if ("ama".equals(sub))
			return WiktionaryAMA000.get(name);
		else if ("amb".equals(sub))
			return WiktionaryAMB000.get(name);
		else if ("ame".equals(sub))
			return WiktionaryAME000.get(name);
		else if ("amf".equals(sub))
			return WiktionaryAMF000.get(name);
		else if ("amh".equals(sub))
			return WiktionaryAMH000.get(name);
		else if ("ami".equals(sub))
			return WiktionaryAMI000.get(name);
		else if ("aml".equals(sub))
			return WiktionaryAML000.get(name);
		else if ("amm".equals(sub))
			return WiktionaryAMM000.get(name);
		else if ("amn".equals(sub))
			return WiktionaryAMN000.get(name);
		else if ("amo".equals(sub))
			return WiktionaryAMO000.get(name);
		else if ("amp".equals(sub))
			return WiktionaryAMP000.get(name);
		else if ("amr".equals(sub))
			return WiktionaryAMR000.get(name);
		else if ("ams".equals(sub))
			return WiktionaryAMS000.get(name);
		else if ("amt".equals(sub))
			return WiktionaryAMT000.get(name);
		else if ("amu".equals(sub))
			return WiktionaryAMU000.get(name);
		else if ("amy".equals(sub))
			return WiktionaryAMY000.get(name);
		else if ("ana".equals(sub))
			return WiktionaryANA000.get(name);
		else if ("anc".equals(sub))
			return WiktionaryANC000.get(name);
		else if ("and".equals(sub))
			return WiktionaryAND000.get(name);
		else if ("ane".equals(sub))
			return WiktionaryANE000.get(name);
		else if ("anf".equals(sub))
			return WiktionaryANF000.get(name);
		else if ("ang".equals(sub))
			return WiktionaryANG000.get(name);
		else if ("anh".equals(sub))
			return WiktionaryANH000.get(name);
		else if ("ani".equals(sub))
			return WiktionaryANI000.get(name);
		else if ("ank".equals(sub))
			return WiktionaryANK000.get(name);
		else if ("anl".equals(sub))
			return WiktionaryANL000.get(name);
		else if ("ann".equals(sub))
			return WiktionaryANN000.get(name);
		else if ("ano".equals(sub))
			return WiktionaryANO000.get(name);
		else if ("ans".equals(sub))
			return WiktionaryANS000.get(name);
		else if ("ant".equals(sub))
			return WiktionaryANT000.get(name);
		else if ("anu".equals(sub))
			return WiktionaryANU000.get(name);
		else if ("anx".equals(sub))
			return WiktionaryANX000.get(name);
		else if ("any".equals(sub))
			return WiktionaryANY000.get(name);
		else if ("aor".equals(sub))
			return WiktionaryAOR000.get(name);
		else if ("aot".equals(sub))
			return WiktionaryAOT000.get(name);
		else if ("apa".equals(sub))
			return WiktionaryAPA000.get(name);
		else if ("ape".equals(sub))
			return WiktionaryAPE000.get(name);
		else if ("apf".equals(sub))
			return WiktionaryAPF000.get(name);
		else if ("aph".equals(sub))
			return WiktionaryAPH000.get(name);
		else if ("api".equals(sub))
			return WiktionaryAPI000.get(name);
		else if ("apl".equals(sub))
			return WiktionaryAPL000.get(name);
		else if ("apn".equals(sub))
			return WiktionaryAPN000.get(name);
		else if ("apo".equals(sub))
			return WiktionaryAPO000.get(name);
		else if ("app".equals(sub))
			return WiktionaryAPP000.get(name);
		else if ("apr".equals(sub))
			return WiktionaryAPR000.get(name);
		else if ("aps".equals(sub))
			return WiktionaryAPS000.get(name);
		else if ("apt".equals(sub))
			return WiktionaryAPT000.get(name);
		else if ("apu".equals(sub))
			return WiktionaryAPU000.get(name);
		else if ("apy".equals(sub))
			return WiktionaryAPY000.get(name);
		else if ("aqu".equals(sub))
			return WiktionaryAQU000.get(name);
		else if ("ara".equals(sub))
			return WiktionaryARA000.get(name);
		else if ("arb".equals(sub))
			return WiktionaryARB000.get(name);
		else if ("arc".equals(sub))
			return WiktionaryARC000.get(name);
		else if ("ard".equals(sub))
			return WiktionaryARD000.get(name);
		else if ("are".equals(sub))
			return WiktionaryARE000.get(name);
		else if ("arf".equals(sub))
			return WiktionaryARF000.get(name);
		else if ("arg".equals(sub))
			return WiktionaryARG000.get(name);
		else if ("arh".equals(sub))
			return WiktionaryARH000.get(name);
		else if ("ari".equals(sub))
			return WiktionaryARI000.get(name);
		else if ("ark".equals(sub))
			return WiktionaryARK000.get(name);
		else if ("arm".equals(sub))
			return WiktionaryARM000.get(name);
		else if ("arn".equals(sub))
			return WiktionaryARN000.get(name);
		else if ("aro".equals(sub))
			return WiktionaryARO000.get(name);
		else if ("arp".equals(sub))
			return WiktionaryARP000.get(name);
		else if ("arq".equals(sub))
			return WiktionaryARQ000.get(name);
		else if ("arr".equals(sub))
			return WiktionaryARR000.get(name);
		else if ("ars".equals(sub))
			return WiktionaryARS000.get(name);
		else if ("art".equals(sub))
			return WiktionaryART000.get(name);
		else if ("aru".equals(sub))
			return WiktionaryARU000.get(name);
		else if ("arv".equals(sub))
			return WiktionaryARV000.get(name);
		else if ("ary".equals(sub))
			return WiktionaryARY000.get(name);
		else if ("asa".equals(sub))
			return WiktionaryASA000.get(name);
		else if ("asb".equals(sub))
			return WiktionaryASB000.get(name);
		else if ("asc".equals(sub))
			return WiktionaryASC000.get(name);
		else if ("ase".equals(sub))
			return WiktionaryASE000.get(name);
		else if ("ash".equals(sub))
			return WiktionaryASH000.get(name);
		else if ("asi".equals(sub))
			return WiktionaryASI000.get(name);
		else if ("ask".equals(sub))
			return WiktionaryASK000.get(name);
		else if ("aso".equals(sub))
			return WiktionaryASO000.get(name);
		else if ("asp".equals(sub))
			return WiktionaryASP000.get(name);
		else if ("ass".equals(sub))
			return WiktionaryASS000.get(name);
		else if ("ast".equals(sub))
			return WiktionaryAST000.get(name);
		else if ("asu".equals(sub))
			return WiktionaryASU000.get(name);
		else if ("asy".equals(sub))
			return WiktionaryASY000.get(name);
		else if ("ata".equals(sub))
			return WiktionaryATA000.get(name);
		else if ("ate".equals(sub))
			return WiktionaryATE000.get(name);
		else if ("ath".equals(sub))
			return WiktionaryATH000.get(name);
		else if ("ati".equals(sub))
			return WiktionaryATI000.get(name);
		else if ("atl".equals(sub))
			return WiktionaryATL000.get(name);
		else if ("atm".equals(sub))
			return WiktionaryATM000.get(name);
		else if ("ato".equals(sub))
			return WiktionaryATO000.get(name);
		else if ("atp".equals(sub))
			return WiktionaryATP000.get(name);
		else if ("atr".equals(sub))
			return WiktionaryATR000.get(name);
		else if ("att".equals(sub))
			return WiktionaryATT000.get(name);
		else if ("aty".equals(sub))
			return WiktionaryATY000.get(name);
		else if ("aub".equals(sub))
			return WiktionaryAUB000.get(name);
		else if ("auc".equals(sub))
			return WiktionaryAUC000.get(name);
		else if ("aud".equals(sub))
			return WiktionaryAUD000.get(name);
		else if ("auf".equals(sub))
			return WiktionaryAUF000.get(name);
		else if ("aug".equals(sub))
			return WiktionaryAUG000.get(name);
		else if ("auk".equals(sub))
			return WiktionaryAUK000.get(name);
		else if ("aul".equals(sub))
			return WiktionaryAUL000.get(name);
		else if ("aun".equals(sub))
			return WiktionaryAUN000.get(name);
		else if ("aur".equals(sub))
			return WiktionaryAUR000.get(name);
		else if ("aus".equals(sub))
			return WiktionaryAUS000.get(name);
		else if ("aut".equals(sub))
			return WiktionaryAUT000.get(name);
		else if ("auv".equals(sub))
			return WiktionaryAUV000.get(name);
		else if ("aux".equals(sub))
			return WiktionaryAUX000.get(name);
		else if ("ava".equals(sub))
			return WiktionaryAVA000.get(name);
		else if ("ave".equals(sub))
			return WiktionaryAVE000.get(name);
		else if ("avg".equals(sub))
			return WiktionaryAVG000.get(name);
		else if ("avi".equals(sub))
			return WiktionaryAVI000.get(name);
		else if ("avl".equals(sub))
			return WiktionaryAVL000.get(name);
		else if ("avo".equals(sub))
			return WiktionaryAVO000.get(name);
		else if ("awa".equals(sub))
			return WiktionaryAWA000.get(name);
		else if ("awe".equals(sub))
			return WiktionaryAWE000.get(name);
		else if ("awk".equals(sub))
			return WiktionaryAWK000.get(name);
		else if ("awn".equals(sub))
			return WiktionaryAWN000.get(name);
		else if ("axh".equals(sub))
			return WiktionaryAXH000.get(name);
		else if ("axi".equals(sub))
			return WiktionaryAXI000.get(name);
		else if ("axl".equals(sub))
			return WiktionaryAXL000.get(name);
		else if ("axo".equals(sub))
			return WiktionaryAXO000.get(name);
		else if ("aya".equals(sub))
			return WiktionaryAYA000.get(name);
		else if ("ayr".equals(sub))
			return WiktionaryAYR000.get(name);
		else if ("aza".equals(sub))
			return WiktionaryAZA000.get(name);
		else if ("azb".equals(sub))
			return WiktionaryAZB000.get(name);
		else if ("aze".equals(sub))
			return WiktionaryAZE000.get(name);
		else if ("azi".equals(sub))
			return WiktionaryAZI000.get(name);
		else if ("azl".equals(sub))
			return WiktionaryAZL000.get(name);
		else if ("azo".equals(sub))
			return WiktionaryAZO000.get(name);
		else if ("azt".equals(sub))
			return WiktionaryAZT000.get(name);
		else if ("azu".equals(sub))
			return WiktionaryAZU000.get(name);
		return null;
	}
}