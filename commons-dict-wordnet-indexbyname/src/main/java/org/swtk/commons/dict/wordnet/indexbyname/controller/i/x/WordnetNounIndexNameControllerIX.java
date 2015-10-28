package org.swtk.commons.dict.wordnet.indexbyname.controller.i.x;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.x.i.WordnetNounIndexNameInstanceIXI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.x.o.WordnetNounIndexNameInstanceIXO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIX {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ixi".equals(key)) return WordnetNounIndexNameInstanceIXI.get(TERM);
	if ("ixo".equals(key)) return WordnetNounIndexNameInstanceIXO.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIXI.terms());
	set.addAll(WordnetNounIndexNameInstanceIXO.terms());
  		return set; 	} }