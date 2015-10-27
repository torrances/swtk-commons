package org.swtk.commons.dict.wordnet.index.name.controller.e.q;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.q.u.a.WordnetNounIndexNameInstanceEQUA;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.q.u.e.WordnetNounIndexNameInstanceEQUE;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.q.u.i.WordnetNounIndexNameInstanceEQUI;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.q.u.u.WordnetNounIndexNameInstanceEQUU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEQ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("equa".equals(key)) return WordnetNounIndexNameInstanceEQUA.get(TERM);
	if ("eque".equals(key)) return WordnetNounIndexNameInstanceEQUE.get(TERM);
	if ("equi".equals(key)) return WordnetNounIndexNameInstanceEQUI.get(TERM);
	if ("equu".equals(key)) return WordnetNounIndexNameInstanceEQUU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEQUA.terms());
	set.addAll(WordnetNounIndexNameInstanceEQUE.terms());
	set.addAll(WordnetNounIndexNameInstanceEQUI.terms());
	set.addAll(WordnetNounIndexNameInstanceEQUU.terms());
  		return set; 	} }