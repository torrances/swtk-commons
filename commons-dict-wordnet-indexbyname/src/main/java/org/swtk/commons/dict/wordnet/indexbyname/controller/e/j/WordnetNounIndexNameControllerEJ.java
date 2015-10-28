package org.swtk.commons.dict.wordnet.indexbyname.controller.e.j;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.j.a.WordnetNounIndexNameInstanceEJA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.j.e.WordnetNounIndexNameInstanceEJE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("eja".equals(key)) return WordnetNounIndexNameInstanceEJA.get(TERM);
	if ("eje".equals(key)) return WordnetNounIndexNameInstanceEJE.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEJA.terms());
	set.addAll(WordnetNounIndexNameInstanceEJE.terms());
  		return set; 	} }