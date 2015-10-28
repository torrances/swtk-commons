package org.swtk.commons.dict.wordnet.indexbyname.controller.e.e;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.e.l.WordnetNounIndexNameInstanceEEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.e.r.WordnetNounIndexNameInstanceEER;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("eel".equals(key)) return WordnetNounIndexNameInstanceEEL.get(TERM);
	if ("eer".equals(key)) return WordnetNounIndexNameInstanceEER.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEEL.terms());
	set.addAll(WordnetNounIndexNameInstanceEER.terms());
  		return set; 	} }