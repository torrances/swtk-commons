package org.swtk.commons.dict.wordnet.index.name.controller.a.j;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.a.j.a.i.WordnetNounIndexNameInstanceAJAI;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.j.a.x.WordnetNounIndexNameInstanceAJAX;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.j.u.g.WordnetNounIndexNameInstanceAJUG;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ajai".equals(key)) return WordnetNounIndexNameInstanceAJAI.get(TERM);
	if ("ajax".equals(key)) return WordnetNounIndexNameInstanceAJAX.get(TERM);
	if ("ajug".equals(key)) return WordnetNounIndexNameInstanceAJUG.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAJAI.terms());
	set.addAll(WordnetNounIndexNameInstanceAJAX.terms());
	set.addAll(WordnetNounIndexNameInstanceAJUG.terms());
  		return set; 	} }