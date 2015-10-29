package org.swtk.commons.dict.wordnet.indexbyname.controller.r.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.h.a.WordnetNounIndexNameInstanceRHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.h.e.WordnetNounIndexNameInstanceRHE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.h.i.WordnetNounIndexNameInstanceRHI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.h.o.WordnetNounIndexNameInstanceRHO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.h.u.WordnetNounIndexNameInstanceRHU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.h.y.WordnetNounIndexNameInstanceRHY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerRH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("rha".equals(key)) return WordnetNounIndexNameInstanceRHA.get(TERM);
	if ("rhe".equals(key)) return WordnetNounIndexNameInstanceRHE.get(TERM);
	if ("rhi".equals(key)) return WordnetNounIndexNameInstanceRHI.get(TERM);
	if ("rho".equals(key)) return WordnetNounIndexNameInstanceRHO.get(TERM);
	if ("rhu".equals(key)) return WordnetNounIndexNameInstanceRHU.get(TERM);
	if ("rhy".equals(key)) return WordnetNounIndexNameInstanceRHY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceRHA.terms());
	set.addAll(WordnetNounIndexNameInstanceRHE.terms());
	set.addAll(WordnetNounIndexNameInstanceRHI.terms());
	set.addAll(WordnetNounIndexNameInstanceRHO.terms());
	set.addAll(WordnetNounIndexNameInstanceRHU.terms());
	set.addAll(WordnetNounIndexNameInstanceRHY.terms());
  		return set; 	} }