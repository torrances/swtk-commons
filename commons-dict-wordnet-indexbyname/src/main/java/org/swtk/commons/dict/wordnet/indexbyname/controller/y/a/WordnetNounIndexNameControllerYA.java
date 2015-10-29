package org.swtk.commons.dict.wordnet.indexbyname.controller.y.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.c.WordnetNounIndexNameInstanceYAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.f.WordnetNounIndexNameInstanceYAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.g.WordnetNounIndexNameInstanceYAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.h.WordnetNounIndexNameInstanceYAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.k.WordnetNounIndexNameInstanceYAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.l.WordnetNounIndexNameInstanceYAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.m.WordnetNounIndexNameInstanceYAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.n.WordnetNounIndexNameInstanceYAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.o.WordnetNounIndexNameInstanceYAO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.r.WordnetNounIndexNameInstanceYAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.s.WordnetNounIndexNameInstanceYAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.t.WordnetNounIndexNameInstanceYAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.u.WordnetNounIndexNameInstanceYAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.v.WordnetNounIndexNameInstanceYAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.w.WordnetNounIndexNameInstanceYAW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.z.WordnetNounIndexNameInstanceYAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("yac".equals(key)) return WordnetNounIndexNameInstanceYAC.get(TERM);
	if ("yaf".equals(key)) return WordnetNounIndexNameInstanceYAF.get(TERM);
	if ("yag".equals(key)) return WordnetNounIndexNameInstanceYAG.get(TERM);
	if ("yah".equals(key)) return WordnetNounIndexNameInstanceYAH.get(TERM);
	if ("yak".equals(key)) return WordnetNounIndexNameInstanceYAK.get(TERM);
	if ("yal".equals(key)) return WordnetNounIndexNameInstanceYAL.get(TERM);
	if ("yam".equals(key)) return WordnetNounIndexNameInstanceYAM.get(TERM);
	if ("yan".equals(key)) return WordnetNounIndexNameInstanceYAN.get(TERM);
	if ("yao".equals(key)) return WordnetNounIndexNameInstanceYAO.get(TERM);
	if ("yar".equals(key)) return WordnetNounIndexNameInstanceYAR.get(TERM);
	if ("yas".equals(key)) return WordnetNounIndexNameInstanceYAS.get(TERM);
	if ("yat".equals(key)) return WordnetNounIndexNameInstanceYAT.get(TERM);
	if ("yau".equals(key)) return WordnetNounIndexNameInstanceYAU.get(TERM);
	if ("yav".equals(key)) return WordnetNounIndexNameInstanceYAV.get(TERM);
	if ("yaw".equals(key)) return WordnetNounIndexNameInstanceYAW.get(TERM);
	if ("yaz".equals(key)) return WordnetNounIndexNameInstanceYAZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYAC.terms());
	set.addAll(WordnetNounIndexNameInstanceYAF.terms());
	set.addAll(WordnetNounIndexNameInstanceYAG.terms());
	set.addAll(WordnetNounIndexNameInstanceYAH.terms());
	set.addAll(WordnetNounIndexNameInstanceYAK.terms());
	set.addAll(WordnetNounIndexNameInstanceYAL.terms());
	set.addAll(WordnetNounIndexNameInstanceYAM.terms());
	set.addAll(WordnetNounIndexNameInstanceYAN.terms());
	set.addAll(WordnetNounIndexNameInstanceYAO.terms());
	set.addAll(WordnetNounIndexNameInstanceYAR.terms());
	set.addAll(WordnetNounIndexNameInstanceYAS.terms());
	set.addAll(WordnetNounIndexNameInstanceYAT.terms());
	set.addAll(WordnetNounIndexNameInstanceYAU.terms());
	set.addAll(WordnetNounIndexNameInstanceYAV.terms());
	set.addAll(WordnetNounIndexNameInstanceYAW.terms());
	set.addAll(WordnetNounIndexNameInstanceYAZ.terms());
  		return set; 	} }