package org.swtk.commons.dict.wordnet.indexbyname.controller.o.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.z.a.WordnetNounIndexNameInstanceOZA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.z.e.WordnetNounIndexNameInstanceOZE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.z.o.WordnetNounIndexNameInstanceOZO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("oza".equals(key)) return WordnetNounIndexNameInstanceOZA.get(TERM);
	if ("oze".equals(key)) return WordnetNounIndexNameInstanceOZE.get(TERM);
	if ("ozo".equals(key)) return WordnetNounIndexNameInstanceOZO.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOZA.terms());
	set.addAll(WordnetNounIndexNameInstanceOZE.terms());
	set.addAll(WordnetNounIndexNameInstanceOZO.terms());
  		return set; 	} }