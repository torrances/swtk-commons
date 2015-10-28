package org.swtk.commons.dict.wordnet.indexbyname.controller.m.w;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.w.a.WordnetNounIndexNameInstanceMWA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.w.e.WordnetNounIndexNameInstanceMWE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("mwa".equals(key)) return WordnetNounIndexNameInstanceMWA.get(TERM);
	if ("mwe".equals(key)) return WordnetNounIndexNameInstanceMWE.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMWA.terms());
	set.addAll(WordnetNounIndexNameInstanceMWE.terms());
  		return set; 	} }