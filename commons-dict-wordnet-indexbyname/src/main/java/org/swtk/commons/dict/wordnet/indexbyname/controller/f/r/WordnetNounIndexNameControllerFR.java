package org.swtk.commons.dict.wordnet.indexbyname.controller.f.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.r.a.WordnetNounIndexNameInstanceFRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.r.e.WordnetNounIndexNameInstanceFRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.r.i.WordnetNounIndexNameInstanceFRI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.r.o.WordnetNounIndexNameInstanceFRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.r.u.WordnetNounIndexNameInstanceFRU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.r.y.WordnetNounIndexNameInstanceFRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerFR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("fra".equals(key)) return WordnetNounIndexNameInstanceFRA.get(TERM);
	if ("fre".equals(key)) return WordnetNounIndexNameInstanceFRE.get(TERM);
	if ("fri".equals(key)) return WordnetNounIndexNameInstanceFRI.get(TERM);
	if ("fro".equals(key)) return WordnetNounIndexNameInstanceFRO.get(TERM);
	if ("fru".equals(key)) return WordnetNounIndexNameInstanceFRU.get(TERM);
	if ("fry".equals(key)) return WordnetNounIndexNameInstanceFRY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceFRA.terms());
	set.addAll(WordnetNounIndexNameInstanceFRE.terms());
	set.addAll(WordnetNounIndexNameInstanceFRI.terms());
	set.addAll(WordnetNounIndexNameInstanceFRO.terms());
	set.addAll(WordnetNounIndexNameInstanceFRU.terms());
	set.addAll(WordnetNounIndexNameInstanceFRY.terms());
  		return set; 	} }