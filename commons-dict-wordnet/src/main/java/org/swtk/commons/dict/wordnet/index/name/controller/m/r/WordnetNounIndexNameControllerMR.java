package org.swtk.commons.dict.wordnet.index.name.controller.m.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.m.r.e.m.WordnetNounIndexNameInstanceMREM;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.r.n.a.WordnetNounIndexNameInstanceMRNA;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.r.t.a.WordnetNounIndexNameInstanceMRTA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mrem".equals(key)) return WordnetNounIndexNameInstanceMREM.get(TERM);
	if ("mrna".equals(key)) return WordnetNounIndexNameInstanceMRNA.get(TERM);
	if ("mrta".equals(key)) return WordnetNounIndexNameInstanceMRTA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMREM.terms());
	set.addAll(WordnetNounIndexNameInstanceMRNA.terms());
	set.addAll(WordnetNounIndexNameInstanceMRTA.terms());
  		return set; 	} }