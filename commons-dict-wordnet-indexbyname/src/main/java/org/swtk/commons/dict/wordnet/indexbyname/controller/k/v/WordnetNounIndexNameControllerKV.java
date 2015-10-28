package org.swtk.commons.dict.wordnet.indexbyname.controller.k.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.v.a.WordnetNounIndexNameInstanceKVA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.v.e.WordnetNounIndexNameInstanceKVE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("kva".equals(key)) return WordnetNounIndexNameInstanceKVA.get(TERM);
	if ("kve".equals(key)) return WordnetNounIndexNameInstanceKVE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKVA.terms());
	set.addAll(WordnetNounIndexNameInstanceKVE.terms());
  		return set; 	} }