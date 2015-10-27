package org.swtk.commons.dict.wordnet.index.name.controller.c.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.c.z.a.r.WordnetNounIndexNameInstanceCZAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.z.e.c.WordnetNounIndexNameInstanceCZEC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.z.e.r.WordnetNounIndexNameInstanceCZER;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.z.e.s.WordnetNounIndexNameInstanceCZES;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("czar".equals(key)) return WordnetNounIndexNameInstanceCZAR.get(TERM);
	if ("czec".equals(key)) return WordnetNounIndexNameInstanceCZEC.get(TERM);
	if ("czer".equals(key)) return WordnetNounIndexNameInstanceCZER.get(TERM);
	if ("czes".equals(key)) return WordnetNounIndexNameInstanceCZES.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCZAR.terms());
	set.addAll(WordnetNounIndexNameInstanceCZEC.terms());
	set.addAll(WordnetNounIndexNameInstanceCZER.terms());
	set.addAll(WordnetNounIndexNameInstanceCZES.terms());
  		return set; 	} }