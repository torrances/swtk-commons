package org.swtk.commons.dict.wordnet.indexbyname.controller.r.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.y.d.WordnetNounIndexNameInstanceRYD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.y.e.WordnetNounIndexNameInstanceRYE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.y.n.WordnetNounIndexNameInstanceRYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.y.p.WordnetNounIndexNameInstanceRYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.y.u.WordnetNounIndexNameInstanceRYU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerRY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ryd".equals(key)) return WordnetNounIndexNameInstanceRYD.get(TERM);
	if ("rye".equals(key)) return WordnetNounIndexNameInstanceRYE.get(TERM);
	if ("ryn".equals(key)) return WordnetNounIndexNameInstanceRYN.get(TERM);
	if ("ryp".equals(key)) return WordnetNounIndexNameInstanceRYP.get(TERM);
	if ("ryu".equals(key)) return WordnetNounIndexNameInstanceRYU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceRYD.terms());
	set.addAll(WordnetNounIndexNameInstanceRYE.terms());
	set.addAll(WordnetNounIndexNameInstanceRYN.terms());
	set.addAll(WordnetNounIndexNameInstanceRYP.terms());
	set.addAll(WordnetNounIndexNameInstanceRYU.terms());
  		return set; 	} }