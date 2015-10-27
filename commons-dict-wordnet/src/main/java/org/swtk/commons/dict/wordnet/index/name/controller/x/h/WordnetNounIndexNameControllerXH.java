package org.swtk.commons.dict.wordnet.index.name.controller.x.h;  import java.util.Collection;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.x.x.i.i.WordnetNounIndexNameInstanceXXII;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.x.i.v.WordnetNounIndexNameInstanceXXIV;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.x.i.x.WordnetNounIndexNameInstanceXXIX;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.x.v.i.WordnetNounIndexNameInstanceXXVI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xxii".equals(key)) return WordnetNounIndexNameInstanceXXII.get(TERM);
	if ("xxiv".equals(key)) return WordnetNounIndexNameInstanceXXIV.get(TERM);
	if ("xxix".equals(key)) return WordnetNounIndexNameInstanceXXIX.get(TERM);
	if ("xxvi".equals(key)) return WordnetNounIndexNameInstanceXXVI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} }