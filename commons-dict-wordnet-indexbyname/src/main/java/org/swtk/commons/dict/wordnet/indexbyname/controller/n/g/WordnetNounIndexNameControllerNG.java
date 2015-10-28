package org.swtk.commons.dict.wordnet.indexbyname.controller.n.g;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.g.a.WordnetNounIndexNameInstanceNGA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.g.u.WordnetNounIndexNameInstanceNGU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.g.w.WordnetNounIndexNameInstanceNGW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("nga".equals(key)) return WordnetNounIndexNameInstanceNGA.get(TERM);
	if ("ngu".equals(key)) return WordnetNounIndexNameInstanceNGU.get(TERM);
	if ("ngw".equals(key)) return WordnetNounIndexNameInstanceNGW.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNGA.terms());
	set.addAll(WordnetNounIndexNameInstanceNGU.terms());
	set.addAll(WordnetNounIndexNameInstanceNGW.terms());
  		return set; 	} }