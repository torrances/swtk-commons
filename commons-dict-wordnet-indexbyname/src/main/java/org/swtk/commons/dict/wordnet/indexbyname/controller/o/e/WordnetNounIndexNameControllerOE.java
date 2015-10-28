package org.swtk.commons.dict.wordnet.indexbyname.controller.o.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.c.WordnetNounIndexNameInstanceOEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.d.WordnetNounIndexNameInstanceOED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.n.WordnetNounIndexNameInstanceOEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.r.WordnetNounIndexNameInstanceOER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.s.WordnetNounIndexNameInstanceOES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.u.WordnetNounIndexNameInstanceOEU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("oec".equals(key)) return WordnetNounIndexNameInstanceOEC.get(TERM);
	if ("oed".equals(key)) return WordnetNounIndexNameInstanceOED.get(TERM);
	if ("oen".equals(key)) return WordnetNounIndexNameInstanceOEN.get(TERM);
	if ("oer".equals(key)) return WordnetNounIndexNameInstanceOER.get(TERM);
	if ("oes".equals(key)) return WordnetNounIndexNameInstanceOES.get(TERM);
	if ("oeu".equals(key)) return WordnetNounIndexNameInstanceOEU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOEC.terms());
	set.addAll(WordnetNounIndexNameInstanceOED.terms());
	set.addAll(WordnetNounIndexNameInstanceOEN.terms());
	set.addAll(WordnetNounIndexNameInstanceOER.terms());
	set.addAll(WordnetNounIndexNameInstanceOES.terms());
	set.addAll(WordnetNounIndexNameInstanceOEU.terms());
  		return set; 	} }