package org.swtk.commons.dict.wordnet.index.name.controller.b.m;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.b.m.d.o.WordnetNounIndexNameInstanceBMDO;
	import org.swtk.commons.dict.wordnet.index.name.instance.b.m.u.s.WordnetNounIndexNameInstanceBMUS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBM {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("bmdo".equals(key)) return WordnetNounIndexNameInstanceBMDO.get(TERM);
	if ("bmus".equals(key)) return WordnetNounIndexNameInstanceBMUS.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBMDO.terms());
	set.addAll(WordnetNounIndexNameInstanceBMUS.terms());
  		return set; 	} }