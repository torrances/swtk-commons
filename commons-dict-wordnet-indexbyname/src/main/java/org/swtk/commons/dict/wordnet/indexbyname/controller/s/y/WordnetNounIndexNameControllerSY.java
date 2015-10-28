package org.swtk.commons.dict.wordnet.indexbyname.controller.s.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.b.WordnetNounIndexNameInstanceSYB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.c.WordnetNounIndexNameInstanceSYC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.d.WordnetNounIndexNameInstanceSYD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.l.WordnetNounIndexNameInstanceSYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.m.WordnetNounIndexNameInstanceSYM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.n.WordnetNounIndexNameInstanceSYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.p.WordnetNounIndexNameInstanceSYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.r.WordnetNounIndexNameInstanceSYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.s.WordnetNounIndexNameInstanceSYS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.y.z.WordnetNounIndexNameInstanceSYZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("syb".equals(key)) return WordnetNounIndexNameInstanceSYB.get(TERM);
	if ("syc".equals(key)) return WordnetNounIndexNameInstanceSYC.get(TERM);
	if ("syd".equals(key)) return WordnetNounIndexNameInstanceSYD.get(TERM);
	if ("syl".equals(key)) return WordnetNounIndexNameInstanceSYL.get(TERM);
	if ("sym".equals(key)) return WordnetNounIndexNameInstanceSYM.get(TERM);
	if ("syn".equals(key)) return WordnetNounIndexNameInstanceSYN.get(TERM);
	if ("syp".equals(key)) return WordnetNounIndexNameInstanceSYP.get(TERM);
	if ("syr".equals(key)) return WordnetNounIndexNameInstanceSYR.get(TERM);
	if ("sys".equals(key)) return WordnetNounIndexNameInstanceSYS.get(TERM);
	if ("syz".equals(key)) return WordnetNounIndexNameInstanceSYZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSYB.terms());
	set.addAll(WordnetNounIndexNameInstanceSYC.terms());
	set.addAll(WordnetNounIndexNameInstanceSYD.terms());
	set.addAll(WordnetNounIndexNameInstanceSYL.terms());
	set.addAll(WordnetNounIndexNameInstanceSYM.terms());
	set.addAll(WordnetNounIndexNameInstanceSYN.terms());
	set.addAll(WordnetNounIndexNameInstanceSYP.terms());
	set.addAll(WordnetNounIndexNameInstanceSYR.terms());
	set.addAll(WordnetNounIndexNameInstanceSYS.terms());
	set.addAll(WordnetNounIndexNameInstanceSYZ.terms());
  		return set; 	} }