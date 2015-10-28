package org.swtk.commons.dict.wordnet.indexbyname.controller.e.o;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.o.c.WordnetNounIndexNameInstanceEOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.o.h.WordnetNounIndexNameInstanceEOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.o.l.WordnetNounIndexNameInstanceEOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.o.r.WordnetNounIndexNameInstanceEOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.o.s.WordnetNounIndexNameInstanceEOS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("eoc".equals(key)) return WordnetNounIndexNameInstanceEOC.get(TERM);
	if ("eoh".equals(key)) return WordnetNounIndexNameInstanceEOH.get(TERM);
	if ("eol".equals(key)) return WordnetNounIndexNameInstanceEOL.get(TERM);
	if ("eor".equals(key)) return WordnetNounIndexNameInstanceEOR.get(TERM);
	if ("eos".equals(key)) return WordnetNounIndexNameInstanceEOS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEOC.terms());
	set.addAll(WordnetNounIndexNameInstanceEOH.terms());
	set.addAll(WordnetNounIndexNameInstanceEOL.terms());
	set.addAll(WordnetNounIndexNameInstanceEOR.terms());
	set.addAll(WordnetNounIndexNameInstanceEOS.terms());
  		return set; 	} }