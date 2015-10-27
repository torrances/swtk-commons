package org.swtk.commons.dict.wordnet.index.name.controller.s.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.s.r.a.v.WordnetNounIndexNameInstanceSRAV;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.r.b.i.WordnetNounIndexNameInstanceSRBI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("srav".equals(key)) return WordnetNounIndexNameInstanceSRAV.get(TERM);
	if ("srbi".equals(key)) return WordnetNounIndexNameInstanceSRBI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSRAV.terms());
	set.addAll(WordnetNounIndexNameInstanceSRBI.terms());
  		return set; 	} }