package org.swtk.commons.dict.wordnet.index.name.controller.m.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.m.s.a.s.WordnetNounIndexNameInstanceMSAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.s.e.c.WordnetNounIndexNameInstanceMSEC;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("msas".equals(key)) return WordnetNounIndexNameInstanceMSAS.get(TERM);
	if ("msec".equals(key)) return WordnetNounIndexNameInstanceMSEC.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMSAS.terms());
	set.addAll(WordnetNounIndexNameInstanceMSEC.terms());
  		return set; 	} }