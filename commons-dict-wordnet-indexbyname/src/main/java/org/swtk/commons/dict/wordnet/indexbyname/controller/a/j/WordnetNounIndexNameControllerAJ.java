package org.swtk.commons.dict.wordnet.indexbyname.controller.a.j;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.j.a.WordnetNounIndexNameInstanceAJA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.j.u.WordnetNounIndexNameInstanceAJU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("aja".equals(key)) return WordnetNounIndexNameInstanceAJA.get(TERM);
	if ("aju".equals(key)) return WordnetNounIndexNameInstanceAJU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAJA.terms());
	set.addAll(WordnetNounIndexNameInstanceAJU.terms());
  		return set; 	} }