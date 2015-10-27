package org.swtk.commons.dict.wordnet.index.name.controller.u.k;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.u.k.a.s.WordnetNounIndexNameInstanceUKAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.k.r.a.WordnetNounIndexNameInstanceUKRA;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.k.u.l.WordnetNounIndexNameInstanceUKUL;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUK {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ukas".equals(key)) return WordnetNounIndexNameInstanceUKAS.get(TERM);
	if ("ukra".equals(key)) return WordnetNounIndexNameInstanceUKRA.get(TERM);
	if ("ukul".equals(key)) return WordnetNounIndexNameInstanceUKUL.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUKAS.terms());
	set.addAll(WordnetNounIndexNameInstanceUKRA.terms());
	set.addAll(WordnetNounIndexNameInstanceUKUL.terms());
  		return set; 	} }