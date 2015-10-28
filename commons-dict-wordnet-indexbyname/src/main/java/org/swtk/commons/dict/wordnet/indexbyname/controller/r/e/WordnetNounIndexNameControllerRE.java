package org.swtk.commons.dict.wordnet.indexbyname.controller.r.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.a.WordnetNounIndexNameInstanceREA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.b.WordnetNounIndexNameInstanceREB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.c.WordnetNounIndexNameInstanceREC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.d.WordnetNounIndexNameInstanceRED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.e.WordnetNounIndexNameInstanceREE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.f.WordnetNounIndexNameInstanceREF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.g.WordnetNounIndexNameInstanceREG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.h.WordnetNounIndexNameInstanceREH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.i.WordnetNounIndexNameInstanceREI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.j.WordnetNounIndexNameInstanceREJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.l.WordnetNounIndexNameInstanceREL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.m.WordnetNounIndexNameInstanceREM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.n.WordnetNounIndexNameInstanceREN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.o.WordnetNounIndexNameInstanceREO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.p.WordnetNounIndexNameInstanceREP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.q.WordnetNounIndexNameInstanceREQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.r.WordnetNounIndexNameInstanceRER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.s.WordnetNounIndexNameInstanceRES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.t.WordnetNounIndexNameInstanceRET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.u.WordnetNounIndexNameInstanceREU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.v.WordnetNounIndexNameInstanceREV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.w.WordnetNounIndexNameInstanceREW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.y.WordnetNounIndexNameInstanceREY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerRE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("rea".equals(key)) return WordnetNounIndexNameInstanceREA.get(TERM);
	if ("reb".equals(key)) return WordnetNounIndexNameInstanceREB.get(TERM);
	if ("rec".equals(key)) return WordnetNounIndexNameInstanceREC.get(TERM);
	if ("red".equals(key)) return WordnetNounIndexNameInstanceRED.get(TERM);
	if ("ree".equals(key)) return WordnetNounIndexNameInstanceREE.get(TERM);
	if ("ref".equals(key)) return WordnetNounIndexNameInstanceREF.get(TERM);
	if ("reg".equals(key)) return WordnetNounIndexNameInstanceREG.get(TERM);
	if ("reh".equals(key)) return WordnetNounIndexNameInstanceREH.get(TERM);
	if ("rei".equals(key)) return WordnetNounIndexNameInstanceREI.get(TERM);
	if ("rej".equals(key)) return WordnetNounIndexNameInstanceREJ.get(TERM);
	if ("rel".equals(key)) return WordnetNounIndexNameInstanceREL.get(TERM);
	if ("rem".equals(key)) return WordnetNounIndexNameInstanceREM.get(TERM);
	if ("ren".equals(key)) return WordnetNounIndexNameInstanceREN.get(TERM);
	if ("reo".equals(key)) return WordnetNounIndexNameInstanceREO.get(TERM);
	if ("rep".equals(key)) return WordnetNounIndexNameInstanceREP.get(TERM);
	if ("req".equals(key)) return WordnetNounIndexNameInstanceREQ.get(TERM);
	if ("rer".equals(key)) return WordnetNounIndexNameInstanceRER.get(TERM);
	if ("res".equals(key)) return WordnetNounIndexNameInstanceRES.get(TERM);
	if ("ret".equals(key)) return WordnetNounIndexNameInstanceRET.get(TERM);
	if ("reu".equals(key)) return WordnetNounIndexNameInstanceREU.get(TERM);
	if ("rev".equals(key)) return WordnetNounIndexNameInstanceREV.get(TERM);
	if ("rew".equals(key)) return WordnetNounIndexNameInstanceREW.get(TERM);
	if ("rey".equals(key)) return WordnetNounIndexNameInstanceREY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceREA.terms());
	set.addAll(WordnetNounIndexNameInstanceREB.terms());
	set.addAll(WordnetNounIndexNameInstanceREC.terms());
	set.addAll(WordnetNounIndexNameInstanceRED.terms());
	set.addAll(WordnetNounIndexNameInstanceREE.terms());
	set.addAll(WordnetNounIndexNameInstanceREF.terms());
	set.addAll(WordnetNounIndexNameInstanceREG.terms());
	set.addAll(WordnetNounIndexNameInstanceREH.terms());
	set.addAll(WordnetNounIndexNameInstanceREI.terms());
	set.addAll(WordnetNounIndexNameInstanceREJ.terms());
	set.addAll(WordnetNounIndexNameInstanceREL.terms());
	set.addAll(WordnetNounIndexNameInstanceREM.terms());
	set.addAll(WordnetNounIndexNameInstanceREN.terms());
	set.addAll(WordnetNounIndexNameInstanceREO.terms());
	set.addAll(WordnetNounIndexNameInstanceREP.terms());
	set.addAll(WordnetNounIndexNameInstanceREQ.terms());
	set.addAll(WordnetNounIndexNameInstanceRER.terms());
	set.addAll(WordnetNounIndexNameInstanceRES.terms());
	set.addAll(WordnetNounIndexNameInstanceRET.terms());
	set.addAll(WordnetNounIndexNameInstanceREU.terms());
	set.addAll(WordnetNounIndexNameInstanceREV.terms());
	set.addAll(WordnetNounIndexNameInstanceREW.terms());
	set.addAll(WordnetNounIndexNameInstanceREY.terms());
  		return set; 	} }