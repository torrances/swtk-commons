package org.swtk.commons.dict.wordnet.index.name.controller.m.d;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.m.d.i.v.WordnetNounIndexNameInstanceMDIV;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.d.m.a.WordnetNounIndexNameInstanceMDMA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMD {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mdiv".equals(key)) return WordnetNounIndexNameInstanceMDIV.get(TERM);
	if ("mdma".equals(key)) return WordnetNounIndexNameInstanceMDMA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMDIV.terms());
	set.addAll(WordnetNounIndexNameInstanceMDMA.terms());
  		return set; 	} }