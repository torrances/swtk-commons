package org.swtk.commons.dict.wordnet.indexbyname.controller.l.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.a.WordnetNounIndexNameInstanceLAA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.b.WordnetNounIndexNameInstanceLAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.c.WordnetNounIndexNameInstanceLAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.d.WordnetNounIndexNameInstanceLAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.e.WordnetNounIndexNameInstanceLAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.f.WordnetNounIndexNameInstanceLAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.g.WordnetNounIndexNameInstanceLAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.h.WordnetNounIndexNameInstanceLAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.i.WordnetNounIndexNameInstanceLAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.k.WordnetNounIndexNameInstanceLAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.l.WordnetNounIndexNameInstanceLAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.m.WordnetNounIndexNameInstanceLAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.n.WordnetNounIndexNameInstanceLAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.o.WordnetNounIndexNameInstanceLAO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.p.WordnetNounIndexNameInstanceLAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.r.WordnetNounIndexNameInstanceLAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.s.WordnetNounIndexNameInstanceLAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.t.WordnetNounIndexNameInstanceLAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.u.WordnetNounIndexNameInstanceLAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.v.WordnetNounIndexNameInstanceLAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.w.WordnetNounIndexNameInstanceLAW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.x.WordnetNounIndexNameInstanceLAX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.y.WordnetNounIndexNameInstanceLAY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.z.WordnetNounIndexNameInstanceLAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("laa".equals(key)) return WordnetNounIndexNameInstanceLAA.get(TERM);
	if ("lab".equals(key)) return WordnetNounIndexNameInstanceLAB.get(TERM);
	if ("lac".equals(key)) return WordnetNounIndexNameInstanceLAC.get(TERM);
	if ("lad".equals(key)) return WordnetNounIndexNameInstanceLAD.get(TERM);
	if ("lae".equals(key)) return WordnetNounIndexNameInstanceLAE.get(TERM);
	if ("laf".equals(key)) return WordnetNounIndexNameInstanceLAF.get(TERM);
	if ("lag".equals(key)) return WordnetNounIndexNameInstanceLAG.get(TERM);
	if ("lah".equals(key)) return WordnetNounIndexNameInstanceLAH.get(TERM);
	if ("lai".equals(key)) return WordnetNounIndexNameInstanceLAI.get(TERM);
	if ("lak".equals(key)) return WordnetNounIndexNameInstanceLAK.get(TERM);
	if ("lal".equals(key)) return WordnetNounIndexNameInstanceLAL.get(TERM);
	if ("lam".equals(key)) return WordnetNounIndexNameInstanceLAM.get(TERM);
	if ("lan".equals(key)) return WordnetNounIndexNameInstanceLAN.get(TERM);
	if ("lao".equals(key)) return WordnetNounIndexNameInstanceLAO.get(TERM);
	if ("lap".equals(key)) return WordnetNounIndexNameInstanceLAP.get(TERM);
	if ("lar".equals(key)) return WordnetNounIndexNameInstanceLAR.get(TERM);
	if ("las".equals(key)) return WordnetNounIndexNameInstanceLAS.get(TERM);
	if ("lat".equals(key)) return WordnetNounIndexNameInstanceLAT.get(TERM);
	if ("lau".equals(key)) return WordnetNounIndexNameInstanceLAU.get(TERM);
	if ("lav".equals(key)) return WordnetNounIndexNameInstanceLAV.get(TERM);
	if ("law".equals(key)) return WordnetNounIndexNameInstanceLAW.get(TERM);
	if ("lax".equals(key)) return WordnetNounIndexNameInstanceLAX.get(TERM);
	if ("lay".equals(key)) return WordnetNounIndexNameInstanceLAY.get(TERM);
	if ("laz".equals(key)) return WordnetNounIndexNameInstanceLAZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLAA.terms());
	set.addAll(WordnetNounIndexNameInstanceLAB.terms());
	set.addAll(WordnetNounIndexNameInstanceLAC.terms());
	set.addAll(WordnetNounIndexNameInstanceLAD.terms());
	set.addAll(WordnetNounIndexNameInstanceLAE.terms());
	set.addAll(WordnetNounIndexNameInstanceLAF.terms());
	set.addAll(WordnetNounIndexNameInstanceLAG.terms());
	set.addAll(WordnetNounIndexNameInstanceLAH.terms());
	set.addAll(WordnetNounIndexNameInstanceLAI.terms());
	set.addAll(WordnetNounIndexNameInstanceLAK.terms());
	set.addAll(WordnetNounIndexNameInstanceLAL.terms());
	set.addAll(WordnetNounIndexNameInstanceLAM.terms());
	set.addAll(WordnetNounIndexNameInstanceLAN.terms());
	set.addAll(WordnetNounIndexNameInstanceLAO.terms());
	set.addAll(WordnetNounIndexNameInstanceLAP.terms());
	set.addAll(WordnetNounIndexNameInstanceLAR.terms());
	set.addAll(WordnetNounIndexNameInstanceLAS.terms());
	set.addAll(WordnetNounIndexNameInstanceLAT.terms());
	set.addAll(WordnetNounIndexNameInstanceLAU.terms());
	set.addAll(WordnetNounIndexNameInstanceLAV.terms());
	set.addAll(WordnetNounIndexNameInstanceLAW.terms());
	set.addAll(WordnetNounIndexNameInstanceLAX.terms());
	set.addAll(WordnetNounIndexNameInstanceLAY.terms());
	set.addAll(WordnetNounIndexNameInstanceLAZ.terms());
  		return set; 	} }