package org.swtk.commons.dict.wordnet.indexbyname.controller.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.b.a.WordnetNounIndexNameInstanceMBA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.b.e.WordnetNounIndexNameInstanceMBE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.b.i.WordnetNounIndexNameInstanceMBI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.b.u.WordnetNounIndexNameInstanceMBU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("mba".equals(key)) return WordnetNounIndexNameInstanceMBA.get(TERM);
	if ("mbe".equals(key)) return WordnetNounIndexNameInstanceMBE.get(TERM);
	if ("mbi".equals(key)) return WordnetNounIndexNameInstanceMBI.get(TERM);
	if ("mbu".equals(key)) return WordnetNounIndexNameInstanceMBU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMBA.terms());
	set.addAll(WordnetNounIndexNameInstanceMBE.terms());
	set.addAll(WordnetNounIndexNameInstanceMBI.terms());
	set.addAll(WordnetNounIndexNameInstanceMBU.terms());
  		return set; 	} }