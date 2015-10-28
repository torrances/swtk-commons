package org.swtk.commons.dict.wordnet.indexbyname.controller.e.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.h.a.WordnetNounIndexNameInstanceEHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.h.r.WordnetNounIndexNameInstanceEHR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("eha".equals(key)) return WordnetNounIndexNameInstanceEHA.get(TERM);
	if ("ehr".equals(key)) return WordnetNounIndexNameInstanceEHR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEHA.terms());
	set.addAll(WordnetNounIndexNameInstanceEHR.terms());
  		return set; 	} }