package org.swtk.commons.dict.wordnet.index.name.controller.t.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.t.z.a.r.WordnetNounIndexNameInstanceTZAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.t.z.e.t.WordnetNounIndexNameInstanceTZET;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerTZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("tzar".equals(key)) return WordnetNounIndexNameInstanceTZAR.get(TERM);
	if ("tzet".equals(key)) return WordnetNounIndexNameInstanceTZET.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceTZAR.terms());
	set.addAll(WordnetNounIndexNameInstanceTZET.terms());
  		return set; 	} }