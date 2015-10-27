package org.swtk.commons.dict.wordnet.index.name.controller.x.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.x.a.n.a.WordnetNounIndexNameInstanceXANA;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.a.n.t.WordnetNounIndexNameInstanceXANT;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.a.v.i.WordnetNounIndexNameInstanceXAVI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xana".equals(key)) return WordnetNounIndexNameInstanceXANA.get(TERM);
	if ("xant".equals(key)) return WordnetNounIndexNameInstanceXANT.get(TERM);
	if ("xavi".equals(key)) return WordnetNounIndexNameInstanceXAVI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXANA.terms());
	set.addAll(WordnetNounIndexNameInstanceXANT.terms());
	set.addAll(WordnetNounIndexNameInstanceXAVI.terms());
  		return set; 	} }