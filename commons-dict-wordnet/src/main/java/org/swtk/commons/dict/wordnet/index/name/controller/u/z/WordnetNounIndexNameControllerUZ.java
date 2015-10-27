package org.swtk.commons.dict.wordnet.index.name.controller.u.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.u.z.b.a.WordnetNounIndexNameInstanceUZBA;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.z.b.e.WordnetNounIndexNameInstanceUZBE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("uzba".equals(key)) return WordnetNounIndexNameInstanceUZBA.get(TERM);
	if ("uzbe".equals(key)) return WordnetNounIndexNameInstanceUZBE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUZBA.terms());
	set.addAll(WordnetNounIndexNameInstanceUZBE.terms());
  		return set; 	} }