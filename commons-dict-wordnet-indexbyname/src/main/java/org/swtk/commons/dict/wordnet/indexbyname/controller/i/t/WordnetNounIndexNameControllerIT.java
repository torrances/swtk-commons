package org.swtk.commons.dict.wordnet.indexbyname.controller.i.t;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.t.a.WordnetNounIndexNameInstanceITA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.t.c.WordnetNounIndexNameInstanceITC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.t.e.WordnetNounIndexNameInstanceITE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.t.h.WordnetNounIndexNameInstanceITH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.t.i.WordnetNounIndexNameInstanceITI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.t.r.WordnetNounIndexNameInstanceITR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ita".equals(key)) return WordnetNounIndexNameInstanceITA.get(TERM);
	if ("itc".equals(key)) return WordnetNounIndexNameInstanceITC.get(TERM);
	if ("ite".equals(key)) return WordnetNounIndexNameInstanceITE.get(TERM);
	if ("ith".equals(key)) return WordnetNounIndexNameInstanceITH.get(TERM);
	if ("iti".equals(key)) return WordnetNounIndexNameInstanceITI.get(TERM);
	if ("itr".equals(key)) return WordnetNounIndexNameInstanceITR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceITA.terms());
	set.addAll(WordnetNounIndexNameInstanceITC.terms());
	set.addAll(WordnetNounIndexNameInstanceITE.terms());
	set.addAll(WordnetNounIndexNameInstanceITH.terms());
	set.addAll(WordnetNounIndexNameInstanceITI.terms());
	set.addAll(WordnetNounIndexNameInstanceITR.terms());
  		return set; 	} }