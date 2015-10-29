package org.swtk.commons.dict.wordnet.indexbyname.controller.k.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.n.a.WordnetNounIndexNameInstanceKNA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.n.e.WordnetNounIndexNameInstanceKNE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.n.i.WordnetNounIndexNameInstanceKNI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.n.o.WordnetNounIndexNameInstanceKNO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.n.u.WordnetNounIndexNameInstanceKNU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("kna".equals(key)) return WordnetNounIndexNameInstanceKNA.get(TERM);
	if ("kne".equals(key)) return WordnetNounIndexNameInstanceKNE.get(TERM);
	if ("kni".equals(key)) return WordnetNounIndexNameInstanceKNI.get(TERM);
	if ("kno".equals(key)) return WordnetNounIndexNameInstanceKNO.get(TERM);
	if ("knu".equals(key)) return WordnetNounIndexNameInstanceKNU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKNA.terms());
	set.addAll(WordnetNounIndexNameInstanceKNE.terms());
	set.addAll(WordnetNounIndexNameInstanceKNI.terms());
	set.addAll(WordnetNounIndexNameInstanceKNO.terms());
	set.addAll(WordnetNounIndexNameInstanceKNU.terms());
  		return set; 	} }