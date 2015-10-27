package org.swtk.commons.dict.wordnet.index.name.controller.o.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.y.a.b.WordnetNounIndexNameInstanceOYAB;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.y.s.t.WordnetNounIndexNameInstanceOYST;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("oyab".equals(key)) return WordnetNounIndexNameInstanceOYAB.get(TERM);
	if ("oyst".equals(key)) return WordnetNounIndexNameInstanceOYST.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOYAB.terms());
	set.addAll(WordnetNounIndexNameInstanceOYST.terms());
  		return set; 	} }