package org.swtk.commons.dict.wordnet.indexbyname.controller.x.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.y.l.WordnetNounIndexNameInstanceXYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.y.p.WordnetNounIndexNameInstanceXYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.y.r.WordnetNounIndexNameInstanceXYR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xyl".equals(key)) return WordnetNounIndexNameInstanceXYL.get(TERM);
	if ("xyp".equals(key)) return WordnetNounIndexNameInstanceXYP.get(TERM);
	if ("xyr".equals(key)) return WordnetNounIndexNameInstanceXYR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXYL.terms());
	set.addAll(WordnetNounIndexNameInstanceXYP.terms());
	set.addAll(WordnetNounIndexNameInstanceXYR.terms());
  		return set; 	} }