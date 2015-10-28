package org.swtk.commons.dict.wordnet.indexbyname.controller.w.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.h.a.WordnetNounIndexNameInstanceWHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.h.e.WordnetNounIndexNameInstanceWHE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.h.i.WordnetNounIndexNameInstanceWHI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.h.o.WordnetNounIndexNameInstanceWHO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.h.y.WordnetNounIndexNameInstanceWHY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("wha".equals(key)) return WordnetNounIndexNameInstanceWHA.get(TERM);
	if ("whe".equals(key)) return WordnetNounIndexNameInstanceWHE.get(TERM);
	if ("whi".equals(key)) return WordnetNounIndexNameInstanceWHI.get(TERM);
	if ("who".equals(key)) return WordnetNounIndexNameInstanceWHO.get(TERM);
	if ("why".equals(key)) return WordnetNounIndexNameInstanceWHY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWHA.terms());
	set.addAll(WordnetNounIndexNameInstanceWHE.terms());
	set.addAll(WordnetNounIndexNameInstanceWHI.terms());
	set.addAll(WordnetNounIndexNameInstanceWHO.terms());
	set.addAll(WordnetNounIndexNameInstanceWHY.terms());
  		return set; 	} }