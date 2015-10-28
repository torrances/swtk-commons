package org.swtk.commons.dict.wordnet.indexbyname.controller.s.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.v.a.WordnetNounIndexNameInstanceSVA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.v.e.WordnetNounIndexNameInstanceSVE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.v.i.WordnetNounIndexNameInstanceSVI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.v.o.WordnetNounIndexNameInstanceSVO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("sva".equals(key)) return WordnetNounIndexNameInstanceSVA.get(TERM);
	if ("sve".equals(key)) return WordnetNounIndexNameInstanceSVE.get(TERM);
	if ("svi".equals(key)) return WordnetNounIndexNameInstanceSVI.get(TERM);
	if ("svo".equals(key)) return WordnetNounIndexNameInstanceSVO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSVA.terms());
	set.addAll(WordnetNounIndexNameInstanceSVE.terms());
	set.addAll(WordnetNounIndexNameInstanceSVI.terms());
	set.addAll(WordnetNounIndexNameInstanceSVO.terms());
  		return set; 	} }