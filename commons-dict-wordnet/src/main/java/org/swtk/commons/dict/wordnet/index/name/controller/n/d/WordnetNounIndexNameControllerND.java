package org.swtk.commons.dict.wordnet.index.name.controller.n.d;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.d.e.b.WordnetNounIndexNameInstanceNDEB;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.d.j.a.WordnetNounIndexNameInstanceNDJA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerND {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ndeb".equals(key)) return WordnetNounIndexNameInstanceNDEB.get(TERM);
	if ("ndja".equals(key)) return WordnetNounIndexNameInstanceNDJA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNDEB.terms());
	set.addAll(WordnetNounIndexNameInstanceNDJA.terms());
  		return set; 	} }