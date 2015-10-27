package org.swtk.commons.dict.wordnet.index.name.controller.r.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.r.y.d.b.WordnetNounIndexNameInstanceRYDB;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.y.e.g.WordnetNounIndexNameInstanceRYEG;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.y.n.c.WordnetNounIndexNameInstanceRYNC;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.y.p.t.WordnetNounIndexNameInstanceRYPT;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.y.u.k.WordnetNounIndexNameInstanceRYUK;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerRY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("rydb".equals(key)) return WordnetNounIndexNameInstanceRYDB.get(TERM);
	if ("ryeg".equals(key)) return WordnetNounIndexNameInstanceRYEG.get(TERM);
	if ("rync".equals(key)) return WordnetNounIndexNameInstanceRYNC.get(TERM);
	if ("rypt".equals(key)) return WordnetNounIndexNameInstanceRYPT.get(TERM);
	if ("ryuk".equals(key)) return WordnetNounIndexNameInstanceRYUK.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceRYDB.terms());
	set.addAll(WordnetNounIndexNameInstanceRYEG.terms());
	set.addAll(WordnetNounIndexNameInstanceRYNC.terms());
	set.addAll(WordnetNounIndexNameInstanceRYPT.terms());
	set.addAll(WordnetNounIndexNameInstanceRYUK.terms());
  		return set; 	} }