package org.swtk.commons.dict.wordnet.indexbyname.controller.b.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.h.a.WordnetNounIndexNameInstanceBHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.h.u.WordnetNounIndexNameInstanceBHU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("bha".equals(key)) return WordnetNounIndexNameInstanceBHA.get(TERM);
	if ("bhu".equals(key)) return WordnetNounIndexNameInstanceBHU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBHA.terms());
	set.addAll(WordnetNounIndexNameInstanceBHU.terms());
  		return set; 	} }