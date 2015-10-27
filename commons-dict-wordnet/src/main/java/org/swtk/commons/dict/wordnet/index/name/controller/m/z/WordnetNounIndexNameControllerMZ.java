package org.swtk.commons.dict.wordnet.index.name.controller.m.z;  import java.util.Collection;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.m.m.p.i.WordnetNounIndexNameInstanceMMPI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mmpi".equals(key)) return WordnetNounIndexNameInstanceMMPI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} }