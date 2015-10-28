package org.swtk.commons.dict.wordnet.indexbyname.controller.w.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.a.WordnetNounIndexNameInstanceWOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.b.WordnetNounIndexNameInstanceWOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.d.WordnetNounIndexNameInstanceWOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.e.WordnetNounIndexNameInstanceWOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.l.WordnetNounIndexNameInstanceWOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.m.WordnetNounIndexNameInstanceWOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.n.WordnetNounIndexNameInstanceWON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.o.WordnetNounIndexNameInstanceWOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.r.WordnetNounIndexNameInstanceWOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.t.WordnetNounIndexNameInstanceWOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.u.WordnetNounIndexNameInstanceWOU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("woa".equals(key)) return WordnetNounIndexNameInstanceWOA.get(TERM);
	if ("wob".equals(key)) return WordnetNounIndexNameInstanceWOB.get(TERM);
	if ("wod".equals(key)) return WordnetNounIndexNameInstanceWOD.get(TERM);
	if ("woe".equals(key)) return WordnetNounIndexNameInstanceWOE.get(TERM);
	if ("wol".equals(key)) return WordnetNounIndexNameInstanceWOL.get(TERM);
	if ("wom".equals(key)) return WordnetNounIndexNameInstanceWOM.get(TERM);
	if ("won".equals(key)) return WordnetNounIndexNameInstanceWON.get(TERM);
	if ("woo".equals(key)) return WordnetNounIndexNameInstanceWOO.get(TERM);
	if ("wor".equals(key)) return WordnetNounIndexNameInstanceWOR.get(TERM);
	if ("wot".equals(key)) return WordnetNounIndexNameInstanceWOT.get(TERM);
	if ("wou".equals(key)) return WordnetNounIndexNameInstanceWOU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWOA.terms());
	set.addAll(WordnetNounIndexNameInstanceWOB.terms());
	set.addAll(WordnetNounIndexNameInstanceWOD.terms());
	set.addAll(WordnetNounIndexNameInstanceWOE.terms());
	set.addAll(WordnetNounIndexNameInstanceWOL.terms());
	set.addAll(WordnetNounIndexNameInstanceWOM.terms());
	set.addAll(WordnetNounIndexNameInstanceWON.terms());
	set.addAll(WordnetNounIndexNameInstanceWOO.terms());
	set.addAll(WordnetNounIndexNameInstanceWOR.terms());
	set.addAll(WordnetNounIndexNameInstanceWOT.terms());
	set.addAll(WordnetNounIndexNameInstanceWOU.terms());
  		return set; 	} }