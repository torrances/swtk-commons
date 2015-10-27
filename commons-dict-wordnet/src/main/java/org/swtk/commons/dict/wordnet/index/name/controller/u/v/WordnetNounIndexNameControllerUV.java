package org.swtk.commons.dict.wordnet.index.name.controller.u.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.u.v.e.a.WordnetNounIndexNameInstanceUVEA;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.v.e.i.WordnetNounIndexNameInstanceUVEI;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.v.u.l.WordnetNounIndexNameInstanceUVUL;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("uvea".equals(key)) return WordnetNounIndexNameInstanceUVEA.get(TERM);
	if ("uvei".equals(key)) return WordnetNounIndexNameInstanceUVEI.get(TERM);
	if ("uvul".equals(key)) return WordnetNounIndexNameInstanceUVUL.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUVEA.terms());
	set.addAll(WordnetNounIndexNameInstanceUVEI.terms());
	set.addAll(WordnetNounIndexNameInstanceUVUL.terms());
  		return set; 	} }