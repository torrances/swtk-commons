package org.swtk.commons.dict.wordnet.index.name.controller.u.b;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.u.b.e.r.WordnetNounIndexNameInstanceUBER;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.b.i.e.WordnetNounIndexNameInstanceUBIE;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.b.i.q.WordnetNounIndexNameInstanceUBIQ;
	import org.swtk.commons.dict.wordnet.index.name.instance.u.b.y.k.WordnetNounIndexNameInstanceUBYK;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("uber".equals(key)) return WordnetNounIndexNameInstanceUBER.get(TERM);
	if ("ubie".equals(key)) return WordnetNounIndexNameInstanceUBIE.get(TERM);
	if ("ubiq".equals(key)) return WordnetNounIndexNameInstanceUBIQ.get(TERM);
	if ("ubyk".equals(key)) return WordnetNounIndexNameInstanceUBYK.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUBER.terms());
	set.addAll(WordnetNounIndexNameInstanceUBIE.terms());
	set.addAll(WordnetNounIndexNameInstanceUBIQ.terms());
	set.addAll(WordnetNounIndexNameInstanceUBYK.terms());
  		return set; 	} }