package org.swtk.commons.dict.wordnet.indexbyname.controller.d.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.h.a.WordnetNounIndexNameInstanceDHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.h.e.WordnetNounIndexNameInstanceDHE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.h.o.WordnetNounIndexNameInstanceDHO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("dha".equals(key)) return WordnetNounIndexNameInstanceDHA.get(TERM);
	if ("dhe".equals(key)) return WordnetNounIndexNameInstanceDHE.get(TERM);
	if ("dho".equals(key)) return WordnetNounIndexNameInstanceDHO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDHA.terms());
	set.addAll(WordnetNounIndexNameInstanceDHE.terms());
	set.addAll(WordnetNounIndexNameInstanceDHO.terms());
  		return set; 	} }