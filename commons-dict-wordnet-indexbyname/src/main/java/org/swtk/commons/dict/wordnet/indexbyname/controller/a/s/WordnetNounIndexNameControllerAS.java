package org.swtk.commons.dict.wordnet.indexbyname.controller.a.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.a.WordnetNounIndexNameInstanceASA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.b.WordnetNounIndexNameInstanceASB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.c.WordnetNounIndexNameInstanceASC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.d.WordnetNounIndexNameInstanceASD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.e.WordnetNounIndexNameInstanceASE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.g.WordnetNounIndexNameInstanceASG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.h.WordnetNounIndexNameInstanceASH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.i.WordnetNounIndexNameInstanceASI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.k.WordnetNounIndexNameInstanceASK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.m.WordnetNounIndexNameInstanceASM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.p.WordnetNounIndexNameInstanceASP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.s.WordnetNounIndexNameInstanceASS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.t.WordnetNounIndexNameInstanceAST;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.u.WordnetNounIndexNameInstanceASU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.v.WordnetNounIndexNameInstanceASV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.w.WordnetNounIndexNameInstanceASW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.y.WordnetNounIndexNameInstanceASY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("asa".equals(key)) return WordnetNounIndexNameInstanceASA.get(TERM);
	if ("asb".equals(key)) return WordnetNounIndexNameInstanceASB.get(TERM);
	if ("asc".equals(key)) return WordnetNounIndexNameInstanceASC.get(TERM);
	if ("asd".equals(key)) return WordnetNounIndexNameInstanceASD.get(TERM);
	if ("ase".equals(key)) return WordnetNounIndexNameInstanceASE.get(TERM);
	if ("asg".equals(key)) return WordnetNounIndexNameInstanceASG.get(TERM);
	if ("ash".equals(key)) return WordnetNounIndexNameInstanceASH.get(TERM);
	if ("asi".equals(key)) return WordnetNounIndexNameInstanceASI.get(TERM);
	if ("ask".equals(key)) return WordnetNounIndexNameInstanceASK.get(TERM);
	if ("asm".equals(key)) return WordnetNounIndexNameInstanceASM.get(TERM);
	if ("asp".equals(key)) return WordnetNounIndexNameInstanceASP.get(TERM);
	if ("ass".equals(key)) return WordnetNounIndexNameInstanceASS.get(TERM);
	if ("ast".equals(key)) return WordnetNounIndexNameInstanceAST.get(TERM);
	if ("asu".equals(key)) return WordnetNounIndexNameInstanceASU.get(TERM);
	if ("asv".equals(key)) return WordnetNounIndexNameInstanceASV.get(TERM);
	if ("asw".equals(key)) return WordnetNounIndexNameInstanceASW.get(TERM);
	if ("asy".equals(key)) return WordnetNounIndexNameInstanceASY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceASA.terms());
	set.addAll(WordnetNounIndexNameInstanceASB.terms());
	set.addAll(WordnetNounIndexNameInstanceASC.terms());
	set.addAll(WordnetNounIndexNameInstanceASD.terms());
	set.addAll(WordnetNounIndexNameInstanceASE.terms());
	set.addAll(WordnetNounIndexNameInstanceASG.terms());
	set.addAll(WordnetNounIndexNameInstanceASH.terms());
	set.addAll(WordnetNounIndexNameInstanceASI.terms());
	set.addAll(WordnetNounIndexNameInstanceASK.terms());
	set.addAll(WordnetNounIndexNameInstanceASM.terms());
	set.addAll(WordnetNounIndexNameInstanceASP.terms());
	set.addAll(WordnetNounIndexNameInstanceASS.terms());
	set.addAll(WordnetNounIndexNameInstanceAST.terms());
	set.addAll(WordnetNounIndexNameInstanceASU.terms());
	set.addAll(WordnetNounIndexNameInstanceASV.terms());
	set.addAll(WordnetNounIndexNameInstanceASW.terms());
	set.addAll(WordnetNounIndexNameInstanceASY.terms());
  		return set; 	} }