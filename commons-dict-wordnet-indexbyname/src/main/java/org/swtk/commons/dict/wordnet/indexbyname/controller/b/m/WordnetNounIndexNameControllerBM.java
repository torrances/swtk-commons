package org.swtk.commons.dict.wordnet.indexbyname.controller.b.m;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.m.d.WordnetNounIndexNameInstanceBMD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.m.u.WordnetNounIndexNameInstanceBMU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBM {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("bmd".equals(key)) return WordnetNounIndexNameInstanceBMD.get(TERM);
	if ("bmu".equals(key)) return WordnetNounIndexNameInstanceBMU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBMD.terms());
	set.addAll(WordnetNounIndexNameInstanceBMU.terms());
  		return set; 	} }