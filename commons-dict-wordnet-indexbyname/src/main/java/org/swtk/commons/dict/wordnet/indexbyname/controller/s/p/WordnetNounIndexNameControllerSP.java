package org.swtk.commons.dict.wordnet.indexbyname.controller.s.p;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.a.WordnetNounIndexNameInstanceSPA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.e.WordnetNounIndexNameInstanceSPE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.h.WordnetNounIndexNameInstanceSPH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.i.WordnetNounIndexNameInstanceSPI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.l.WordnetNounIndexNameInstanceSPL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.o.WordnetNounIndexNameInstanceSPO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.r.WordnetNounIndexNameInstanceSPR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.u.WordnetNounIndexNameInstanceSPU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.y.WordnetNounIndexNameInstanceSPY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSP {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("spa".equals(key)) return WordnetNounIndexNameInstanceSPA.get(TERM);
	if ("spe".equals(key)) return WordnetNounIndexNameInstanceSPE.get(TERM);
	if ("sph".equals(key)) return WordnetNounIndexNameInstanceSPH.get(TERM);
	if ("spi".equals(key)) return WordnetNounIndexNameInstanceSPI.get(TERM);
	if ("spl".equals(key)) return WordnetNounIndexNameInstanceSPL.get(TERM);
	if ("spo".equals(key)) return WordnetNounIndexNameInstanceSPO.get(TERM);
	if ("spr".equals(key)) return WordnetNounIndexNameInstanceSPR.get(TERM);
	if ("spu".equals(key)) return WordnetNounIndexNameInstanceSPU.get(TERM);
	if ("spy".equals(key)) return WordnetNounIndexNameInstanceSPY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSPA.terms());
	set.addAll(WordnetNounIndexNameInstanceSPE.terms());
	set.addAll(WordnetNounIndexNameInstanceSPH.terms());
	set.addAll(WordnetNounIndexNameInstanceSPI.terms());
	set.addAll(WordnetNounIndexNameInstanceSPL.terms());
	set.addAll(WordnetNounIndexNameInstanceSPO.terms());
	set.addAll(WordnetNounIndexNameInstanceSPR.terms());
	set.addAll(WordnetNounIndexNameInstanceSPU.terms());
	set.addAll(WordnetNounIndexNameInstanceSPY.terms());
  		return set; 	} }