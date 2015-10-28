package org.swtk.commons.dict.wordnet.indexbyname.controller.u.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.v.e.WordnetNounIndexNameInstanceUVE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.v.u.WordnetNounIndexNameInstanceUVU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("uve".equals(key)) return WordnetNounIndexNameInstanceUVE.get(TERM);
	if ("uvu".equals(key)) return WordnetNounIndexNameInstanceUVU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUVE.terms());
	set.addAll(WordnetNounIndexNameInstanceUVU.terms());
  		return set; 	} }