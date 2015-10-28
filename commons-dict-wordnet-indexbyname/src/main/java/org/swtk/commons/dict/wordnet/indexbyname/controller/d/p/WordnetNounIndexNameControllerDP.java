package org.swtk.commons.dict.wordnet.indexbyname.controller.d.p;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.p.h.WordnetNounIndexNameInstanceDPH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.p.r.WordnetNounIndexNameInstanceDPR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDP {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("dph".equals(key)) return WordnetNounIndexNameInstanceDPH.get(TERM);
	if ("dpr".equals(key)) return WordnetNounIndexNameInstanceDPR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDPH.terms());
	set.addAll(WordnetNounIndexNameInstanceDPR.terms());
  		return set; 	} }