package org.swtk.commons.dict.wordnet.indexbyname.controller.n.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.r.e.WordnetNounIndexNameInstanceNRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.r.n.WordnetNounIndexNameInstanceNRN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.r.t.WordnetNounIndexNameInstanceNRT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("nre".equals(key)) return WordnetNounIndexNameInstanceNRE.get(TERM);
	if ("nrn".equals(key)) return WordnetNounIndexNameInstanceNRN.get(TERM);
	if ("nrt".equals(key)) return WordnetNounIndexNameInstanceNRT.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNRE.terms());
	set.addAll(WordnetNounIndexNameInstanceNRN.terms());
	set.addAll(WordnetNounIndexNameInstanceNRT.terms());
  		return set; 	} }