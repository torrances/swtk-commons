package org.swtk.commons.dict.wordnet.indexbyname.controller.g.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.n.a.WordnetNounIndexNameInstanceGNA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.n.e.WordnetNounIndexNameInstanceGNE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.n.o.WordnetNounIndexNameInstanceGNO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("gna".equals(key)) return WordnetNounIndexNameInstanceGNA.get(TERM);
	if ("gne".equals(key)) return WordnetNounIndexNameInstanceGNE.get(TERM);
	if ("gno".equals(key)) return WordnetNounIndexNameInstanceGNO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGNA.terms());
	set.addAll(WordnetNounIndexNameInstanceGNE.terms());
	set.addAll(WordnetNounIndexNameInstanceGNO.terms());
  		return set; 	} }