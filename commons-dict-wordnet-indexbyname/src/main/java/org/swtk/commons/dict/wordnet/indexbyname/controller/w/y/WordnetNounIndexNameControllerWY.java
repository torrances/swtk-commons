package org.swtk.commons.dict.wordnet.indexbyname.controller.w.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.a.WordnetNounIndexNameInstanceWYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.c.WordnetNounIndexNameInstanceWYC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.e.WordnetNounIndexNameInstanceWYE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.k.WordnetNounIndexNameInstanceWYK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.l.WordnetNounIndexNameInstanceWYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.n.WordnetNounIndexNameInstanceWYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.o.WordnetNounIndexNameInstanceWYO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.r.WordnetNounIndexNameInstanceWYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.s.WordnetNounIndexNameInstanceWYS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.t.WordnetNounIndexNameInstanceWYT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.y.v.WordnetNounIndexNameInstanceWYV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("wya".equals(key)) return WordnetNounIndexNameInstanceWYA.get(TERM);
	if ("wyc".equals(key)) return WordnetNounIndexNameInstanceWYC.get(TERM);
	if ("wye".equals(key)) return WordnetNounIndexNameInstanceWYE.get(TERM);
	if ("wyk".equals(key)) return WordnetNounIndexNameInstanceWYK.get(TERM);
	if ("wyl".equals(key)) return WordnetNounIndexNameInstanceWYL.get(TERM);
	if ("wyn".equals(key)) return WordnetNounIndexNameInstanceWYN.get(TERM);
	if ("wyo".equals(key)) return WordnetNounIndexNameInstanceWYO.get(TERM);
	if ("wyr".equals(key)) return WordnetNounIndexNameInstanceWYR.get(TERM);
	if ("wys".equals(key)) return WordnetNounIndexNameInstanceWYS.get(TERM);
	if ("wyt".equals(key)) return WordnetNounIndexNameInstanceWYT.get(TERM);
	if ("wyv".equals(key)) return WordnetNounIndexNameInstanceWYV.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWYA.terms());
	set.addAll(WordnetNounIndexNameInstanceWYC.terms());
	set.addAll(WordnetNounIndexNameInstanceWYE.terms());
	set.addAll(WordnetNounIndexNameInstanceWYK.terms());
	set.addAll(WordnetNounIndexNameInstanceWYL.terms());
	set.addAll(WordnetNounIndexNameInstanceWYN.terms());
	set.addAll(WordnetNounIndexNameInstanceWYO.terms());
	set.addAll(WordnetNounIndexNameInstanceWYR.terms());
	set.addAll(WordnetNounIndexNameInstanceWYS.terms());
	set.addAll(WordnetNounIndexNameInstanceWYT.terms());
	set.addAll(WordnetNounIndexNameInstanceWYV.terms());
  		return set; 	} }