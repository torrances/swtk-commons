package org.swtk.commons.dict.wordnet.indexbyname.controller.l.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.a.WordnetNounIndexNameInstanceLOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.b.WordnetNounIndexNameInstanceLOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.c.WordnetNounIndexNameInstanceLOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.d.WordnetNounIndexNameInstanceLOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.e.WordnetNounIndexNameInstanceLOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.f.WordnetNounIndexNameInstanceLOF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.g.WordnetNounIndexNameInstanceLOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.h.WordnetNounIndexNameInstanceLOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.i.WordnetNounIndexNameInstanceLOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.k.WordnetNounIndexNameInstanceLOK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.l.WordnetNounIndexNameInstanceLOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.m.WordnetNounIndexNameInstanceLOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.n.WordnetNounIndexNameInstanceLON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.o.WordnetNounIndexNameInstanceLOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.p.WordnetNounIndexNameInstanceLOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.q.WordnetNounIndexNameInstanceLOQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.r.WordnetNounIndexNameInstanceLOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.s.WordnetNounIndexNameInstanceLOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.t.WordnetNounIndexNameInstanceLOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.u.WordnetNounIndexNameInstanceLOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.v.WordnetNounIndexNameInstanceLOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.w.WordnetNounIndexNameInstanceLOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.x.WordnetNounIndexNameInstanceLOX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.y.WordnetNounIndexNameInstanceLOY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.z.WordnetNounIndexNameInstanceLOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("loa".equals(key)) return WordnetNounIndexNameInstanceLOA.get(TERM);
	if ("lob".equals(key)) return WordnetNounIndexNameInstanceLOB.get(TERM);
	if ("loc".equals(key)) return WordnetNounIndexNameInstanceLOC.get(TERM);
	if ("lod".equals(key)) return WordnetNounIndexNameInstanceLOD.get(TERM);
	if ("loe".equals(key)) return WordnetNounIndexNameInstanceLOE.get(TERM);
	if ("lof".equals(key)) return WordnetNounIndexNameInstanceLOF.get(TERM);
	if ("log".equals(key)) return WordnetNounIndexNameInstanceLOG.get(TERM);
	if ("loh".equals(key)) return WordnetNounIndexNameInstanceLOH.get(TERM);
	if ("loi".equals(key)) return WordnetNounIndexNameInstanceLOI.get(TERM);
	if ("lok".equals(key)) return WordnetNounIndexNameInstanceLOK.get(TERM);
	if ("lol".equals(key)) return WordnetNounIndexNameInstanceLOL.get(TERM);
	if ("lom".equals(key)) return WordnetNounIndexNameInstanceLOM.get(TERM);
	if ("lon".equals(key)) return WordnetNounIndexNameInstanceLON.get(TERM);
	if ("loo".equals(key)) return WordnetNounIndexNameInstanceLOO.get(TERM);
	if ("lop".equals(key)) return WordnetNounIndexNameInstanceLOP.get(TERM);
	if ("loq".equals(key)) return WordnetNounIndexNameInstanceLOQ.get(TERM);
	if ("lor".equals(key)) return WordnetNounIndexNameInstanceLOR.get(TERM);
	if ("los".equals(key)) return WordnetNounIndexNameInstanceLOS.get(TERM);
	if ("lot".equals(key)) return WordnetNounIndexNameInstanceLOT.get(TERM);
	if ("lou".equals(key)) return WordnetNounIndexNameInstanceLOU.get(TERM);
	if ("lov".equals(key)) return WordnetNounIndexNameInstanceLOV.get(TERM);
	if ("low".equals(key)) return WordnetNounIndexNameInstanceLOW.get(TERM);
	if ("lox".equals(key)) return WordnetNounIndexNameInstanceLOX.get(TERM);
	if ("loy".equals(key)) return WordnetNounIndexNameInstanceLOY.get(TERM);
	if ("loz".equals(key)) return WordnetNounIndexNameInstanceLOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLOA.terms());
	set.addAll(WordnetNounIndexNameInstanceLOB.terms());
	set.addAll(WordnetNounIndexNameInstanceLOC.terms());
	set.addAll(WordnetNounIndexNameInstanceLOD.terms());
	set.addAll(WordnetNounIndexNameInstanceLOE.terms());
	set.addAll(WordnetNounIndexNameInstanceLOF.terms());
	set.addAll(WordnetNounIndexNameInstanceLOG.terms());
	set.addAll(WordnetNounIndexNameInstanceLOH.terms());
	set.addAll(WordnetNounIndexNameInstanceLOI.terms());
	set.addAll(WordnetNounIndexNameInstanceLOK.terms());
	set.addAll(WordnetNounIndexNameInstanceLOL.terms());
	set.addAll(WordnetNounIndexNameInstanceLOM.terms());
	set.addAll(WordnetNounIndexNameInstanceLON.terms());
	set.addAll(WordnetNounIndexNameInstanceLOO.terms());
	set.addAll(WordnetNounIndexNameInstanceLOP.terms());
	set.addAll(WordnetNounIndexNameInstanceLOQ.terms());
	set.addAll(WordnetNounIndexNameInstanceLOR.terms());
	set.addAll(WordnetNounIndexNameInstanceLOS.terms());
	set.addAll(WordnetNounIndexNameInstanceLOT.terms());
	set.addAll(WordnetNounIndexNameInstanceLOU.terms());
	set.addAll(WordnetNounIndexNameInstanceLOV.terms());
	set.addAll(WordnetNounIndexNameInstanceLOW.terms());
	set.addAll(WordnetNounIndexNameInstanceLOX.terms());
	set.addAll(WordnetNounIndexNameInstanceLOY.terms());
	set.addAll(WordnetNounIndexNameInstanceLOZ.terms());
  		return set; 	} }