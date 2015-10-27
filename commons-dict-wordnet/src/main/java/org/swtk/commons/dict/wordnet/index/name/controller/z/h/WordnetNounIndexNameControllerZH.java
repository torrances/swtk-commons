package org.swtk.commons.dict.wordnet.index.name.controller.z.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.z.h.o.u.WordnetNounIndexNameInstanceZHOU;
	import org.swtk.commons.dict.wordnet.index.name.instance.z.h.u.a.WordnetNounIndexNameInstanceZHUA;
	import org.swtk.commons.dict.wordnet.index.name.instance.z.h.u.k.WordnetNounIndexNameInstanceZHUK;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerZH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("zhou".equals(key)) return WordnetNounIndexNameInstanceZHOU.get(TERM);
	if ("zhua".equals(key)) return WordnetNounIndexNameInstanceZHUA.get(TERM);
	if ("zhuk".equals(key)) return WordnetNounIndexNameInstanceZHUK.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceZHOU.terms());
	set.addAll(WordnetNounIndexNameInstanceZHUA.terms());
	set.addAll(WordnetNounIndexNameInstanceZHUK.terms());
  		return set; 	} }