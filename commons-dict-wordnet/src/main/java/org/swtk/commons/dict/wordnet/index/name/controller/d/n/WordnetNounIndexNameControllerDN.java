package org.swtk.commons.dict.wordnet.index.name.controller.d.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.d.n.e.p.WordnetNounIndexNameInstanceDNEP;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.n.i.e.WordnetNounIndexNameInstanceDNIE;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.n.i.p.WordnetNounIndexNameInstanceDNIP;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("dnep".equals(key)) return WordnetNounIndexNameInstanceDNEP.get(TERM);
	if ("dnie".equals(key)) return WordnetNounIndexNameInstanceDNIE.get(TERM);
	if ("dnip".equals(key)) return WordnetNounIndexNameInstanceDNIP.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDNEP.terms());
	set.addAll(WordnetNounIndexNameInstanceDNIE.terms());
	set.addAll(WordnetNounIndexNameInstanceDNIP.terms());
  		return set; 	} }