package org.swtk.commons.dict.wordnet.indexbyname.controller.y.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.g.d.WordnetNounIndexNameInstanceYGD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.g.g.WordnetNounIndexNameInstanceYGG;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ygd".equals(key)) return WordnetNounIndexNameInstanceYGD.get(TERM);
	if ("ygg".equals(key)) return WordnetNounIndexNameInstanceYGG.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYGD.terms());
	set.addAll(WordnetNounIndexNameInstanceYGG.terms());
  		return set; 	} }