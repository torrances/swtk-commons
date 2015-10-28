package org.swtk.commons.dict.wordnet.indexbyname.controller.e.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.z.e.WordnetNounIndexNameInstanceEZE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.z.r.WordnetNounIndexNameInstanceEZR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("eze".equals(key)) return WordnetNounIndexNameInstanceEZE.get(TERM);
	if ("ezr".equals(key)) return WordnetNounIndexNameInstanceEZR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEZE.terms());
	set.addAll(WordnetNounIndexNameInstanceEZR.terms());
  		return set; 	} }