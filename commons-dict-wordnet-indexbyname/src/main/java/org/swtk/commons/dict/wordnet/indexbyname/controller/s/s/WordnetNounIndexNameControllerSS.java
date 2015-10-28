package org.swtk.commons.dict.wordnet.indexbyname.controller.s.s;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.s.p.WordnetNounIndexNameInstanceSSP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.s.r.WordnetNounIndexNameInstanceSSR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ssp".equals(key)) return WordnetNounIndexNameInstanceSSP.get(TERM);
	if ("ssr".equals(key)) return WordnetNounIndexNameInstanceSSR.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSSP.terms());
	set.addAll(WordnetNounIndexNameInstanceSSR.terms());
  		return set; 	} }