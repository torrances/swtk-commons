package org.swtk.commons.dict.wordnet.index.name.controller.d.j;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.d.j.a.k.WordnetNounIndexNameInstanceDJAK;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.j.a.n.WordnetNounIndexNameInstanceDJAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.j.i.b.WordnetNounIndexNameInstanceDJIB;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.j.i.n.WordnetNounIndexNameInstanceDJIN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDJ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("djak".equals(key)) return WordnetNounIndexNameInstanceDJAK.get(TERM);
	if ("djan".equals(key)) return WordnetNounIndexNameInstanceDJAN.get(TERM);
	if ("djib".equals(key)) return WordnetNounIndexNameInstanceDJIB.get(TERM);
	if ("djin".equals(key)) return WordnetNounIndexNameInstanceDJIN.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDJAK.terms());
	set.addAll(WordnetNounIndexNameInstanceDJAN.terms());
	set.addAll(WordnetNounIndexNameInstanceDJIB.terms());
	set.addAll(WordnetNounIndexNameInstanceDJIN.terms());
  		return set; 	} }