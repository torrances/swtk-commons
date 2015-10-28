package org.swtk.commons.dict.wordnet.indexbyname.controller.b.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.b.WordnetNounIndexNameInstanceBUB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.c.WordnetNounIndexNameInstanceBUC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.d.WordnetNounIndexNameInstanceBUD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.f.WordnetNounIndexNameInstanceBUF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.g.WordnetNounIndexNameInstanceBUG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.h.WordnetNounIndexNameInstanceBUH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.i.WordnetNounIndexNameInstanceBUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.j.WordnetNounIndexNameInstanceBUJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.k.WordnetNounIndexNameInstanceBUK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.l.WordnetNounIndexNameInstanceBUL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.m.WordnetNounIndexNameInstanceBUM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.n.WordnetNounIndexNameInstanceBUN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.o.WordnetNounIndexNameInstanceBUO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.p.WordnetNounIndexNameInstanceBUP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.r.WordnetNounIndexNameInstanceBUR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.s.WordnetNounIndexNameInstanceBUS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.t.WordnetNounIndexNameInstanceBUT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.x.WordnetNounIndexNameInstanceBUX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.y.WordnetNounIndexNameInstanceBUY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.z.WordnetNounIndexNameInstanceBUZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("bub".equals(key)) return WordnetNounIndexNameInstanceBUB.get(TERM);
	if ("buc".equals(key)) return WordnetNounIndexNameInstanceBUC.get(TERM);
	if ("bud".equals(key)) return WordnetNounIndexNameInstanceBUD.get(TERM);
	if ("buf".equals(key)) return WordnetNounIndexNameInstanceBUF.get(TERM);
	if ("bug".equals(key)) return WordnetNounIndexNameInstanceBUG.get(TERM);
	if ("buh".equals(key)) return WordnetNounIndexNameInstanceBUH.get(TERM);
	if ("bui".equals(key)) return WordnetNounIndexNameInstanceBUI.get(TERM);
	if ("buj".equals(key)) return WordnetNounIndexNameInstanceBUJ.get(TERM);
	if ("buk".equals(key)) return WordnetNounIndexNameInstanceBUK.get(TERM);
	if ("bul".equals(key)) return WordnetNounIndexNameInstanceBUL.get(TERM);
	if ("bum".equals(key)) return WordnetNounIndexNameInstanceBUM.get(TERM);
	if ("bun".equals(key)) return WordnetNounIndexNameInstanceBUN.get(TERM);
	if ("buo".equals(key)) return WordnetNounIndexNameInstanceBUO.get(TERM);
	if ("bup".equals(key)) return WordnetNounIndexNameInstanceBUP.get(TERM);
	if ("bur".equals(key)) return WordnetNounIndexNameInstanceBUR.get(TERM);
	if ("bus".equals(key)) return WordnetNounIndexNameInstanceBUS.get(TERM);
	if ("but".equals(key)) return WordnetNounIndexNameInstanceBUT.get(TERM);
	if ("bux".equals(key)) return WordnetNounIndexNameInstanceBUX.get(TERM);
	if ("buy".equals(key)) return WordnetNounIndexNameInstanceBUY.get(TERM);
	if ("buz".equals(key)) return WordnetNounIndexNameInstanceBUZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBUB.terms());
	set.addAll(WordnetNounIndexNameInstanceBUC.terms());
	set.addAll(WordnetNounIndexNameInstanceBUD.terms());
	set.addAll(WordnetNounIndexNameInstanceBUF.terms());
	set.addAll(WordnetNounIndexNameInstanceBUG.terms());
	set.addAll(WordnetNounIndexNameInstanceBUH.terms());
	set.addAll(WordnetNounIndexNameInstanceBUI.terms());
	set.addAll(WordnetNounIndexNameInstanceBUJ.terms());
	set.addAll(WordnetNounIndexNameInstanceBUK.terms());
	set.addAll(WordnetNounIndexNameInstanceBUL.terms());
	set.addAll(WordnetNounIndexNameInstanceBUM.terms());
	set.addAll(WordnetNounIndexNameInstanceBUN.terms());
	set.addAll(WordnetNounIndexNameInstanceBUO.terms());
	set.addAll(WordnetNounIndexNameInstanceBUP.terms());
	set.addAll(WordnetNounIndexNameInstanceBUR.terms());
	set.addAll(WordnetNounIndexNameInstanceBUS.terms());
	set.addAll(WordnetNounIndexNameInstanceBUT.terms());
	set.addAll(WordnetNounIndexNameInstanceBUX.terms());
	set.addAll(WordnetNounIndexNameInstanceBUY.terms());
	set.addAll(WordnetNounIndexNameInstanceBUZ.terms());
  		return set; 	} }