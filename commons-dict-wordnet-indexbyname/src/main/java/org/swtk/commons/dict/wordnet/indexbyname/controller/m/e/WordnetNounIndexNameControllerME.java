package org.swtk.commons.dict.wordnet.indexbyname.controller.m.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.a.WordnetNounIndexNameInstanceMEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.b.WordnetNounIndexNameInstanceMEB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.c.WordnetNounIndexNameInstanceMEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.d.WordnetNounIndexNameInstanceMED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.e.WordnetNounIndexNameInstanceMEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.f.WordnetNounIndexNameInstanceMEF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.g.WordnetNounIndexNameInstanceMEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.i.WordnetNounIndexNameInstanceMEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.k.WordnetNounIndexNameInstanceMEK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.l.WordnetNounIndexNameInstanceMEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.m.WordnetNounIndexNameInstanceMEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.n.WordnetNounIndexNameInstanceMEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.o.WordnetNounIndexNameInstanceMEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.p.WordnetNounIndexNameInstanceMEP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.r.WordnetNounIndexNameInstanceMER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.s.WordnetNounIndexNameInstanceMES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.t.WordnetNounIndexNameInstanceMET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.u.WordnetNounIndexNameInstanceMEU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.v.WordnetNounIndexNameInstanceMEV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.w.WordnetNounIndexNameInstanceMEW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.x.WordnetNounIndexNameInstanceMEX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.y.WordnetNounIndexNameInstanceMEY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.z.WordnetNounIndexNameInstanceMEZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerME {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mea".equals(key)) return WordnetNounIndexNameInstanceMEA.get(TERM);
	if ("meb".equals(key)) return WordnetNounIndexNameInstanceMEB.get(TERM);
	if ("mec".equals(key)) return WordnetNounIndexNameInstanceMEC.get(TERM);
	if ("med".equals(key)) return WordnetNounIndexNameInstanceMED.get(TERM);
	if ("mee".equals(key)) return WordnetNounIndexNameInstanceMEE.get(TERM);
	if ("mef".equals(key)) return WordnetNounIndexNameInstanceMEF.get(TERM);
	if ("meg".equals(key)) return WordnetNounIndexNameInstanceMEG.get(TERM);
	if ("mei".equals(key)) return WordnetNounIndexNameInstanceMEI.get(TERM);
	if ("mek".equals(key)) return WordnetNounIndexNameInstanceMEK.get(TERM);
	if ("mel".equals(key)) return WordnetNounIndexNameInstanceMEL.get(TERM);
	if ("mem".equals(key)) return WordnetNounIndexNameInstanceMEM.get(TERM);
	if ("men".equals(key)) return WordnetNounIndexNameInstanceMEN.get(TERM);
	if ("meo".equals(key)) return WordnetNounIndexNameInstanceMEO.get(TERM);
	if ("mep".equals(key)) return WordnetNounIndexNameInstanceMEP.get(TERM);
	if ("mer".equals(key)) return WordnetNounIndexNameInstanceMER.get(TERM);
	if ("mes".equals(key)) return WordnetNounIndexNameInstanceMES.get(TERM);
	if ("met".equals(key)) return WordnetNounIndexNameInstanceMET.get(TERM);
	if ("meu".equals(key)) return WordnetNounIndexNameInstanceMEU.get(TERM);
	if ("mev".equals(key)) return WordnetNounIndexNameInstanceMEV.get(TERM);
	if ("mew".equals(key)) return WordnetNounIndexNameInstanceMEW.get(TERM);
	if ("mex".equals(key)) return WordnetNounIndexNameInstanceMEX.get(TERM);
	if ("mey".equals(key)) return WordnetNounIndexNameInstanceMEY.get(TERM);
	if ("mez".equals(key)) return WordnetNounIndexNameInstanceMEZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMEA.terms());
	set.addAll(WordnetNounIndexNameInstanceMEB.terms());
	set.addAll(WordnetNounIndexNameInstanceMEC.terms());
	set.addAll(WordnetNounIndexNameInstanceMED.terms());
	set.addAll(WordnetNounIndexNameInstanceMEE.terms());
	set.addAll(WordnetNounIndexNameInstanceMEF.terms());
	set.addAll(WordnetNounIndexNameInstanceMEG.terms());
	set.addAll(WordnetNounIndexNameInstanceMEI.terms());
	set.addAll(WordnetNounIndexNameInstanceMEK.terms());
	set.addAll(WordnetNounIndexNameInstanceMEL.terms());
	set.addAll(WordnetNounIndexNameInstanceMEM.terms());
	set.addAll(WordnetNounIndexNameInstanceMEN.terms());
	set.addAll(WordnetNounIndexNameInstanceMEO.terms());
	set.addAll(WordnetNounIndexNameInstanceMEP.terms());
	set.addAll(WordnetNounIndexNameInstanceMER.terms());
	set.addAll(WordnetNounIndexNameInstanceMES.terms());
	set.addAll(WordnetNounIndexNameInstanceMET.terms());
	set.addAll(WordnetNounIndexNameInstanceMEU.terms());
	set.addAll(WordnetNounIndexNameInstanceMEV.terms());
	set.addAll(WordnetNounIndexNameInstanceMEW.terms());
	set.addAll(WordnetNounIndexNameInstanceMEX.terms());
	set.addAll(WordnetNounIndexNameInstanceMEY.terms());
	set.addAll(WordnetNounIndexNameInstanceMEZ.terms());
  		return set; 	} }