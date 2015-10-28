package org.swtk.commons.dict.wordnet.indexbyname.controller.o.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.y.a.WordnetNounIndexNameInstanceOYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.y.s.WordnetNounIndexNameInstanceOYS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("oya".equals(key)) return WordnetNounIndexNameInstanceOYA.get(TERM);
	if ("oys".equals(key)) return WordnetNounIndexNameInstanceOYS.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOYA.terms());
	set.addAll(WordnetNounIndexNameInstanceOYS.terms());
  		return set; 	} }