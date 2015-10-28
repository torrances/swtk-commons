package org.swtk.commons.dict.wordnet.indexbyname.controller.s.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.z.e.WordnetNounIndexNameInstanceSZE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.z.i.WordnetNounIndexNameInstanceSZI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("sze".equals(key)) return WordnetNounIndexNameInstanceSZE.get(TERM);
	if ("szi".equals(key)) return WordnetNounIndexNameInstanceSZI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSZE.terms());
	set.addAll(WordnetNounIndexNameInstanceSZI.terms());
  		return set; 	} }