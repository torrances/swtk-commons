package org.swtk.commons.dict.wordnet.index.name.controller.s.f;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.s.f.a.x.WordnetNounIndexNameInstanceSFAX;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.f.o.r.WordnetNounIndexNameInstanceSFOR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSF {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("sfax".equals(key)) return WordnetNounIndexNameInstanceSFAX.get(TERM);
	if ("sfor".equals(key)) return WordnetNounIndexNameInstanceSFOR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSFAX.terms());
	set.addAll(WordnetNounIndexNameInstanceSFOR.terms());
  		return set; 	} }