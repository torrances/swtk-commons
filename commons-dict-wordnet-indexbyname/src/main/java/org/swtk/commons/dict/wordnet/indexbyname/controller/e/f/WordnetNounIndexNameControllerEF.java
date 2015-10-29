package org.swtk.commons.dict.wordnet.indexbyname.controller.e.f;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.f.f.WordnetNounIndexNameInstanceEFF;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEF {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("eff".equals(key)) return WordnetNounIndexNameInstanceEFF.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEFF.terms());
  		return set; 	} }