package org.swtk.commons.dict.wordnet.indexbyname.controller.g.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.a.WordnetNounIndexNameInstanceGAA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.b.WordnetNounIndexNameInstanceGAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.d.WordnetNounIndexNameInstanceGAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.e.WordnetNounIndexNameInstanceGAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.f.WordnetNounIndexNameInstanceGAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.g.WordnetNounIndexNameInstanceGAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.i.WordnetNounIndexNameInstanceGAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.l.WordnetNounIndexNameInstanceGAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.m.WordnetNounIndexNameInstanceGAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.n.WordnetNounIndexNameInstanceGAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.o.WordnetNounIndexNameInstanceGAO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.p.WordnetNounIndexNameInstanceGAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.r.WordnetNounIndexNameInstanceGAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.s.WordnetNounIndexNameInstanceGAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.t.WordnetNounIndexNameInstanceGAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.u.WordnetNounIndexNameInstanceGAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.v.WordnetNounIndexNameInstanceGAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.w.WordnetNounIndexNameInstanceGAW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.y.WordnetNounIndexNameInstanceGAY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.z.WordnetNounIndexNameInstanceGAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("gaa".equals(key)) return WordnetNounIndexNameInstanceGAA.get(TERM);
	if ("gab".equals(key)) return WordnetNounIndexNameInstanceGAB.get(TERM);
	if ("gad".equals(key)) return WordnetNounIndexNameInstanceGAD.get(TERM);
	if ("gae".equals(key)) return WordnetNounIndexNameInstanceGAE.get(TERM);
	if ("gaf".equals(key)) return WordnetNounIndexNameInstanceGAF.get(TERM);
	if ("gag".equals(key)) return WordnetNounIndexNameInstanceGAG.get(TERM);
	if ("gai".equals(key)) return WordnetNounIndexNameInstanceGAI.get(TERM);
	if ("gal".equals(key)) return WordnetNounIndexNameInstanceGAL.get(TERM);
	if ("gam".equals(key)) return WordnetNounIndexNameInstanceGAM.get(TERM);
	if ("gan".equals(key)) return WordnetNounIndexNameInstanceGAN.get(TERM);
	if ("gao".equals(key)) return WordnetNounIndexNameInstanceGAO.get(TERM);
	if ("gap".equals(key)) return WordnetNounIndexNameInstanceGAP.get(TERM);
	if ("gar".equals(key)) return WordnetNounIndexNameInstanceGAR.get(TERM);
	if ("gas".equals(key)) return WordnetNounIndexNameInstanceGAS.get(TERM);
	if ("gat".equals(key)) return WordnetNounIndexNameInstanceGAT.get(TERM);
	if ("gau".equals(key)) return WordnetNounIndexNameInstanceGAU.get(TERM);
	if ("gav".equals(key)) return WordnetNounIndexNameInstanceGAV.get(TERM);
	if ("gaw".equals(key)) return WordnetNounIndexNameInstanceGAW.get(TERM);
	if ("gay".equals(key)) return WordnetNounIndexNameInstanceGAY.get(TERM);
	if ("gaz".equals(key)) return WordnetNounIndexNameInstanceGAZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGAA.terms());
	set.addAll(WordnetNounIndexNameInstanceGAB.terms());
	set.addAll(WordnetNounIndexNameInstanceGAD.terms());
	set.addAll(WordnetNounIndexNameInstanceGAE.terms());
	set.addAll(WordnetNounIndexNameInstanceGAF.terms());
	set.addAll(WordnetNounIndexNameInstanceGAG.terms());
	set.addAll(WordnetNounIndexNameInstanceGAI.terms());
	set.addAll(WordnetNounIndexNameInstanceGAL.terms());
	set.addAll(WordnetNounIndexNameInstanceGAM.terms());
	set.addAll(WordnetNounIndexNameInstanceGAN.terms());
	set.addAll(WordnetNounIndexNameInstanceGAO.terms());
	set.addAll(WordnetNounIndexNameInstanceGAP.terms());
	set.addAll(WordnetNounIndexNameInstanceGAR.terms());
	set.addAll(WordnetNounIndexNameInstanceGAS.terms());
	set.addAll(WordnetNounIndexNameInstanceGAT.terms());
	set.addAll(WordnetNounIndexNameInstanceGAU.terms());
	set.addAll(WordnetNounIndexNameInstanceGAV.terms());
	set.addAll(WordnetNounIndexNameInstanceGAW.terms());
	set.addAll(WordnetNounIndexNameInstanceGAY.terms());
	set.addAll(WordnetNounIndexNameInstanceGAZ.terms());
  		return set; 	} }