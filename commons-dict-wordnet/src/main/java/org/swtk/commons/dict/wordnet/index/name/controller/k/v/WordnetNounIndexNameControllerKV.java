package org.swtk.commons.dict.wordnet.index.name.controller.k.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.k.v.a.s.WordnetNounIndexNameInstanceKVAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.k.v.e.t.WordnetNounIndexNameInstanceKVET;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("kvas".equals(key)) return WordnetNounIndexNameInstanceKVAS.get(TERM);
	if ("kvet".equals(key)) return WordnetNounIndexNameInstanceKVET.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKVAS.terms());
	set.addAll(WordnetNounIndexNameInstanceKVET.terms());
  		return set; 	} }