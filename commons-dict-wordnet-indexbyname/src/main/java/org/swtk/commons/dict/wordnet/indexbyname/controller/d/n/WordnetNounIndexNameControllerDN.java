package org.swtk.commons.dict.wordnet.indexbyname.controller.d.n;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.n.e.WordnetNounIndexNameInstanceDNE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.n.i.WordnetNounIndexNameInstanceDNI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("dne".equals(key)) return WordnetNounIndexNameInstanceDNE.get(TERM);
	if ("dni".equals(key)) return WordnetNounIndexNameInstanceDNI.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDNE.terms());
	set.addAll(WordnetNounIndexNameInstanceDNI.terms());
  		return set; 	} }