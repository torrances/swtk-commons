package org.swtk.commons.dict.wordnet.indexbyname.controller.b.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.l.a.WordnetNounIndexNameInstanceBLA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.l.e.WordnetNounIndexNameInstanceBLE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.l.i.WordnetNounIndexNameInstanceBLI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.l.o.WordnetNounIndexNameInstanceBLO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.l.u.WordnetNounIndexNameInstanceBLU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("bla".equals(key)) return WordnetNounIndexNameInstanceBLA.get(TERM);
	if ("ble".equals(key)) return WordnetNounIndexNameInstanceBLE.get(TERM);
	if ("bli".equals(key)) return WordnetNounIndexNameInstanceBLI.get(TERM);
	if ("blo".equals(key)) return WordnetNounIndexNameInstanceBLO.get(TERM);
	if ("blu".equals(key)) return WordnetNounIndexNameInstanceBLU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBLA.terms());
	set.addAll(WordnetNounIndexNameInstanceBLE.terms());
	set.addAll(WordnetNounIndexNameInstanceBLI.terms());
	set.addAll(WordnetNounIndexNameInstanceBLO.terms());
	set.addAll(WordnetNounIndexNameInstanceBLU.terms());
  		return set; 	} }