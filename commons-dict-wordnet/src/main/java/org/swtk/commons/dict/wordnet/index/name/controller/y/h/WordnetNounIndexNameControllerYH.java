package org.swtk.commons.dict.wordnet.index.name.controller.y.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.y.h.v.h.WordnetNounIndexNameInstanceYHVH;
	import org.swtk.commons.dict.wordnet.index.name.instance.y.h.w.h.WordnetNounIndexNameInstanceYHWH;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("yhvh".equals(key)) return WordnetNounIndexNameInstanceYHVH.get(TERM);
	if ("yhwh".equals(key)) return WordnetNounIndexNameInstanceYHWH.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYHVH.terms());
	set.addAll(WordnetNounIndexNameInstanceYHWH.terms());
  		return set; 	} }