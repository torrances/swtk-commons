package org.swtk.commons.dict.wordnet.indexbyname.controller.e.y;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.y.a.WordnetNounIndexNameInstanceEYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.y.c.WordnetNounIndexNameInstanceEYC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.y.e.WordnetNounIndexNameInstanceEYE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.y.r.WordnetNounIndexNameInstanceEYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.y.s.WordnetNounIndexNameInstanceEYS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("eya".equals(key)) return WordnetNounIndexNameInstanceEYA.get(TERM);
	if ("eyc".equals(key)) return WordnetNounIndexNameInstanceEYC.get(TERM);
	if ("eye".equals(key)) return WordnetNounIndexNameInstanceEYE.get(TERM);
	if ("eyr".equals(key)) return WordnetNounIndexNameInstanceEYR.get(TERM);
	if ("eys".equals(key)) return WordnetNounIndexNameInstanceEYS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEYA.terms());
	set.addAll(WordnetNounIndexNameInstanceEYC.terms());
	set.addAll(WordnetNounIndexNameInstanceEYE.terms());
	set.addAll(WordnetNounIndexNameInstanceEYR.terms());
	set.addAll(WordnetNounIndexNameInstanceEYS.terms());
  		return set; 	} }