package org.swtk.commons.dict.wordnet.indexbyname.controller.a.q;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.q.a.WordnetNounIndexNameInstanceAQA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.q.u.WordnetNounIndexNameInstanceAQU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAQ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("aqa".equals(key)) return WordnetNounIndexNameInstanceAQA.get(TERM);
	if ("aqu".equals(key)) return WordnetNounIndexNameInstanceAQU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAQA.terms());
	set.addAll(WordnetNounIndexNameInstanceAQU.terms());
  		return set; 	} }