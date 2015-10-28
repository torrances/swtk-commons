package org.swtk.commons.dict.wordnet.indexbyname.controller.l.x;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.x.x.WordnetNounIndexNameInstanceLXX;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLX {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("lxx".equals(key)) return WordnetNounIndexNameInstanceLXX.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLXX.terms());
  		return set; 	} }