package org.swtk.commons.dict.wordnet.indexbyname.controller.i.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.z.a.WordnetNounIndexNameInstanceIZA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.z.m.WordnetNounIndexNameInstanceIZM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.z.z.WordnetNounIndexNameInstanceIZZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("iza".equals(key)) return WordnetNounIndexNameInstanceIZA.get(TERM);
	if ("izm".equals(key)) return WordnetNounIndexNameInstanceIZM.get(TERM);
	if ("izz".equals(key)) return WordnetNounIndexNameInstanceIZZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIZA.terms());
	set.addAll(WordnetNounIndexNameInstanceIZM.terms());
	set.addAll(WordnetNounIndexNameInstanceIZZ.terms());
  		return set; 	} }