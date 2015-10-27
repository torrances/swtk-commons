package org.swtk.commons.dict.wordnet.index.name.controller.n.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.g.a.n.WordnetNounIndexNameInstanceNGAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.g.u.l.WordnetNounIndexNameInstanceNGUL;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.g.u.n.WordnetNounIndexNameInstanceNGUN;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.g.w.e.WordnetNounIndexNameInstanceNGWE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ngan".equals(key)) return WordnetNounIndexNameInstanceNGAN.get(TERM);
	if ("ngul".equals(key)) return WordnetNounIndexNameInstanceNGUL.get(TERM);
	if ("ngun".equals(key)) return WordnetNounIndexNameInstanceNGUN.get(TERM);
	if ("ngwe".equals(key)) return WordnetNounIndexNameInstanceNGWE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNGAN.terms());
	set.addAll(WordnetNounIndexNameInstanceNGUL.terms());
	set.addAll(WordnetNounIndexNameInstanceNGUN.terms());
	set.addAll(WordnetNounIndexNameInstanceNGWE.terms());
  		return set; 	} }