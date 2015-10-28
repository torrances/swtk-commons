package org.swtk.commons.dict.wordnet.indexbyname.controller.s.f;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.f.a.WordnetNounIndexNameInstanceSFA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.f.o.WordnetNounIndexNameInstanceSFO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSF {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("sfa".equals(key)) return WordnetNounIndexNameInstanceSFA.get(TERM);
	if ("sfo".equals(key)) return WordnetNounIndexNameInstanceSFO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSFA.terms());
	set.addAll(WordnetNounIndexNameInstanceSFO.terms());
  		return set; 	} }