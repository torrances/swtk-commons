package org.swtk.commons.dict.wordnet.indexbyname.controller.k.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.a.WordnetNounIndexNameInstanceKYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.l.WordnetNounIndexNameInstanceKYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.m.WordnetNounIndexNameInstanceKYM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.o.WordnetNounIndexNameInstanceKYO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.p.WordnetNounIndexNameInstanceKYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.r.WordnetNounIndexNameInstanceKYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.u.WordnetNounIndexNameInstanceKYU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.y.y.WordnetNounIndexNameInstanceKYY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("kya".equals(key)) return WordnetNounIndexNameInstanceKYA.get(TERM);
	if ("kyl".equals(key)) return WordnetNounIndexNameInstanceKYL.get(TERM);
	if ("kym".equals(key)) return WordnetNounIndexNameInstanceKYM.get(TERM);
	if ("kyo".equals(key)) return WordnetNounIndexNameInstanceKYO.get(TERM);
	if ("kyp".equals(key)) return WordnetNounIndexNameInstanceKYP.get(TERM);
	if ("kyr".equals(key)) return WordnetNounIndexNameInstanceKYR.get(TERM);
	if ("kyu".equals(key)) return WordnetNounIndexNameInstanceKYU.get(TERM);
	if ("kyy".equals(key)) return WordnetNounIndexNameInstanceKYY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKYA.terms());
	set.addAll(WordnetNounIndexNameInstanceKYL.terms());
	set.addAll(WordnetNounIndexNameInstanceKYM.terms());
	set.addAll(WordnetNounIndexNameInstanceKYO.terms());
	set.addAll(WordnetNounIndexNameInstanceKYP.terms());
	set.addAll(WordnetNounIndexNameInstanceKYR.terms());
	set.addAll(WordnetNounIndexNameInstanceKYU.terms());
	set.addAll(WordnetNounIndexNameInstanceKYY.terms());
  		return set; 	} }