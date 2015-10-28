package org.swtk.commons.dict.wordnet.indexbyname.controller.q.i;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.i.a.WordnetNounIndexNameInstanceQIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.i.b.WordnetNounIndexNameInstanceQIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.i.n.WordnetNounIndexNameInstanceQIN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerQI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("qia".equals(key)) return WordnetNounIndexNameInstanceQIA.get(TERM);
	if ("qib".equals(key)) return WordnetNounIndexNameInstanceQIB.get(TERM);
	if ("qin".equals(key)) return WordnetNounIndexNameInstanceQIN.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceQIA.terms());
	set.addAll(WordnetNounIndexNameInstanceQIB.terms());
	set.addAll(WordnetNounIndexNameInstanceQIN.terms());
  		return set; 	} }