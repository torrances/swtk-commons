package org.swtk.commons.dict.wordnet.index.name.controller.u.d;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.u.d.d.e.WordnetNounIndexNameInstanceUDDE;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.d.m.u.WordnetNounIndexNameInstanceUDMU;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.d.o.m.WordnetNounIndexNameInstanceUDOM;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUD {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("udde".equals(key)) return WordnetNounIndexNameInstanceUDDE.get(TERM);
	if ("udmu".equals(key)) return WordnetNounIndexNameInstanceUDMU.get(TERM);
	if ("udom".equals(key)) return WordnetNounIndexNameInstanceUDOM.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUDDE.terms());
	set.addAll(WordnetNounIndexNameInstanceUDMU.terms());
	set.addAll(WordnetNounIndexNameInstanceUDOM.terms());
  		return set; 	} }