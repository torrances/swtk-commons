package org.swtk.commons.dict.wordnet.index.name.controller.i.x;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.x.i.a.WordnetNounIndexNameInstanceIXIA;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.x.o.b.WordnetNounIndexNameInstanceIXOB;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.x.o.d.WordnetNounIndexNameInstanceIXOD;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIX {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ixia".equals(key)) return WordnetNounIndexNameInstanceIXIA.get(TERM);
	if ("ixob".equals(key)) return WordnetNounIndexNameInstanceIXOB.get(TERM);
	if ("ixod".equals(key)) return WordnetNounIndexNameInstanceIXOD.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIXIA.terms());
	set.addAll(WordnetNounIndexNameInstanceIXOB.terms());
	set.addAll(WordnetNounIndexNameInstanceIXOD.terms());
  		return set; 	} }