package org.swtk.commons.dict.wordnet.indexbyname.controller.s.g;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.g.m.WordnetNounIndexNameInstanceSGM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.g.r.WordnetNounIndexNameInstanceSGR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("sgm".equals(key)) return WordnetNounIndexNameInstanceSGM.get(TERM);
	if ("sgr".equals(key)) return WordnetNounIndexNameInstanceSGR.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSGM.terms());
	set.addAll(WordnetNounIndexNameInstanceSGR.terms());
  		return set; 	} }