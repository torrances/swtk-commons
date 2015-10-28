package org.swtk.commons.dict.wordnet.indexbyname.controller.o.f;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.f.f.WordnetNounIndexNameInstanceOFF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.f.t.WordnetNounIndexNameInstanceOFT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOF {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("off".equals(key)) return WordnetNounIndexNameInstanceOFF.get(TERM);
	if ("oft".equals(key)) return WordnetNounIndexNameInstanceOFT.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOFF.terms());
	set.addAll(WordnetNounIndexNameInstanceOFT.terms());
  		return set; 	} }