package org.swtk.commons.dict.wordnet.index.name.controller.d.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.d.w.a.r.WordnetNounIndexNameInstanceDWAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.w.e.e.WordnetNounIndexNameInstanceDWEE;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.w.e.l.WordnetNounIndexNameInstanceDWEL;
	import org.swtk.commons.dict.wordnet.index.name.instance.d.w.i.n.WordnetNounIndexNameInstanceDWIN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("dwar".equals(key)) return WordnetNounIndexNameInstanceDWAR.get(TERM);
	if ("dwee".equals(key)) return WordnetNounIndexNameInstanceDWEE.get(TERM);
	if ("dwel".equals(key)) return WordnetNounIndexNameInstanceDWEL.get(TERM);
	if ("dwin".equals(key)) return WordnetNounIndexNameInstanceDWIN.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDWAR.terms());
	set.addAll(WordnetNounIndexNameInstanceDWEE.terms());
	set.addAll(WordnetNounIndexNameInstanceDWEL.terms());
	set.addAll(WordnetNounIndexNameInstanceDWIN.terms());
  		return set; 	} }