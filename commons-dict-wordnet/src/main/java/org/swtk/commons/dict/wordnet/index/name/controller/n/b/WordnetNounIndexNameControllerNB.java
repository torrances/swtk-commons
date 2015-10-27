package org.swtk.commons.dict.wordnet.index.name.controller.n.b;  import java.util.Collection;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.n.r.t.WordnetNounIndexNameInstanceNNRT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("nnrt".equals(key)) return WordnetNounIndexNameInstanceNNRT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} }