package org.swtk.commons.dict.wordnet.indexbyname.controller.j.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.b.WordnetNounIndexNameInstanceJAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.c.WordnetNounIndexNameInstanceJAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.d.WordnetNounIndexNameInstanceJAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.e.WordnetNounIndexNameInstanceJAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.f.WordnetNounIndexNameInstanceJAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.g.WordnetNounIndexNameInstanceJAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.h.WordnetNounIndexNameInstanceJAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.i.WordnetNounIndexNameInstanceJAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.k.WordnetNounIndexNameInstanceJAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.l.WordnetNounIndexNameInstanceJAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.m.WordnetNounIndexNameInstanceJAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.n.WordnetNounIndexNameInstanceJAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.p.WordnetNounIndexNameInstanceJAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.r.WordnetNounIndexNameInstanceJAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.s.WordnetNounIndexNameInstanceJAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.t.WordnetNounIndexNameInstanceJAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.u.WordnetNounIndexNameInstanceJAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.v.WordnetNounIndexNameInstanceJAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.w.WordnetNounIndexNameInstanceJAW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.y.WordnetNounIndexNameInstanceJAY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.z.WordnetNounIndexNameInstanceJAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerJA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("jab".equals(key)) return WordnetNounIndexNameInstanceJAB.get(TERM);
	if ("jac".equals(key)) return WordnetNounIndexNameInstanceJAC.get(TERM);
	if ("jad".equals(key)) return WordnetNounIndexNameInstanceJAD.get(TERM);
	if ("jae".equals(key)) return WordnetNounIndexNameInstanceJAE.get(TERM);
	if ("jaf".equals(key)) return WordnetNounIndexNameInstanceJAF.get(TERM);
	if ("jag".equals(key)) return WordnetNounIndexNameInstanceJAG.get(TERM);
	if ("jah".equals(key)) return WordnetNounIndexNameInstanceJAH.get(TERM);
	if ("jai".equals(key)) return WordnetNounIndexNameInstanceJAI.get(TERM);
	if ("jak".equals(key)) return WordnetNounIndexNameInstanceJAK.get(TERM);
	if ("jal".equals(key)) return WordnetNounIndexNameInstanceJAL.get(TERM);
	if ("jam".equals(key)) return WordnetNounIndexNameInstanceJAM.get(TERM);
	if ("jan".equals(key)) return WordnetNounIndexNameInstanceJAN.get(TERM);
	if ("jap".equals(key)) return WordnetNounIndexNameInstanceJAP.get(TERM);
	if ("jar".equals(key)) return WordnetNounIndexNameInstanceJAR.get(TERM);
	if ("jas".equals(key)) return WordnetNounIndexNameInstanceJAS.get(TERM);
	if ("jat".equals(key)) return WordnetNounIndexNameInstanceJAT.get(TERM);
	if ("jau".equals(key)) return WordnetNounIndexNameInstanceJAU.get(TERM);
	if ("jav".equals(key)) return WordnetNounIndexNameInstanceJAV.get(TERM);
	if ("jaw".equals(key)) return WordnetNounIndexNameInstanceJAW.get(TERM);
	if ("jay".equals(key)) return WordnetNounIndexNameInstanceJAY.get(TERM);
	if ("jaz".equals(key)) return WordnetNounIndexNameInstanceJAZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceJAB.terms());
	set.addAll(WordnetNounIndexNameInstanceJAC.terms());
	set.addAll(WordnetNounIndexNameInstanceJAD.terms());
	set.addAll(WordnetNounIndexNameInstanceJAE.terms());
	set.addAll(WordnetNounIndexNameInstanceJAF.terms());
	set.addAll(WordnetNounIndexNameInstanceJAG.terms());
	set.addAll(WordnetNounIndexNameInstanceJAH.terms());
	set.addAll(WordnetNounIndexNameInstanceJAI.terms());
	set.addAll(WordnetNounIndexNameInstanceJAK.terms());
	set.addAll(WordnetNounIndexNameInstanceJAL.terms());
	set.addAll(WordnetNounIndexNameInstanceJAM.terms());
	set.addAll(WordnetNounIndexNameInstanceJAN.terms());
	set.addAll(WordnetNounIndexNameInstanceJAP.terms());
	set.addAll(WordnetNounIndexNameInstanceJAR.terms());
	set.addAll(WordnetNounIndexNameInstanceJAS.terms());
	set.addAll(WordnetNounIndexNameInstanceJAT.terms());
	set.addAll(WordnetNounIndexNameInstanceJAU.terms());
	set.addAll(WordnetNounIndexNameInstanceJAV.terms());
	set.addAll(WordnetNounIndexNameInstanceJAW.terms());
	set.addAll(WordnetNounIndexNameInstanceJAY.terms());
	set.addAll(WordnetNounIndexNameInstanceJAZ.terms());
  		return set; 	} }