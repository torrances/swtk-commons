package org.swtk.commons.dict.wordnet.indexbyname.controller.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.w.a.WordnetNounIndexNameInstanceAWA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.w.f.WordnetNounIndexNameInstanceAWF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.w.k.WordnetNounIndexNameInstanceAWK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.w.l.WordnetNounIndexNameInstanceAWL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.w.n.WordnetNounIndexNameInstanceAWN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.w.o.WordnetNounIndexNameInstanceAWO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("awa".equals(key)) return WordnetNounIndexNameInstanceAWA.get(TERM);
	if ("awf".equals(key)) return WordnetNounIndexNameInstanceAWF.get(TERM);
	if ("awk".equals(key)) return WordnetNounIndexNameInstanceAWK.get(TERM);
	if ("awl".equals(key)) return WordnetNounIndexNameInstanceAWL.get(TERM);
	if ("awn".equals(key)) return WordnetNounIndexNameInstanceAWN.get(TERM);
	if ("awo".equals(key)) return WordnetNounIndexNameInstanceAWO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAWA.terms());
	set.addAll(WordnetNounIndexNameInstanceAWF.terms());
	set.addAll(WordnetNounIndexNameInstanceAWK.terms());
	set.addAll(WordnetNounIndexNameInstanceAWL.terms());
	set.addAll(WordnetNounIndexNameInstanceAWN.terms());
	set.addAll(WordnetNounIndexNameInstanceAWO.terms());
  		return set; 	} }