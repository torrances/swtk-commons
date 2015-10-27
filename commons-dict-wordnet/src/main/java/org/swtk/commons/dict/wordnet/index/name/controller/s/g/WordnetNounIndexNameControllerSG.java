package org.swtk.commons.dict.wordnet.index.name.controller.s.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.s.g.m.l.WordnetNounIndexNameInstanceSGML;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.g.r.a.WordnetNounIndexNameInstanceSGRA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("sgml".equals(key)) return WordnetNounIndexNameInstanceSGML.get(TERM);
	if ("sgra".equals(key)) return WordnetNounIndexNameInstanceSGRA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSGML.terms());
	set.addAll(WordnetNounIndexNameInstanceSGRA.terms());
  		return set; 	} }