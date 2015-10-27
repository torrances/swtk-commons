package org.swtk.commons.dict.wordnet.index.name.controller.e.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.z.e.c.WordnetNounIndexNameInstanceEZEC;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.z.e.d.WordnetNounIndexNameInstanceEZED;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.z.e.k.WordnetNounIndexNameInstanceEZEK;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.z.r.a.WordnetNounIndexNameInstanceEZRA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ezec".equals(key)) return WordnetNounIndexNameInstanceEZEC.get(TERM);
	if ("ezed".equals(key)) return WordnetNounIndexNameInstanceEZED.get(TERM);
	if ("ezek".equals(key)) return WordnetNounIndexNameInstanceEZEK.get(TERM);
	if ("ezra".equals(key)) return WordnetNounIndexNameInstanceEZRA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEZEC.terms());
	set.addAll(WordnetNounIndexNameInstanceEZED.terms());
	set.addAll(WordnetNounIndexNameInstanceEZEK.terms());
	set.addAll(WordnetNounIndexNameInstanceEZRA.terms());
  		return set; 	} }