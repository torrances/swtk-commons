package org.swtk.commons.dict.wordnet.index.name.controller.s.q;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.s.q.u.a.WordnetNounIndexNameInstanceSQUA;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.q.u.e.WordnetNounIndexNameInstanceSQUE;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.q.u.i.WordnetNounIndexNameInstanceSQUI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSQ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("squa".equals(key)) return WordnetNounIndexNameInstanceSQUA.get(TERM);
	if ("sque".equals(key)) return WordnetNounIndexNameInstanceSQUE.get(TERM);
	if ("squi".equals(key)) return WordnetNounIndexNameInstanceSQUI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSQUA.terms());
	set.addAll(WordnetNounIndexNameInstanceSQUE.terms());
	set.addAll(WordnetNounIndexNameInstanceSQUI.terms());
  		return set; 	} }