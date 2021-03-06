package org.swtk.commons.dict.wordnet.indexbyname.controller.w.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.b.WordnetNounIndexNameInstanceWAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.c.WordnetNounIndexNameInstanceWAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.d.WordnetNounIndexNameInstanceWAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.f.WordnetNounIndexNameInstanceWAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.g.WordnetNounIndexNameInstanceWAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.h.WordnetNounIndexNameInstanceWAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.i.WordnetNounIndexNameInstanceWAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.j.WordnetNounIndexNameInstanceWAJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.k.WordnetNounIndexNameInstanceWAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.l.WordnetNounIndexNameInstanceWAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.m.WordnetNounIndexNameInstanceWAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.n.WordnetNounIndexNameInstanceWAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.p.WordnetNounIndexNameInstanceWAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.r.WordnetNounIndexNameInstanceWAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.s.WordnetNounIndexNameInstanceWAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.t.WordnetNounIndexNameInstanceWAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.u.WordnetNounIndexNameInstanceWAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.v.WordnetNounIndexNameInstanceWAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.x.WordnetNounIndexNameInstanceWAX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.y.WordnetNounIndexNameInstanceWAY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("wab".equals(key)) return WordnetNounIndexNameInstanceWAB.get(TERM);
	if ("wac".equals(key)) return WordnetNounIndexNameInstanceWAC.get(TERM);
	if ("wad".equals(key)) return WordnetNounIndexNameInstanceWAD.get(TERM);
	if ("waf".equals(key)) return WordnetNounIndexNameInstanceWAF.get(TERM);
	if ("wag".equals(key)) return WordnetNounIndexNameInstanceWAG.get(TERM);
	if ("wah".equals(key)) return WordnetNounIndexNameInstanceWAH.get(TERM);
	if ("wai".equals(key)) return WordnetNounIndexNameInstanceWAI.get(TERM);
	if ("waj".equals(key)) return WordnetNounIndexNameInstanceWAJ.get(TERM);
	if ("wak".equals(key)) return WordnetNounIndexNameInstanceWAK.get(TERM);
	if ("wal".equals(key)) return WordnetNounIndexNameInstanceWAL.get(TERM);
	if ("wam".equals(key)) return WordnetNounIndexNameInstanceWAM.get(TERM);
	if ("wan".equals(key)) return WordnetNounIndexNameInstanceWAN.get(TERM);
	if ("wap".equals(key)) return WordnetNounIndexNameInstanceWAP.get(TERM);
	if ("war".equals(key)) return WordnetNounIndexNameInstanceWAR.get(TERM);
	if ("was".equals(key)) return WordnetNounIndexNameInstanceWAS.get(TERM);
	if ("wat".equals(key)) return WordnetNounIndexNameInstanceWAT.get(TERM);
	if ("wau".equals(key)) return WordnetNounIndexNameInstanceWAU.get(TERM);
	if ("wav".equals(key)) return WordnetNounIndexNameInstanceWAV.get(TERM);
	if ("wax".equals(key)) return WordnetNounIndexNameInstanceWAX.get(TERM);
	if ("way".equals(key)) return WordnetNounIndexNameInstanceWAY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWAB.terms());
	set.addAll(WordnetNounIndexNameInstanceWAC.terms());
	set.addAll(WordnetNounIndexNameInstanceWAD.terms());
	set.addAll(WordnetNounIndexNameInstanceWAF.terms());
	set.addAll(WordnetNounIndexNameInstanceWAG.terms());
	set.addAll(WordnetNounIndexNameInstanceWAH.terms());
	set.addAll(WordnetNounIndexNameInstanceWAI.terms());
	set.addAll(WordnetNounIndexNameInstanceWAJ.terms());
	set.addAll(WordnetNounIndexNameInstanceWAK.terms());
	set.addAll(WordnetNounIndexNameInstanceWAL.terms());
	set.addAll(WordnetNounIndexNameInstanceWAM.terms());
	set.addAll(WordnetNounIndexNameInstanceWAN.terms());
	set.addAll(WordnetNounIndexNameInstanceWAP.terms());
	set.addAll(WordnetNounIndexNameInstanceWAR.terms());
	set.addAll(WordnetNounIndexNameInstanceWAS.terms());
	set.addAll(WordnetNounIndexNameInstanceWAT.terms());
	set.addAll(WordnetNounIndexNameInstanceWAU.terms());
	set.addAll(WordnetNounIndexNameInstanceWAV.terms());
	set.addAll(WordnetNounIndexNameInstanceWAX.terms());
	set.addAll(WordnetNounIndexNameInstanceWAY.terms());
  		return set; 	} }