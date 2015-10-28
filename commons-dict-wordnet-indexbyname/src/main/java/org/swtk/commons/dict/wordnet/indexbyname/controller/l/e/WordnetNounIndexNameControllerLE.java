package org.swtk.commons.dict.wordnet.indexbyname.controller.l.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.a.WordnetNounIndexNameInstanceLEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.b.WordnetNounIndexNameInstanceLEB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.c.WordnetNounIndexNameInstanceLEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.d.WordnetNounIndexNameInstanceLED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.e.WordnetNounIndexNameInstanceLEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.f.WordnetNounIndexNameInstanceLEF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.g.WordnetNounIndexNameInstanceLEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.h.WordnetNounIndexNameInstanceLEH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.i.WordnetNounIndexNameInstanceLEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.k.WordnetNounIndexNameInstanceLEK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.m.WordnetNounIndexNameInstanceLEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.n.WordnetNounIndexNameInstanceLEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.o.WordnetNounIndexNameInstanceLEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.p.WordnetNounIndexNameInstanceLEP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.r.WordnetNounIndexNameInstanceLER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.s.WordnetNounIndexNameInstanceLES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.t.WordnetNounIndexNameInstanceLET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.u.WordnetNounIndexNameInstanceLEU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.v.WordnetNounIndexNameInstanceLEV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.w.WordnetNounIndexNameInstanceLEW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.x.WordnetNounIndexNameInstanceLEX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.y.WordnetNounIndexNameInstanceLEY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("lea".equals(key)) return WordnetNounIndexNameInstanceLEA.get(TERM);
	if ("leb".equals(key)) return WordnetNounIndexNameInstanceLEB.get(TERM);
	if ("lec".equals(key)) return WordnetNounIndexNameInstanceLEC.get(TERM);
	if ("led".equals(key)) return WordnetNounIndexNameInstanceLED.get(TERM);
	if ("lee".equals(key)) return WordnetNounIndexNameInstanceLEE.get(TERM);
	if ("lef".equals(key)) return WordnetNounIndexNameInstanceLEF.get(TERM);
	if ("leg".equals(key)) return WordnetNounIndexNameInstanceLEG.get(TERM);
	if ("leh".equals(key)) return WordnetNounIndexNameInstanceLEH.get(TERM);
	if ("lei".equals(key)) return WordnetNounIndexNameInstanceLEI.get(TERM);
	if ("lek".equals(key)) return WordnetNounIndexNameInstanceLEK.get(TERM);
	if ("lem".equals(key)) return WordnetNounIndexNameInstanceLEM.get(TERM);
	if ("len".equals(key)) return WordnetNounIndexNameInstanceLEN.get(TERM);
	if ("leo".equals(key)) return WordnetNounIndexNameInstanceLEO.get(TERM);
	if ("lep".equals(key)) return WordnetNounIndexNameInstanceLEP.get(TERM);
	if ("ler".equals(key)) return WordnetNounIndexNameInstanceLER.get(TERM);
	if ("les".equals(key)) return WordnetNounIndexNameInstanceLES.get(TERM);
	if ("let".equals(key)) return WordnetNounIndexNameInstanceLET.get(TERM);
	if ("leu".equals(key)) return WordnetNounIndexNameInstanceLEU.get(TERM);
	if ("lev".equals(key)) return WordnetNounIndexNameInstanceLEV.get(TERM);
	if ("lew".equals(key)) return WordnetNounIndexNameInstanceLEW.get(TERM);
	if ("lex".equals(key)) return WordnetNounIndexNameInstanceLEX.get(TERM);
	if ("ley".equals(key)) return WordnetNounIndexNameInstanceLEY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLEA.terms());
	set.addAll(WordnetNounIndexNameInstanceLEB.terms());
	set.addAll(WordnetNounIndexNameInstanceLEC.terms());
	set.addAll(WordnetNounIndexNameInstanceLED.terms());
	set.addAll(WordnetNounIndexNameInstanceLEE.terms());
	set.addAll(WordnetNounIndexNameInstanceLEF.terms());
	set.addAll(WordnetNounIndexNameInstanceLEG.terms());
	set.addAll(WordnetNounIndexNameInstanceLEH.terms());
	set.addAll(WordnetNounIndexNameInstanceLEI.terms());
	set.addAll(WordnetNounIndexNameInstanceLEK.terms());
	set.addAll(WordnetNounIndexNameInstanceLEM.terms());
	set.addAll(WordnetNounIndexNameInstanceLEN.terms());
	set.addAll(WordnetNounIndexNameInstanceLEO.terms());
	set.addAll(WordnetNounIndexNameInstanceLEP.terms());
	set.addAll(WordnetNounIndexNameInstanceLER.terms());
	set.addAll(WordnetNounIndexNameInstanceLES.terms());
	set.addAll(WordnetNounIndexNameInstanceLET.terms());
	set.addAll(WordnetNounIndexNameInstanceLEU.terms());
	set.addAll(WordnetNounIndexNameInstanceLEV.terms());
	set.addAll(WordnetNounIndexNameInstanceLEW.terms());
	set.addAll(WordnetNounIndexNameInstanceLEX.terms());
	set.addAll(WordnetNounIndexNameInstanceLEY.terms());
  		return set; 	} }