package org.swtk.commons.dict.wordnet.indexbyname.controller.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.a.WordnetNounIndexNameInstanceNAA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.b.WordnetNounIndexNameInstanceNAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.c.WordnetNounIndexNameInstanceNAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.d.WordnetNounIndexNameInstanceNAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.e.WordnetNounIndexNameInstanceNAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.f.WordnetNounIndexNameInstanceNAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.g.WordnetNounIndexNameInstanceNAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.h.WordnetNounIndexNameInstanceNAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.i.WordnetNounIndexNameInstanceNAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.j.WordnetNounIndexNameInstanceNAJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.k.WordnetNounIndexNameInstanceNAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.l.WordnetNounIndexNameInstanceNAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.m.WordnetNounIndexNameInstanceNAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.n.WordnetNounIndexNameInstanceNAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.o.WordnetNounIndexNameInstanceNAO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.p.WordnetNounIndexNameInstanceNAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.q.WordnetNounIndexNameInstanceNAQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.r.WordnetNounIndexNameInstanceNAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.s.WordnetNounIndexNameInstanceNAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.t.WordnetNounIndexNameInstanceNAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.u.WordnetNounIndexNameInstanceNAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.v.WordnetNounIndexNameInstanceNAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.w.WordnetNounIndexNameInstanceNAW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.y.WordnetNounIndexNameInstanceNAY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.z.WordnetNounIndexNameInstanceNAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("naa".equals(key)) return WordnetNounIndexNameInstanceNAA.get(TERM);
	if ("nab".equals(key)) return WordnetNounIndexNameInstanceNAB.get(TERM);
	if ("nac".equals(key)) return WordnetNounIndexNameInstanceNAC.get(TERM);
	if ("nad".equals(key)) return WordnetNounIndexNameInstanceNAD.get(TERM);
	if ("nae".equals(key)) return WordnetNounIndexNameInstanceNAE.get(TERM);
	if ("naf".equals(key)) return WordnetNounIndexNameInstanceNAF.get(TERM);
	if ("nag".equals(key)) return WordnetNounIndexNameInstanceNAG.get(TERM);
	if ("nah".equals(key)) return WordnetNounIndexNameInstanceNAH.get(TERM);
	if ("nai".equals(key)) return WordnetNounIndexNameInstanceNAI.get(TERM);
	if ("naj".equals(key)) return WordnetNounIndexNameInstanceNAJ.get(TERM);
	if ("nak".equals(key)) return WordnetNounIndexNameInstanceNAK.get(TERM);
	if ("nal".equals(key)) return WordnetNounIndexNameInstanceNAL.get(TERM);
	if ("nam".equals(key)) return WordnetNounIndexNameInstanceNAM.get(TERM);
	if ("nan".equals(key)) return WordnetNounIndexNameInstanceNAN.get(TERM);
	if ("nao".equals(key)) return WordnetNounIndexNameInstanceNAO.get(TERM);
	if ("nap".equals(key)) return WordnetNounIndexNameInstanceNAP.get(TERM);
	if ("naq".equals(key)) return WordnetNounIndexNameInstanceNAQ.get(TERM);
	if ("nar".equals(key)) return WordnetNounIndexNameInstanceNAR.get(TERM);
	if ("nas".equals(key)) return WordnetNounIndexNameInstanceNAS.get(TERM);
	if ("nat".equals(key)) return WordnetNounIndexNameInstanceNAT.get(TERM);
	if ("nau".equals(key)) return WordnetNounIndexNameInstanceNAU.get(TERM);
	if ("nav".equals(key)) return WordnetNounIndexNameInstanceNAV.get(TERM);
	if ("naw".equals(key)) return WordnetNounIndexNameInstanceNAW.get(TERM);
	if ("nay".equals(key)) return WordnetNounIndexNameInstanceNAY.get(TERM);
	if ("naz".equals(key)) return WordnetNounIndexNameInstanceNAZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNAA.terms());
	set.addAll(WordnetNounIndexNameInstanceNAB.terms());
	set.addAll(WordnetNounIndexNameInstanceNAC.terms());
	set.addAll(WordnetNounIndexNameInstanceNAD.terms());
	set.addAll(WordnetNounIndexNameInstanceNAE.terms());
	set.addAll(WordnetNounIndexNameInstanceNAF.terms());
	set.addAll(WordnetNounIndexNameInstanceNAG.terms());
	set.addAll(WordnetNounIndexNameInstanceNAH.terms());
	set.addAll(WordnetNounIndexNameInstanceNAI.terms());
	set.addAll(WordnetNounIndexNameInstanceNAJ.terms());
	set.addAll(WordnetNounIndexNameInstanceNAK.terms());
	set.addAll(WordnetNounIndexNameInstanceNAL.terms());
	set.addAll(WordnetNounIndexNameInstanceNAM.terms());
	set.addAll(WordnetNounIndexNameInstanceNAN.terms());
	set.addAll(WordnetNounIndexNameInstanceNAO.terms());
	set.addAll(WordnetNounIndexNameInstanceNAP.terms());
	set.addAll(WordnetNounIndexNameInstanceNAQ.terms());
	set.addAll(WordnetNounIndexNameInstanceNAR.terms());
	set.addAll(WordnetNounIndexNameInstanceNAS.terms());
	set.addAll(WordnetNounIndexNameInstanceNAT.terms());
	set.addAll(WordnetNounIndexNameInstanceNAU.terms());
	set.addAll(WordnetNounIndexNameInstanceNAV.terms());
	set.addAll(WordnetNounIndexNameInstanceNAW.terms());
	set.addAll(WordnetNounIndexNameInstanceNAY.terms());
	set.addAll(WordnetNounIndexNameInstanceNAZ.terms());
  		return set; 	} }