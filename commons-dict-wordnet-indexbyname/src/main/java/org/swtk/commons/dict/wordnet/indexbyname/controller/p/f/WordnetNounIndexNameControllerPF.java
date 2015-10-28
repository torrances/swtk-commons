package org.swtk.commons.dict.wordnet.indexbyname.controller.p.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.f.a.WordnetNounIndexNameInstancePFA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.f.e.WordnetNounIndexNameInstancePFE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.f.l.WordnetNounIndexNameInstancePFL;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPF {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("pfa".equals(key)) return WordnetNounIndexNameInstancePFA.get(TERM);
	if ("pfe".equals(key)) return WordnetNounIndexNameInstancePFE.get(TERM);
	if ("pfl".equals(key)) return WordnetNounIndexNameInstancePFL.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePFA.terms());
	set.addAll(WordnetNounIndexNameInstancePFE.terms());
	set.addAll(WordnetNounIndexNameInstancePFL.terms());
  		return set; 	} }