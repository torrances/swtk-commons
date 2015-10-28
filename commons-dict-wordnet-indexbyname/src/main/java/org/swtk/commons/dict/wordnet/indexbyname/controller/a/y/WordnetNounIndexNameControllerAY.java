package org.swtk.commons.dict.wordnet.indexbyname.controller.a.y;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.y.a.WordnetNounIndexNameInstanceAYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.y.i.WordnetNounIndexNameInstanceAYI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.y.r.WordnetNounIndexNameInstanceAYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.y.t.WordnetNounIndexNameInstanceAYT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.y.u.WordnetNounIndexNameInstanceAYU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("aya".equals(key)) return WordnetNounIndexNameInstanceAYA.get(TERM);
	if ("ayi".equals(key)) return WordnetNounIndexNameInstanceAYI.get(TERM);
	if ("ayr".equals(key)) return WordnetNounIndexNameInstanceAYR.get(TERM);
	if ("ayt".equals(key)) return WordnetNounIndexNameInstanceAYT.get(TERM);
	if ("ayu".equals(key)) return WordnetNounIndexNameInstanceAYU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAYA.terms());
	set.addAll(WordnetNounIndexNameInstanceAYI.terms());
	set.addAll(WordnetNounIndexNameInstanceAYR.terms());
	set.addAll(WordnetNounIndexNameInstanceAYT.terms());
	set.addAll(WordnetNounIndexNameInstanceAYU.terms());
  		return set; 	} }