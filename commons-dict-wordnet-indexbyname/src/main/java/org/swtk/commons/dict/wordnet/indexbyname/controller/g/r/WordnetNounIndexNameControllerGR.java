package org.swtk.commons.dict.wordnet.indexbyname.controller.g.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.r.a.WordnetNounIndexNameInstanceGRA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.r.e.WordnetNounIndexNameInstanceGRE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.r.i.WordnetNounIndexNameInstanceGRI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.r.o.WordnetNounIndexNameInstanceGRO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.r.u.WordnetNounIndexNameInstanceGRU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.g.r.y.WordnetNounIndexNameInstanceGRY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("gra".equals(key)) return WordnetNounIndexNameInstanceGRA.get(TERM);
	if ("gre".equals(key)) return WordnetNounIndexNameInstanceGRE.get(TERM);
	if ("gri".equals(key)) return WordnetNounIndexNameInstanceGRI.get(TERM);
	if ("gro".equals(key)) return WordnetNounIndexNameInstanceGRO.get(TERM);
	if ("gru".equals(key)) return WordnetNounIndexNameInstanceGRU.get(TERM);
	if ("gry".equals(key)) return WordnetNounIndexNameInstanceGRY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGRA.terms());
	set.addAll(WordnetNounIndexNameInstanceGRE.terms());
	set.addAll(WordnetNounIndexNameInstanceGRI.terms());
	set.addAll(WordnetNounIndexNameInstanceGRO.terms());
	set.addAll(WordnetNounIndexNameInstanceGRU.terms());
	set.addAll(WordnetNounIndexNameInstanceGRY.terms());
  		return set; 	} }