package org.swtk.commons.dict.wordnet.index.name.controller.l.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.l.h.a.s.WordnetNounIndexNameInstanceLHAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.l.h.o.t.WordnetNounIndexNameInstanceLHOT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("lhas".equals(key)) return WordnetNounIndexNameInstanceLHAS.get(TERM);
	if ("lhot".equals(key)) return WordnetNounIndexNameInstanceLHOT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLHAS.terms());
	set.addAll(WordnetNounIndexNameInstanceLHOT.terms());
  		return set; 	} }