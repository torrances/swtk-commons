package org.swtk.commons.dict.wordnet.indexbyname.controller.m.n;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.n.e.WordnetNounIndexNameInstanceMNE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.n.i.WordnetNounIndexNameInstanceMNI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("mne".equals(key)) return WordnetNounIndexNameInstanceMNE.get(TERM);
	if ("mni".equals(key)) return WordnetNounIndexNameInstanceMNI.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMNE.terms());
	set.addAll(WordnetNounIndexNameInstanceMNI.terms());
  		return set; 	} }