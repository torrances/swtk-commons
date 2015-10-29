package org.swtk.commons.dict.wordnet.indexbyname.controller.o.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.w.e.WordnetNounIndexNameInstanceOWE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.w.l.WordnetNounIndexNameInstanceOWL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.w.n.WordnetNounIndexNameInstanceOWN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("owe".equals(key)) return WordnetNounIndexNameInstanceOWE.get(TERM);
	if ("owl".equals(key)) return WordnetNounIndexNameInstanceOWL.get(TERM);
	if ("own".equals(key)) return WordnetNounIndexNameInstanceOWN.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOWE.terms());
	set.addAll(WordnetNounIndexNameInstanceOWL.terms());
	set.addAll(WordnetNounIndexNameInstanceOWN.terms());
  		return set; 	} }