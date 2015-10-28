package org.swtk.commons.dict.wordnet.indexbyname.controller.i.m;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.m.a.WordnetNounIndexNameInstanceIMA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.m.b.WordnetNounIndexNameInstanceIMB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.m.i.WordnetNounIndexNameInstanceIMI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.m.m.WordnetNounIndexNameInstanceIMM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.m.p.WordnetNounIndexNameInstanceIMP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.m.u.WordnetNounIndexNameInstanceIMU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIM {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ima".equals(key)) return WordnetNounIndexNameInstanceIMA.get(TERM);
	if ("imb".equals(key)) return WordnetNounIndexNameInstanceIMB.get(TERM);
	if ("imi".equals(key)) return WordnetNounIndexNameInstanceIMI.get(TERM);
	if ("imm".equals(key)) return WordnetNounIndexNameInstanceIMM.get(TERM);
	if ("imp".equals(key)) return WordnetNounIndexNameInstanceIMP.get(TERM);
	if ("imu".equals(key)) return WordnetNounIndexNameInstanceIMU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIMA.terms());
	set.addAll(WordnetNounIndexNameInstanceIMB.terms());
	set.addAll(WordnetNounIndexNameInstanceIMI.terms());
	set.addAll(WordnetNounIndexNameInstanceIMM.terms());
	set.addAll(WordnetNounIndexNameInstanceIMP.terms());
	set.addAll(WordnetNounIndexNameInstanceIMU.terms());
  		return set; 	} }