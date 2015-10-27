package org.swtk.commons.dict.wordnet.index.name.controller.h.t;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.h.t.m.l.WordnetNounIndexNameInstanceHTML;
	import org.swtk.commons.dict.wordnet.index.name.instance.h.t.t.p.WordnetNounIndexNameInstanceHTTP;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerHT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("html".equals(key)) return WordnetNounIndexNameInstanceHTML.get(TERM);
	if ("http".equals(key)) return WordnetNounIndexNameInstanceHTTP.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceHTML.terms());
	set.addAll(WordnetNounIndexNameInstanceHTTP.terms());
  		return set; 	} }