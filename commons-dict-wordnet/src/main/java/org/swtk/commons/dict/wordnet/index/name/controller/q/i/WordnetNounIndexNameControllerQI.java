package org.swtk.commons.dict.wordnet.index.name.controller.q.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.q.i.a.n.WordnetNounIndexNameInstanceQIAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.q.i.b.l.WordnetNounIndexNameInstanceQIBL;
	import org.swtk.commons.dict.wordnet.index.name.instance.q.i.n.d.WordnetNounIndexNameInstanceQIND;
	import org.swtk.commons.dict.wordnet.index.name.instance.q.i.n.g.WordnetNounIndexNameInstanceQING;
	import org.swtk.commons.dict.wordnet.index.name.instance.q.i.n.t.WordnetNounIndexNameInstanceQINT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerQI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("qian".equals(key)) return WordnetNounIndexNameInstanceQIAN.get(TERM);
	if ("qibl".equals(key)) return WordnetNounIndexNameInstanceQIBL.get(TERM);
	if ("qind".equals(key)) return WordnetNounIndexNameInstanceQIND.get(TERM);
	if ("qing".equals(key)) return WordnetNounIndexNameInstanceQING.get(TERM);
	if ("qint".equals(key)) return WordnetNounIndexNameInstanceQINT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceQIAN.terms());
	set.addAll(WordnetNounIndexNameInstanceQIBL.terms());
	set.addAll(WordnetNounIndexNameInstanceQIND.terms());
	set.addAll(WordnetNounIndexNameInstanceQING.terms());
	set.addAll(WordnetNounIndexNameInstanceQINT.terms());
  		return set; 	} }