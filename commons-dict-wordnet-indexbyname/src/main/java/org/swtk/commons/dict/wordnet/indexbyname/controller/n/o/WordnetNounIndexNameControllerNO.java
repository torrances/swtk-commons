package org.swtk.commons.dict.wordnet.indexbyname.controller.n.o;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.a.WordnetNounIndexNameInstanceNOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.b.WordnetNounIndexNameInstanceNOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.c.WordnetNounIndexNameInstanceNOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.d.WordnetNounIndexNameInstanceNOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.e.WordnetNounIndexNameInstanceNOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.g.WordnetNounIndexNameInstanceNOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.i.WordnetNounIndexNameInstanceNOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.l.WordnetNounIndexNameInstanceNOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.m.WordnetNounIndexNameInstanceNOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.n.WordnetNounIndexNameInstanceNON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.o.WordnetNounIndexNameInstanceNOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.p.WordnetNounIndexNameInstanceNOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.r.WordnetNounIndexNameInstanceNOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.s.WordnetNounIndexNameInstanceNOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.t.WordnetNounIndexNameInstanceNOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.u.WordnetNounIndexNameInstanceNOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.v.WordnetNounIndexNameInstanceNOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.w.WordnetNounIndexNameInstanceNOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.x.WordnetNounIndexNameInstanceNOX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.y.WordnetNounIndexNameInstanceNOY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.z.WordnetNounIndexNameInstanceNOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("noa".equals(key)) return WordnetNounIndexNameInstanceNOA.get(TERM);
	if ("nob".equals(key)) return WordnetNounIndexNameInstanceNOB.get(TERM);
	if ("noc".equals(key)) return WordnetNounIndexNameInstanceNOC.get(TERM);
	if ("nod".equals(key)) return WordnetNounIndexNameInstanceNOD.get(TERM);
	if ("noe".equals(key)) return WordnetNounIndexNameInstanceNOE.get(TERM);
	if ("nog".equals(key)) return WordnetNounIndexNameInstanceNOG.get(TERM);
	if ("noi".equals(key)) return WordnetNounIndexNameInstanceNOI.get(TERM);
	if ("nol".equals(key)) return WordnetNounIndexNameInstanceNOL.get(TERM);
	if ("nom".equals(key)) return WordnetNounIndexNameInstanceNOM.get(TERM);
	if ("non".equals(key)) return WordnetNounIndexNameInstanceNON.get(TERM);
	if ("noo".equals(key)) return WordnetNounIndexNameInstanceNOO.get(TERM);
	if ("nop".equals(key)) return WordnetNounIndexNameInstanceNOP.get(TERM);
	if ("nor".equals(key)) return WordnetNounIndexNameInstanceNOR.get(TERM);
	if ("nos".equals(key)) return WordnetNounIndexNameInstanceNOS.get(TERM);
	if ("not".equals(key)) return WordnetNounIndexNameInstanceNOT.get(TERM);
	if ("nou".equals(key)) return WordnetNounIndexNameInstanceNOU.get(TERM);
	if ("nov".equals(key)) return WordnetNounIndexNameInstanceNOV.get(TERM);
	if ("now".equals(key)) return WordnetNounIndexNameInstanceNOW.get(TERM);
	if ("nox".equals(key)) return WordnetNounIndexNameInstanceNOX.get(TERM);
	if ("noy".equals(key)) return WordnetNounIndexNameInstanceNOY.get(TERM);
	if ("noz".equals(key)) return WordnetNounIndexNameInstanceNOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNOA.terms());
	set.addAll(WordnetNounIndexNameInstanceNOB.terms());
	set.addAll(WordnetNounIndexNameInstanceNOC.terms());
	set.addAll(WordnetNounIndexNameInstanceNOD.terms());
	set.addAll(WordnetNounIndexNameInstanceNOE.terms());
	set.addAll(WordnetNounIndexNameInstanceNOG.terms());
	set.addAll(WordnetNounIndexNameInstanceNOI.terms());
	set.addAll(WordnetNounIndexNameInstanceNOL.terms());
	set.addAll(WordnetNounIndexNameInstanceNOM.terms());
	set.addAll(WordnetNounIndexNameInstanceNON.terms());
	set.addAll(WordnetNounIndexNameInstanceNOO.terms());
	set.addAll(WordnetNounIndexNameInstanceNOP.terms());
	set.addAll(WordnetNounIndexNameInstanceNOR.terms());
	set.addAll(WordnetNounIndexNameInstanceNOS.terms());
	set.addAll(WordnetNounIndexNameInstanceNOT.terms());
	set.addAll(WordnetNounIndexNameInstanceNOU.terms());
	set.addAll(WordnetNounIndexNameInstanceNOV.terms());
	set.addAll(WordnetNounIndexNameInstanceNOW.terms());
	set.addAll(WordnetNounIndexNameInstanceNOX.terms());
	set.addAll(WordnetNounIndexNameInstanceNOY.terms());
	set.addAll(WordnetNounIndexNameInstanceNOZ.terms());
  		return set; 	} }