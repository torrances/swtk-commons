package org.swtk.commons.dict.wordnet.index.name.controller.a.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.a.o.r.i.WordnetNounIndexNameInstanceAORI;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.o.r.t.WordnetNounIndexNameInstanceAORT;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.o.t.u.WordnetNounIndexNameInstanceAOTU;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.o.u.d.WordnetNounIndexNameInstanceAOUD;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("aori".equals(key)) return WordnetNounIndexNameInstanceAORI.get(TERM);
	if ("aort".equals(key)) return WordnetNounIndexNameInstanceAORT.get(TERM);
	if ("aotu".equals(key)) return WordnetNounIndexNameInstanceAOTU.get(TERM);
	if ("aoud".equals(key)) return WordnetNounIndexNameInstanceAOUD.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAORI.terms());
	set.addAll(WordnetNounIndexNameInstanceAORT.terms());
	set.addAll(WordnetNounIndexNameInstanceAOTU.terms());
	set.addAll(WordnetNounIndexNameInstanceAOUD.terms());
  		return set; 	} }