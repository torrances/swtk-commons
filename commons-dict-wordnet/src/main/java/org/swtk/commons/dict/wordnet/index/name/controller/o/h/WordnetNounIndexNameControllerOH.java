package org.swtk.commons.dict.wordnet.index.name.controller.o.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.h.i.o.WordnetNounIndexNameInstanceOHIO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.h.m.a.WordnetNounIndexNameInstanceOHMA;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.h.m.m.WordnetNounIndexNameInstanceOHMM;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ohio".equals(key)) return WordnetNounIndexNameInstanceOHIO.get(TERM);
	if ("ohma".equals(key)) return WordnetNounIndexNameInstanceOHMA.get(TERM);
	if ("ohmm".equals(key)) return WordnetNounIndexNameInstanceOHMM.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOHIO.terms());
	set.addAll(WordnetNounIndexNameInstanceOHMA.terms());
	set.addAll(WordnetNounIndexNameInstanceOHMM.terms());
  		return set; 	} }