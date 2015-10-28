package org.swtk.commons.dict.wordnet.indexbyname.controller.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.d.d.WordnetNounIndexNameInstanceUDD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.d.m.WordnetNounIndexNameInstanceUDM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.d.o.WordnetNounIndexNameInstanceUDO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUD {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("udd".equals(key)) return WordnetNounIndexNameInstanceUDD.get(TERM);
	if ("udm".equals(key)) return WordnetNounIndexNameInstanceUDM.get(TERM);
	if ("udo".equals(key)) return WordnetNounIndexNameInstanceUDO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUDD.terms());
	set.addAll(WordnetNounIndexNameInstanceUDM.terms());
	set.addAll(WordnetNounIndexNameInstanceUDO.terms());
  		return set; 	} }