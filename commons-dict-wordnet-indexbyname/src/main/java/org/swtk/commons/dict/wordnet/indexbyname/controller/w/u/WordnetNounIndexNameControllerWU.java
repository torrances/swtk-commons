package org.swtk.commons.dict.wordnet.indexbyname.controller.w.u;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.u.e.WordnetNounIndexNameInstanceWUE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.u.h.WordnetNounIndexNameInstanceWUH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.u.l.WordnetNounIndexNameInstanceWUL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.u.r.WordnetNounIndexNameInstanceWUR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.u.s.WordnetNounIndexNameInstanceWUS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("wue".equals(key)) return WordnetNounIndexNameInstanceWUE.get(TERM);
	if ("wuh".equals(key)) return WordnetNounIndexNameInstanceWUH.get(TERM);
	if ("wul".equals(key)) return WordnetNounIndexNameInstanceWUL.get(TERM);
	if ("wur".equals(key)) return WordnetNounIndexNameInstanceWUR.get(TERM);
	if ("wus".equals(key)) return WordnetNounIndexNameInstanceWUS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWUE.terms());
	set.addAll(WordnetNounIndexNameInstanceWUH.terms());
	set.addAll(WordnetNounIndexNameInstanceWUL.terms());
	set.addAll(WordnetNounIndexNameInstanceWUR.terms());
	set.addAll(WordnetNounIndexNameInstanceWUS.terms());
  		return set; 	} }