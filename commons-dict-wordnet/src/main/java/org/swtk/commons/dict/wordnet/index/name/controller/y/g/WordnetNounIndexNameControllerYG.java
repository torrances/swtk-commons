package org.swtk.commons.dict.wordnet.index.name.controller.y.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.y.g.d.r.WordnetNounIndexNameInstanceYGDR;
	import org.swtk.commons.dict.wordnet.index.name.instance.y.g.g.d.WordnetNounIndexNameInstanceYGGD;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ygdr".equals(key)) return WordnetNounIndexNameInstanceYGDR.get(TERM);
	if ("yggd".equals(key)) return WordnetNounIndexNameInstanceYGGD.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYGDR.terms());
	set.addAll(WordnetNounIndexNameInstanceYGGD.terms());
  		return set; 	} }