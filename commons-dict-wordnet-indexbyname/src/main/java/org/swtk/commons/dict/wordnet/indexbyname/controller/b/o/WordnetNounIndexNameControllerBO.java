package org.swtk.commons.dict.wordnet.indexbyname.controller.b.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.a.WordnetNounIndexNameInstanceBOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.b.WordnetNounIndexNameInstanceBOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.c.WordnetNounIndexNameInstanceBOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.d.WordnetNounIndexNameInstanceBOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.e.WordnetNounIndexNameInstanceBOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.f.WordnetNounIndexNameInstanceBOF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.g.WordnetNounIndexNameInstanceBOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.h.WordnetNounIndexNameInstanceBOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.i.WordnetNounIndexNameInstanceBOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.k.WordnetNounIndexNameInstanceBOK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.l.WordnetNounIndexNameInstanceBOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.m.WordnetNounIndexNameInstanceBOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.n.WordnetNounIndexNameInstanceBON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.o.WordnetNounIndexNameInstanceBOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.p.WordnetNounIndexNameInstanceBOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.r.WordnetNounIndexNameInstanceBOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.s.WordnetNounIndexNameInstanceBOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.t.WordnetNounIndexNameInstanceBOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.u.WordnetNounIndexNameInstanceBOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.v.WordnetNounIndexNameInstanceBOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.w.WordnetNounIndexNameInstanceBOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.x.WordnetNounIndexNameInstanceBOX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.y.WordnetNounIndexNameInstanceBOY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.z.WordnetNounIndexNameInstanceBOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("boa".equals(key)) return WordnetNounIndexNameInstanceBOA.get(TERM);
	if ("bob".equals(key)) return WordnetNounIndexNameInstanceBOB.get(TERM);
	if ("boc".equals(key)) return WordnetNounIndexNameInstanceBOC.get(TERM);
	if ("bod".equals(key)) return WordnetNounIndexNameInstanceBOD.get(TERM);
	if ("boe".equals(key)) return WordnetNounIndexNameInstanceBOE.get(TERM);
	if ("bof".equals(key)) return WordnetNounIndexNameInstanceBOF.get(TERM);
	if ("bog".equals(key)) return WordnetNounIndexNameInstanceBOG.get(TERM);
	if ("boh".equals(key)) return WordnetNounIndexNameInstanceBOH.get(TERM);
	if ("boi".equals(key)) return WordnetNounIndexNameInstanceBOI.get(TERM);
	if ("bok".equals(key)) return WordnetNounIndexNameInstanceBOK.get(TERM);
	if ("bol".equals(key)) return WordnetNounIndexNameInstanceBOL.get(TERM);
	if ("bom".equals(key)) return WordnetNounIndexNameInstanceBOM.get(TERM);
	if ("bon".equals(key)) return WordnetNounIndexNameInstanceBON.get(TERM);
	if ("boo".equals(key)) return WordnetNounIndexNameInstanceBOO.get(TERM);
	if ("bop".equals(key)) return WordnetNounIndexNameInstanceBOP.get(TERM);
	if ("bor".equals(key)) return WordnetNounIndexNameInstanceBOR.get(TERM);
	if ("bos".equals(key)) return WordnetNounIndexNameInstanceBOS.get(TERM);
	if ("bot".equals(key)) return WordnetNounIndexNameInstanceBOT.get(TERM);
	if ("bou".equals(key)) return WordnetNounIndexNameInstanceBOU.get(TERM);
	if ("bov".equals(key)) return WordnetNounIndexNameInstanceBOV.get(TERM);
	if ("bow".equals(key)) return WordnetNounIndexNameInstanceBOW.get(TERM);
	if ("box".equals(key)) return WordnetNounIndexNameInstanceBOX.get(TERM);
	if ("boy".equals(key)) return WordnetNounIndexNameInstanceBOY.get(TERM);
	if ("boz".equals(key)) return WordnetNounIndexNameInstanceBOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBOA.terms());
	set.addAll(WordnetNounIndexNameInstanceBOB.terms());
	set.addAll(WordnetNounIndexNameInstanceBOC.terms());
	set.addAll(WordnetNounIndexNameInstanceBOD.terms());
	set.addAll(WordnetNounIndexNameInstanceBOE.terms());
	set.addAll(WordnetNounIndexNameInstanceBOF.terms());
	set.addAll(WordnetNounIndexNameInstanceBOG.terms());
	set.addAll(WordnetNounIndexNameInstanceBOH.terms());
	set.addAll(WordnetNounIndexNameInstanceBOI.terms());
	set.addAll(WordnetNounIndexNameInstanceBOK.terms());
	set.addAll(WordnetNounIndexNameInstanceBOL.terms());
	set.addAll(WordnetNounIndexNameInstanceBOM.terms());
	set.addAll(WordnetNounIndexNameInstanceBON.terms());
	set.addAll(WordnetNounIndexNameInstanceBOO.terms());
	set.addAll(WordnetNounIndexNameInstanceBOP.terms());
	set.addAll(WordnetNounIndexNameInstanceBOR.terms());
	set.addAll(WordnetNounIndexNameInstanceBOS.terms());
	set.addAll(WordnetNounIndexNameInstanceBOT.terms());
	set.addAll(WordnetNounIndexNameInstanceBOU.terms());
	set.addAll(WordnetNounIndexNameInstanceBOV.terms());
	set.addAll(WordnetNounIndexNameInstanceBOW.terms());
	set.addAll(WordnetNounIndexNameInstanceBOX.terms());
	set.addAll(WordnetNounIndexNameInstanceBOY.terms());
	set.addAll(WordnetNounIndexNameInstanceBOZ.terms());
  		return set; 	} }