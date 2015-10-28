package org.swtk.commons.dict.wordnet.indexbyname.controller.m.s;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.s.a.WordnetNounIndexNameInstanceMSA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.s.e.WordnetNounIndexNameInstanceMSE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("msa".equals(key)) return WordnetNounIndexNameInstanceMSA.get(TERM);
	if ("mse".equals(key)) return WordnetNounIndexNameInstanceMSE.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMSA.terms());
	set.addAll(WordnetNounIndexNameInstanceMSE.terms());
  		return set; 	} }