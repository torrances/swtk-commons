package org.swtk.commons.dict.wordnet.index.name.controller.v.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.v.l.a.d.WordnetNounIndexNameInstanceVLAD;
	import org.swtk.commons.dict.wordnet.index.name.instance.v.l.a.m.WordnetNounIndexNameInstanceVLAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.v.l.d.l.WordnetNounIndexNameInstanceVLDL;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerVL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("vlad".equals(key)) return WordnetNounIndexNameInstanceVLAD.get(TERM);
	if ("vlam".equals(key)) return WordnetNounIndexNameInstanceVLAM.get(TERM);
	if ("vldl".equals(key)) return WordnetNounIndexNameInstanceVLDL.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceVLAD.terms());
	set.addAll(WordnetNounIndexNameInstanceVLAM.terms());
	set.addAll(WordnetNounIndexNameInstanceVLDL.terms());
  		return set; 	} }