package org.swtk.commons.dict.wordnet.indexbyname.controller.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.a.WordnetNounIndexNameInstanceEPA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.e.WordnetNounIndexNameInstanceEPE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.h.WordnetNounIndexNameInstanceEPH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.i.WordnetNounIndexNameInstanceEPI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.o.WordnetNounIndexNameInstanceEPO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.r.WordnetNounIndexNameInstanceEPR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.s.WordnetNounIndexNameInstanceEPS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.t.WordnetNounIndexNameInstanceEPT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEP {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("epa".equals(key)) return WordnetNounIndexNameInstanceEPA.get(TERM);
	if ("epe".equals(key)) return WordnetNounIndexNameInstanceEPE.get(TERM);
	if ("eph".equals(key)) return WordnetNounIndexNameInstanceEPH.get(TERM);
	if ("epi".equals(key)) return WordnetNounIndexNameInstanceEPI.get(TERM);
	if ("epo".equals(key)) return WordnetNounIndexNameInstanceEPO.get(TERM);
	if ("epr".equals(key)) return WordnetNounIndexNameInstanceEPR.get(TERM);
	if ("eps".equals(key)) return WordnetNounIndexNameInstanceEPS.get(TERM);
	if ("ept".equals(key)) return WordnetNounIndexNameInstanceEPT.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEPA.terms());
	set.addAll(WordnetNounIndexNameInstanceEPE.terms());
	set.addAll(WordnetNounIndexNameInstanceEPH.terms());
	set.addAll(WordnetNounIndexNameInstanceEPI.terms());
	set.addAll(WordnetNounIndexNameInstanceEPO.terms());
	set.addAll(WordnetNounIndexNameInstanceEPR.terms());
	set.addAll(WordnetNounIndexNameInstanceEPS.terms());
	set.addAll(WordnetNounIndexNameInstanceEPT.terms());
  		return set; 	} }