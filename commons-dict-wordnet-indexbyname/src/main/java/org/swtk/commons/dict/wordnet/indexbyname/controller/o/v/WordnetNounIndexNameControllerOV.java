package org.swtk.commons.dict.wordnet.indexbyname.controller.o.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.a.WordnetNounIndexNameInstanceOVA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.e.WordnetNounIndexNameInstanceOVE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.i.WordnetNounIndexNameInstanceOVI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.o.WordnetNounIndexNameInstanceOVO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.r.WordnetNounIndexNameInstanceOVR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.u.WordnetNounIndexNameInstanceOVU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("ova".equals(key)) return WordnetNounIndexNameInstanceOVA.get(TERM);
	if ("ove".equals(key)) return WordnetNounIndexNameInstanceOVE.get(TERM);
	if ("ovi".equals(key)) return WordnetNounIndexNameInstanceOVI.get(TERM);
	if ("ovo".equals(key)) return WordnetNounIndexNameInstanceOVO.get(TERM);
	if ("ovr".equals(key)) return WordnetNounIndexNameInstanceOVR.get(TERM);
	if ("ovu".equals(key)) return WordnetNounIndexNameInstanceOVU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOVA.terms());
	set.addAll(WordnetNounIndexNameInstanceOVE.terms());
	set.addAll(WordnetNounIndexNameInstanceOVI.terms());
	set.addAll(WordnetNounIndexNameInstanceOVO.terms());
	set.addAll(WordnetNounIndexNameInstanceOVR.terms());
	set.addAll(WordnetNounIndexNameInstanceOVU.terms());
  		return set; 	} }