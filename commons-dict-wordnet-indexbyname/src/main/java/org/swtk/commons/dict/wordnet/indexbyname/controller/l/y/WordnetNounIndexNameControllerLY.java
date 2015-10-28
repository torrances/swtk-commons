package org.swtk.commons.dict.wordnet.indexbyname.controller.l.y;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.a.WordnetNounIndexNameInstanceLYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.c.WordnetNounIndexNameInstanceLYC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.d.WordnetNounIndexNameInstanceLYD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.g.WordnetNounIndexNameInstanceLYG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.i.WordnetNounIndexNameInstanceLYI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.l.WordnetNounIndexNameInstanceLYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.m.WordnetNounIndexNameInstanceLYM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.n.WordnetNounIndexNameInstanceLYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.o.WordnetNounIndexNameInstanceLYO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.p.WordnetNounIndexNameInstanceLYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.r.WordnetNounIndexNameInstanceLYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.s.WordnetNounIndexNameInstanceLYS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.t.WordnetNounIndexNameInstanceLYT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("lya".equals(key)) return WordnetNounIndexNameInstanceLYA.get(TERM);
	if ("lyc".equals(key)) return WordnetNounIndexNameInstanceLYC.get(TERM);
	if ("lyd".equals(key)) return WordnetNounIndexNameInstanceLYD.get(TERM);
	if ("lyg".equals(key)) return WordnetNounIndexNameInstanceLYG.get(TERM);
	if ("lyi".equals(key)) return WordnetNounIndexNameInstanceLYI.get(TERM);
	if ("lyl".equals(key)) return WordnetNounIndexNameInstanceLYL.get(TERM);
	if ("lym".equals(key)) return WordnetNounIndexNameInstanceLYM.get(TERM);
	if ("lyn".equals(key)) return WordnetNounIndexNameInstanceLYN.get(TERM);
	if ("lyo".equals(key)) return WordnetNounIndexNameInstanceLYO.get(TERM);
	if ("lyp".equals(key)) return WordnetNounIndexNameInstanceLYP.get(TERM);
	if ("lyr".equals(key)) return WordnetNounIndexNameInstanceLYR.get(TERM);
	if ("lys".equals(key)) return WordnetNounIndexNameInstanceLYS.get(TERM);
	if ("lyt".equals(key)) return WordnetNounIndexNameInstanceLYT.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLYA.terms());
	set.addAll(WordnetNounIndexNameInstanceLYC.terms());
	set.addAll(WordnetNounIndexNameInstanceLYD.terms());
	set.addAll(WordnetNounIndexNameInstanceLYG.terms());
	set.addAll(WordnetNounIndexNameInstanceLYI.terms());
	set.addAll(WordnetNounIndexNameInstanceLYL.terms());
	set.addAll(WordnetNounIndexNameInstanceLYM.terms());
	set.addAll(WordnetNounIndexNameInstanceLYN.terms());
	set.addAll(WordnetNounIndexNameInstanceLYO.terms());
	set.addAll(WordnetNounIndexNameInstanceLYP.terms());
	set.addAll(WordnetNounIndexNameInstanceLYR.terms());
	set.addAll(WordnetNounIndexNameInstanceLYS.terms());
	set.addAll(WordnetNounIndexNameInstanceLYT.terms());
  		return set; 	} }