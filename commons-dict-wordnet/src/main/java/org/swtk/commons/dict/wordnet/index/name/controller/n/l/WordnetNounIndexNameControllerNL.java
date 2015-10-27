package org.swtk.commons.dict.wordnet.index.name.controller.n.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.l.r.b.WordnetNounIndexNameInstanceNLRB;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("nlrb".equals(key)) return WordnetNounIndexNameInstanceNLRB.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNLRB.terms());
  		return set; 	} }