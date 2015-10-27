package org.swtk.commons.dict.wordnet.index.name.controller.t.b;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.t.b.i.l.WordnetNounIndexNameInstanceTBIL;
	import org.swtk.commons.dict.wordnet.index.name.instance.t.b.i.t.WordnetNounIndexNameInstanceTBIT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerTB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("tbil".equals(key)) return WordnetNounIndexNameInstanceTBIL.get(TERM);
	if ("tbit".equals(key)) return WordnetNounIndexNameInstanceTBIT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceTBIL.terms());
	set.addAll(WordnetNounIndexNameInstanceTBIT.terms());
  		return set; 	} }