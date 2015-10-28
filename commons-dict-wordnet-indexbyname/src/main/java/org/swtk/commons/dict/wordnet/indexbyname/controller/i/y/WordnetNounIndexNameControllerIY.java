package org.swtk.commons.dict.wordnet.indexbyname.controller.i.y;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.y.a.WordnetNounIndexNameInstanceIYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.y.y.WordnetNounIndexNameInstanceIYY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("iya".equals(key)) return WordnetNounIndexNameInstanceIYA.get(TERM);
	if ("iyy".equals(key)) return WordnetNounIndexNameInstanceIYY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIYA.terms());
	set.addAll(WordnetNounIndexNameInstanceIYY.terms());
  		return set; 	} }