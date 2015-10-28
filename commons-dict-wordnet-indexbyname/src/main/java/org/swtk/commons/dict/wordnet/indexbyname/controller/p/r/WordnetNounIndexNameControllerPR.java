package org.swtk.commons.dict.wordnet.indexbyname.controller.p.r;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.r.a.WordnetNounIndexNameInstancePRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.r.e.WordnetNounIndexNameInstancePRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.r.i.WordnetNounIndexNameInstancePRI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.r.o.WordnetNounIndexNameInstancePRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.r.u.WordnetNounIndexNameInstancePRU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.r.y.WordnetNounIndexNameInstancePRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("pra".equals(key)) return WordnetNounIndexNameInstancePRA.get(TERM);
	if ("pre".equals(key)) return WordnetNounIndexNameInstancePRE.get(TERM);
	if ("pri".equals(key)) return WordnetNounIndexNameInstancePRI.get(TERM);
	if ("pro".equals(key)) return WordnetNounIndexNameInstancePRO.get(TERM);
	if ("pru".equals(key)) return WordnetNounIndexNameInstancePRU.get(TERM);
	if ("pry".equals(key)) return WordnetNounIndexNameInstancePRY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePRA.terms());
	set.addAll(WordnetNounIndexNameInstancePRE.terms());
	set.addAll(WordnetNounIndexNameInstancePRI.terms());
	set.addAll(WordnetNounIndexNameInstancePRO.terms());
	set.addAll(WordnetNounIndexNameInstancePRU.terms());
	set.addAll(WordnetNounIndexNameInstancePRY.terms());
  		return set; 	} }