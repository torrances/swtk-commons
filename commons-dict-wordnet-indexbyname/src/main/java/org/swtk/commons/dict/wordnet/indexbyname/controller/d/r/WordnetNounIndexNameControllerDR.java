package org.swtk.commons.dict.wordnet.indexbyname.controller.d.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.a.WordnetNounIndexNameInstanceDRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.e.WordnetNounIndexNameInstanceDRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.i.WordnetNounIndexNameInstanceDRI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.m.WordnetNounIndexNameInstanceDRM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.o.WordnetNounIndexNameInstanceDRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.u.WordnetNounIndexNameInstanceDRU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.y.WordnetNounIndexNameInstanceDRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("dra".equals(key)) return WordnetNounIndexNameInstanceDRA.get(TERM);
	if ("dre".equals(key)) return WordnetNounIndexNameInstanceDRE.get(TERM);
	if ("dri".equals(key)) return WordnetNounIndexNameInstanceDRI.get(TERM);
	if ("drm".equals(key)) return WordnetNounIndexNameInstanceDRM.get(TERM);
	if ("dro".equals(key)) return WordnetNounIndexNameInstanceDRO.get(TERM);
	if ("dru".equals(key)) return WordnetNounIndexNameInstanceDRU.get(TERM);
	if ("dry".equals(key)) return WordnetNounIndexNameInstanceDRY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDRA.terms());
	set.addAll(WordnetNounIndexNameInstanceDRE.terms());
	set.addAll(WordnetNounIndexNameInstanceDRI.terms());
	set.addAll(WordnetNounIndexNameInstanceDRM.terms());
	set.addAll(WordnetNounIndexNameInstanceDRO.terms());
	set.addAll(WordnetNounIndexNameInstanceDRU.terms());
	set.addAll(WordnetNounIndexNameInstanceDRY.terms());
  		return set; 	} }