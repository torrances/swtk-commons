package org.swtk.commons.dict.wordnet.indexbyname.controller.x.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.a.n.WordnetNounIndexNameInstanceXAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.a.v.WordnetNounIndexNameInstanceXAV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xan".equals(key)) return WordnetNounIndexNameInstanceXAN.get(TERM);
	if ("xav".equals(key)) return WordnetNounIndexNameInstanceXAV.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXAN.terms());
	set.addAll(WordnetNounIndexNameInstanceXAV.terms());
  		return set; 	} }