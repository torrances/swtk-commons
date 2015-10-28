package org.swtk.commons.dict.wordnet.indexbyname.controller.k.r;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.r.a.WordnetNounIndexNameInstanceKRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.r.e.WordnetNounIndexNameInstanceKRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.r.i.WordnetNounIndexNameInstanceKRI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.r.o.WordnetNounIndexNameInstanceKRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.r.u.WordnetNounIndexNameInstanceKRU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.r.y.WordnetNounIndexNameInstanceKRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("kra".equals(key)) return WordnetNounIndexNameInstanceKRA.get(TERM);
	if ("kre".equals(key)) return WordnetNounIndexNameInstanceKRE.get(TERM);
	if ("kri".equals(key)) return WordnetNounIndexNameInstanceKRI.get(TERM);
	if ("kro".equals(key)) return WordnetNounIndexNameInstanceKRO.get(TERM);
	if ("kru".equals(key)) return WordnetNounIndexNameInstanceKRU.get(TERM);
	if ("kry".equals(key)) return WordnetNounIndexNameInstanceKRY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKRA.terms());
	set.addAll(WordnetNounIndexNameInstanceKRE.terms());
	set.addAll(WordnetNounIndexNameInstanceKRI.terms());
	set.addAll(WordnetNounIndexNameInstanceKRO.terms());
	set.addAll(WordnetNounIndexNameInstanceKRU.terms());
	set.addAll(WordnetNounIndexNameInstanceKRY.terms());
  		return set; 	} }