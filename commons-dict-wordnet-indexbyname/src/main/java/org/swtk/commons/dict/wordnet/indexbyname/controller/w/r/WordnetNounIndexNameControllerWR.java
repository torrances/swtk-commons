package org.swtk.commons.dict.wordnet.indexbyname.controller.w.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.r.a.WordnetNounIndexNameInstanceWRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.r.e.WordnetNounIndexNameInstanceWRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.r.i.WordnetNounIndexNameInstanceWRI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.r.o.WordnetNounIndexNameInstanceWRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.w.r.y.WordnetNounIndexNameInstanceWRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("wra".equals(key)) return WordnetNounIndexNameInstanceWRA.get(TERM);
	if ("wre".equals(key)) return WordnetNounIndexNameInstanceWRE.get(TERM);
	if ("wri".equals(key)) return WordnetNounIndexNameInstanceWRI.get(TERM);
	if ("wro".equals(key)) return WordnetNounIndexNameInstanceWRO.get(TERM);
	if ("wry".equals(key)) return WordnetNounIndexNameInstanceWRY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWRA.terms());
	set.addAll(WordnetNounIndexNameInstanceWRE.terms());
	set.addAll(WordnetNounIndexNameInstanceWRI.terms());
	set.addAll(WordnetNounIndexNameInstanceWRO.terms());
	set.addAll(WordnetNounIndexNameInstanceWRY.terms());
  		return set; 	} }