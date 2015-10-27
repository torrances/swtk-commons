package org.swtk.commons.dict.wordnet.index.name.controller.a.q;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.a.q.a.b.WordnetNounIndexNameInstanceAQAB;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.q.u.a.WordnetNounIndexNameInstanceAQUA;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.q.u.e.WordnetNounIndexNameInstanceAQUE;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.q.u.i.WordnetNounIndexNameInstanceAQUI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAQ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("aqab".equals(key)) return WordnetNounIndexNameInstanceAQAB.get(TERM);
	if ("aqua".equals(key)) return WordnetNounIndexNameInstanceAQUA.get(TERM);
	if ("aque".equals(key)) return WordnetNounIndexNameInstanceAQUE.get(TERM);
	if ("aqui".equals(key)) return WordnetNounIndexNameInstanceAQUI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAQAB.terms());
	set.addAll(WordnetNounIndexNameInstanceAQUA.terms());
	set.addAll(WordnetNounIndexNameInstanceAQUE.terms());
	set.addAll(WordnetNounIndexNameInstanceAQUI.terms());
  		return set; 	} }