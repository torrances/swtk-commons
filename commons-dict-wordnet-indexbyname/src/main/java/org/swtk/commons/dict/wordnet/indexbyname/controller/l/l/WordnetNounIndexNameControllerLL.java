package org.swtk.commons.dict.wordnet.indexbyname.controller.l.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.l.a.WordnetNounIndexNameInstanceLLA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.l.o.WordnetNounIndexNameInstanceLLO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.l.u.WordnetNounIndexNameInstanceLLU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.l.y.WordnetNounIndexNameInstanceLLY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("lla".equals(key)) return WordnetNounIndexNameInstanceLLA.get(TERM);
	if ("llo".equals(key)) return WordnetNounIndexNameInstanceLLO.get(TERM);
	if ("llu".equals(key)) return WordnetNounIndexNameInstanceLLU.get(TERM);
	if ("lly".equals(key)) return WordnetNounIndexNameInstanceLLY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLLA.terms());
	set.addAll(WordnetNounIndexNameInstanceLLO.terms());
	set.addAll(WordnetNounIndexNameInstanceLLU.terms());
	set.addAll(WordnetNounIndexNameInstanceLLY.terms());
  		return set; 	} }