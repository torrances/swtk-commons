package org.swtk.commons.dict.wordnet.indexbyname.controller.q.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.u.a.WordnetNounIndexNameInstanceQUA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.u.e.WordnetNounIndexNameInstanceQUE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.u.i.WordnetNounIndexNameInstanceQUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.u.o.WordnetNounIndexNameInstanceQUO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.u.r.WordnetNounIndexNameInstanceQUR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerQU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("qua".equals(key)) return WordnetNounIndexNameInstanceQUA.get(TERM);
	if ("que".equals(key)) return WordnetNounIndexNameInstanceQUE.get(TERM);
	if ("qui".equals(key)) return WordnetNounIndexNameInstanceQUI.get(TERM);
	if ("quo".equals(key)) return WordnetNounIndexNameInstanceQUO.get(TERM);
	if ("qur".equals(key)) return WordnetNounIndexNameInstanceQUR.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceQUA.terms());
	set.addAll(WordnetNounIndexNameInstanceQUE.terms());
	set.addAll(WordnetNounIndexNameInstanceQUI.terms());
	set.addAll(WordnetNounIndexNameInstanceQUO.terms());
	set.addAll(WordnetNounIndexNameInstanceQUR.terms());
  		return set; 	} }