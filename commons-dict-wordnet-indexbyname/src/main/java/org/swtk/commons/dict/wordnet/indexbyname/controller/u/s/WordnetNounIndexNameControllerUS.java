package org.swtk.commons.dict.wordnet.indexbyname.controller.u.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.a.WordnetNounIndexNameInstanceUSA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.b.WordnetNounIndexNameInstanceUSB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.c.WordnetNounIndexNameInstanceUSC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.d.WordnetNounIndexNameInstanceUSD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.e.WordnetNounIndexNameInstanceUSE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.h.WordnetNounIndexNameInstanceUSH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.i.WordnetNounIndexNameInstanceUSI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.k.WordnetNounIndexNameInstanceUSK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.m.WordnetNounIndexNameInstanceUSM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.n.WordnetNounIndexNameInstanceUSN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.p.WordnetNounIndexNameInstanceUSP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.s.WordnetNounIndexNameInstanceUSS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.t.WordnetNounIndexNameInstanceUST;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.u.WordnetNounIndexNameInstanceUSU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("usa".equals(key)) return WordnetNounIndexNameInstanceUSA.get(TERM);
	if ("usb".equals(key)) return WordnetNounIndexNameInstanceUSB.get(TERM);
	if ("usc".equals(key)) return WordnetNounIndexNameInstanceUSC.get(TERM);
	if ("usd".equals(key)) return WordnetNounIndexNameInstanceUSD.get(TERM);
	if ("use".equals(key)) return WordnetNounIndexNameInstanceUSE.get(TERM);
	if ("ush".equals(key)) return WordnetNounIndexNameInstanceUSH.get(TERM);
	if ("usi".equals(key)) return WordnetNounIndexNameInstanceUSI.get(TERM);
	if ("usk".equals(key)) return WordnetNounIndexNameInstanceUSK.get(TERM);
	if ("usm".equals(key)) return WordnetNounIndexNameInstanceUSM.get(TERM);
	if ("usn".equals(key)) return WordnetNounIndexNameInstanceUSN.get(TERM);
	if ("usp".equals(key)) return WordnetNounIndexNameInstanceUSP.get(TERM);
	if ("uss".equals(key)) return WordnetNounIndexNameInstanceUSS.get(TERM);
	if ("ust".equals(key)) return WordnetNounIndexNameInstanceUST.get(TERM);
	if ("usu".equals(key)) return WordnetNounIndexNameInstanceUSU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUSA.terms());
	set.addAll(WordnetNounIndexNameInstanceUSB.terms());
	set.addAll(WordnetNounIndexNameInstanceUSC.terms());
	set.addAll(WordnetNounIndexNameInstanceUSD.terms());
	set.addAll(WordnetNounIndexNameInstanceUSE.terms());
	set.addAll(WordnetNounIndexNameInstanceUSH.terms());
	set.addAll(WordnetNounIndexNameInstanceUSI.terms());
	set.addAll(WordnetNounIndexNameInstanceUSK.terms());
	set.addAll(WordnetNounIndexNameInstanceUSM.terms());
	set.addAll(WordnetNounIndexNameInstanceUSN.terms());
	set.addAll(WordnetNounIndexNameInstanceUSP.terms());
	set.addAll(WordnetNounIndexNameInstanceUSS.terms());
	set.addAll(WordnetNounIndexNameInstanceUST.terms());
	set.addAll(WordnetNounIndexNameInstanceUSU.terms());
  		return set; 	} }