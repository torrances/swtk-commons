package org.swtk.commons.dict.wordnet.indexbyname.controller.h.t;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.t.m.WordnetNounIndexNameInstanceHTM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.t.t.WordnetNounIndexNameInstanceHTT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerHT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("htm".equals(key)) return WordnetNounIndexNameInstanceHTM.get(TERM);
	if ("htt".equals(key)) return WordnetNounIndexNameInstanceHTT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceHTM.terms());
	set.addAll(WordnetNounIndexNameInstanceHTT.terms());
  		return set; 	} }