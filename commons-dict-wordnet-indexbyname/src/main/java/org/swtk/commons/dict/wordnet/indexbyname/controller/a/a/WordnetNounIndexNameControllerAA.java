package org.swtk.commons.dict.wordnet.indexbyname.controller.a.a;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.a.c.WordnetNounIndexNameInstanceAAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.a.l.WordnetNounIndexNameInstanceAAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.a.r.WordnetNounIndexNameInstanceAAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.a.v.WordnetNounIndexNameInstanceAAV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("aac".equals(key)) return WordnetNounIndexNameInstanceAAC.get(TERM);
	if ("aal".equals(key)) return WordnetNounIndexNameInstanceAAL.get(TERM);
	if ("aar".equals(key)) return WordnetNounIndexNameInstanceAAR.get(TERM);
	if ("aav".equals(key)) return WordnetNounIndexNameInstanceAAV.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAAC.terms());
	set.addAll(WordnetNounIndexNameInstanceAAL.terms());
	set.addAll(WordnetNounIndexNameInstanceAAR.terms());
	set.addAll(WordnetNounIndexNameInstanceAAV.terms());
  		return set; 	} }