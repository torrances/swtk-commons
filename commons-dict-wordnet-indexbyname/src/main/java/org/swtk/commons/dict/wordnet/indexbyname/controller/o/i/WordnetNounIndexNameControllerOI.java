package org.swtk.commons.dict.wordnet.indexbyname.controller.o.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.i.l.WordnetNounIndexNameInstanceOIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.i.n.WordnetNounIndexNameInstanceOIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.i.r.WordnetNounIndexNameInstanceOIR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("oil".equals(key)) return WordnetNounIndexNameInstanceOIL.get(TERM);
	if ("oin".equals(key)) return WordnetNounIndexNameInstanceOIN.get(TERM);
	if ("oir".equals(key)) return WordnetNounIndexNameInstanceOIR.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOIL.terms());
	set.addAll(WordnetNounIndexNameInstanceOIN.terms());
	set.addAll(WordnetNounIndexNameInstanceOIR.terms());
  		return set; 	} }