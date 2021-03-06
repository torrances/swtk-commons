package org.swtk.commons.dict.wordnet.indexbyname.controller.w.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.c.WordnetNounIndexNameInstanceWIC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.d.WordnetNounIndexNameInstanceWID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.e.WordnetNounIndexNameInstanceWIE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.f.WordnetNounIndexNameInstanceWIF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.g.WordnetNounIndexNameInstanceWIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.k.WordnetNounIndexNameInstanceWIK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.l.WordnetNounIndexNameInstanceWIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.m.WordnetNounIndexNameInstanceWIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.n.WordnetNounIndexNameInstanceWIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.p.WordnetNounIndexNameInstanceWIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.r.WordnetNounIndexNameInstanceWIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.s.WordnetNounIndexNameInstanceWIS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.t.WordnetNounIndexNameInstanceWIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.v.WordnetNounIndexNameInstanceWIV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.z.WordnetNounIndexNameInstanceWIZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("wic".equals(key)) return WordnetNounIndexNameInstanceWIC.get(TERM);
	if ("wid".equals(key)) return WordnetNounIndexNameInstanceWID.get(TERM);
	if ("wie".equals(key)) return WordnetNounIndexNameInstanceWIE.get(TERM);
	if ("wif".equals(key)) return WordnetNounIndexNameInstanceWIF.get(TERM);
	if ("wig".equals(key)) return WordnetNounIndexNameInstanceWIG.get(TERM);
	if ("wik".equals(key)) return WordnetNounIndexNameInstanceWIK.get(TERM);
	if ("wil".equals(key)) return WordnetNounIndexNameInstanceWIL.get(TERM);
	if ("wim".equals(key)) return WordnetNounIndexNameInstanceWIM.get(TERM);
	if ("win".equals(key)) return WordnetNounIndexNameInstanceWIN.get(TERM);
	if ("wip".equals(key)) return WordnetNounIndexNameInstanceWIP.get(TERM);
	if ("wir".equals(key)) return WordnetNounIndexNameInstanceWIR.get(TERM);
	if ("wis".equals(key)) return WordnetNounIndexNameInstanceWIS.get(TERM);
	if ("wit".equals(key)) return WordnetNounIndexNameInstanceWIT.get(TERM);
	if ("wiv".equals(key)) return WordnetNounIndexNameInstanceWIV.get(TERM);
	if ("wiz".equals(key)) return WordnetNounIndexNameInstanceWIZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWIC.terms());
	set.addAll(WordnetNounIndexNameInstanceWID.terms());
	set.addAll(WordnetNounIndexNameInstanceWIE.terms());
	set.addAll(WordnetNounIndexNameInstanceWIF.terms());
	set.addAll(WordnetNounIndexNameInstanceWIG.terms());
	set.addAll(WordnetNounIndexNameInstanceWIK.terms());
	set.addAll(WordnetNounIndexNameInstanceWIL.terms());
	set.addAll(WordnetNounIndexNameInstanceWIM.terms());
	set.addAll(WordnetNounIndexNameInstanceWIN.terms());
	set.addAll(WordnetNounIndexNameInstanceWIP.terms());
	set.addAll(WordnetNounIndexNameInstanceWIR.terms());
	set.addAll(WordnetNounIndexNameInstanceWIS.terms());
	set.addAll(WordnetNounIndexNameInstanceWIT.terms());
	set.addAll(WordnetNounIndexNameInstanceWIV.terms());
	set.addAll(WordnetNounIndexNameInstanceWIZ.terms());
  		return set; 	} }