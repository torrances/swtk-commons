package org.swtk.commons.dict.wordnet.indexbyname.controller.y.h;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.h.v.WordnetNounIndexNameInstanceYHV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.h.w.WordnetNounIndexNameInstanceYHW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("yhv".equals(key)) return WordnetNounIndexNameInstanceYHV.get(TERM);
	if ("yhw".equals(key)) return WordnetNounIndexNameInstanceYHW.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYHV.terms());
	set.addAll(WordnetNounIndexNameInstanceYHW.terms());
  		return set; 	} }