package org.swtk.commons.dict.wordnet.index.name.controller.n.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.s.a.i.WordnetNounIndexNameInstanceNSAI;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.s.w.c.WordnetNounIndexNameInstanceNSWC;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("nsai".equals(key)) return WordnetNounIndexNameInstanceNSAI.get(TERM);
	if ("nswc".equals(key)) return WordnetNounIndexNameInstanceNSWC.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNSAI.terms());
	set.addAll(WordnetNounIndexNameInstanceNSWC.terms());
  		return set; 	} }