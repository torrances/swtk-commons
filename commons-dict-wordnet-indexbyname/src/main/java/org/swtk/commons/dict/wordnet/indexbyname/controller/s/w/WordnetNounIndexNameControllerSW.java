package org.swtk.commons.dict.wordnet.indexbyname.controller.s.w;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.w.a.WordnetNounIndexNameInstanceSWA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.w.b.WordnetNounIndexNameInstanceSWB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.w.e.WordnetNounIndexNameInstanceSWE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.w.i.WordnetNounIndexNameInstanceSWI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.w.o.WordnetNounIndexNameInstanceSWO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("swa".equals(key)) return WordnetNounIndexNameInstanceSWA.get(TERM);
	if ("swb".equals(key)) return WordnetNounIndexNameInstanceSWB.get(TERM);
	if ("swe".equals(key)) return WordnetNounIndexNameInstanceSWE.get(TERM);
	if ("swi".equals(key)) return WordnetNounIndexNameInstanceSWI.get(TERM);
	if ("swo".equals(key)) return WordnetNounIndexNameInstanceSWO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSWA.terms());
	set.addAll(WordnetNounIndexNameInstanceSWB.terms());
	set.addAll(WordnetNounIndexNameInstanceSWE.terms());
	set.addAll(WordnetNounIndexNameInstanceSWI.terms());
	set.addAll(WordnetNounIndexNameInstanceSWO.terms());
  		return set; 	} }