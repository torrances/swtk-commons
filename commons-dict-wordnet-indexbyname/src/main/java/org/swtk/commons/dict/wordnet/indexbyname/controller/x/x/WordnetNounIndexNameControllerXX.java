package org.swtk.commons.dict.wordnet.indexbyname.controller.x.x;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.x.i.WordnetNounIndexNameInstanceXXI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.x.v.WordnetNounIndexNameInstanceXXV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXX {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xxi".equals(key)) return WordnetNounIndexNameInstanceXXI.get(TERM);
	if ("xxv".equals(key)) return WordnetNounIndexNameInstanceXXV.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXXI.terms());
	set.addAll(WordnetNounIndexNameInstanceXXV.terms());
  		return set; 	} }