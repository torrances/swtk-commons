package org.swtk.commons.dict.wordnet.indexbyname.controller.i.j;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.j.s.WordnetNounIndexNameInstanceIJS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.j.t.WordnetNounIndexNameInstanceIJT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ijs".equals(key)) return WordnetNounIndexNameInstanceIJS.get(TERM);
	if ("ijt".equals(key)) return WordnetNounIndexNameInstanceIJT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIJS.terms());
	set.addAll(WordnetNounIndexNameInstanceIJT.terms());
  		return set; 	} }