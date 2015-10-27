package org.swtk.commons.dict.wordnet.index.name.controller.c.t;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.c.c.r.c.WordnetNounIndexNameInstanceCCRC;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ccrc".equals(key)) return WordnetNounIndexNameInstanceCCRC.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCCRC.terms());
  		return set; 	} }