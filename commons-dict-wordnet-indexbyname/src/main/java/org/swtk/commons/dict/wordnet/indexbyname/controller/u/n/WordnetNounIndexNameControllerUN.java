package org.swtk.commons.dict.wordnet.indexbyname.controller.u.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.a.WordnetNounIndexNameInstanceUNA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.b.WordnetNounIndexNameInstanceUNB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.c.WordnetNounIndexNameInstanceUNC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.d.WordnetNounIndexNameInstanceUND;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.e.WordnetNounIndexNameInstanceUNE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.f.WordnetNounIndexNameInstanceUNF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.g.WordnetNounIndexNameInstanceUNG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.h.WordnetNounIndexNameInstanceUNH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.i.WordnetNounIndexNameInstanceUNI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.j.WordnetNounIndexNameInstanceUNJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.k.WordnetNounIndexNameInstanceUNK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.l.WordnetNounIndexNameInstanceUNL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.m.WordnetNounIndexNameInstanceUNM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.n.WordnetNounIndexNameInstanceUNN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.o.WordnetNounIndexNameInstanceUNO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.p.WordnetNounIndexNameInstanceUNP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.q.WordnetNounIndexNameInstanceUNQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.r.WordnetNounIndexNameInstanceUNR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.s.WordnetNounIndexNameInstanceUNS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.t.WordnetNounIndexNameInstanceUNT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.u.WordnetNounIndexNameInstanceUNU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.v.WordnetNounIndexNameInstanceUNV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.w.WordnetNounIndexNameInstanceUNW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.y.WordnetNounIndexNameInstanceUNY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("una".equals(key)) return WordnetNounIndexNameInstanceUNA.get(TERM);
	if ("unb".equals(key)) return WordnetNounIndexNameInstanceUNB.get(TERM);
	if ("unc".equals(key)) return WordnetNounIndexNameInstanceUNC.get(TERM);
	if ("und".equals(key)) return WordnetNounIndexNameInstanceUND.get(TERM);
	if ("une".equals(key)) return WordnetNounIndexNameInstanceUNE.get(TERM);
	if ("unf".equals(key)) return WordnetNounIndexNameInstanceUNF.get(TERM);
	if ("ung".equals(key)) return WordnetNounIndexNameInstanceUNG.get(TERM);
	if ("unh".equals(key)) return WordnetNounIndexNameInstanceUNH.get(TERM);
	if ("uni".equals(key)) return WordnetNounIndexNameInstanceUNI.get(TERM);
	if ("unj".equals(key)) return WordnetNounIndexNameInstanceUNJ.get(TERM);
	if ("unk".equals(key)) return WordnetNounIndexNameInstanceUNK.get(TERM);
	if ("unl".equals(key)) return WordnetNounIndexNameInstanceUNL.get(TERM);
	if ("unm".equals(key)) return WordnetNounIndexNameInstanceUNM.get(TERM);
	if ("unn".equals(key)) return WordnetNounIndexNameInstanceUNN.get(TERM);
	if ("uno".equals(key)) return WordnetNounIndexNameInstanceUNO.get(TERM);
	if ("unp".equals(key)) return WordnetNounIndexNameInstanceUNP.get(TERM);
	if ("unq".equals(key)) return WordnetNounIndexNameInstanceUNQ.get(TERM);
	if ("unr".equals(key)) return WordnetNounIndexNameInstanceUNR.get(TERM);
	if ("uns".equals(key)) return WordnetNounIndexNameInstanceUNS.get(TERM);
	if ("unt".equals(key)) return WordnetNounIndexNameInstanceUNT.get(TERM);
	if ("unu".equals(key)) return WordnetNounIndexNameInstanceUNU.get(TERM);
	if ("unv".equals(key)) return WordnetNounIndexNameInstanceUNV.get(TERM);
	if ("unw".equals(key)) return WordnetNounIndexNameInstanceUNW.get(TERM);
	if ("uny".equals(key)) return WordnetNounIndexNameInstanceUNY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUNA.terms());
	set.addAll(WordnetNounIndexNameInstanceUNB.terms());
	set.addAll(WordnetNounIndexNameInstanceUNC.terms());
	set.addAll(WordnetNounIndexNameInstanceUND.terms());
	set.addAll(WordnetNounIndexNameInstanceUNE.terms());
	set.addAll(WordnetNounIndexNameInstanceUNF.terms());
	set.addAll(WordnetNounIndexNameInstanceUNG.terms());
	set.addAll(WordnetNounIndexNameInstanceUNH.terms());
	set.addAll(WordnetNounIndexNameInstanceUNI.terms());
	set.addAll(WordnetNounIndexNameInstanceUNJ.terms());
	set.addAll(WordnetNounIndexNameInstanceUNK.terms());
	set.addAll(WordnetNounIndexNameInstanceUNL.terms());
	set.addAll(WordnetNounIndexNameInstanceUNM.terms());
	set.addAll(WordnetNounIndexNameInstanceUNN.terms());
	set.addAll(WordnetNounIndexNameInstanceUNO.terms());
	set.addAll(WordnetNounIndexNameInstanceUNP.terms());
	set.addAll(WordnetNounIndexNameInstanceUNQ.terms());
	set.addAll(WordnetNounIndexNameInstanceUNR.terms());
	set.addAll(WordnetNounIndexNameInstanceUNS.terms());
	set.addAll(WordnetNounIndexNameInstanceUNT.terms());
	set.addAll(WordnetNounIndexNameInstanceUNU.terms());
	set.addAll(WordnetNounIndexNameInstanceUNV.terms());
	set.addAll(WordnetNounIndexNameInstanceUNW.terms());
	set.addAll(WordnetNounIndexNameInstanceUNY.terms());
  		return set; 	} }