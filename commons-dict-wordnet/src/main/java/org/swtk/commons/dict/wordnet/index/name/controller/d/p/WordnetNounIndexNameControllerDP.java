package org.swtk.commons.dict.wordnet.index.name.controller.d.p;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.d.p.h.i.WordnetNounIndexNameInstanceDPHI;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.p.r.k.WordnetNounIndexNameInstanceDPRK;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDP {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("dphi".equals(key)) return WordnetNounIndexNameInstanceDPHI.get(TERM);
	if ("dprk".equals(key)) return WordnetNounIndexNameInstanceDPRK.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDPHI.terms());
	set.addAll(WordnetNounIndexNameInstanceDPRK.terms());
  		return set; 	} }