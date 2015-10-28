package org.swtk.commons.dict.wordnet.indexbyname.controller.n.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.a.WordnetNounIndexNameInstanceNUA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.b.WordnetNounIndexNameInstanceNUB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.c.WordnetNounIndexNameInstanceNUC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.d.WordnetNounIndexNameInstanceNUD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.f.WordnetNounIndexNameInstanceNUF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.g.WordnetNounIndexNameInstanceNUG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.i.WordnetNounIndexNameInstanceNUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.k.WordnetNounIndexNameInstanceNUK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.l.WordnetNounIndexNameInstanceNUL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.m.WordnetNounIndexNameInstanceNUM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.n.WordnetNounIndexNameInstanceNUN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.p.WordnetNounIndexNameInstanceNUP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.r.WordnetNounIndexNameInstanceNUR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.s.WordnetNounIndexNameInstanceNUS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.t.WordnetNounIndexNameInstanceNUT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.w.WordnetNounIndexNameInstanceNUW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.y.WordnetNounIndexNameInstanceNUY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("nua".equals(key)) return WordnetNounIndexNameInstanceNUA.get(TERM);
	if ("nub".equals(key)) return WordnetNounIndexNameInstanceNUB.get(TERM);
	if ("nuc".equals(key)) return WordnetNounIndexNameInstanceNUC.get(TERM);
	if ("nud".equals(key)) return WordnetNounIndexNameInstanceNUD.get(TERM);
	if ("nuf".equals(key)) return WordnetNounIndexNameInstanceNUF.get(TERM);
	if ("nug".equals(key)) return WordnetNounIndexNameInstanceNUG.get(TERM);
	if ("nui".equals(key)) return WordnetNounIndexNameInstanceNUI.get(TERM);
	if ("nuk".equals(key)) return WordnetNounIndexNameInstanceNUK.get(TERM);
	if ("nul".equals(key)) return WordnetNounIndexNameInstanceNUL.get(TERM);
	if ("num".equals(key)) return WordnetNounIndexNameInstanceNUM.get(TERM);
	if ("nun".equals(key)) return WordnetNounIndexNameInstanceNUN.get(TERM);
	if ("nup".equals(key)) return WordnetNounIndexNameInstanceNUP.get(TERM);
	if ("nur".equals(key)) return WordnetNounIndexNameInstanceNUR.get(TERM);
	if ("nus".equals(key)) return WordnetNounIndexNameInstanceNUS.get(TERM);
	if ("nut".equals(key)) return WordnetNounIndexNameInstanceNUT.get(TERM);
	if ("nuw".equals(key)) return WordnetNounIndexNameInstanceNUW.get(TERM);
	if ("nuy".equals(key)) return WordnetNounIndexNameInstanceNUY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNUA.terms());
	set.addAll(WordnetNounIndexNameInstanceNUB.terms());
	set.addAll(WordnetNounIndexNameInstanceNUC.terms());
	set.addAll(WordnetNounIndexNameInstanceNUD.terms());
	set.addAll(WordnetNounIndexNameInstanceNUF.terms());
	set.addAll(WordnetNounIndexNameInstanceNUG.terms());
	set.addAll(WordnetNounIndexNameInstanceNUI.terms());
	set.addAll(WordnetNounIndexNameInstanceNUK.terms());
	set.addAll(WordnetNounIndexNameInstanceNUL.terms());
	set.addAll(WordnetNounIndexNameInstanceNUM.terms());
	set.addAll(WordnetNounIndexNameInstanceNUN.terms());
	set.addAll(WordnetNounIndexNameInstanceNUP.terms());
	set.addAll(WordnetNounIndexNameInstanceNUR.terms());
	set.addAll(WordnetNounIndexNameInstanceNUS.terms());
	set.addAll(WordnetNounIndexNameInstanceNUT.terms());
	set.addAll(WordnetNounIndexNameInstanceNUW.terms());
	set.addAll(WordnetNounIndexNameInstanceNUY.terms());
  		return set; 	} }