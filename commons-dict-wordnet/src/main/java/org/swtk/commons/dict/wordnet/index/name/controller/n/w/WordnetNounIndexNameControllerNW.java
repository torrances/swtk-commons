package org.swtk.commons.dict.wordnet.index.name.controller.n.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.w.b.n.WordnetNounIndexNameInstanceNWBN;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.w.b.w.WordnetNounIndexNameInstanceNWBW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("nwbn".equals(key)) return WordnetNounIndexNameInstanceNWBN.get(TERM);
	if ("nwbw".equals(key)) return WordnetNounIndexNameInstanceNWBW.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNWBN.terms());
	set.addAll(WordnetNounIndexNameInstanceNWBW.terms());
  		return set; 	} }