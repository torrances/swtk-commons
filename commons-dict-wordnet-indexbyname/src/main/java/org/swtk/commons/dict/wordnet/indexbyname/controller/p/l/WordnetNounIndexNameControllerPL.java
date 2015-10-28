package org.swtk.commons.dict.wordnet.indexbyname.controller.p.l;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import org.swtk.common.dict.dto.wordnet.IndexNoun;
import org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.a.WordnetNounIndexNameInstancePLA;
import org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.e.WordnetNounIndexNameInstancePLE;
import org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.i.WordnetNounIndexNameInstancePLI;
import org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.o.WordnetNounIndexNameInstancePLO;
import org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.u.WordnetNounIndexNameInstancePLU;
import org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.y.WordnetNounIndexNameInstancePLY;
import org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.z.WordnetNounIndexNameInstancePLZ;

import com.trimc.blogger.commons.exception.BusinessException;

public final class WordnetNounIndexNameControllerPL {
	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {
		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM);
		String key = TERM.substring(0, 3).toLowerCase();
		if ("pla".equals(key)) return WordnetNounIndexNameInstancePLA.get(TERM);
		if ("ple".equals(key)) return WordnetNounIndexNameInstancePLE.get(TERM);
		if ("pli".equals(key)) return WordnetNounIndexNameInstancePLI.get(TERM);
		if ("plo".equals(key)) return WordnetNounIndexNameInstancePLO.get(TERM);
		if ("plu".equals(key)) return WordnetNounIndexNameInstancePLU.get(TERM);
		if ("ply".equals(key)) return WordnetNounIndexNameInstancePLY.get(TERM);
		if ("plz".equals(key)) return WordnetNounIndexNameInstancePLZ.get(TERM);
		throw new BusinessException("TERM not found (term = %s)", TERM);
	}

	public static Collection<String> terms() throws BusinessException {
		Set<String> set = new TreeSet<String>();
		set.addAll(WordnetNounIndexNameInstancePLA.terms());
		set.addAll(WordnetNounIndexNameInstancePLE.terms());
		set.addAll(WordnetNounIndexNameInstancePLI.terms());
		set.addAll(WordnetNounIndexNameInstancePLO.terms());
		set.addAll(WordnetNounIndexNameInstancePLU.terms());
		set.addAll(WordnetNounIndexNameInstancePLY.terms());
		set.addAll(WordnetNounIndexNameInstancePLZ.terms());
		return set;
	}
}