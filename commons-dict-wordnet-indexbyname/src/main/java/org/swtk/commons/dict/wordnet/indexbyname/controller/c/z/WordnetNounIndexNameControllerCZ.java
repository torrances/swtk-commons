package org.swtk.commons.dict.wordnet.indexbyname.controller.c.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.z.a.WordnetNounIndexNameInstanceCZA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.z.e.WordnetNounIndexNameInstanceCZE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("cza".equals(key)) return WordnetNounIndexNameInstanceCZA.get(TERM);
	if ("cze".equals(key)) return WordnetNounIndexNameInstanceCZE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCZA.terms());
	set.addAll(WordnetNounIndexNameInstanceCZE.terms());
  		return set; 	} }