package org.swtk.commons.dict.wordnet.indexbyname.controller.g.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.h.a.WordnetNounIndexNameInstanceGHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.h.e.WordnetNounIndexNameInstanceGHE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.h.i.WordnetNounIndexNameInstanceGHI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.h.o.WordnetNounIndexNameInstanceGHO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.h.r.WordnetNounIndexNameInstanceGHR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("gha".equals(key)) return WordnetNounIndexNameInstanceGHA.get(TERM);
	if ("ghe".equals(key)) return WordnetNounIndexNameInstanceGHE.get(TERM);
	if ("ghi".equals(key)) return WordnetNounIndexNameInstanceGHI.get(TERM);
	if ("gho".equals(key)) return WordnetNounIndexNameInstanceGHO.get(TERM);
	if ("ghr".equals(key)) return WordnetNounIndexNameInstanceGHR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGHA.terms());
	set.addAll(WordnetNounIndexNameInstanceGHE.terms());
	set.addAll(WordnetNounIndexNameInstanceGHI.terms());
	set.addAll(WordnetNounIndexNameInstanceGHO.terms());
	set.addAll(WordnetNounIndexNameInstanceGHR.terms());
  		return set; 	} }