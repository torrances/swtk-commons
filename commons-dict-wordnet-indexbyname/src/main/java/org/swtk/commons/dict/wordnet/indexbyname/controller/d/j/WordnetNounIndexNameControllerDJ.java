package org.swtk.commons.dict.wordnet.indexbyname.controller.d.j;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.j.a.WordnetNounIndexNameInstanceDJA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.j.i.WordnetNounIndexNameInstanceDJI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("dja".equals(key)) return WordnetNounIndexNameInstanceDJA.get(TERM);
	if ("dji".equals(key)) return WordnetNounIndexNameInstanceDJI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDJA.terms());
	set.addAll(WordnetNounIndexNameInstanceDJI.terms());
  		return set; 	} }