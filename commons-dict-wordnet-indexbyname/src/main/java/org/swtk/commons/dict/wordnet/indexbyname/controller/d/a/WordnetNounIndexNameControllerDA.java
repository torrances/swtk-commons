package org.swtk.commons.dict.wordnet.indexbyname.controller.d.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.b.WordnetNounIndexNameInstanceDAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.c.WordnetNounIndexNameInstanceDAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.d.WordnetNounIndexNameInstanceDAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.e.WordnetNounIndexNameInstanceDAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.f.WordnetNounIndexNameInstanceDAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.g.WordnetNounIndexNameInstanceDAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.h.WordnetNounIndexNameInstanceDAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.i.WordnetNounIndexNameInstanceDAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.k.WordnetNounIndexNameInstanceDAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.l.WordnetNounIndexNameInstanceDAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.m.WordnetNounIndexNameInstanceDAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.n.WordnetNounIndexNameInstanceDAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.o.WordnetNounIndexNameInstanceDAO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.p.WordnetNounIndexNameInstanceDAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.r.WordnetNounIndexNameInstanceDAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.s.WordnetNounIndexNameInstanceDAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.t.WordnetNounIndexNameInstanceDAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.u.WordnetNounIndexNameInstanceDAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.v.WordnetNounIndexNameInstanceDAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.w.WordnetNounIndexNameInstanceDAW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.y.WordnetNounIndexNameInstanceDAY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.z.WordnetNounIndexNameInstanceDAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("dab".equals(key)) return WordnetNounIndexNameInstanceDAB.get(TERM);
	if ("dac".equals(key)) return WordnetNounIndexNameInstanceDAC.get(TERM);
	if ("dad".equals(key)) return WordnetNounIndexNameInstanceDAD.get(TERM);
	if ("dae".equals(key)) return WordnetNounIndexNameInstanceDAE.get(TERM);
	if ("daf".equals(key)) return WordnetNounIndexNameInstanceDAF.get(TERM);
	if ("dag".equals(key)) return WordnetNounIndexNameInstanceDAG.get(TERM);
	if ("dah".equals(key)) return WordnetNounIndexNameInstanceDAH.get(TERM);
	if ("dai".equals(key)) return WordnetNounIndexNameInstanceDAI.get(TERM);
	if ("dak".equals(key)) return WordnetNounIndexNameInstanceDAK.get(TERM);
	if ("dal".equals(key)) return WordnetNounIndexNameInstanceDAL.get(TERM);
	if ("dam".equals(key)) return WordnetNounIndexNameInstanceDAM.get(TERM);
	if ("dan".equals(key)) return WordnetNounIndexNameInstanceDAN.get(TERM);
	if ("dao".equals(key)) return WordnetNounIndexNameInstanceDAO.get(TERM);
	if ("dap".equals(key)) return WordnetNounIndexNameInstanceDAP.get(TERM);
	if ("dar".equals(key)) return WordnetNounIndexNameInstanceDAR.get(TERM);
	if ("das".equals(key)) return WordnetNounIndexNameInstanceDAS.get(TERM);
	if ("dat".equals(key)) return WordnetNounIndexNameInstanceDAT.get(TERM);
	if ("dau".equals(key)) return WordnetNounIndexNameInstanceDAU.get(TERM);
	if ("dav".equals(key)) return WordnetNounIndexNameInstanceDAV.get(TERM);
	if ("daw".equals(key)) return WordnetNounIndexNameInstanceDAW.get(TERM);
	if ("day".equals(key)) return WordnetNounIndexNameInstanceDAY.get(TERM);
	if ("daz".equals(key)) return WordnetNounIndexNameInstanceDAZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDAB.terms());
	set.addAll(WordnetNounIndexNameInstanceDAC.terms());
	set.addAll(WordnetNounIndexNameInstanceDAD.terms());
	set.addAll(WordnetNounIndexNameInstanceDAE.terms());
	set.addAll(WordnetNounIndexNameInstanceDAF.terms());
	set.addAll(WordnetNounIndexNameInstanceDAG.terms());
	set.addAll(WordnetNounIndexNameInstanceDAH.terms());
	set.addAll(WordnetNounIndexNameInstanceDAI.terms());
	set.addAll(WordnetNounIndexNameInstanceDAK.terms());
	set.addAll(WordnetNounIndexNameInstanceDAL.terms());
	set.addAll(WordnetNounIndexNameInstanceDAM.terms());
	set.addAll(WordnetNounIndexNameInstanceDAN.terms());
	set.addAll(WordnetNounIndexNameInstanceDAO.terms());
	set.addAll(WordnetNounIndexNameInstanceDAP.terms());
	set.addAll(WordnetNounIndexNameInstanceDAR.terms());
	set.addAll(WordnetNounIndexNameInstanceDAS.terms());
	set.addAll(WordnetNounIndexNameInstanceDAT.terms());
	set.addAll(WordnetNounIndexNameInstanceDAU.terms());
	set.addAll(WordnetNounIndexNameInstanceDAV.terms());
	set.addAll(WordnetNounIndexNameInstanceDAW.terms());
	set.addAll(WordnetNounIndexNameInstanceDAY.terms());
	set.addAll(WordnetNounIndexNameInstanceDAZ.terms());
  		return set; 	} }