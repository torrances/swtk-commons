package org.swtk.commons.dict.wordnet.indexbyname.controller.u.i;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.i.g.WordnetNounIndexNameInstanceUIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.i.n.WordnetNounIndexNameInstanceUIN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("uig".equals(key)) return WordnetNounIndexNameInstanceUIG.get(TERM);
	if ("uin".equals(key)) return WordnetNounIndexNameInstanceUIN.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUIG.terms());
	set.addAll(WordnetNounIndexNameInstanceUIN.terms());
  		return set; 	} }