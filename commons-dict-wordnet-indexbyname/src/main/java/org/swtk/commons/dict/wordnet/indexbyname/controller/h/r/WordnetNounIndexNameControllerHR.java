package org.swtk.commons.dict.wordnet.indexbyname.controller.h.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.r.o.WordnetNounIndexNameInstanceHRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.r.v.WordnetNounIndexNameInstanceHRV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.r.y.WordnetNounIndexNameInstanceHRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerHR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("hro".equals(key)) return WordnetNounIndexNameInstanceHRO.get(TERM);
	if ("hrv".equals(key)) return WordnetNounIndexNameInstanceHRV.get(TERM);
	if ("hry".equals(key)) return WordnetNounIndexNameInstanceHRY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceHRO.terms());
	set.addAll(WordnetNounIndexNameInstanceHRV.terms());
	set.addAll(WordnetNounIndexNameInstanceHRY.terms());
  		return set; 	} }