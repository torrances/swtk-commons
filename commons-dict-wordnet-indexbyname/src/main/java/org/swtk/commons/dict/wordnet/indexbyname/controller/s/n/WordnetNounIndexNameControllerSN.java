package org.swtk.commons.dict.wordnet.indexbyname.controller.s.n;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.n.a.WordnetNounIndexNameInstanceSNA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.n.e.WordnetNounIndexNameInstanceSNE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.n.i.WordnetNounIndexNameInstanceSNI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.n.o.WordnetNounIndexNameInstanceSNO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.n.u.WordnetNounIndexNameInstanceSNU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("sna".equals(key)) return WordnetNounIndexNameInstanceSNA.get(TERM);
	if ("sne".equals(key)) return WordnetNounIndexNameInstanceSNE.get(TERM);
	if ("sni".equals(key)) return WordnetNounIndexNameInstanceSNI.get(TERM);
	if ("sno".equals(key)) return WordnetNounIndexNameInstanceSNO.get(TERM);
	if ("snu".equals(key)) return WordnetNounIndexNameInstanceSNU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSNA.terms());
	set.addAll(WordnetNounIndexNameInstanceSNE.terms());
	set.addAll(WordnetNounIndexNameInstanceSNI.terms());
	set.addAll(WordnetNounIndexNameInstanceSNO.terms());
	set.addAll(WordnetNounIndexNameInstanceSNU.terms());
  		return set; 	} }