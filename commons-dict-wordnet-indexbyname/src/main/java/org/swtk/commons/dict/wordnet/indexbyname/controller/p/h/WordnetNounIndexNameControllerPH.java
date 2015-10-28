package org.swtk.commons.dict.wordnet.indexbyname.controller.p.h;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.a.WordnetNounIndexNameInstancePHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.e.WordnetNounIndexNameInstancePHE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.i.WordnetNounIndexNameInstancePHI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.l.WordnetNounIndexNameInstancePHL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.o.WordnetNounIndexNameInstancePHO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.r.WordnetNounIndexNameInstancePHR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.t.WordnetNounIndexNameInstancePHT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.y.WordnetNounIndexNameInstancePHY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("pha".equals(key)) return WordnetNounIndexNameInstancePHA.get(TERM);
	if ("phe".equals(key)) return WordnetNounIndexNameInstancePHE.get(TERM);
	if ("phi".equals(key)) return WordnetNounIndexNameInstancePHI.get(TERM);
	if ("phl".equals(key)) return WordnetNounIndexNameInstancePHL.get(TERM);
	if ("pho".equals(key)) return WordnetNounIndexNameInstancePHO.get(TERM);
	if ("phr".equals(key)) return WordnetNounIndexNameInstancePHR.get(TERM);
	if ("pht".equals(key)) return WordnetNounIndexNameInstancePHT.get(TERM);
	if ("phy".equals(key)) return WordnetNounIndexNameInstancePHY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePHA.terms());
	set.addAll(WordnetNounIndexNameInstancePHE.terms());
	set.addAll(WordnetNounIndexNameInstancePHI.terms());
	set.addAll(WordnetNounIndexNameInstancePHL.terms());
	set.addAll(WordnetNounIndexNameInstancePHO.terms());
	set.addAll(WordnetNounIndexNameInstancePHR.terms());
	set.addAll(WordnetNounIndexNameInstancePHT.terms());
	set.addAll(WordnetNounIndexNameInstancePHY.terms());
  		return set; 	} }