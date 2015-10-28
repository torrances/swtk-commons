package org.swtk.commons.dict.wordnet.indexbyname.controller.t.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.w.a.WordnetNounIndexNameInstanceTWA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.w.e.WordnetNounIndexNameInstanceTWE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.w.i.WordnetNounIndexNameInstanceTWI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.w.o.WordnetNounIndexNameInstanceTWO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerTW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("twa".equals(key)) return WordnetNounIndexNameInstanceTWA.get(TERM);
	if ("twe".equals(key)) return WordnetNounIndexNameInstanceTWE.get(TERM);
	if ("twi".equals(key)) return WordnetNounIndexNameInstanceTWI.get(TERM);
	if ("two".equals(key)) return WordnetNounIndexNameInstanceTWO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceTWA.terms());
	set.addAll(WordnetNounIndexNameInstanceTWE.terms());
	set.addAll(WordnetNounIndexNameInstanceTWI.terms());
	set.addAll(WordnetNounIndexNameInstanceTWO.terms());
  		return set; 	} }