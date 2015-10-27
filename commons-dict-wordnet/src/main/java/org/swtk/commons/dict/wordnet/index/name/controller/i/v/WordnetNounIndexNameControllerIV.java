package org.swtk.commons.dict.wordnet.index.name.controller.i.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.v.a.n.WordnetNounIndexNameInstanceIVAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.v.e.s.WordnetNounIndexNameInstanceIVES;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.v.o.r.WordnetNounIndexNameInstanceIVOR;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.v.r.y.WordnetNounIndexNameInstanceIVRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ivan".equals(key)) return WordnetNounIndexNameInstanceIVAN.get(TERM);
	if ("ives".equals(key)) return WordnetNounIndexNameInstanceIVES.get(TERM);
	if ("ivor".equals(key)) return WordnetNounIndexNameInstanceIVOR.get(TERM);
	if ("ivry".equals(key)) return WordnetNounIndexNameInstanceIVRY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIVAN.terms());
	set.addAll(WordnetNounIndexNameInstanceIVES.terms());
	set.addAll(WordnetNounIndexNameInstanceIVOR.terms());
	set.addAll(WordnetNounIndexNameInstanceIVRY.terms());
  		return set; 	} }