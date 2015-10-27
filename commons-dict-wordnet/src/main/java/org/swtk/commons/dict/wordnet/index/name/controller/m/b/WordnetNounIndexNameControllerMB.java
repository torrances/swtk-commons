package org.swtk.commons.dict.wordnet.index.name.controller.m.b;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.m.b.a.b.WordnetNounIndexNameInstanceMBAB;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.b.e.y.WordnetNounIndexNameInstanceMBEY;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.b.i.t.WordnetNounIndexNameInstanceMBIT;
	import org.swtk.commons.dict.wordnet.index.name.instance.m.b.u.n.WordnetNounIndexNameInstanceMBUN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mbab".equals(key)) return WordnetNounIndexNameInstanceMBAB.get(TERM);
	if ("mbey".equals(key)) return WordnetNounIndexNameInstanceMBEY.get(TERM);
	if ("mbit".equals(key)) return WordnetNounIndexNameInstanceMBIT.get(TERM);
	if ("mbun".equals(key)) return WordnetNounIndexNameInstanceMBUN.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMBAB.terms());
	set.addAll(WordnetNounIndexNameInstanceMBEY.terms());
	set.addAll(WordnetNounIndexNameInstanceMBIT.terms());
	set.addAll(WordnetNounIndexNameInstanceMBUN.terms());
  		return set; 	} }