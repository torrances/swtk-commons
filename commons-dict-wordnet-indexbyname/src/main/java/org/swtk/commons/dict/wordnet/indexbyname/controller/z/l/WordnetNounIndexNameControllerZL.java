package org.swtk.commons.dict.wordnet.indexbyname.controller.z.l;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.l.o.WordnetNounIndexNameInstanceZLO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerZL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("zlo".equals(key)) return WordnetNounIndexNameInstanceZLO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceZLO.terms());
  		return set; 	} }