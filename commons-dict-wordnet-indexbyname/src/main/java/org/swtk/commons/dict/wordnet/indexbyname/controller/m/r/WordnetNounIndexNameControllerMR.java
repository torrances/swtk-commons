package org.swtk.commons.dict.wordnet.indexbyname.controller.m.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.r.e.WordnetNounIndexNameInstanceMRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.r.n.WordnetNounIndexNameInstanceMRN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.r.t.WordnetNounIndexNameInstanceMRT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("mre".equals(key)) return WordnetNounIndexNameInstanceMRE.get(TERM);
	if ("mrn".equals(key)) return WordnetNounIndexNameInstanceMRN.get(TERM);
	if ("mrt".equals(key)) return WordnetNounIndexNameInstanceMRT.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMRE.terms());
	set.addAll(WordnetNounIndexNameInstanceMRN.terms());
	set.addAll(WordnetNounIndexNameInstanceMRT.terms());
  		return set; 	} }