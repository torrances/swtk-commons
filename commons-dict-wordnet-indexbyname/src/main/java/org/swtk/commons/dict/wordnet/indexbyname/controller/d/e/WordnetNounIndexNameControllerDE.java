package org.swtk.commons.dict.wordnet.indexbyname.controller.d.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.a.WordnetNounIndexNameInstanceDEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.b.WordnetNounIndexNameInstanceDEB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.c.WordnetNounIndexNameInstanceDEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.d.WordnetNounIndexNameInstanceDED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.e.WordnetNounIndexNameInstanceDEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.f.WordnetNounIndexNameInstanceDEF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.g.WordnetNounIndexNameInstanceDEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.h.WordnetNounIndexNameInstanceDEH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.i.WordnetNounIndexNameInstanceDEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.j.WordnetNounIndexNameInstanceDEJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.k.WordnetNounIndexNameInstanceDEK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.l.WordnetNounIndexNameInstanceDEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.m.WordnetNounIndexNameInstanceDEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.n.WordnetNounIndexNameInstanceDEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.o.WordnetNounIndexNameInstanceDEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.p.WordnetNounIndexNameInstanceDEP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.r.WordnetNounIndexNameInstanceDER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.s.WordnetNounIndexNameInstanceDES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.t.WordnetNounIndexNameInstanceDET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.u.WordnetNounIndexNameInstanceDEU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.v.WordnetNounIndexNameInstanceDEV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.w.WordnetNounIndexNameInstanceDEW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.x.WordnetNounIndexNameInstanceDEX;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("dea".equals(key)) return WordnetNounIndexNameInstanceDEA.get(TERM);
	if ("deb".equals(key)) return WordnetNounIndexNameInstanceDEB.get(TERM);
	if ("dec".equals(key)) return WordnetNounIndexNameInstanceDEC.get(TERM);
	if ("ded".equals(key)) return WordnetNounIndexNameInstanceDED.get(TERM);
	if ("dee".equals(key)) return WordnetNounIndexNameInstanceDEE.get(TERM);
	if ("def".equals(key)) return WordnetNounIndexNameInstanceDEF.get(TERM);
	if ("deg".equals(key)) return WordnetNounIndexNameInstanceDEG.get(TERM);
	if ("deh".equals(key)) return WordnetNounIndexNameInstanceDEH.get(TERM);
	if ("dei".equals(key)) return WordnetNounIndexNameInstanceDEI.get(TERM);
	if ("dej".equals(key)) return WordnetNounIndexNameInstanceDEJ.get(TERM);
	if ("dek".equals(key)) return WordnetNounIndexNameInstanceDEK.get(TERM);
	if ("del".equals(key)) return WordnetNounIndexNameInstanceDEL.get(TERM);
	if ("dem".equals(key)) return WordnetNounIndexNameInstanceDEM.get(TERM);
	if ("den".equals(key)) return WordnetNounIndexNameInstanceDEN.get(TERM);
	if ("deo".equals(key)) return WordnetNounIndexNameInstanceDEO.get(TERM);
	if ("dep".equals(key)) return WordnetNounIndexNameInstanceDEP.get(TERM);
	if ("der".equals(key)) return WordnetNounIndexNameInstanceDER.get(TERM);
	if ("des".equals(key)) return WordnetNounIndexNameInstanceDES.get(TERM);
	if ("det".equals(key)) return WordnetNounIndexNameInstanceDET.get(TERM);
	if ("deu".equals(key)) return WordnetNounIndexNameInstanceDEU.get(TERM);
	if ("dev".equals(key)) return WordnetNounIndexNameInstanceDEV.get(TERM);
	if ("dew".equals(key)) return WordnetNounIndexNameInstanceDEW.get(TERM);
	if ("dex".equals(key)) return WordnetNounIndexNameInstanceDEX.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDEA.terms());
	set.addAll(WordnetNounIndexNameInstanceDEB.terms());
	set.addAll(WordnetNounIndexNameInstanceDEC.terms());
	set.addAll(WordnetNounIndexNameInstanceDED.terms());
	set.addAll(WordnetNounIndexNameInstanceDEE.terms());
	set.addAll(WordnetNounIndexNameInstanceDEF.terms());
	set.addAll(WordnetNounIndexNameInstanceDEG.terms());
	set.addAll(WordnetNounIndexNameInstanceDEH.terms());
	set.addAll(WordnetNounIndexNameInstanceDEI.terms());
	set.addAll(WordnetNounIndexNameInstanceDEJ.terms());
	set.addAll(WordnetNounIndexNameInstanceDEK.terms());
	set.addAll(WordnetNounIndexNameInstanceDEL.terms());
	set.addAll(WordnetNounIndexNameInstanceDEM.terms());
	set.addAll(WordnetNounIndexNameInstanceDEN.terms());
	set.addAll(WordnetNounIndexNameInstanceDEO.terms());
	set.addAll(WordnetNounIndexNameInstanceDEP.terms());
	set.addAll(WordnetNounIndexNameInstanceDER.terms());
	set.addAll(WordnetNounIndexNameInstanceDES.terms());
	set.addAll(WordnetNounIndexNameInstanceDET.terms());
	set.addAll(WordnetNounIndexNameInstanceDEU.terms());
	set.addAll(WordnetNounIndexNameInstanceDEV.terms());
	set.addAll(WordnetNounIndexNameInstanceDEW.terms());
	set.addAll(WordnetNounIndexNameInstanceDEX.terms());
  		return set; 	} }