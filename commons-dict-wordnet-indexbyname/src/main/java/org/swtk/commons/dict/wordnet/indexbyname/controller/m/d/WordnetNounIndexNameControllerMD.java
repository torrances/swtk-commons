package org.swtk.commons.dict.wordnet.indexbyname.controller.m.d;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.d.i.WordnetNounIndexNameInstanceMDI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.d.m.WordnetNounIndexNameInstanceMDM;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMD {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mdi".equals(key)) return WordnetNounIndexNameInstanceMDI.get(TERM);
	if ("mdm".equals(key)) return WordnetNounIndexNameInstanceMDM.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMDI.terms());
	set.addAll(WordnetNounIndexNameInstanceMDM.terms());
  		return set; 	} }