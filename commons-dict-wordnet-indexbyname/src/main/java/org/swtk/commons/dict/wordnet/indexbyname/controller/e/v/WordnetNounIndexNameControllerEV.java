package org.swtk.commons.dict.wordnet.indexbyname.controller.e.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.v.a.WordnetNounIndexNameInstanceEVA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.v.e.WordnetNounIndexNameInstanceEVE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.v.i.WordnetNounIndexNameInstanceEVI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.v.o.WordnetNounIndexNameInstanceEVO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("eva".equals(key)) return WordnetNounIndexNameInstanceEVA.get(TERM);
	if ("eve".equals(key)) return WordnetNounIndexNameInstanceEVE.get(TERM);
	if ("evi".equals(key)) return WordnetNounIndexNameInstanceEVI.get(TERM);
	if ("evo".equals(key)) return WordnetNounIndexNameInstanceEVO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEVA.terms());
	set.addAll(WordnetNounIndexNameInstanceEVE.terms());
	set.addAll(WordnetNounIndexNameInstanceEVI.terms());
	set.addAll(WordnetNounIndexNameInstanceEVO.terms());
  		return set; 	} }