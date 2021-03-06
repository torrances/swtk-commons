package org.swtk.commons.dict.wordnet.indexbyname.controller.s.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.a.WordnetNounIndexNameInstanceSAA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.b.WordnetNounIndexNameInstanceSAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.c.WordnetNounIndexNameInstanceSAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.d.WordnetNounIndexNameInstanceSAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.e.WordnetNounIndexNameInstanceSAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.f.WordnetNounIndexNameInstanceSAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.g.WordnetNounIndexNameInstanceSAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.h.WordnetNounIndexNameInstanceSAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.i.WordnetNounIndexNameInstanceSAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.j.WordnetNounIndexNameInstanceSAJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.k.WordnetNounIndexNameInstanceSAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.l.WordnetNounIndexNameInstanceSAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.m.WordnetNounIndexNameInstanceSAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.n.WordnetNounIndexNameInstanceSAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.o.WordnetNounIndexNameInstanceSAO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.p.WordnetNounIndexNameInstanceSAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.q.WordnetNounIndexNameInstanceSAQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.r.WordnetNounIndexNameInstanceSAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.s.WordnetNounIndexNameInstanceSAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.t.WordnetNounIndexNameInstanceSAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.u.WordnetNounIndexNameInstanceSAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.v.WordnetNounIndexNameInstanceSAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.w.WordnetNounIndexNameInstanceSAW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.x.WordnetNounIndexNameInstanceSAX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.y.WordnetNounIndexNameInstanceSAY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.z.WordnetNounIndexNameInstanceSAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("saa".equals(key)) return WordnetNounIndexNameInstanceSAA.get(TERM);
	if ("sab".equals(key)) return WordnetNounIndexNameInstanceSAB.get(TERM);
	if ("sac".equals(key)) return WordnetNounIndexNameInstanceSAC.get(TERM);
	if ("sad".equals(key)) return WordnetNounIndexNameInstanceSAD.get(TERM);
	if ("sae".equals(key)) return WordnetNounIndexNameInstanceSAE.get(TERM);
	if ("saf".equals(key)) return WordnetNounIndexNameInstanceSAF.get(TERM);
	if ("sag".equals(key)) return WordnetNounIndexNameInstanceSAG.get(TERM);
	if ("sah".equals(key)) return WordnetNounIndexNameInstanceSAH.get(TERM);
	if ("sai".equals(key)) return WordnetNounIndexNameInstanceSAI.get(TERM);
	if ("saj".equals(key)) return WordnetNounIndexNameInstanceSAJ.get(TERM);
	if ("sak".equals(key)) return WordnetNounIndexNameInstanceSAK.get(TERM);
	if ("sal".equals(key)) return WordnetNounIndexNameInstanceSAL.get(TERM);
	if ("sam".equals(key)) return WordnetNounIndexNameInstanceSAM.get(TERM);
	if ("san".equals(key)) return WordnetNounIndexNameInstanceSAN.get(TERM);
	if ("sao".equals(key)) return WordnetNounIndexNameInstanceSAO.get(TERM);
	if ("sap".equals(key)) return WordnetNounIndexNameInstanceSAP.get(TERM);
	if ("saq".equals(key)) return WordnetNounIndexNameInstanceSAQ.get(TERM);
	if ("sar".equals(key)) return WordnetNounIndexNameInstanceSAR.get(TERM);
	if ("sas".equals(key)) return WordnetNounIndexNameInstanceSAS.get(TERM);
	if ("sat".equals(key)) return WordnetNounIndexNameInstanceSAT.get(TERM);
	if ("sau".equals(key)) return WordnetNounIndexNameInstanceSAU.get(TERM);
	if ("sav".equals(key)) return WordnetNounIndexNameInstanceSAV.get(TERM);
	if ("saw".equals(key)) return WordnetNounIndexNameInstanceSAW.get(TERM);
	if ("sax".equals(key)) return WordnetNounIndexNameInstanceSAX.get(TERM);
	if ("say".equals(key)) return WordnetNounIndexNameInstanceSAY.get(TERM);
	if ("saz".equals(key)) return WordnetNounIndexNameInstanceSAZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSAA.terms());
	set.addAll(WordnetNounIndexNameInstanceSAB.terms());
	set.addAll(WordnetNounIndexNameInstanceSAC.terms());
	set.addAll(WordnetNounIndexNameInstanceSAD.terms());
	set.addAll(WordnetNounIndexNameInstanceSAE.terms());
	set.addAll(WordnetNounIndexNameInstanceSAF.terms());
	set.addAll(WordnetNounIndexNameInstanceSAG.terms());
	set.addAll(WordnetNounIndexNameInstanceSAH.terms());
	set.addAll(WordnetNounIndexNameInstanceSAI.terms());
	set.addAll(WordnetNounIndexNameInstanceSAJ.terms());
	set.addAll(WordnetNounIndexNameInstanceSAK.terms());
	set.addAll(WordnetNounIndexNameInstanceSAL.terms());
	set.addAll(WordnetNounIndexNameInstanceSAM.terms());
	set.addAll(WordnetNounIndexNameInstanceSAN.terms());
	set.addAll(WordnetNounIndexNameInstanceSAO.terms());
	set.addAll(WordnetNounIndexNameInstanceSAP.terms());
	set.addAll(WordnetNounIndexNameInstanceSAQ.terms());
	set.addAll(WordnetNounIndexNameInstanceSAR.terms());
	set.addAll(WordnetNounIndexNameInstanceSAS.terms());
	set.addAll(WordnetNounIndexNameInstanceSAT.terms());
	set.addAll(WordnetNounIndexNameInstanceSAU.terms());
	set.addAll(WordnetNounIndexNameInstanceSAV.terms());
	set.addAll(WordnetNounIndexNameInstanceSAW.terms());
	set.addAll(WordnetNounIndexNameInstanceSAX.terms());
	set.addAll(WordnetNounIndexNameInstanceSAY.terms());
	set.addAll(WordnetNounIndexNameInstanceSAZ.terms());
  		return set; 	} }