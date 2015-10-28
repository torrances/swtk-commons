package org.swtk.commons.dict.wordnet.indexbyname.controller.a.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.a.WordnetNounIndexNameInstanceAVA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.e.WordnetNounIndexNameInstanceAVE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.i.WordnetNounIndexNameInstanceAVI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.o.WordnetNounIndexNameInstanceAVO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.u.WordnetNounIndexNameInstanceAVU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ava".equals(key)) return WordnetNounIndexNameInstanceAVA.get(TERM);
	if ("ave".equals(key)) return WordnetNounIndexNameInstanceAVE.get(TERM);
	if ("avi".equals(key)) return WordnetNounIndexNameInstanceAVI.get(TERM);
	if ("avo".equals(key)) return WordnetNounIndexNameInstanceAVO.get(TERM);
	if ("avu".equals(key)) return WordnetNounIndexNameInstanceAVU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAVA.terms());
	set.addAll(WordnetNounIndexNameInstanceAVE.terms());
	set.addAll(WordnetNounIndexNameInstanceAVI.terms());
	set.addAll(WordnetNounIndexNameInstanceAVO.terms());
	set.addAll(WordnetNounIndexNameInstanceAVU.terms());
  		return set; 	} }