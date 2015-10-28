package org.swtk.commons.dict.wordnet.indexbyname.controller.u.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.k.a.WordnetNounIndexNameInstanceUKA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.k.r.WordnetNounIndexNameInstanceUKR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.k.u.WordnetNounIndexNameInstanceUKU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUK {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("uka".equals(key)) return WordnetNounIndexNameInstanceUKA.get(TERM);
	if ("ukr".equals(key)) return WordnetNounIndexNameInstanceUKR.get(TERM);
	if ("uku".equals(key)) return WordnetNounIndexNameInstanceUKU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUKA.terms());
	set.addAll(WordnetNounIndexNameInstanceUKR.terms());
	set.addAll(WordnetNounIndexNameInstanceUKU.terms());
  		return set; 	} }