package org.swtk.commons.dict.wordnet.index.name.controller.m.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.m.w.a.n.WordnetNounIndexNameInstanceMWAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.w.e.r.WordnetNounIndexNameInstanceMWER;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mwan".equals(key)) return WordnetNounIndexNameInstanceMWAN.get(TERM);
	if ("mwer".equals(key)) return WordnetNounIndexNameInstanceMWER.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMWAN.terms());
	set.addAll(WordnetNounIndexNameInstanceMWER.terms());
  		return set; 	} }