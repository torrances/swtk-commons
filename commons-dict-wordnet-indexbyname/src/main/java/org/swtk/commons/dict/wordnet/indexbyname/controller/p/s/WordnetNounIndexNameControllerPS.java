package org.swtk.commons.dict.wordnet.indexbyname.controller.p.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.s.a.WordnetNounIndexNameInstancePSA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.s.e.WordnetNounIndexNameInstancePSE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.s.i.WordnetNounIndexNameInstancePSI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.s.o.WordnetNounIndexNameInstancePSO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.s.y.WordnetNounIndexNameInstancePSY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("psa".equals(key)) return WordnetNounIndexNameInstancePSA.get(TERM);
	if ("pse".equals(key)) return WordnetNounIndexNameInstancePSE.get(TERM);
	if ("psi".equals(key)) return WordnetNounIndexNameInstancePSI.get(TERM);
	if ("pso".equals(key)) return WordnetNounIndexNameInstancePSO.get(TERM);
	if ("psy".equals(key)) return WordnetNounIndexNameInstancePSY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePSA.terms());
	set.addAll(WordnetNounIndexNameInstancePSE.terms());
	set.addAll(WordnetNounIndexNameInstancePSI.terms());
	set.addAll(WordnetNounIndexNameInstancePSO.terms());
	set.addAll(WordnetNounIndexNameInstancePSY.terms());
  		return set; 	} }