package org.swtk.commons.dict.wordnet.index.name.controller.s.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.s.z.e.c.WordnetNounIndexNameInstanceSZEC;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.z.e.l.WordnetNounIndexNameInstanceSZEL;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.z.i.l.WordnetNounIndexNameInstanceSZIL;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("szec".equals(key)) return WordnetNounIndexNameInstanceSZEC.get(TERM);
	if ("szel".equals(key)) return WordnetNounIndexNameInstanceSZEL.get(TERM);
	if ("szil".equals(key)) return WordnetNounIndexNameInstanceSZIL.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSZEC.terms());
	set.addAll(WordnetNounIndexNameInstanceSZEL.terms());
	set.addAll(WordnetNounIndexNameInstanceSZIL.terms());
  		return set; 	} }