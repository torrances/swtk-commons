package org.swtk.commons.dict.wordnet.indexbyname.controller.u.b;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.b.e.WordnetNounIndexNameInstanceUBE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.b.i.WordnetNounIndexNameInstanceUBI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.b.y.WordnetNounIndexNameInstanceUBY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ube".equals(key)) return WordnetNounIndexNameInstanceUBE.get(TERM);
	if ("ubi".equals(key)) return WordnetNounIndexNameInstanceUBI.get(TERM);
	if ("uby".equals(key)) return WordnetNounIndexNameInstanceUBY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUBE.terms());
	set.addAll(WordnetNounIndexNameInstanceUBI.terms());
	set.addAll(WordnetNounIndexNameInstanceUBY.terms());
  		return set; 	} }