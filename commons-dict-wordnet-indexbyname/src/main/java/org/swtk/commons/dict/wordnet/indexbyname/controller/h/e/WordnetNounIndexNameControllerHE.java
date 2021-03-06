package org.swtk.commons.dict.wordnet.indexbyname.controller.h.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.a.WordnetNounIndexNameInstanceHEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.b.WordnetNounIndexNameInstanceHEB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.c.WordnetNounIndexNameInstanceHEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.d.WordnetNounIndexNameInstanceHED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.e.WordnetNounIndexNameInstanceHEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.f.WordnetNounIndexNameInstanceHEF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.g.WordnetNounIndexNameInstanceHEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.i.WordnetNounIndexNameInstanceHEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.j.WordnetNounIndexNameInstanceHEJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.l.WordnetNounIndexNameInstanceHEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.m.WordnetNounIndexNameInstanceHEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.n.WordnetNounIndexNameInstanceHEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.p.WordnetNounIndexNameInstanceHEP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.r.WordnetNounIndexNameInstanceHER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.s.WordnetNounIndexNameInstanceHES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.t.WordnetNounIndexNameInstanceHET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.u.WordnetNounIndexNameInstanceHEU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.v.WordnetNounIndexNameInstanceHEV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.w.WordnetNounIndexNameInstanceHEW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.x.WordnetNounIndexNameInstanceHEX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.y.WordnetNounIndexNameInstanceHEY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.z.WordnetNounIndexNameInstanceHEZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerHE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("hea".equals(key)) return WordnetNounIndexNameInstanceHEA.get(TERM);
	if ("heb".equals(key)) return WordnetNounIndexNameInstanceHEB.get(TERM);
	if ("hec".equals(key)) return WordnetNounIndexNameInstanceHEC.get(TERM);
	if ("hed".equals(key)) return WordnetNounIndexNameInstanceHED.get(TERM);
	if ("hee".equals(key)) return WordnetNounIndexNameInstanceHEE.get(TERM);
	if ("hef".equals(key)) return WordnetNounIndexNameInstanceHEF.get(TERM);
	if ("heg".equals(key)) return WordnetNounIndexNameInstanceHEG.get(TERM);
	if ("hei".equals(key)) return WordnetNounIndexNameInstanceHEI.get(TERM);
	if ("hej".equals(key)) return WordnetNounIndexNameInstanceHEJ.get(TERM);
	if ("hel".equals(key)) return WordnetNounIndexNameInstanceHEL.get(TERM);
	if ("hem".equals(key)) return WordnetNounIndexNameInstanceHEM.get(TERM);
	if ("hen".equals(key)) return WordnetNounIndexNameInstanceHEN.get(TERM);
	if ("hep".equals(key)) return WordnetNounIndexNameInstanceHEP.get(TERM);
	if ("her".equals(key)) return WordnetNounIndexNameInstanceHER.get(TERM);
	if ("hes".equals(key)) return WordnetNounIndexNameInstanceHES.get(TERM);
	if ("het".equals(key)) return WordnetNounIndexNameInstanceHET.get(TERM);
	if ("heu".equals(key)) return WordnetNounIndexNameInstanceHEU.get(TERM);
	if ("hev".equals(key)) return WordnetNounIndexNameInstanceHEV.get(TERM);
	if ("hew".equals(key)) return WordnetNounIndexNameInstanceHEW.get(TERM);
	if ("hex".equals(key)) return WordnetNounIndexNameInstanceHEX.get(TERM);
	if ("hey".equals(key)) return WordnetNounIndexNameInstanceHEY.get(TERM);
	if ("hez".equals(key)) return WordnetNounIndexNameInstanceHEZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceHEA.terms());
	set.addAll(WordnetNounIndexNameInstanceHEB.terms());
	set.addAll(WordnetNounIndexNameInstanceHEC.terms());
	set.addAll(WordnetNounIndexNameInstanceHED.terms());
	set.addAll(WordnetNounIndexNameInstanceHEE.terms());
	set.addAll(WordnetNounIndexNameInstanceHEF.terms());
	set.addAll(WordnetNounIndexNameInstanceHEG.terms());
	set.addAll(WordnetNounIndexNameInstanceHEI.terms());
	set.addAll(WordnetNounIndexNameInstanceHEJ.terms());
	set.addAll(WordnetNounIndexNameInstanceHEL.terms());
	set.addAll(WordnetNounIndexNameInstanceHEM.terms());
	set.addAll(WordnetNounIndexNameInstanceHEN.terms());
	set.addAll(WordnetNounIndexNameInstanceHEP.terms());
	set.addAll(WordnetNounIndexNameInstanceHER.terms());
	set.addAll(WordnetNounIndexNameInstanceHES.terms());
	set.addAll(WordnetNounIndexNameInstanceHET.terms());
	set.addAll(WordnetNounIndexNameInstanceHEU.terms());
	set.addAll(WordnetNounIndexNameInstanceHEV.terms());
	set.addAll(WordnetNounIndexNameInstanceHEW.terms());
	set.addAll(WordnetNounIndexNameInstanceHEX.terms());
	set.addAll(WordnetNounIndexNameInstanceHEY.terms());
	set.addAll(WordnetNounIndexNameInstanceHEZ.terms());
  		return set; 	} }