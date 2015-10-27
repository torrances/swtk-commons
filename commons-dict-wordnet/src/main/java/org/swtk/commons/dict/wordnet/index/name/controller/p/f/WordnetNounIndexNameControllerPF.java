package org.swtk.commons.dict.wordnet.index.name.controller.p.f;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.p.f.a.l.WordnetNounIndexNameInstancePFAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.f.a.n.WordnetNounIndexNameInstancePFAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.f.e.n.WordnetNounIndexNameInstancePFEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.f.l.p.WordnetNounIndexNameInstancePFLP;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPF {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("pfal".equals(key)) return WordnetNounIndexNameInstancePFAL.get(TERM);
	if ("pfan".equals(key)) return WordnetNounIndexNameInstancePFAN.get(TERM);
	if ("pfen".equals(key)) return WordnetNounIndexNameInstancePFEN.get(TERM);
	if ("pflp".equals(key)) return WordnetNounIndexNameInstancePFLP.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePFAL.terms());
	set.addAll(WordnetNounIndexNameInstancePFAN.terms());
	set.addAll(WordnetNounIndexNameInstancePFEN.terms());
	set.addAll(WordnetNounIndexNameInstancePFLP.terms());
  		return set; 	} }