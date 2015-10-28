package org.swtk.commons.dict.wordnet.indexbyname.controller.k.w;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.w.a.WordnetNounIndexNameInstanceKWA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.w.e.WordnetNounIndexNameInstanceKWE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("kwa".equals(key)) return WordnetNounIndexNameInstanceKWA.get(TERM);
	if ("kwe".equals(key)) return WordnetNounIndexNameInstanceKWE.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKWA.terms());
	set.addAll(WordnetNounIndexNameInstanceKWE.terms());
  		return set; 	} }