package org.swtk.commons.dict.wordnet.index.name.controller.u.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.u.g.a.n.WordnetNounIndexNameInstanceUGAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.g.a.r.WordnetNounIndexNameInstanceUGAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.g.l.i.WordnetNounIndexNameInstanceUGLI;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.g.r.i.WordnetNounIndexNameInstanceUGRI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ugan".equals(key)) return WordnetNounIndexNameInstanceUGAN.get(TERM);
	if ("ugar".equals(key)) return WordnetNounIndexNameInstanceUGAR.get(TERM);
	if ("ugli".equals(key)) return WordnetNounIndexNameInstanceUGLI.get(TERM);
	if ("ugri".equals(key)) return WordnetNounIndexNameInstanceUGRI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUGAN.terms());
	set.addAll(WordnetNounIndexNameInstanceUGAR.terms());
	set.addAll(WordnetNounIndexNameInstanceUGLI.terms());
	set.addAll(WordnetNounIndexNameInstanceUGRI.terms());
  		return set; 	} }