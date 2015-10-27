package org.swtk.commons.dict.wordnet.index.name.controller.i.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.z.a.n.WordnetNounIndexNameInstanceIZAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.z.a.r.WordnetNounIndexNameInstanceIZAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.z.m.i.WordnetNounIndexNameInstanceIZMI;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.z.z.a.WordnetNounIndexNameInstanceIZZA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("izan".equals(key)) return WordnetNounIndexNameInstanceIZAN.get(TERM);
	if ("izar".equals(key)) return WordnetNounIndexNameInstanceIZAR.get(TERM);
	if ("izmi".equals(key)) return WordnetNounIndexNameInstanceIZMI.get(TERM);
	if ("izza".equals(key)) return WordnetNounIndexNameInstanceIZZA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIZAN.terms());
	set.addAll(WordnetNounIndexNameInstanceIZAR.terms());
	set.addAll(WordnetNounIndexNameInstanceIZMI.terms());
	set.addAll(WordnetNounIndexNameInstanceIZZA.terms());
  		return set; 	} }