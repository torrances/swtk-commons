package org.swtk.commons.dict.wordnet.indexbyname.controller.i.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.v.a.WordnetNounIndexNameInstanceIVA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.v.e.WordnetNounIndexNameInstanceIVE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.v.o.WordnetNounIndexNameInstanceIVO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.v.r.WordnetNounIndexNameInstanceIVR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("iva".equals(key)) return WordnetNounIndexNameInstanceIVA.get(TERM);
	if ("ive".equals(key)) return WordnetNounIndexNameInstanceIVE.get(TERM);
	if ("ivo".equals(key)) return WordnetNounIndexNameInstanceIVO.get(TERM);
	if ("ivr".equals(key)) return WordnetNounIndexNameInstanceIVR.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIVA.terms());
	set.addAll(WordnetNounIndexNameInstanceIVE.terms());
	set.addAll(WordnetNounIndexNameInstanceIVO.terms());
	set.addAll(WordnetNounIndexNameInstanceIVR.terms());
  		return set; 	} }