package org.swtk.commons.dict.wordnet.indexbyname.controller.b.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.s.a.WordnetNounIndexNameInstanceBSA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("bsa".equals(key)) return WordnetNounIndexNameInstanceBSA.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBSA.terms());
  		return set; 	} }