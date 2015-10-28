package org.swtk.commons.dict.wordnet.indexbyname.controller.v.u;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.u.i.WordnetNounIndexNameInstanceVUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.u.l.WordnetNounIndexNameInstanceVUL;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerVU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("vui".equals(key)) return WordnetNounIndexNameInstanceVUI.get(TERM);
	if ("vul".equals(key)) return WordnetNounIndexNameInstanceVUL.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceVUI.terms());
	set.addAll(WordnetNounIndexNameInstanceVUL.terms());
  		return set; 	} }