package org.swtk.commons.dict.wordnet.indexbyname.controller.s.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.l.a.WordnetNounIndexNameInstanceSLA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.l.e.WordnetNounIndexNameInstanceSLE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.l.i.WordnetNounIndexNameInstanceSLI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.l.o.WordnetNounIndexNameInstanceSLO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.l.u.WordnetNounIndexNameInstanceSLU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.l.y.WordnetNounIndexNameInstanceSLY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("sla".equals(key)) return WordnetNounIndexNameInstanceSLA.get(TERM);
	if ("sle".equals(key)) return WordnetNounIndexNameInstanceSLE.get(TERM);
	if ("sli".equals(key)) return WordnetNounIndexNameInstanceSLI.get(TERM);
	if ("slo".equals(key)) return WordnetNounIndexNameInstanceSLO.get(TERM);
	if ("slu".equals(key)) return WordnetNounIndexNameInstanceSLU.get(TERM);
	if ("sly".equals(key)) return WordnetNounIndexNameInstanceSLY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSLA.terms());
	set.addAll(WordnetNounIndexNameInstanceSLE.terms());
	set.addAll(WordnetNounIndexNameInstanceSLI.terms());
	set.addAll(WordnetNounIndexNameInstanceSLO.terms());
	set.addAll(WordnetNounIndexNameInstanceSLU.terms());
	set.addAll(WordnetNounIndexNameInstanceSLY.terms());
  		return set; 	} }