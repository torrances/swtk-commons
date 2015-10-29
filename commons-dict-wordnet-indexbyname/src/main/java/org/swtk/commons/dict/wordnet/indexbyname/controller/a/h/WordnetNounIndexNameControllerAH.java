package org.swtk.commons.dict.wordnet.indexbyname.controller.a.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.h.a.WordnetNounIndexNameInstanceAHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.h.e.WordnetNounIndexNameInstanceAHE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.h.i.WordnetNounIndexNameInstanceAHI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.h.p.WordnetNounIndexNameInstanceAHP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.h.r.WordnetNounIndexNameInstanceAHR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.h.u.WordnetNounIndexNameInstanceAHU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.h.v.WordnetNounIndexNameInstanceAHV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("aha".equals(key)) return WordnetNounIndexNameInstanceAHA.get(TERM);
	if ("ahe".equals(key)) return WordnetNounIndexNameInstanceAHE.get(TERM);
	if ("ahi".equals(key)) return WordnetNounIndexNameInstanceAHI.get(TERM);
	if ("ahp".equals(key)) return WordnetNounIndexNameInstanceAHP.get(TERM);
	if ("ahr".equals(key)) return WordnetNounIndexNameInstanceAHR.get(TERM);
	if ("ahu".equals(key)) return WordnetNounIndexNameInstanceAHU.get(TERM);
	if ("ahv".equals(key)) return WordnetNounIndexNameInstanceAHV.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAHA.terms());
	set.addAll(WordnetNounIndexNameInstanceAHE.terms());
	set.addAll(WordnetNounIndexNameInstanceAHI.terms());
	set.addAll(WordnetNounIndexNameInstanceAHP.terms());
	set.addAll(WordnetNounIndexNameInstanceAHR.terms());
	set.addAll(WordnetNounIndexNameInstanceAHU.terms());
	set.addAll(WordnetNounIndexNameInstanceAHV.terms());
  		return set; 	} }