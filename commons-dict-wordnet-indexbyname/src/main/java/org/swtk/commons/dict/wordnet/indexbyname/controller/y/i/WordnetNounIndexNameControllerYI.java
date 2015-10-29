package org.swtk.commons.dict.wordnet.indexbyname.controller.y.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.i.b.WordnetNounIndexNameInstanceYIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.i.d.WordnetNounIndexNameInstanceYID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.i.e.WordnetNounIndexNameInstanceYIE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.i.p.WordnetNounIndexNameInstanceYIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.i.s.WordnetNounIndexNameInstanceYIS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("yib".equals(key)) return WordnetNounIndexNameInstanceYIB.get(TERM);
	if ("yid".equals(key)) return WordnetNounIndexNameInstanceYID.get(TERM);
	if ("yie".equals(key)) return WordnetNounIndexNameInstanceYIE.get(TERM);
	if ("yip".equals(key)) return WordnetNounIndexNameInstanceYIP.get(TERM);
	if ("yis".equals(key)) return WordnetNounIndexNameInstanceYIS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYIB.terms());
	set.addAll(WordnetNounIndexNameInstanceYID.terms());
	set.addAll(WordnetNounIndexNameInstanceYIE.terms());
	set.addAll(WordnetNounIndexNameInstanceYIP.terms());
	set.addAll(WordnetNounIndexNameInstanceYIS.terms());
  		return set; 	} }