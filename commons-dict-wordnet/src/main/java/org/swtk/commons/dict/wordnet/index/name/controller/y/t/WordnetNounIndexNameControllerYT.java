package org.swtk.commons.dict.wordnet.index.name.controller.y.t;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.y.t.t.e.WordnetNounIndexNameInstanceYTTE;
	import org.swtk.commons.dict.wordnet.index.name.instance.y.t.t.r.WordnetNounIndexNameInstanceYTTR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ytte".equals(key)) return WordnetNounIndexNameInstanceYTTE.get(TERM);
	if ("yttr".equals(key)) return WordnetNounIndexNameInstanceYTTR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYTTE.terms());
	set.addAll(WordnetNounIndexNameInstanceYTTR.terms());
  		return set; 	} }