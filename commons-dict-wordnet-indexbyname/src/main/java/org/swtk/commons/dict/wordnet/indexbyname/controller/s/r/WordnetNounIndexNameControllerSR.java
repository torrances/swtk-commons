package org.swtk.commons.dict.wordnet.indexbyname.controller.s.r;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.r.a.WordnetNounIndexNameInstanceSRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.r.b.WordnetNounIndexNameInstanceSRB;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("sra".equals(key)) return WordnetNounIndexNameInstanceSRA.get(TERM);
	if ("srb".equals(key)) return WordnetNounIndexNameInstanceSRB.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSRA.terms());
	set.addAll(WordnetNounIndexNameInstanceSRB.terms());
  		return set; 	} }