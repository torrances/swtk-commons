package org.swtk.commons.dict.wordnet.indexbyname.controller.n.d;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.d.e.WordnetNounIndexNameInstanceNDE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.d.j.WordnetNounIndexNameInstanceNDJ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerND {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("nde".equals(key)) return WordnetNounIndexNameInstanceNDE.get(TERM);
	if ("ndj".equals(key)) return WordnetNounIndexNameInstanceNDJ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNDE.terms());
	set.addAll(WordnetNounIndexNameInstanceNDJ.terms());
  		return set; 	} }