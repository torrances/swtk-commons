package org.swtk.commons.dict.wordnet.index.name.controller.n.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.r.e.m.WordnetNounIndexNameInstanceNREM;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.r.n.a.WordnetNounIndexNameInstanceNRNA;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.r.t.i.WordnetNounIndexNameInstanceNRTI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("nrem".equals(key)) return WordnetNounIndexNameInstanceNREM.get(TERM);
	if ("nrna".equals(key)) return WordnetNounIndexNameInstanceNRNA.get(TERM);
	if ("nrti".equals(key)) return WordnetNounIndexNameInstanceNRTI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNREM.terms());
	set.addAll(WordnetNounIndexNameInstanceNRNA.terms());
	set.addAll(WordnetNounIndexNameInstanceNRTI.terms());
  		return set; 	} }