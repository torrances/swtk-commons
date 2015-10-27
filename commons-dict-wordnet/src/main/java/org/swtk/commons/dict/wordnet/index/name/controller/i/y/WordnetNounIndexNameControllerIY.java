package org.swtk.commons.dict.wordnet.index.name.controller.i.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.y.a.r.WordnetNounIndexNameInstanceIYAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.y.y.a.WordnetNounIndexNameInstanceIYYA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("iyar".equals(key)) return WordnetNounIndexNameInstanceIYAR.get(TERM);
	if ("iyya".equals(key)) return WordnetNounIndexNameInstanceIYYA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIYAR.terms());
	set.addAll(WordnetNounIndexNameInstanceIYYA.terms());
  		return set; 	} }