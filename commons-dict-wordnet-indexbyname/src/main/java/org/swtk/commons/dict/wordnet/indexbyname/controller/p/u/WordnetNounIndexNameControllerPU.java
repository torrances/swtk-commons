package org.swtk.commons.dict.wordnet.indexbyname.controller.p.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.b.WordnetNounIndexNameInstancePUB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.c.WordnetNounIndexNameInstancePUC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.d.WordnetNounIndexNameInstancePUD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.e.WordnetNounIndexNameInstancePUE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.f.WordnetNounIndexNameInstancePUF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.g.WordnetNounIndexNameInstancePUG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.i.WordnetNounIndexNameInstancePUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.j.WordnetNounIndexNameInstancePUJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.k.WordnetNounIndexNameInstancePUK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.l.WordnetNounIndexNameInstancePUL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.m.WordnetNounIndexNameInstancePUM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.n.WordnetNounIndexNameInstancePUN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.p.WordnetNounIndexNameInstancePUP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.r.WordnetNounIndexNameInstancePUR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.s.WordnetNounIndexNameInstancePUS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.t.WordnetNounIndexNameInstancePUT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.z.WordnetNounIndexNameInstancePUZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("pub".equals(key)) return WordnetNounIndexNameInstancePUB.get(TERM);
	if ("puc".equals(key)) return WordnetNounIndexNameInstancePUC.get(TERM);
	if ("pud".equals(key)) return WordnetNounIndexNameInstancePUD.get(TERM);
	if ("pue".equals(key)) return WordnetNounIndexNameInstancePUE.get(TERM);
	if ("puf".equals(key)) return WordnetNounIndexNameInstancePUF.get(TERM);
	if ("pug".equals(key)) return WordnetNounIndexNameInstancePUG.get(TERM);
	if ("pui".equals(key)) return WordnetNounIndexNameInstancePUI.get(TERM);
	if ("puj".equals(key)) return WordnetNounIndexNameInstancePUJ.get(TERM);
	if ("puk".equals(key)) return WordnetNounIndexNameInstancePUK.get(TERM);
	if ("pul".equals(key)) return WordnetNounIndexNameInstancePUL.get(TERM);
	if ("pum".equals(key)) return WordnetNounIndexNameInstancePUM.get(TERM);
	if ("pun".equals(key)) return WordnetNounIndexNameInstancePUN.get(TERM);
	if ("pup".equals(key)) return WordnetNounIndexNameInstancePUP.get(TERM);
	if ("pur".equals(key)) return WordnetNounIndexNameInstancePUR.get(TERM);
	if ("pus".equals(key)) return WordnetNounIndexNameInstancePUS.get(TERM);
	if ("put".equals(key)) return WordnetNounIndexNameInstancePUT.get(TERM);
	if ("puz".equals(key)) return WordnetNounIndexNameInstancePUZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePUB.terms());
	set.addAll(WordnetNounIndexNameInstancePUC.terms());
	set.addAll(WordnetNounIndexNameInstancePUD.terms());
	set.addAll(WordnetNounIndexNameInstancePUE.terms());
	set.addAll(WordnetNounIndexNameInstancePUF.terms());
	set.addAll(WordnetNounIndexNameInstancePUG.terms());
	set.addAll(WordnetNounIndexNameInstancePUI.terms());
	set.addAll(WordnetNounIndexNameInstancePUJ.terms());
	set.addAll(WordnetNounIndexNameInstancePUK.terms());
	set.addAll(WordnetNounIndexNameInstancePUL.terms());
	set.addAll(WordnetNounIndexNameInstancePUM.terms());
	set.addAll(WordnetNounIndexNameInstancePUN.terms());
	set.addAll(WordnetNounIndexNameInstancePUP.terms());
	set.addAll(WordnetNounIndexNameInstancePUR.terms());
	set.addAll(WordnetNounIndexNameInstancePUS.terms());
	set.addAll(WordnetNounIndexNameInstancePUT.terms());
	set.addAll(WordnetNounIndexNameInstancePUZ.terms());
  		return set; 	} }