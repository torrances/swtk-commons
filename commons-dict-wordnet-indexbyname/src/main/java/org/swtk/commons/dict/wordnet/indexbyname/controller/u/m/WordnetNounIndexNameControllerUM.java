package org.swtk.commons.dict.wordnet.indexbyname.controller.u.m;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.m.a.WordnetNounIndexNameInstanceUMA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.m.b.WordnetNounIndexNameInstanceUMB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.m.l.WordnetNounIndexNameInstanceUML;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.m.m.WordnetNounIndexNameInstanceUMM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.m.p.WordnetNounIndexNameInstanceUMP;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUM {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("uma".equals(key)) return WordnetNounIndexNameInstanceUMA.get(TERM);
	if ("umb".equals(key)) return WordnetNounIndexNameInstanceUMB.get(TERM);
	if ("uml".equals(key)) return WordnetNounIndexNameInstanceUML.get(TERM);
	if ("umm".equals(key)) return WordnetNounIndexNameInstanceUMM.get(TERM);
	if ("ump".equals(key)) return WordnetNounIndexNameInstanceUMP.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUMA.terms());
	set.addAll(WordnetNounIndexNameInstanceUMB.terms());
	set.addAll(WordnetNounIndexNameInstanceUML.terms());
	set.addAll(WordnetNounIndexNameInstanceUMM.terms());
	set.addAll(WordnetNounIndexNameInstanceUMP.terms());
  		return set; 	} }