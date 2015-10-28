package org.swtk.commons.dict.wordnet.indexbyname.controller.o.t;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.t.a.WordnetNounIndexNameInstanceOTA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.t.h.WordnetNounIndexNameInstanceOTH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.t.i.WordnetNounIndexNameInstanceOTI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.t.o.WordnetNounIndexNameInstanceOTO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.t.t.WordnetNounIndexNameInstanceOTT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.t.u.WordnetNounIndexNameInstanceOTU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ota".equals(key)) return WordnetNounIndexNameInstanceOTA.get(TERM);
	if ("oth".equals(key)) return WordnetNounIndexNameInstanceOTH.get(TERM);
	if ("oti".equals(key)) return WordnetNounIndexNameInstanceOTI.get(TERM);
	if ("oto".equals(key)) return WordnetNounIndexNameInstanceOTO.get(TERM);
	if ("ott".equals(key)) return WordnetNounIndexNameInstanceOTT.get(TERM);
	if ("otu".equals(key)) return WordnetNounIndexNameInstanceOTU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOTA.terms());
	set.addAll(WordnetNounIndexNameInstanceOTH.terms());
	set.addAll(WordnetNounIndexNameInstanceOTI.terms());
	set.addAll(WordnetNounIndexNameInstanceOTO.terms());
	set.addAll(WordnetNounIndexNameInstanceOTT.terms());
	set.addAll(WordnetNounIndexNameInstanceOTU.terms());
  		return set; 	} }