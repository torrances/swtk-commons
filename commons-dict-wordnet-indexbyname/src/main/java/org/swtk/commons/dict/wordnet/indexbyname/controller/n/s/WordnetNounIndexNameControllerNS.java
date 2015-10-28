package org.swtk.commons.dict.wordnet.indexbyname.controller.n.s;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.s.a.WordnetNounIndexNameInstanceNSA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.s.w.WordnetNounIndexNameInstanceNSW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("nsa".equals(key)) return WordnetNounIndexNameInstanceNSA.get(TERM);
	if ("nsw".equals(key)) return WordnetNounIndexNameInstanceNSW.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNSA.terms());
	set.addAll(WordnetNounIndexNameInstanceNSW.terms());
  		return set; 	} }