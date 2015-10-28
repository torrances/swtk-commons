package org.swtk.commons.dict.wordnet.indexbyname.controller.o.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.h.i.WordnetNounIndexNameInstanceOHI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.h.m.WordnetNounIndexNameInstanceOHM;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ohi".equals(key)) return WordnetNounIndexNameInstanceOHI.get(TERM);
	if ("ohm".equals(key)) return WordnetNounIndexNameInstanceOHM.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOHI.terms());
	set.addAll(WordnetNounIndexNameInstanceOHM.terms());
  		return set; 	} }