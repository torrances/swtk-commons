package org.swtk.commons.dict.wordnet.index.name.controller.e.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.w.e.n.WordnetNounIndexNameInstanceEWEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.w.e.r.WordnetNounIndexNameInstanceEWER;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ewen".equals(key)) return WordnetNounIndexNameInstanceEWEN.get(TERM);
	if ("ewer".equals(key)) return WordnetNounIndexNameInstanceEWER.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEWEN.terms());
	set.addAll(WordnetNounIndexNameInstanceEWER.terms());
  		return set; 	} }