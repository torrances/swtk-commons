package org.swtk.commons.dict.wordnet.index.name.controller.i.k;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.k.h.a.WordnetNounIndexNameInstanceIKHA;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.k.o.n.WordnetNounIndexNameInstanceIKON;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIK {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ikha".equals(key)) return WordnetNounIndexNameInstanceIKHA.get(TERM);
	if ("ikon".equals(key)) return WordnetNounIndexNameInstanceIKON.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIKHA.terms());
	set.addAll(WordnetNounIndexNameInstanceIKON.terms());
  		return set; 	} }