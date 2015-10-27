package org.swtk.commons.dict.wordnet.index.name.controller.e.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.o.c.e.WordnetNounIndexNameInstanceEOCE;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.o.h.i.WordnetNounIndexNameInstanceEOHI;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.o.l.i.WordnetNounIndexNameInstanceEOLI;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.o.r.a.WordnetNounIndexNameInstanceEORA;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.o.s.i.WordnetNounIndexNameInstanceEOSI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("eoce".equals(key)) return WordnetNounIndexNameInstanceEOCE.get(TERM);
	if ("eohi".equals(key)) return WordnetNounIndexNameInstanceEOHI.get(TERM);
	if ("eoli".equals(key)) return WordnetNounIndexNameInstanceEOLI.get(TERM);
	if ("eora".equals(key)) return WordnetNounIndexNameInstanceEORA.get(TERM);
	if ("eosi".equals(key)) return WordnetNounIndexNameInstanceEOSI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEOCE.terms());
	set.addAll(WordnetNounIndexNameInstanceEOHI.terms());
	set.addAll(WordnetNounIndexNameInstanceEOLI.terms());
	set.addAll(WordnetNounIndexNameInstanceEORA.terms());
	set.addAll(WordnetNounIndexNameInstanceEOSI.terms());
  		return set; 	} }