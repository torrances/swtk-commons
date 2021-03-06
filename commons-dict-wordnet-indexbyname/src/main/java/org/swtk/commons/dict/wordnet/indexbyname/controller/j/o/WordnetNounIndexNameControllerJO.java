package org.swtk.commons.dict.wordnet.indexbyname.controller.j.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.a.WordnetNounIndexNameInstanceJOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.b.WordnetNounIndexNameInstanceJOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.c.WordnetNounIndexNameInstanceJOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.d.WordnetNounIndexNameInstanceJOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.e.WordnetNounIndexNameInstanceJOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.f.WordnetNounIndexNameInstanceJOF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.g.WordnetNounIndexNameInstanceJOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.h.WordnetNounIndexNameInstanceJOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.i.WordnetNounIndexNameInstanceJOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.k.WordnetNounIndexNameInstanceJOK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.l.WordnetNounIndexNameInstanceJOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.n.WordnetNounIndexNameInstanceJON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.o.WordnetNounIndexNameInstanceJOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.p.WordnetNounIndexNameInstanceJOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.r.WordnetNounIndexNameInstanceJOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.s.WordnetNounIndexNameInstanceJOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.t.WordnetNounIndexNameInstanceJOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.u.WordnetNounIndexNameInstanceJOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.v.WordnetNounIndexNameInstanceJOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.w.WordnetNounIndexNameInstanceJOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.y.WordnetNounIndexNameInstanceJOY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerJO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("joa".equals(key)) return WordnetNounIndexNameInstanceJOA.get(TERM);
	if ("job".equals(key)) return WordnetNounIndexNameInstanceJOB.get(TERM);
	if ("joc".equals(key)) return WordnetNounIndexNameInstanceJOC.get(TERM);
	if ("jod".equals(key)) return WordnetNounIndexNameInstanceJOD.get(TERM);
	if ("joe".equals(key)) return WordnetNounIndexNameInstanceJOE.get(TERM);
	if ("jof".equals(key)) return WordnetNounIndexNameInstanceJOF.get(TERM);
	if ("jog".equals(key)) return WordnetNounIndexNameInstanceJOG.get(TERM);
	if ("joh".equals(key)) return WordnetNounIndexNameInstanceJOH.get(TERM);
	if ("joi".equals(key)) return WordnetNounIndexNameInstanceJOI.get(TERM);
	if ("jok".equals(key)) return WordnetNounIndexNameInstanceJOK.get(TERM);
	if ("jol".equals(key)) return WordnetNounIndexNameInstanceJOL.get(TERM);
	if ("jon".equals(key)) return WordnetNounIndexNameInstanceJON.get(TERM);
	if ("joo".equals(key)) return WordnetNounIndexNameInstanceJOO.get(TERM);
	if ("jop".equals(key)) return WordnetNounIndexNameInstanceJOP.get(TERM);
	if ("jor".equals(key)) return WordnetNounIndexNameInstanceJOR.get(TERM);
	if ("jos".equals(key)) return WordnetNounIndexNameInstanceJOS.get(TERM);
	if ("jot".equals(key)) return WordnetNounIndexNameInstanceJOT.get(TERM);
	if ("jou".equals(key)) return WordnetNounIndexNameInstanceJOU.get(TERM);
	if ("jov".equals(key)) return WordnetNounIndexNameInstanceJOV.get(TERM);
	if ("jow".equals(key)) return WordnetNounIndexNameInstanceJOW.get(TERM);
	if ("joy".equals(key)) return WordnetNounIndexNameInstanceJOY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceJOA.terms());
	set.addAll(WordnetNounIndexNameInstanceJOB.terms());
	set.addAll(WordnetNounIndexNameInstanceJOC.terms());
	set.addAll(WordnetNounIndexNameInstanceJOD.terms());
	set.addAll(WordnetNounIndexNameInstanceJOE.terms());
	set.addAll(WordnetNounIndexNameInstanceJOF.terms());
	set.addAll(WordnetNounIndexNameInstanceJOG.terms());
	set.addAll(WordnetNounIndexNameInstanceJOH.terms());
	set.addAll(WordnetNounIndexNameInstanceJOI.terms());
	set.addAll(WordnetNounIndexNameInstanceJOK.terms());
	set.addAll(WordnetNounIndexNameInstanceJOL.terms());
	set.addAll(WordnetNounIndexNameInstanceJON.terms());
	set.addAll(WordnetNounIndexNameInstanceJOO.terms());
	set.addAll(WordnetNounIndexNameInstanceJOP.terms());
	set.addAll(WordnetNounIndexNameInstanceJOR.terms());
	set.addAll(WordnetNounIndexNameInstanceJOS.terms());
	set.addAll(WordnetNounIndexNameInstanceJOT.terms());
	set.addAll(WordnetNounIndexNameInstanceJOU.terms());
	set.addAll(WordnetNounIndexNameInstanceJOV.terms());
	set.addAll(WordnetNounIndexNameInstanceJOW.terms());
	set.addAll(WordnetNounIndexNameInstanceJOY.terms());
  		return set; 	} }