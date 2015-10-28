package org.swtk.commons.dict.wordnet.indexbyname.controller.z.w;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.w.e.WordnetNounIndexNameInstanceZWE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.w.i.WordnetNounIndexNameInstanceZWI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.w.o.WordnetNounIndexNameInstanceZWO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerZW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("zwe".equals(key)) return WordnetNounIndexNameInstanceZWE.get(TERM);
	if ("zwi".equals(key)) return WordnetNounIndexNameInstanceZWI.get(TERM);
	if ("zwo".equals(key)) return WordnetNounIndexNameInstanceZWO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceZWE.terms());
	set.addAll(WordnetNounIndexNameInstanceZWI.terms());
	set.addAll(WordnetNounIndexNameInstanceZWO.terms());
  		return set; 	} }