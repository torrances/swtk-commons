package org.swtk.commons.dict.wordnet.indexbyname.controller.c.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.r.a.WordnetNounIndexNameInstanceCRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.r.e.WordnetNounIndexNameInstanceCRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.r.i.WordnetNounIndexNameInstanceCRI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.r.o.WordnetNounIndexNameInstanceCRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.r.u.WordnetNounIndexNameInstanceCRU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.r.y.WordnetNounIndexNameInstanceCRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("cra".equals(key)) return WordnetNounIndexNameInstanceCRA.get(TERM);
	if ("cre".equals(key)) return WordnetNounIndexNameInstanceCRE.get(TERM);
	if ("cri".equals(key)) return WordnetNounIndexNameInstanceCRI.get(TERM);
	if ("cro".equals(key)) return WordnetNounIndexNameInstanceCRO.get(TERM);
	if ("cru".equals(key)) return WordnetNounIndexNameInstanceCRU.get(TERM);
	if ("cry".equals(key)) return WordnetNounIndexNameInstanceCRY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCRA.terms());
	set.addAll(WordnetNounIndexNameInstanceCRE.terms());
	set.addAll(WordnetNounIndexNameInstanceCRI.terms());
	set.addAll(WordnetNounIndexNameInstanceCRO.terms());
	set.addAll(WordnetNounIndexNameInstanceCRU.terms());
	set.addAll(WordnetNounIndexNameInstanceCRY.terms());
  		return set; 	} }