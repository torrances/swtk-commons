package org.swtk.commons.dict.wordnet.indexbyname.controller.t.z;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.z.a.WordnetNounIndexNameInstanceTZA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.z.e.WordnetNounIndexNameInstanceTZE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerTZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("tza".equals(key)) return WordnetNounIndexNameInstanceTZA.get(TERM);
	if ("tze".equals(key)) return WordnetNounIndexNameInstanceTZE.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceTZA.terms());
	set.addAll(WordnetNounIndexNameInstanceTZE.terms());
  		return set; 	} }