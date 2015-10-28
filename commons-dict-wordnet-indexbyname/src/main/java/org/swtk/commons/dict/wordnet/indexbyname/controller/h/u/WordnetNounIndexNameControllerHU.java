package org.swtk.commons.dict.wordnet.indexbyname.controller.h.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.a.WordnetNounIndexNameInstanceHUA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.b.WordnetNounIndexNameInstanceHUB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.c.WordnetNounIndexNameInstanceHUC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.d.WordnetNounIndexNameInstanceHUD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.f.WordnetNounIndexNameInstanceHUF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.g.WordnetNounIndexNameInstanceHUG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.i.WordnetNounIndexNameInstanceHUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.j.WordnetNounIndexNameInstanceHUJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.l.WordnetNounIndexNameInstanceHUL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.m.WordnetNounIndexNameInstanceHUM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.n.WordnetNounIndexNameInstanceHUN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.p.WordnetNounIndexNameInstanceHUP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.r.WordnetNounIndexNameInstanceHUR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.s.WordnetNounIndexNameInstanceHUS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.t.WordnetNounIndexNameInstanceHUT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.x.WordnetNounIndexNameInstanceHUX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.y.WordnetNounIndexNameInstanceHUY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerHU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("hua".equals(key)) return WordnetNounIndexNameInstanceHUA.get(TERM);
	if ("hub".equals(key)) return WordnetNounIndexNameInstanceHUB.get(TERM);
	if ("huc".equals(key)) return WordnetNounIndexNameInstanceHUC.get(TERM);
	if ("hud".equals(key)) return WordnetNounIndexNameInstanceHUD.get(TERM);
	if ("huf".equals(key)) return WordnetNounIndexNameInstanceHUF.get(TERM);
	if ("hug".equals(key)) return WordnetNounIndexNameInstanceHUG.get(TERM);
	if ("hui".equals(key)) return WordnetNounIndexNameInstanceHUI.get(TERM);
	if ("huj".equals(key)) return WordnetNounIndexNameInstanceHUJ.get(TERM);
	if ("hul".equals(key)) return WordnetNounIndexNameInstanceHUL.get(TERM);
	if ("hum".equals(key)) return WordnetNounIndexNameInstanceHUM.get(TERM);
	if ("hun".equals(key)) return WordnetNounIndexNameInstanceHUN.get(TERM);
	if ("hup".equals(key)) return WordnetNounIndexNameInstanceHUP.get(TERM);
	if ("hur".equals(key)) return WordnetNounIndexNameInstanceHUR.get(TERM);
	if ("hus".equals(key)) return WordnetNounIndexNameInstanceHUS.get(TERM);
	if ("hut".equals(key)) return WordnetNounIndexNameInstanceHUT.get(TERM);
	if ("hux".equals(key)) return WordnetNounIndexNameInstanceHUX.get(TERM);
	if ("huy".equals(key)) return WordnetNounIndexNameInstanceHUY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceHUA.terms());
	set.addAll(WordnetNounIndexNameInstanceHUB.terms());
	set.addAll(WordnetNounIndexNameInstanceHUC.terms());
	set.addAll(WordnetNounIndexNameInstanceHUD.terms());
	set.addAll(WordnetNounIndexNameInstanceHUF.terms());
	set.addAll(WordnetNounIndexNameInstanceHUG.terms());
	set.addAll(WordnetNounIndexNameInstanceHUI.terms());
	set.addAll(WordnetNounIndexNameInstanceHUJ.terms());
	set.addAll(WordnetNounIndexNameInstanceHUL.terms());
	set.addAll(WordnetNounIndexNameInstanceHUM.terms());
	set.addAll(WordnetNounIndexNameInstanceHUN.terms());
	set.addAll(WordnetNounIndexNameInstanceHUP.terms());
	set.addAll(WordnetNounIndexNameInstanceHUR.terms());
	set.addAll(WordnetNounIndexNameInstanceHUS.terms());
	set.addAll(WordnetNounIndexNameInstanceHUT.terms());
	set.addAll(WordnetNounIndexNameInstanceHUX.terms());
	set.addAll(WordnetNounIndexNameInstanceHUY.terms());
  		return set; 	} }