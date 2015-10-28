package org.swtk.commons.dict.wordnet.indexbyname.controller.x.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.e.n.WordnetNounIndexNameInstanceXEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.e.r.WordnetNounIndexNameInstanceXER;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xen".equals(key)) return WordnetNounIndexNameInstanceXEN.get(TERM);
	if ("xer".equals(key)) return WordnetNounIndexNameInstanceXER.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXEN.terms());
	set.addAll(WordnetNounIndexNameInstanceXER.terms());
  		return set; 	} }