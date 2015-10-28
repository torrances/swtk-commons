package org.swtk.commons.dict.wordnet.indexbyname.controller.g.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.a.WordnetNounIndexNameInstanceGEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.c.WordnetNounIndexNameInstanceGEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.e.WordnetNounIndexNameInstanceGEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.g.WordnetNounIndexNameInstanceGEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.h.WordnetNounIndexNameInstanceGEH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.i.WordnetNounIndexNameInstanceGEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.k.WordnetNounIndexNameInstanceGEK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.l.WordnetNounIndexNameInstanceGEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.m.WordnetNounIndexNameInstanceGEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.n.WordnetNounIndexNameInstanceGEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.o.WordnetNounIndexNameInstanceGEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.r.WordnetNounIndexNameInstanceGER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.s.WordnetNounIndexNameInstanceGES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.t.WordnetNounIndexNameInstanceGET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.u.WordnetNounIndexNameInstanceGEU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.w.WordnetNounIndexNameInstanceGEW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.y.WordnetNounIndexNameInstanceGEY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("gea".equals(key)) return WordnetNounIndexNameInstanceGEA.get(TERM);
	if ("gec".equals(key)) return WordnetNounIndexNameInstanceGEC.get(TERM);
	if ("gee".equals(key)) return WordnetNounIndexNameInstanceGEE.get(TERM);
	if ("geg".equals(key)) return WordnetNounIndexNameInstanceGEG.get(TERM);
	if ("geh".equals(key)) return WordnetNounIndexNameInstanceGEH.get(TERM);
	if ("gei".equals(key)) return WordnetNounIndexNameInstanceGEI.get(TERM);
	if ("gek".equals(key)) return WordnetNounIndexNameInstanceGEK.get(TERM);
	if ("gel".equals(key)) return WordnetNounIndexNameInstanceGEL.get(TERM);
	if ("gem".equals(key)) return WordnetNounIndexNameInstanceGEM.get(TERM);
	if ("gen".equals(key)) return WordnetNounIndexNameInstanceGEN.get(TERM);
	if ("geo".equals(key)) return WordnetNounIndexNameInstanceGEO.get(TERM);
	if ("ger".equals(key)) return WordnetNounIndexNameInstanceGER.get(TERM);
	if ("ges".equals(key)) return WordnetNounIndexNameInstanceGES.get(TERM);
	if ("get".equals(key)) return WordnetNounIndexNameInstanceGET.get(TERM);
	if ("geu".equals(key)) return WordnetNounIndexNameInstanceGEU.get(TERM);
	if ("gew".equals(key)) return WordnetNounIndexNameInstanceGEW.get(TERM);
	if ("gey".equals(key)) return WordnetNounIndexNameInstanceGEY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGEA.terms());
	set.addAll(WordnetNounIndexNameInstanceGEC.terms());
	set.addAll(WordnetNounIndexNameInstanceGEE.terms());
	set.addAll(WordnetNounIndexNameInstanceGEG.terms());
	set.addAll(WordnetNounIndexNameInstanceGEH.terms());
	set.addAll(WordnetNounIndexNameInstanceGEI.terms());
	set.addAll(WordnetNounIndexNameInstanceGEK.terms());
	set.addAll(WordnetNounIndexNameInstanceGEL.terms());
	set.addAll(WordnetNounIndexNameInstanceGEM.terms());
	set.addAll(WordnetNounIndexNameInstanceGEN.terms());
	set.addAll(WordnetNounIndexNameInstanceGEO.terms());
	set.addAll(WordnetNounIndexNameInstanceGER.terms());
	set.addAll(WordnetNounIndexNameInstanceGES.terms());
	set.addAll(WordnetNounIndexNameInstanceGET.terms());
	set.addAll(WordnetNounIndexNameInstanceGEU.terms());
	set.addAll(WordnetNounIndexNameInstanceGEW.terms());
	set.addAll(WordnetNounIndexNameInstanceGEY.terms());
  		return set; 	} }