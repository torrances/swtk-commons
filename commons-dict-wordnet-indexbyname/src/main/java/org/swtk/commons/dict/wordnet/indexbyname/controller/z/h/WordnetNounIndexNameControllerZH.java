package org.swtk.commons.dict.wordnet.indexbyname.controller.z.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.h.o.WordnetNounIndexNameInstanceZHO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.h.u.WordnetNounIndexNameInstanceZHU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerZH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("zho".equals(key)) return WordnetNounIndexNameInstanceZHO.get(TERM);
	if ("zhu".equals(key)) return WordnetNounIndexNameInstanceZHU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceZHO.terms());
	set.addAll(WordnetNounIndexNameInstanceZHU.terms());
  		return set; 	} }