package org.swtk.commons.dict.wordnet.index.name.controller.j.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.j.y.a.i.WordnetNounIndexNameInstanceJYAI;
	import org.swtk.commons.dict.wordnet.index.name.instance.j.y.l.l.WordnetNounIndexNameInstanceJYLL;
	import org.swtk.commons.dict.wordnet.index.name.instance.j.y.n.x.WordnetNounIndexNameInstanceJYNX;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerJY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("jyai".equals(key)) return WordnetNounIndexNameInstanceJYAI.get(TERM);
	if ("jyll".equals(key)) return WordnetNounIndexNameInstanceJYLL.get(TERM);
	if ("jynx".equals(key)) return WordnetNounIndexNameInstanceJYNX.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceJYAI.terms());
	set.addAll(WordnetNounIndexNameInstanceJYLL.terms());
	set.addAll(WordnetNounIndexNameInstanceJYNX.terms());
  		return set; 	} }