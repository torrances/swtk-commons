package org.swtk.commons.dict.wordnet.index.name.controller.l.x;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.l.x.x.v.WordnetNounIndexNameInstanceLXXV;
	import org.swtk.commons.dict.wordnet.index.name.instance.l.x.x.x.WordnetNounIndexNameInstanceLXXX;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLX {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("lxxv".equals(key)) return WordnetNounIndexNameInstanceLXXV.get(TERM);
	if ("lxxx".equals(key)) return WordnetNounIndexNameInstanceLXXX.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLXXV.terms());
	set.addAll(WordnetNounIndexNameInstanceLXXX.terms());
  		return set; 	} }