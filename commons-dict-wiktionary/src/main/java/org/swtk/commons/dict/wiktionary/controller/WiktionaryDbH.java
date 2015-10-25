package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.h.a.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.u.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.v.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.h.b.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.f.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.j.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.u.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.w.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.e.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.j.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.k.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.v.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.i.z.*;
import org.swtk.commons.dict.wiktionary.generated.h.j.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.h.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.j.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.v.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.o.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.r.y.*;
import org.swtk.commons.dict.wiktionary.generated.h.s.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.c.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.i.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.n.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.t.*;
import org.swtk.commons.dict.wiktionary.generated.h.u.x.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.a.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.b.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.d.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.e.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.g.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.l.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.m.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.o.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.p.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.r.*;
import org.swtk.commons.dict.wiktionary.generated.h.y.s.*;

public final class WiktionaryDbH {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("haa".equals(sub))
			return WiktionaryHAA000.get(name);
		else if ("hab".equals(sub))
			return WiktionaryHAB000.get(name);
		else if ("hac".equals(sub))
			return WiktionaryHAC000.get(name);
		else if ("had".equals(sub))
			return WiktionaryHAD000.get(name);
		else if ("hae".equals(sub))
			return WiktionaryHAE000.get(name);
		else if ("hag".equals(sub))
			return WiktionaryHAG000.get(name);
		else if ("hah".equals(sub))
			return WiktionaryHAH000.get(name);
		else if ("hai".equals(sub))
			return WiktionaryHAI000.get(name);
		else if ("hak".equals(sub))
			return WiktionaryHAK000.get(name);
		else if ("hal".equals(sub))
			return WiktionaryHAL000.get(name);
		else if ("ham".equals(sub))
			return WiktionaryHAM000.get(name);
		else if ("han".equals(sub))
			return WiktionaryHAN000.get(name);
		else if ("hao".equals(sub))
			return WiktionaryHAO000.get(name);
		else if ("hap".equals(sub))
			return WiktionaryHAP000.get(name);
		else if ("har".equals(sub))
			return WiktionaryHAR000.get(name);
		else if ("has".equals(sub))
			return WiktionaryHAS000.get(name);
		else if ("hat".equals(sub))
			return WiktionaryHAT000.get(name);
		else if ("hau".equals(sub))
			return WiktionaryHAU000.get(name);
		else if ("hav".equals(sub))
			return WiktionaryHAV000.get(name);
		else if ("haw".equals(sub))
			return WiktionaryHAW000.get(name);
		else if ("hax".equals(sub))
			return WiktionaryHAX000.get(name);
		else if ("hay".equals(sub))
			return WiktionaryHAY000.get(name);
		else if ("haz".equals(sub))
			return WiktionaryHAZ000.get(name);
		else if ("hbo".equals(sub))
			return WiktionaryHBO000.get(name);
		else if ("hea".equals(sub))
			return WiktionaryHEA000.get(name);
		else if ("heb".equals(sub))
			return WiktionaryHEB000.get(name);
		else if ("hec".equals(sub))
			return WiktionaryHEC000.get(name);
		else if ("hed".equals(sub))
			return WiktionaryHED000.get(name);
		else if ("hee".equals(sub))
			return WiktionaryHEE000.get(name);
		else if ("hef".equals(sub))
			return WiktionaryHEF000.get(name);
		else if ("heg".equals(sub))
			return WiktionaryHEG000.get(name);
		else if ("hei".equals(sub))
			return WiktionaryHEI000.get(name);
		else if ("hej".equals(sub))
			return WiktionaryHEJ000.get(name);
		else if ("hel".equals(sub))
			return WiktionaryHEL000.get(name);
		else if ("hem".equals(sub))
			return WiktionaryHEM000.get(name);
		else if ("hen".equals(sub))
			return WiktionaryHEN000.get(name);
		else if ("heo".equals(sub))
			return WiktionaryHEO000.get(name);
		else if ("hep".equals(sub))
			return WiktionaryHEP000.get(name);
		else if ("her".equals(sub))
			return WiktionaryHER000.get(name);
		else if ("hes".equals(sub))
			return WiktionaryHES000.get(name);
		else if ("het".equals(sub))
			return WiktionaryHET000.get(name);
		else if ("heu".equals(sub))
			return WiktionaryHEU000.get(name);
		else if ("hew".equals(sub))
			return WiktionaryHEW000.get(name);
		else if ("hex".equals(sub))
			return WiktionaryHEX000.get(name);
		else if ("hey".equals(sub))
			return WiktionaryHEY000.get(name);
		else if ("hia".equals(sub))
			return WiktionaryHIA000.get(name);
		else if ("hib".equals(sub))
			return WiktionaryHIB000.get(name);
		else if ("hic".equals(sub))
			return WiktionaryHIC000.get(name);
		else if ("hid".equals(sub))
			return WiktionaryHID000.get(name);
		else if ("hie".equals(sub))
			return WiktionaryHIE000.get(name);
		else if ("hig".equals(sub))
			return WiktionaryHIG000.get(name);
		else if ("hij".equals(sub))
			return WiktionaryHIJ000.get(name);
		else if ("hik".equals(sub))
			return WiktionaryHIK000.get(name);
		else if ("hil".equals(sub))
			return WiktionaryHIL000.get(name);
		else if ("him".equals(sub))
			return WiktionaryHIM000.get(name);
		else if ("hin".equals(sub))
			return WiktionaryHIN000.get(name);
		else if ("hip".equals(sub))
			return WiktionaryHIP000.get(name);
		else if ("hir".equals(sub))
			return WiktionaryHIR000.get(name);
		else if ("his".equals(sub))
			return WiktionaryHIS000.get(name);
		else if ("hit".equals(sub))
			return WiktionaryHIT000.get(name);
		else if ("hiv".equals(sub))
			return WiktionaryHIV000.get(name);
		else if ("hix".equals(sub))
			return WiktionaryHIX000.get(name);
		else if ("hiz".equals(sub))
			return WiktionaryHIZ000.get(name);
		else if ("hje".equals(sub))
			return WiktionaryHJE000.get(name);
		else if ("hoa".equals(sub))
			return WiktionaryHOA000.get(name);
		else if ("hob".equals(sub))
			return WiktionaryHOB000.get(name);
		else if ("hoc".equals(sub))
			return WiktionaryHOC000.get(name);
		else if ("hod".equals(sub))
			return WiktionaryHOD000.get(name);
		else if ("hoe".equals(sub))
			return WiktionaryHOE000.get(name);
		else if ("hog".equals(sub))
			return WiktionaryHOG000.get(name);
		else if ("hoh".equals(sub))
			return WiktionaryHOH000.get(name);
		else if ("hoi".equals(sub))
			return WiktionaryHOI000.get(name);
		else if ("hoj".equals(sub))
			return WiktionaryHOJ000.get(name);
		else if ("hok".equals(sub))
			return WiktionaryHOK000.get(name);
		else if ("hol".equals(sub))
			return WiktionaryHOL000.get(name);
		else if ("hom".equals(sub))
			return WiktionaryHOM000.get(name);
		else if ("hon".equals(sub))
			return WiktionaryHON000.get(name);
		else if ("hoo".equals(sub))
			return WiktionaryHOO000.get(name);
		else if ("hop".equals(sub))
			return WiktionaryHOP000.get(name);
		else if ("hor".equals(sub))
			return WiktionaryHOR000.get(name);
		else if ("hos".equals(sub))
			return WiktionaryHOS000.get(name);
		else if ("hot".equals(sub))
			return WiktionaryHOT000.get(name);
		else if ("hou".equals(sub))
			return WiktionaryHOU000.get(name);
		else if ("hov".equals(sub))
			return WiktionaryHOV000.get(name);
		else if ("how".equals(sub))
			return WiktionaryHOW000.get(name);
		else if ("hox".equals(sub))
			return WiktionaryHOX000.get(name);
		else if ("hoy".equals(sub))
			return WiktionaryHOY000.get(name);
		else if ("hry".equals(sub))
			return WiktionaryHRY000.get(name);
		else if ("hsi".equals(sub))
			return WiktionaryHSI000.get(name);
		else if ("hua".equals(sub))
			return WiktionaryHUA000.get(name);
		else if ("hub".equals(sub))
			return WiktionaryHUB000.get(name);
		else if ("huc".equals(sub))
			return WiktionaryHUC000.get(name);
		else if ("hue".equals(sub))
			return WiktionaryHUE000.get(name);
		else if ("hug".equals(sub))
			return WiktionaryHUG000.get(name);
		else if ("hui".equals(sub))
			return WiktionaryHUI000.get(name);
		else if ("hul".equals(sub))
			return WiktionaryHUL000.get(name);
		else if ("hum".equals(sub))
			return WiktionaryHUM000.get(name);
		else if ("hun".equals(sub))
			return WiktionaryHUN000.get(name);
		else if ("hup".equals(sub))
			return WiktionaryHUP000.get(name);
		else if ("hur".equals(sub))
			return WiktionaryHUR000.get(name);
		else if ("hus".equals(sub))
			return WiktionaryHUS000.get(name);
		else if ("hut".equals(sub))
			return WiktionaryHUT000.get(name);
		else if ("hux".equals(sub))
			return WiktionaryHUX000.get(name);
		else if ("hya".equals(sub))
			return WiktionaryHYA000.get(name);
		else if ("hyb".equals(sub))
			return WiktionaryHYB000.get(name);
		else if ("hyd".equals(sub))
			return WiktionaryHYD000.get(name);
		else if ("hye".equals(sub))
			return WiktionaryHYE000.get(name);
		else if ("hyg".equals(sub))
			return WiktionaryHYG000.get(name);
		else if ("hyl".equals(sub))
			return WiktionaryHYL000.get(name);
		else if ("hym".equals(sub))
			return WiktionaryHYM000.get(name);
		else if ("hyo".equals(sub))
			return WiktionaryHYO000.get(name);
		else if ("hyp".equals(sub))
			return WiktionaryHYP000.get(name);
		else if ("hyr".equals(sub))
			return WiktionaryHYR000.get(name);
		else if ("hys".equals(sub))
			return WiktionaryHYS000.get(name);
		return null;
	}
}