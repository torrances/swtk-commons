package org.swtk.commons.dict.wordnet.index.name.controller.s.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.s.s.p.e.WordnetNounIndexNameInstanceSSPE;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.s.r.i.WordnetNounIndexNameInstanceSSRI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("sspe".equals(key)) return WordnetNounIndexNameInstanceSSPE.get(TERM);
	if ("ssri".equals(key)) return WordnetNounIndexNameInstanceSSRI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSSPE.terms());
	set.addAll(WordnetNounIndexNameInstanceSSRI.terms());
  		return set; 	} }