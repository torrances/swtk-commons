package org.swtk.commons.dict.wordnet.index.name.controller.b.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.b.h.a.d.WordnetNounIndexNameInstanceBHAD;
	import org.swtk.commons.dict.wordnet.index.name.instance.b.h.a.g.WordnetNounIndexNameInstanceBHAG;
	import org.swtk.commons.dict.wordnet.index.name.instance.b.h.a.k.WordnetNounIndexNameInstanceBHAK;
	import org.swtk.commons.dict.wordnet.index.name.instance.b.h.a.n.WordnetNounIndexNameInstanceBHAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.b.h.a.r.WordnetNounIndexNameInstanceBHAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.b.h.u.t.WordnetNounIndexNameInstanceBHUT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("bhad".equals(key)) return WordnetNounIndexNameInstanceBHAD.get(TERM);
	if ("bhag".equals(key)) return WordnetNounIndexNameInstanceBHAG.get(TERM);
	if ("bhak".equals(key)) return WordnetNounIndexNameInstanceBHAK.get(TERM);
	if ("bhan".equals(key)) return WordnetNounIndexNameInstanceBHAN.get(TERM);
	if ("bhar".equals(key)) return WordnetNounIndexNameInstanceBHAR.get(TERM);
	if ("bhut".equals(key)) return WordnetNounIndexNameInstanceBHUT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBHAD.terms());
	set.addAll(WordnetNounIndexNameInstanceBHAG.terms());
	set.addAll(WordnetNounIndexNameInstanceBHAK.terms());
	set.addAll(WordnetNounIndexNameInstanceBHAN.terms());
	set.addAll(WordnetNounIndexNameInstanceBHAR.terms());
	set.addAll(WordnetNounIndexNameInstanceBHUT.terms());
  		return set; 	} }