package org.swtk.commons.dict.wordnet.indexbyname.controller.v.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.l.a.WordnetNounIndexNameInstanceVLA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.l.d.WordnetNounIndexNameInstanceVLD;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerVL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("vla".equals(key)) return WordnetNounIndexNameInstanceVLA.get(TERM);
	if ("vld".equals(key)) return WordnetNounIndexNameInstanceVLD.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceVLA.terms());
	set.addAll(WordnetNounIndexNameInstanceVLD.terms());
  		return set; 	} }