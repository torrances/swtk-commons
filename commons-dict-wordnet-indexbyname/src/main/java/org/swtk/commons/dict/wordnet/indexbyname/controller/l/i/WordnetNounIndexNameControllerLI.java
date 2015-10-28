package org.swtk.commons.dict.wordnet.indexbyname.controller.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.a.WordnetNounIndexNameInstanceLIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.b.WordnetNounIndexNameInstanceLIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.c.WordnetNounIndexNameInstanceLIC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.d.WordnetNounIndexNameInstanceLID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.e.WordnetNounIndexNameInstanceLIE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.f.WordnetNounIndexNameInstanceLIF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.g.WordnetNounIndexNameInstanceLIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.k.WordnetNounIndexNameInstanceLIK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.l.WordnetNounIndexNameInstanceLIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.m.WordnetNounIndexNameInstanceLIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.n.WordnetNounIndexNameInstanceLIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.o.WordnetNounIndexNameInstanceLIO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.p.WordnetNounIndexNameInstanceLIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.q.WordnetNounIndexNameInstanceLIQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.r.WordnetNounIndexNameInstanceLIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.s.WordnetNounIndexNameInstanceLIS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.t.WordnetNounIndexNameInstanceLIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.v.WordnetNounIndexNameInstanceLIV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.z.WordnetNounIndexNameInstanceLIZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("lia".equals(key)) return WordnetNounIndexNameInstanceLIA.get(TERM);
	if ("lib".equals(key)) return WordnetNounIndexNameInstanceLIB.get(TERM);
	if ("lic".equals(key)) return WordnetNounIndexNameInstanceLIC.get(TERM);
	if ("lid".equals(key)) return WordnetNounIndexNameInstanceLID.get(TERM);
	if ("lie".equals(key)) return WordnetNounIndexNameInstanceLIE.get(TERM);
	if ("lif".equals(key)) return WordnetNounIndexNameInstanceLIF.get(TERM);
	if ("lig".equals(key)) return WordnetNounIndexNameInstanceLIG.get(TERM);
	if ("lik".equals(key)) return WordnetNounIndexNameInstanceLIK.get(TERM);
	if ("lil".equals(key)) return WordnetNounIndexNameInstanceLIL.get(TERM);
	if ("lim".equals(key)) return WordnetNounIndexNameInstanceLIM.get(TERM);
	if ("lin".equals(key)) return WordnetNounIndexNameInstanceLIN.get(TERM);
	if ("lio".equals(key)) return WordnetNounIndexNameInstanceLIO.get(TERM);
	if ("lip".equals(key)) return WordnetNounIndexNameInstanceLIP.get(TERM);
	if ("liq".equals(key)) return WordnetNounIndexNameInstanceLIQ.get(TERM);
	if ("lir".equals(key)) return WordnetNounIndexNameInstanceLIR.get(TERM);
	if ("lis".equals(key)) return WordnetNounIndexNameInstanceLIS.get(TERM);
	if ("lit".equals(key)) return WordnetNounIndexNameInstanceLIT.get(TERM);
	if ("liv".equals(key)) return WordnetNounIndexNameInstanceLIV.get(TERM);
	if ("liz".equals(key)) return WordnetNounIndexNameInstanceLIZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLIA.terms());
	set.addAll(WordnetNounIndexNameInstanceLIB.terms());
	set.addAll(WordnetNounIndexNameInstanceLIC.terms());
	set.addAll(WordnetNounIndexNameInstanceLID.terms());
	set.addAll(WordnetNounIndexNameInstanceLIE.terms());
	set.addAll(WordnetNounIndexNameInstanceLIF.terms());
	set.addAll(WordnetNounIndexNameInstanceLIG.terms());
	set.addAll(WordnetNounIndexNameInstanceLIK.terms());
	set.addAll(WordnetNounIndexNameInstanceLIL.terms());
	set.addAll(WordnetNounIndexNameInstanceLIM.terms());
	set.addAll(WordnetNounIndexNameInstanceLIN.terms());
	set.addAll(WordnetNounIndexNameInstanceLIO.terms());
	set.addAll(WordnetNounIndexNameInstanceLIP.terms());
	set.addAll(WordnetNounIndexNameInstanceLIQ.terms());
	set.addAll(WordnetNounIndexNameInstanceLIR.terms());
	set.addAll(WordnetNounIndexNameInstanceLIS.terms());
	set.addAll(WordnetNounIndexNameInstanceLIT.terms());
	set.addAll(WordnetNounIndexNameInstanceLIV.terms());
	set.addAll(WordnetNounIndexNameInstanceLIZ.terms());
  		return set; 	} }