package org.swtk.commons.dict.wordnet.index.name.controller.g.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.g.w.y.d.WordnetNounIndexNameInstanceGWYD;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.w.y.n.WordnetNounIndexNameInstanceGWYN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("gwyd".equals(key)) return WordnetNounIndexNameInstanceGWYD.get(TERM);
	if ("gwyn".equals(key)) return WordnetNounIndexNameInstanceGWYN.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGWYD.terms());
	set.addAll(WordnetNounIndexNameInstanceGWYN.terms());
  		return set; 	} }