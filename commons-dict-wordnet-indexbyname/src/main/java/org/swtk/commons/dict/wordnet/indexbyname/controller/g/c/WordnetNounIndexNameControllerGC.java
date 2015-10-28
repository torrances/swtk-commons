package org.swtk.commons.dict.wordnet.indexbyname.controller.g.c;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.c.s.WordnetNounIndexNameInstanceGCS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGC {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("gcs".equals(key)) return WordnetNounIndexNameInstanceGCS.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGCS.terms());
  		return set; 	} }