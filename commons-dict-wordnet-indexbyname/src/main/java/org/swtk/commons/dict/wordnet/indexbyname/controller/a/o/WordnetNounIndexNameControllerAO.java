package org.swtk.commons.dict.wordnet.indexbyname.controller.a.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.o.r.WordnetNounIndexNameInstanceAOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.o.t.WordnetNounIndexNameInstanceAOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.o.u.WordnetNounIndexNameInstanceAOU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("aor".equals(key)) return WordnetNounIndexNameInstanceAOR.get(TERM);
	if ("aot".equals(key)) return WordnetNounIndexNameInstanceAOT.get(TERM);
	if ("aou".equals(key)) return WordnetNounIndexNameInstanceAOU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAOR.terms());
	set.addAll(WordnetNounIndexNameInstanceAOT.terms());
	set.addAll(WordnetNounIndexNameInstanceAOU.terms());
  		return set; 	} }