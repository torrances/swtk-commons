package org.swtk.commons.dict.wordnet.index.name.controller.c.w;  import java.util.Collection;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.c.c.r.c.WordnetNounIndexNameInstanceCCRC;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ccrc".equals(key)) return WordnetNounIndexNameInstanceCCRC.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} }