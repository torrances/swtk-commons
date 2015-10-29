package org.swtk.commons.dict.wordnet.indexbyname.controller.d.m;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.m.u.WordnetNounIndexNameInstanceDMU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDM {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("dmu".equals(key)) return WordnetNounIndexNameInstanceDMU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDMU.terms());
  		return set; 	} }