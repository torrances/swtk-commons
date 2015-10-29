package org.swtk.commons.dict.wordnet.indexbyname.controller.j.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.y.a.WordnetNounIndexNameInstanceJYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.y.l.WordnetNounIndexNameInstanceJYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.y.n.WordnetNounIndexNameInstanceJYN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerJY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("jya".equals(key)) return WordnetNounIndexNameInstanceJYA.get(TERM);
	if ("jyl".equals(key)) return WordnetNounIndexNameInstanceJYL.get(TERM);
	if ("jyn".equals(key)) return WordnetNounIndexNameInstanceJYN.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceJYA.terms());
	set.addAll(WordnetNounIndexNameInstanceJYL.terms());
	set.addAll(WordnetNounIndexNameInstanceJYN.terms());
  		return set; 	} }