package org.swtk.commons.dict.wordnet.index.name.controller.u.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.u.i.g.h.WordnetNounIndexNameInstanceUIGH;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.i.g.u.WordnetNounIndexNameInstanceUIGU;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.i.n.t.WordnetNounIndexNameInstanceUINT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("uigh".equals(key)) return WordnetNounIndexNameInstanceUIGH.get(TERM);
	if ("uigu".equals(key)) return WordnetNounIndexNameInstanceUIGU.get(TERM);
	if ("uint".equals(key)) return WordnetNounIndexNameInstanceUINT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUIGH.terms());
	set.addAll(WordnetNounIndexNameInstanceUIGU.terms());
	set.addAll(WordnetNounIndexNameInstanceUINT.terms());
  		return set; 	} }