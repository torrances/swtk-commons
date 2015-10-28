package org.swtk.commons.dict.wordnet.indexbyname.controller.f.o;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.a.WordnetNounIndexNameInstanceFOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.c.WordnetNounIndexNameInstanceFOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.d.WordnetNounIndexNameInstanceFOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.e.WordnetNounIndexNameInstanceFOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.g.WordnetNounIndexNameInstanceFOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.h.WordnetNounIndexNameInstanceFOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.i.WordnetNounIndexNameInstanceFOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.l.WordnetNounIndexNameInstanceFOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.m.WordnetNounIndexNameInstanceFOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.n.WordnetNounIndexNameInstanceFON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.o.WordnetNounIndexNameInstanceFOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.p.WordnetNounIndexNameInstanceFOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.r.WordnetNounIndexNameInstanceFOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.s.WordnetNounIndexNameInstanceFOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.t.WordnetNounIndexNameInstanceFOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.u.WordnetNounIndexNameInstanceFOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.v.WordnetNounIndexNameInstanceFOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.w.WordnetNounIndexNameInstanceFOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.x.WordnetNounIndexNameInstanceFOX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.y.WordnetNounIndexNameInstanceFOY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerFO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("foa".equals(key)) return WordnetNounIndexNameInstanceFOA.get(TERM);
	if ("foc".equals(key)) return WordnetNounIndexNameInstanceFOC.get(TERM);
	if ("fod".equals(key)) return WordnetNounIndexNameInstanceFOD.get(TERM);
	if ("foe".equals(key)) return WordnetNounIndexNameInstanceFOE.get(TERM);
	if ("fog".equals(key)) return WordnetNounIndexNameInstanceFOG.get(TERM);
	if ("foh".equals(key)) return WordnetNounIndexNameInstanceFOH.get(TERM);
	if ("foi".equals(key)) return WordnetNounIndexNameInstanceFOI.get(TERM);
	if ("fol".equals(key)) return WordnetNounIndexNameInstanceFOL.get(TERM);
	if ("fom".equals(key)) return WordnetNounIndexNameInstanceFOM.get(TERM);
	if ("fon".equals(key)) return WordnetNounIndexNameInstanceFON.get(TERM);
	if ("foo".equals(key)) return WordnetNounIndexNameInstanceFOO.get(TERM);
	if ("fop".equals(key)) return WordnetNounIndexNameInstanceFOP.get(TERM);
	if ("for".equals(key)) return WordnetNounIndexNameInstanceFOR.get(TERM);
	if ("fos".equals(key)) return WordnetNounIndexNameInstanceFOS.get(TERM);
	if ("fot".equals(key)) return WordnetNounIndexNameInstanceFOT.get(TERM);
	if ("fou".equals(key)) return WordnetNounIndexNameInstanceFOU.get(TERM);
	if ("fov".equals(key)) return WordnetNounIndexNameInstanceFOV.get(TERM);
	if ("fow".equals(key)) return WordnetNounIndexNameInstanceFOW.get(TERM);
	if ("fox".equals(key)) return WordnetNounIndexNameInstanceFOX.get(TERM);
	if ("foy".equals(key)) return WordnetNounIndexNameInstanceFOY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceFOA.terms());
	set.addAll(WordnetNounIndexNameInstanceFOC.terms());
	set.addAll(WordnetNounIndexNameInstanceFOD.terms());
	set.addAll(WordnetNounIndexNameInstanceFOE.terms());
	set.addAll(WordnetNounIndexNameInstanceFOG.terms());
	set.addAll(WordnetNounIndexNameInstanceFOH.terms());
	set.addAll(WordnetNounIndexNameInstanceFOI.terms());
	set.addAll(WordnetNounIndexNameInstanceFOL.terms());
	set.addAll(WordnetNounIndexNameInstanceFOM.terms());
	set.addAll(WordnetNounIndexNameInstanceFON.terms());
	set.addAll(WordnetNounIndexNameInstanceFOO.terms());
	set.addAll(WordnetNounIndexNameInstanceFOP.terms());
	set.addAll(WordnetNounIndexNameInstanceFOR.terms());
	set.addAll(WordnetNounIndexNameInstanceFOS.terms());
	set.addAll(WordnetNounIndexNameInstanceFOT.terms());
	set.addAll(WordnetNounIndexNameInstanceFOU.terms());
	set.addAll(WordnetNounIndexNameInstanceFOV.terms());
	set.addAll(WordnetNounIndexNameInstanceFOW.terms());
	set.addAll(WordnetNounIndexNameInstanceFOX.terms());
	set.addAll(WordnetNounIndexNameInstanceFOY.terms());
  		return set; 	} }