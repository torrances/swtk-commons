package org.swtk.commons.dict.wordnet.indexbyname.controller.z.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.y.d.WordnetNounIndexNameInstanceZYD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.y.g.WordnetNounIndexNameInstanceZYG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.y.l.WordnetNounIndexNameInstanceZYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.y.m.WordnetNounIndexNameInstanceZYM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.y.r.WordnetNounIndexNameInstanceZYR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerZY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("zyd".equals(key)) return WordnetNounIndexNameInstanceZYD.get(TERM);
	if ("zyg".equals(key)) return WordnetNounIndexNameInstanceZYG.get(TERM);
	if ("zyl".equals(key)) return WordnetNounIndexNameInstanceZYL.get(TERM);
	if ("zym".equals(key)) return WordnetNounIndexNameInstanceZYM.get(TERM);
	if ("zyr".equals(key)) return WordnetNounIndexNameInstanceZYR.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceZYD.terms());
	set.addAll(WordnetNounIndexNameInstanceZYG.terms());
	set.addAll(WordnetNounIndexNameInstanceZYL.terms());
	set.addAll(WordnetNounIndexNameInstanceZYM.terms());
	set.addAll(WordnetNounIndexNameInstanceZYR.terms());
  		return set; 	} }