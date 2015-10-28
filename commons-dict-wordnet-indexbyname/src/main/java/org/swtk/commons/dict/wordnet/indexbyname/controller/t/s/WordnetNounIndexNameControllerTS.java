package org.swtk.commons.dict.wordnet.indexbyname.controller.t.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.a.WordnetNounIndexNameInstanceTSA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.e.WordnetNounIndexNameInstanceTSE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.h.WordnetNounIndexNameInstanceTSH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.i.WordnetNounIndexNameInstanceTSI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.o.WordnetNounIndexNameInstanceTSO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.u.WordnetNounIndexNameInstanceTSU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.w.WordnetNounIndexNameInstanceTSW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerTS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("tsa".equals(key)) return WordnetNounIndexNameInstanceTSA.get(TERM);
	if ("tse".equals(key)) return WordnetNounIndexNameInstanceTSE.get(TERM);
	if ("tsh".equals(key)) return WordnetNounIndexNameInstanceTSH.get(TERM);
	if ("tsi".equals(key)) return WordnetNounIndexNameInstanceTSI.get(TERM);
	if ("tso".equals(key)) return WordnetNounIndexNameInstanceTSO.get(TERM);
	if ("tsu".equals(key)) return WordnetNounIndexNameInstanceTSU.get(TERM);
	if ("tsw".equals(key)) return WordnetNounIndexNameInstanceTSW.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceTSA.terms());
	set.addAll(WordnetNounIndexNameInstanceTSE.terms());
	set.addAll(WordnetNounIndexNameInstanceTSH.terms());
	set.addAll(WordnetNounIndexNameInstanceTSI.terms());
	set.addAll(WordnetNounIndexNameInstanceTSO.terms());
	set.addAll(WordnetNounIndexNameInstanceTSU.terms());
	set.addAll(WordnetNounIndexNameInstanceTSW.terms());
  		return set; 	} }