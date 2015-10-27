package org.swtk.commons.dict.wordnet.index.name.controller.h.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.h.r.o.l.WordnetNounIndexNameInstanceHROL;
	import org.swtk.commons.dict.wordnet.index.name.instance.h.r.v.a.WordnetNounIndexNameInstanceHRVA;
	import org.swtk.commons.dict.wordnet.index.name.instance.h.r.y.v.WordnetNounIndexNameInstanceHRYV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerHR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("hrol".equals(key)) return WordnetNounIndexNameInstanceHROL.get(TERM);
	if ("hrva".equals(key)) return WordnetNounIndexNameInstanceHRVA.get(TERM);
	if ("hryv".equals(key)) return WordnetNounIndexNameInstanceHRYV.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceHROL.terms());
	set.addAll(WordnetNounIndexNameInstanceHRVA.terms());
	set.addAll(WordnetNounIndexNameInstanceHRYV.terms());
  		return set; 	} }