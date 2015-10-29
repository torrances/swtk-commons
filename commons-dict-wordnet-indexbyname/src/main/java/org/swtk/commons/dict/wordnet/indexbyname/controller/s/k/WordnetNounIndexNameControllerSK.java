package org.swtk.commons.dict.wordnet.indexbyname.controller.s.k;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.a.WordnetNounIndexNameInstanceSKA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.e.WordnetNounIndexNameInstanceSKE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.i.WordnetNounIndexNameInstanceSKI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.o.WordnetNounIndexNameInstanceSKO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.u.WordnetNounIndexNameInstanceSKU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.y.WordnetNounIndexNameInstanceSKY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSK {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("ska".equals(key)) return WordnetNounIndexNameInstanceSKA.get(TERM);
	if ("ske".equals(key)) return WordnetNounIndexNameInstanceSKE.get(TERM);
	if ("ski".equals(key)) return WordnetNounIndexNameInstanceSKI.get(TERM);
	if ("sko".equals(key)) return WordnetNounIndexNameInstanceSKO.get(TERM);
	if ("sku".equals(key)) return WordnetNounIndexNameInstanceSKU.get(TERM);
	if ("sky".equals(key)) return WordnetNounIndexNameInstanceSKY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSKA.terms());
	set.addAll(WordnetNounIndexNameInstanceSKE.terms());
	set.addAll(WordnetNounIndexNameInstanceSKI.terms());
	set.addAll(WordnetNounIndexNameInstanceSKO.terms());
	set.addAll(WordnetNounIndexNameInstanceSKU.terms());
	set.addAll(WordnetNounIndexNameInstanceSKY.terms());
  		return set; 	} }