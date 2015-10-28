package org.swtk.commons.dict.wordnet.indexbyname.controller.h.o;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.a.WordnetNounIndexNameInstanceHOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.b.WordnetNounIndexNameInstanceHOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.c.WordnetNounIndexNameInstanceHOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.d.WordnetNounIndexNameInstanceHOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.e.WordnetNounIndexNameInstanceHOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.f.WordnetNounIndexNameInstanceHOF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.g.WordnetNounIndexNameInstanceHOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.h.WordnetNounIndexNameInstanceHOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.i.WordnetNounIndexNameInstanceHOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.k.WordnetNounIndexNameInstanceHOK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.l.WordnetNounIndexNameInstanceHOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.m.WordnetNounIndexNameInstanceHOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.n.WordnetNounIndexNameInstanceHON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.o.WordnetNounIndexNameInstanceHOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.p.WordnetNounIndexNameInstanceHOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.r.WordnetNounIndexNameInstanceHOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.s.WordnetNounIndexNameInstanceHOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.t.WordnetNounIndexNameInstanceHOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.u.WordnetNounIndexNameInstanceHOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.v.WordnetNounIndexNameInstanceHOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.w.WordnetNounIndexNameInstanceHOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.y.WordnetNounIndexNameInstanceHOY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerHO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("hoa".equals(key)) return WordnetNounIndexNameInstanceHOA.get(TERM);
	if ("hob".equals(key)) return WordnetNounIndexNameInstanceHOB.get(TERM);
	if ("hoc".equals(key)) return WordnetNounIndexNameInstanceHOC.get(TERM);
	if ("hod".equals(key)) return WordnetNounIndexNameInstanceHOD.get(TERM);
	if ("hoe".equals(key)) return WordnetNounIndexNameInstanceHOE.get(TERM);
	if ("hof".equals(key)) return WordnetNounIndexNameInstanceHOF.get(TERM);
	if ("hog".equals(key)) return WordnetNounIndexNameInstanceHOG.get(TERM);
	if ("hoh".equals(key)) return WordnetNounIndexNameInstanceHOH.get(TERM);
	if ("hoi".equals(key)) return WordnetNounIndexNameInstanceHOI.get(TERM);
	if ("hok".equals(key)) return WordnetNounIndexNameInstanceHOK.get(TERM);
	if ("hol".equals(key)) return WordnetNounIndexNameInstanceHOL.get(TERM);
	if ("hom".equals(key)) return WordnetNounIndexNameInstanceHOM.get(TERM);
	if ("hon".equals(key)) return WordnetNounIndexNameInstanceHON.get(TERM);
	if ("hoo".equals(key)) return WordnetNounIndexNameInstanceHOO.get(TERM);
	if ("hop".equals(key)) return WordnetNounIndexNameInstanceHOP.get(TERM);
	if ("hor".equals(key)) return WordnetNounIndexNameInstanceHOR.get(TERM);
	if ("hos".equals(key)) return WordnetNounIndexNameInstanceHOS.get(TERM);
	if ("hot".equals(key)) return WordnetNounIndexNameInstanceHOT.get(TERM);
	if ("hou".equals(key)) return WordnetNounIndexNameInstanceHOU.get(TERM);
	if ("hov".equals(key)) return WordnetNounIndexNameInstanceHOV.get(TERM);
	if ("how".equals(key)) return WordnetNounIndexNameInstanceHOW.get(TERM);
	if ("hoy".equals(key)) return WordnetNounIndexNameInstanceHOY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceHOA.terms());
	set.addAll(WordnetNounIndexNameInstanceHOB.terms());
	set.addAll(WordnetNounIndexNameInstanceHOC.terms());
	set.addAll(WordnetNounIndexNameInstanceHOD.terms());
	set.addAll(WordnetNounIndexNameInstanceHOE.terms());
	set.addAll(WordnetNounIndexNameInstanceHOF.terms());
	set.addAll(WordnetNounIndexNameInstanceHOG.terms());
	set.addAll(WordnetNounIndexNameInstanceHOH.terms());
	set.addAll(WordnetNounIndexNameInstanceHOI.terms());
	set.addAll(WordnetNounIndexNameInstanceHOK.terms());
	set.addAll(WordnetNounIndexNameInstanceHOL.terms());
	set.addAll(WordnetNounIndexNameInstanceHOM.terms());
	set.addAll(WordnetNounIndexNameInstanceHON.terms());
	set.addAll(WordnetNounIndexNameInstanceHOO.terms());
	set.addAll(WordnetNounIndexNameInstanceHOP.terms());
	set.addAll(WordnetNounIndexNameInstanceHOR.terms());
	set.addAll(WordnetNounIndexNameInstanceHOS.terms());
	set.addAll(WordnetNounIndexNameInstanceHOT.terms());
	set.addAll(WordnetNounIndexNameInstanceHOU.terms());
	set.addAll(WordnetNounIndexNameInstanceHOV.terms());
	set.addAll(WordnetNounIndexNameInstanceHOW.terms());
	set.addAll(WordnetNounIndexNameInstanceHOY.terms());
  		return set; 	} }