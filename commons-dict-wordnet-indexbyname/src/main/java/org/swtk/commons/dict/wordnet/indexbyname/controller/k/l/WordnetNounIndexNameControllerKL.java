package org.swtk.commons.dict.wordnet.indexbyname.controller.k.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.l.a.WordnetNounIndexNameInstanceKLA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.l.e.WordnetNounIndexNameInstanceKLE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.l.i.WordnetNounIndexNameInstanceKLI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.l.o.WordnetNounIndexNameInstanceKLO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.l.u.WordnetNounIndexNameInstanceKLU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.l.y.WordnetNounIndexNameInstanceKLY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("kla".equals(key)) return WordnetNounIndexNameInstanceKLA.get(TERM);
	if ("kle".equals(key)) return WordnetNounIndexNameInstanceKLE.get(TERM);
	if ("kli".equals(key)) return WordnetNounIndexNameInstanceKLI.get(TERM);
	if ("klo".equals(key)) return WordnetNounIndexNameInstanceKLO.get(TERM);
	if ("klu".equals(key)) return WordnetNounIndexNameInstanceKLU.get(TERM);
	if ("kly".equals(key)) return WordnetNounIndexNameInstanceKLY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKLA.terms());
	set.addAll(WordnetNounIndexNameInstanceKLE.terms());
	set.addAll(WordnetNounIndexNameInstanceKLI.terms());
	set.addAll(WordnetNounIndexNameInstanceKLO.terms());
	set.addAll(WordnetNounIndexNameInstanceKLU.terms());
	set.addAll(WordnetNounIndexNameInstanceKLY.terms());
  		return set; 	} }