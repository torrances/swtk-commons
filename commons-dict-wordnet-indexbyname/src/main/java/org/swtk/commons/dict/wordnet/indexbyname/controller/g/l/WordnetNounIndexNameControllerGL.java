package org.swtk.commons.dict.wordnet.indexbyname.controller.g.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.a.WordnetNounIndexNameInstanceGLA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.e.WordnetNounIndexNameInstanceGLE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.i.WordnetNounIndexNameInstanceGLI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.o.WordnetNounIndexNameInstanceGLO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.u.WordnetNounIndexNameInstanceGLU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.y.WordnetNounIndexNameInstanceGLY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("gla".equals(key)) return WordnetNounIndexNameInstanceGLA.get(TERM);
	if ("gle".equals(key)) return WordnetNounIndexNameInstanceGLE.get(TERM);
	if ("gli".equals(key)) return WordnetNounIndexNameInstanceGLI.get(TERM);
	if ("glo".equals(key)) return WordnetNounIndexNameInstanceGLO.get(TERM);
	if ("glu".equals(key)) return WordnetNounIndexNameInstanceGLU.get(TERM);
	if ("gly".equals(key)) return WordnetNounIndexNameInstanceGLY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGLA.terms());
	set.addAll(WordnetNounIndexNameInstanceGLE.terms());
	set.addAll(WordnetNounIndexNameInstanceGLI.terms());
	set.addAll(WordnetNounIndexNameInstanceGLO.terms());
	set.addAll(WordnetNounIndexNameInstanceGLU.terms());
	set.addAll(WordnetNounIndexNameInstanceGLY.terms());
  		return set; 	} }