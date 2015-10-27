package org.swtk.commons.dict.wordnet.index.name.controller.m.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.m.n.e.m.WordnetNounIndexNameInstanceMNEM;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.n.i.a.WordnetNounIndexNameInstanceMNIA;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.n.i.u.WordnetNounIndexNameInstanceMNIU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mnem".equals(key)) return WordnetNounIndexNameInstanceMNEM.get(TERM);
	if ("mnia".equals(key)) return WordnetNounIndexNameInstanceMNIA.get(TERM);
	if ("mniu".equals(key)) return WordnetNounIndexNameInstanceMNIU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMNEM.terms());
	set.addAll(WordnetNounIndexNameInstanceMNIA.terms());
	set.addAll(WordnetNounIndexNameInstanceMNIU.terms());
  		return set; 	} }