package org.swtk.commons.dict.wordnet.indexbyname.controller.b.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.a.WordnetNounIndexNameInstanceBIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.b.WordnetNounIndexNameInstanceBIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.c.WordnetNounIndexNameInstanceBIC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.d.WordnetNounIndexNameInstanceBID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.e.WordnetNounIndexNameInstanceBIE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.f.WordnetNounIndexNameInstanceBIF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.g.WordnetNounIndexNameInstanceBIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.h.WordnetNounIndexNameInstanceBIH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.j.WordnetNounIndexNameInstanceBIJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.k.WordnetNounIndexNameInstanceBIK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.l.WordnetNounIndexNameInstanceBIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.m.WordnetNounIndexNameInstanceBIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.n.WordnetNounIndexNameInstanceBIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.o.WordnetNounIndexNameInstanceBIO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.p.WordnetNounIndexNameInstanceBIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.q.WordnetNounIndexNameInstanceBIQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.r.WordnetNounIndexNameInstanceBIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.s.WordnetNounIndexNameInstanceBIS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.t.WordnetNounIndexNameInstanceBIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.v.WordnetNounIndexNameInstanceBIV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.w.WordnetNounIndexNameInstanceBIW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.z.WordnetNounIndexNameInstanceBIZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("bia".equals(key)) return WordnetNounIndexNameInstanceBIA.get(TERM);
	if ("bib".equals(key)) return WordnetNounIndexNameInstanceBIB.get(TERM);
	if ("bic".equals(key)) return WordnetNounIndexNameInstanceBIC.get(TERM);
	if ("bid".equals(key)) return WordnetNounIndexNameInstanceBID.get(TERM);
	if ("bie".equals(key)) return WordnetNounIndexNameInstanceBIE.get(TERM);
	if ("bif".equals(key)) return WordnetNounIndexNameInstanceBIF.get(TERM);
	if ("big".equals(key)) return WordnetNounIndexNameInstanceBIG.get(TERM);
	if ("bih".equals(key)) return WordnetNounIndexNameInstanceBIH.get(TERM);
	if ("bij".equals(key)) return WordnetNounIndexNameInstanceBIJ.get(TERM);
	if ("bik".equals(key)) return WordnetNounIndexNameInstanceBIK.get(TERM);
	if ("bil".equals(key)) return WordnetNounIndexNameInstanceBIL.get(TERM);
	if ("bim".equals(key)) return WordnetNounIndexNameInstanceBIM.get(TERM);
	if ("bin".equals(key)) return WordnetNounIndexNameInstanceBIN.get(TERM);
	if ("bio".equals(key)) return WordnetNounIndexNameInstanceBIO.get(TERM);
	if ("bip".equals(key)) return WordnetNounIndexNameInstanceBIP.get(TERM);
	if ("biq".equals(key)) return WordnetNounIndexNameInstanceBIQ.get(TERM);
	if ("bir".equals(key)) return WordnetNounIndexNameInstanceBIR.get(TERM);
	if ("bis".equals(key)) return WordnetNounIndexNameInstanceBIS.get(TERM);
	if ("bit".equals(key)) return WordnetNounIndexNameInstanceBIT.get(TERM);
	if ("biv".equals(key)) return WordnetNounIndexNameInstanceBIV.get(TERM);
	if ("biw".equals(key)) return WordnetNounIndexNameInstanceBIW.get(TERM);
	if ("biz".equals(key)) return WordnetNounIndexNameInstanceBIZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBIA.terms());
	set.addAll(WordnetNounIndexNameInstanceBIB.terms());
	set.addAll(WordnetNounIndexNameInstanceBIC.terms());
	set.addAll(WordnetNounIndexNameInstanceBID.terms());
	set.addAll(WordnetNounIndexNameInstanceBIE.terms());
	set.addAll(WordnetNounIndexNameInstanceBIF.terms());
	set.addAll(WordnetNounIndexNameInstanceBIG.terms());
	set.addAll(WordnetNounIndexNameInstanceBIH.terms());
	set.addAll(WordnetNounIndexNameInstanceBIJ.terms());
	set.addAll(WordnetNounIndexNameInstanceBIK.terms());
	set.addAll(WordnetNounIndexNameInstanceBIL.terms());
	set.addAll(WordnetNounIndexNameInstanceBIM.terms());
	set.addAll(WordnetNounIndexNameInstanceBIN.terms());
	set.addAll(WordnetNounIndexNameInstanceBIO.terms());
	set.addAll(WordnetNounIndexNameInstanceBIP.terms());
	set.addAll(WordnetNounIndexNameInstanceBIQ.terms());
	set.addAll(WordnetNounIndexNameInstanceBIR.terms());
	set.addAll(WordnetNounIndexNameInstanceBIS.terms());
	set.addAll(WordnetNounIndexNameInstanceBIT.terms());
	set.addAll(WordnetNounIndexNameInstanceBIV.terms());
	set.addAll(WordnetNounIndexNameInstanceBIW.terms());
	set.addAll(WordnetNounIndexNameInstanceBIZ.terms());
  		return set; 	} }