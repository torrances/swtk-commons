package org.swtk.commons.dict.wordnet.index.name.controller.e.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.h.a.d.WordnetNounIndexNameInstanceEHAD;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.h.r.e.WordnetNounIndexNameInstanceEHRE;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.h.r.l.WordnetNounIndexNameInstanceEHRL;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ehad".equals(key)) return WordnetNounIndexNameInstanceEHAD.get(TERM);
	if ("ehre".equals(key)) return WordnetNounIndexNameInstanceEHRE.get(TERM);
	if ("ehrl".equals(key)) return WordnetNounIndexNameInstanceEHRL.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEHAD.terms());
	set.addAll(WordnetNounIndexNameInstanceEHRE.terms());
	set.addAll(WordnetNounIndexNameInstanceEHRL.terms());
  		return set; 	} }