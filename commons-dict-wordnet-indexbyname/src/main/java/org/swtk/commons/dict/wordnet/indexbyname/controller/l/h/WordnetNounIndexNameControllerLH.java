package org.swtk.commons.dict.wordnet.indexbyname.controller.l.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.h.a.WordnetNounIndexNameInstanceLHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.h.o.WordnetNounIndexNameInstanceLHO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("lha".equals(key)) return WordnetNounIndexNameInstanceLHA.get(TERM);
	if ("lho".equals(key)) return WordnetNounIndexNameInstanceLHO.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLHA.terms());
	set.addAll(WordnetNounIndexNameInstanceLHO.terms());
  		return set; 	} }