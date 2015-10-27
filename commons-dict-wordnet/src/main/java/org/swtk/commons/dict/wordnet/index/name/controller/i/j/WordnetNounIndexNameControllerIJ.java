package org.swtk.commons.dict.wordnet.index.name.controller.i.j;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.j.s.s.WordnetNounIndexNameInstanceIJSS;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.j.t.i.WordnetNounIndexNameInstanceIJTI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ijss".equals(key)) return WordnetNounIndexNameInstanceIJSS.get(TERM);
	if ("ijti".equals(key)) return WordnetNounIndexNameInstanceIJTI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIJSS.terms());
	set.addAll(WordnetNounIndexNameInstanceIJTI.terms());
  		return set; 	} }