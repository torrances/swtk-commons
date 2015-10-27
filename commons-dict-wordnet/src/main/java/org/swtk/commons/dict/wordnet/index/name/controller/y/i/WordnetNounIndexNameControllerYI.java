package org.swtk.commons.dict.wordnet.index.name.controller.y.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.y.i.b.i.WordnetNounIndexNameInstanceYIBI;
	import org.swtk.commons.dict.wordnet.index.name.instance.y.i.d.d.WordnetNounIndexNameInstanceYIDD;
	import org.swtk.commons.dict.wordnet.index.name.instance.y.i.e.l.WordnetNounIndexNameInstanceYIEL;
	import org.swtk.commons.dict.wordnet.index.name.instance.y.i.p.s.WordnetNounIndexNameInstanceYIPS;
	import org.swtk.commons.dict.wordnet.index.name.instance.y.i.s.r.WordnetNounIndexNameInstanceYISR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("yibi".equals(key)) return WordnetNounIndexNameInstanceYIBI.get(TERM);
	if ("yidd".equals(key)) return WordnetNounIndexNameInstanceYIDD.get(TERM);
	if ("yiel".equals(key)) return WordnetNounIndexNameInstanceYIEL.get(TERM);
	if ("yips".equals(key)) return WordnetNounIndexNameInstanceYIPS.get(TERM);
	if ("yisr".equals(key)) return WordnetNounIndexNameInstanceYISR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYIBI.terms());
	set.addAll(WordnetNounIndexNameInstanceYIDD.terms());
	set.addAll(WordnetNounIndexNameInstanceYIEL.terms());
	set.addAll(WordnetNounIndexNameInstanceYIPS.terms());
	set.addAll(WordnetNounIndexNameInstanceYISR.terms());
  		return set; 	} }