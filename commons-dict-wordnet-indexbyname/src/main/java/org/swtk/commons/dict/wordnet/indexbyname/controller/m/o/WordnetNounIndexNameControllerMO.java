package org.swtk.commons.dict.wordnet.indexbyname.controller.m.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.a.WordnetNounIndexNameInstanceMOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.b.WordnetNounIndexNameInstanceMOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.c.WordnetNounIndexNameInstanceMOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.d.WordnetNounIndexNameInstanceMOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.e.WordnetNounIndexNameInstanceMOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.g.WordnetNounIndexNameInstanceMOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.h.WordnetNounIndexNameInstanceMOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.i.WordnetNounIndexNameInstanceMOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.j.WordnetNounIndexNameInstanceMOJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.k.WordnetNounIndexNameInstanceMOK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.l.WordnetNounIndexNameInstanceMOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.m.WordnetNounIndexNameInstanceMOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.n.WordnetNounIndexNameInstanceMON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.o.WordnetNounIndexNameInstanceMOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.p.WordnetNounIndexNameInstanceMOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.q.WordnetNounIndexNameInstanceMOQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.r.WordnetNounIndexNameInstanceMOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.s.WordnetNounIndexNameInstanceMOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.t.WordnetNounIndexNameInstanceMOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.u.WordnetNounIndexNameInstanceMOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.v.WordnetNounIndexNameInstanceMOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.w.WordnetNounIndexNameInstanceMOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.x.WordnetNounIndexNameInstanceMOX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.y.WordnetNounIndexNameInstanceMOY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.z.WordnetNounIndexNameInstanceMOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("moa".equals(key)) return WordnetNounIndexNameInstanceMOA.get(TERM);
	if ("mob".equals(key)) return WordnetNounIndexNameInstanceMOB.get(TERM);
	if ("moc".equals(key)) return WordnetNounIndexNameInstanceMOC.get(TERM);
	if ("mod".equals(key)) return WordnetNounIndexNameInstanceMOD.get(TERM);
	if ("moe".equals(key)) return WordnetNounIndexNameInstanceMOE.get(TERM);
	if ("mog".equals(key)) return WordnetNounIndexNameInstanceMOG.get(TERM);
	if ("moh".equals(key)) return WordnetNounIndexNameInstanceMOH.get(TERM);
	if ("moi".equals(key)) return WordnetNounIndexNameInstanceMOI.get(TERM);
	if ("moj".equals(key)) return WordnetNounIndexNameInstanceMOJ.get(TERM);
	if ("mok".equals(key)) return WordnetNounIndexNameInstanceMOK.get(TERM);
	if ("mol".equals(key)) return WordnetNounIndexNameInstanceMOL.get(TERM);
	if ("mom".equals(key)) return WordnetNounIndexNameInstanceMOM.get(TERM);
	if ("mon".equals(key)) return WordnetNounIndexNameInstanceMON.get(TERM);
	if ("moo".equals(key)) return WordnetNounIndexNameInstanceMOO.get(TERM);
	if ("mop".equals(key)) return WordnetNounIndexNameInstanceMOP.get(TERM);
	if ("moq".equals(key)) return WordnetNounIndexNameInstanceMOQ.get(TERM);
	if ("mor".equals(key)) return WordnetNounIndexNameInstanceMOR.get(TERM);
	if ("mos".equals(key)) return WordnetNounIndexNameInstanceMOS.get(TERM);
	if ("mot".equals(key)) return WordnetNounIndexNameInstanceMOT.get(TERM);
	if ("mou".equals(key)) return WordnetNounIndexNameInstanceMOU.get(TERM);
	if ("mov".equals(key)) return WordnetNounIndexNameInstanceMOV.get(TERM);
	if ("mow".equals(key)) return WordnetNounIndexNameInstanceMOW.get(TERM);
	if ("mox".equals(key)) return WordnetNounIndexNameInstanceMOX.get(TERM);
	if ("moy".equals(key)) return WordnetNounIndexNameInstanceMOY.get(TERM);
	if ("moz".equals(key)) return WordnetNounIndexNameInstanceMOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMOA.terms());
	set.addAll(WordnetNounIndexNameInstanceMOB.terms());
	set.addAll(WordnetNounIndexNameInstanceMOC.terms());
	set.addAll(WordnetNounIndexNameInstanceMOD.terms());
	set.addAll(WordnetNounIndexNameInstanceMOE.terms());
	set.addAll(WordnetNounIndexNameInstanceMOG.terms());
	set.addAll(WordnetNounIndexNameInstanceMOH.terms());
	set.addAll(WordnetNounIndexNameInstanceMOI.terms());
	set.addAll(WordnetNounIndexNameInstanceMOJ.terms());
	set.addAll(WordnetNounIndexNameInstanceMOK.terms());
	set.addAll(WordnetNounIndexNameInstanceMOL.terms());
	set.addAll(WordnetNounIndexNameInstanceMOM.terms());
	set.addAll(WordnetNounIndexNameInstanceMON.terms());
	set.addAll(WordnetNounIndexNameInstanceMOO.terms());
	set.addAll(WordnetNounIndexNameInstanceMOP.terms());
	set.addAll(WordnetNounIndexNameInstanceMOQ.terms());
	set.addAll(WordnetNounIndexNameInstanceMOR.terms());
	set.addAll(WordnetNounIndexNameInstanceMOS.terms());
	set.addAll(WordnetNounIndexNameInstanceMOT.terms());
	set.addAll(WordnetNounIndexNameInstanceMOU.terms());
	set.addAll(WordnetNounIndexNameInstanceMOV.terms());
	set.addAll(WordnetNounIndexNameInstanceMOW.terms());
	set.addAll(WordnetNounIndexNameInstanceMOX.terms());
	set.addAll(WordnetNounIndexNameInstanceMOY.terms());
	set.addAll(WordnetNounIndexNameInstanceMOZ.terms());
  		return set; 	} }