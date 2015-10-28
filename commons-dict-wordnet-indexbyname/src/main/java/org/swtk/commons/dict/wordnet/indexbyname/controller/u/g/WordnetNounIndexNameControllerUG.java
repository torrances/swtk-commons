package org.swtk.commons.dict.wordnet.indexbyname.controller.u.g;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.g.a.WordnetNounIndexNameInstanceUGA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.g.l.WordnetNounIndexNameInstanceUGL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.g.r.WordnetNounIndexNameInstanceUGR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("uga".equals(key)) return WordnetNounIndexNameInstanceUGA.get(TERM);
	if ("ugl".equals(key)) return WordnetNounIndexNameInstanceUGL.get(TERM);
	if ("ugr".equals(key)) return WordnetNounIndexNameInstanceUGR.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUGA.terms());
	set.addAll(WordnetNounIndexNameInstanceUGL.terms());
	set.addAll(WordnetNounIndexNameInstanceUGR.terms());
  		return set; 	} }