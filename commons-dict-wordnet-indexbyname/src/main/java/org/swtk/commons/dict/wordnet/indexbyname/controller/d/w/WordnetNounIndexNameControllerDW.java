package org.swtk.commons.dict.wordnet.indexbyname.controller.d.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.w.a.WordnetNounIndexNameInstanceDWA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.w.e.WordnetNounIndexNameInstanceDWE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.w.i.WordnetNounIndexNameInstanceDWI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("dwa".equals(key)) return WordnetNounIndexNameInstanceDWA.get(TERM);
	if ("dwe".equals(key)) return WordnetNounIndexNameInstanceDWE.get(TERM);
	if ("dwi".equals(key)) return WordnetNounIndexNameInstanceDWI.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDWA.terms());
	set.addAll(WordnetNounIndexNameInstanceDWE.terms());
	set.addAll(WordnetNounIndexNameInstanceDWI.terms());
  		return set; 	} }