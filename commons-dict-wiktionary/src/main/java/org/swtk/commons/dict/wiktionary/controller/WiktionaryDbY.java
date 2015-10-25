package org.swtk.commons.dict.wiktionary.controller;

import org.swtk.common.dict.dto.wiktionary.Entry;
import org.swtk.commons.dict.wiktionary.generated.y.a.c.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.f.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.h.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.k.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.l.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.m.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.n.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.o.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.p.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.r.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.s.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.t.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.w.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.y.*;
import org.swtk.commons.dict.wiktionary.generated.y.a.z.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.a.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.g.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.h.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.l.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.n.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.o.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.r.*;
import org.swtk.commons.dict.wiktionary.generated.y.e.s.*;
import org.swtk.commons.dict.wiktionary.generated.y.i.d.*;
import org.swtk.commons.dict.wiktionary.generated.y.i.e.*;
import org.swtk.commons.dict.wiktionary.generated.y.i.p.*;
import org.swtk.commons.dict.wiktionary.generated.y.l.e.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.b.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.d.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.g.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.k.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.m.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.n.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.r.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.t.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.u.*;
import org.swtk.commons.dict.wiktionary.generated.y.o.w.*;
import org.swtk.commons.dict.wiktionary.generated.y.p.r.*;
import org.swtk.commons.dict.wiktionary.generated.y.t.t.*;
import org.swtk.commons.dict.wiktionary.generated.y.u.b.*;
import org.swtk.commons.dict.wiktionary.generated.y.u.g.*;
import org.swtk.commons.dict.wiktionary.generated.y.u.k.*;
import org.swtk.commons.dict.wiktionary.generated.y.u.l.*;
import org.swtk.commons.dict.wiktionary.generated.y.u.p.*;
import org.swtk.commons.dict.wiktionary.generated.y.u.r.*;
import org.swtk.commons.dict.wiktionary.generated.y.u.s.*;
import org.swtk.commons.dict.wiktionary.generated.y.v.o.*;

public final class WiktionaryDbY {
	public static Entry findByName(String name) {
		if (name.length() < 4)
			return null;
		String sub = name.substring(0, 3).toLowerCase();
		if ("yac".equals(sub))
			return WiktionaryYAC000.get(name);
		else if ("yaf".equals(sub))
			return WiktionaryYAF000.get(name);
		else if ("yah".equals(sub))
			return WiktionaryYAH000.get(name);
		else if ("yak".equals(sub))
			return WiktionaryYAK000.get(name);
		else if ("yal".equals(sub))
			return WiktionaryYAL000.get(name);
		else if ("yam".equals(sub))
			return WiktionaryYAM000.get(name);
		else if ("yan".equals(sub))
			return WiktionaryYAN000.get(name);
		else if ("yao".equals(sub))
			return WiktionaryYAO000.get(name);
		else if ("yap".equals(sub))
			return WiktionaryYAP000.get(name);
		else if ("yar".equals(sub))
			return WiktionaryYAR000.get(name);
		else if ("yas".equals(sub))
			return WiktionaryYAS000.get(name);
		else if ("yat".equals(sub))
			return WiktionaryYAT000.get(name);
		else if ("yaw".equals(sub))
			return WiktionaryYAW000.get(name);
		else if ("yay".equals(sub))
			return WiktionaryYAY000.get(name);
		else if ("yaz".equals(sub))
			return WiktionaryYAZ000.get(name);
		else if ("yea".equals(sub))
			return WiktionaryYEA000.get(name);
		else if ("yeg".equals(sub))
			return WiktionaryYEG000.get(name);
		else if ("yeh".equals(sub))
			return WiktionaryYEH000.get(name);
		else if ("yel".equals(sub))
			return WiktionaryYEL000.get(name);
		else if ("yen".equals(sub))
			return WiktionaryYEN000.get(name);
		else if ("yeo".equals(sub))
			return WiktionaryYEO000.get(name);
		else if ("yer".equals(sub))
			return WiktionaryYER000.get(name);
		else if ("yes".equals(sub))
			return WiktionaryYES000.get(name);
		else if ("yid".equals(sub))
			return WiktionaryYID000.get(name);
		else if ("yie".equals(sub))
			return WiktionaryYIE000.get(name);
		else if ("yip".equals(sub))
			return WiktionaryYIP000.get(name);
		else if ("yle".equals(sub))
			return WiktionaryYLE000.get(name);
		else if ("yob".equals(sub))
			return WiktionaryYOB000.get(name);
		else if ("yod".equals(sub))
			return WiktionaryYOD000.get(name);
		else if ("yog".equals(sub))
			return WiktionaryYOG000.get(name);
		else if ("yok".equals(sub))
			return WiktionaryYOK000.get(name);
		else if ("yom".equals(sub))
			return WiktionaryYOM000.get(name);
		else if ("yon".equals(sub))
			return WiktionaryYON000.get(name);
		else if ("yor".equals(sub))
			return WiktionaryYOR000.get(name);
		else if ("yot".equals(sub))
			return WiktionaryYOT000.get(name);
		else if ("you".equals(sub))
			return WiktionaryYOU000.get(name);
		else if ("yow".equals(sub))
			return WiktionaryYOW000.get(name);
		else if ("ypr".equals(sub))
			return WiktionaryYPR000.get(name);
		else if ("ytt".equals(sub))
			return WiktionaryYTT000.get(name);
		else if ("yub".equals(sub))
			return WiktionaryYUB000.get(name);
		else if ("yug".equals(sub))
			return WiktionaryYUG000.get(name);
		else if ("yuk".equals(sub))
			return WiktionaryYUK000.get(name);
		else if ("yul".equals(sub))
			return WiktionaryYUL000.get(name);
		else if ("yup".equals(sub))
			return WiktionaryYUP000.get(name);
		else if ("yur".equals(sub))
			return WiktionaryYUR000.get(name);
		else if ("yus".equals(sub))
			return WiktionaryYUS000.get(name);
		else if ("yvo".equals(sub))
			return WiktionaryYVO000.get(name);
		return null;
	}
}