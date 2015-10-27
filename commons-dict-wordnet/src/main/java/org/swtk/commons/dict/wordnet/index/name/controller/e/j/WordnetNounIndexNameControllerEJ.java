package org.swtk.commons.dict.wordnet.index.name.controller.e.j;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.j.a.c.WordnetNounIndexNameInstanceEJAC;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.j.e.c.WordnetNounIndexNameInstanceEJEC;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ejac".equals(key)) return WordnetNounIndexNameInstanceEJAC.get(TERM);
	if ("ejec".equals(key)) return WordnetNounIndexNameInstanceEJEC.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEJAC.terms());
	set.addAll(WordnetNounIndexNameInstanceEJEC.terms());
  		return set; 	} }