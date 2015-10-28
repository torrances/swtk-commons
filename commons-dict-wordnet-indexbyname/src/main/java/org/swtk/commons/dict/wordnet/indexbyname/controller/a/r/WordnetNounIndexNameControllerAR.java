package org.swtk.commons.dict.wordnet.indexbyname.controller.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.a.WordnetNounIndexNameInstanceARA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.b.WordnetNounIndexNameInstanceARB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.c.WordnetNounIndexNameInstanceARC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.d.WordnetNounIndexNameInstanceARD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.e.WordnetNounIndexNameInstanceARE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.g.WordnetNounIndexNameInstanceARG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.h.WordnetNounIndexNameInstanceARH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.i.WordnetNounIndexNameInstanceARI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.j.WordnetNounIndexNameInstanceARJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.k.WordnetNounIndexNameInstanceARK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.l.WordnetNounIndexNameInstanceARL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.m.WordnetNounIndexNameInstanceARM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.n.WordnetNounIndexNameInstanceARN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.o.WordnetNounIndexNameInstanceARO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.p.WordnetNounIndexNameInstanceARP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.q.WordnetNounIndexNameInstanceARQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.r.WordnetNounIndexNameInstanceARR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.s.WordnetNounIndexNameInstanceARS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.t.WordnetNounIndexNameInstanceART;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.u.WordnetNounIndexNameInstanceARU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.v.WordnetNounIndexNameInstanceARV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.y.WordnetNounIndexNameInstanceARY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ara".equals(key)) return WordnetNounIndexNameInstanceARA.get(TERM);
	if ("arb".equals(key)) return WordnetNounIndexNameInstanceARB.get(TERM);
	if ("arc".equals(key)) return WordnetNounIndexNameInstanceARC.get(TERM);
	if ("ard".equals(key)) return WordnetNounIndexNameInstanceARD.get(TERM);
	if ("are".equals(key)) return WordnetNounIndexNameInstanceARE.get(TERM);
	if ("arg".equals(key)) return WordnetNounIndexNameInstanceARG.get(TERM);
	if ("arh".equals(key)) return WordnetNounIndexNameInstanceARH.get(TERM);
	if ("ari".equals(key)) return WordnetNounIndexNameInstanceARI.get(TERM);
	if ("arj".equals(key)) return WordnetNounIndexNameInstanceARJ.get(TERM);
	if ("ark".equals(key)) return WordnetNounIndexNameInstanceARK.get(TERM);
	if ("arl".equals(key)) return WordnetNounIndexNameInstanceARL.get(TERM);
	if ("arm".equals(key)) return WordnetNounIndexNameInstanceARM.get(TERM);
	if ("arn".equals(key)) return WordnetNounIndexNameInstanceARN.get(TERM);
	if ("aro".equals(key)) return WordnetNounIndexNameInstanceARO.get(TERM);
	if ("arp".equals(key)) return WordnetNounIndexNameInstanceARP.get(TERM);
	if ("arq".equals(key)) return WordnetNounIndexNameInstanceARQ.get(TERM);
	if ("arr".equals(key)) return WordnetNounIndexNameInstanceARR.get(TERM);
	if ("ars".equals(key)) return WordnetNounIndexNameInstanceARS.get(TERM);
	if ("art".equals(key)) return WordnetNounIndexNameInstanceART.get(TERM);
	if ("aru".equals(key)) return WordnetNounIndexNameInstanceARU.get(TERM);
	if ("arv".equals(key)) return WordnetNounIndexNameInstanceARV.get(TERM);
	if ("ary".equals(key)) return WordnetNounIndexNameInstanceARY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceARA.terms());
	set.addAll(WordnetNounIndexNameInstanceARB.terms());
	set.addAll(WordnetNounIndexNameInstanceARC.terms());
	set.addAll(WordnetNounIndexNameInstanceARD.terms());
	set.addAll(WordnetNounIndexNameInstanceARE.terms());
	set.addAll(WordnetNounIndexNameInstanceARG.terms());
	set.addAll(WordnetNounIndexNameInstanceARH.terms());
	set.addAll(WordnetNounIndexNameInstanceARI.terms());
	set.addAll(WordnetNounIndexNameInstanceARJ.terms());
	set.addAll(WordnetNounIndexNameInstanceARK.terms());
	set.addAll(WordnetNounIndexNameInstanceARL.terms());
	set.addAll(WordnetNounIndexNameInstanceARM.terms());
	set.addAll(WordnetNounIndexNameInstanceARN.terms());
	set.addAll(WordnetNounIndexNameInstanceARO.terms());
	set.addAll(WordnetNounIndexNameInstanceARP.terms());
	set.addAll(WordnetNounIndexNameInstanceARQ.terms());
	set.addAll(WordnetNounIndexNameInstanceARR.terms());
	set.addAll(WordnetNounIndexNameInstanceARS.terms());
	set.addAll(WordnetNounIndexNameInstanceART.terms());
	set.addAll(WordnetNounIndexNameInstanceARU.terms());
	set.addAll(WordnetNounIndexNameInstanceARV.terms());
	set.addAll(WordnetNounIndexNameInstanceARY.terms());
  		return set; 	} }