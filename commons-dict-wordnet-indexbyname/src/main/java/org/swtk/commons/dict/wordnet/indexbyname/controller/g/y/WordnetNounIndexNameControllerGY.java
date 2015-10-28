package org.swtk.commons.dict.wordnet.indexbyname.controller.g.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.m.WordnetNounIndexNameInstanceGYM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.n.WordnetNounIndexNameInstanceGYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.p.WordnetNounIndexNameInstanceGYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.r.WordnetNounIndexNameInstanceGYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.w.WordnetNounIndexNameInstanceGYW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("gym".equals(key)) return WordnetNounIndexNameInstanceGYM.get(TERM);
	if ("gyn".equals(key)) return WordnetNounIndexNameInstanceGYN.get(TERM);
	if ("gyp".equals(key)) return WordnetNounIndexNameInstanceGYP.get(TERM);
	if ("gyr".equals(key)) return WordnetNounIndexNameInstanceGYR.get(TERM);
	if ("gyw".equals(key)) return WordnetNounIndexNameInstanceGYW.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGYM.terms());
	set.addAll(WordnetNounIndexNameInstanceGYN.terms());
	set.addAll(WordnetNounIndexNameInstanceGYP.terms());
	set.addAll(WordnetNounIndexNameInstanceGYR.terms());
	set.addAll(WordnetNounIndexNameInstanceGYW.terms());
  		return set; 	} }