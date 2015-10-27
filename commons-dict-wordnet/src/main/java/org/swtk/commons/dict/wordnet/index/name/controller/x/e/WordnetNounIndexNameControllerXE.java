package org.swtk.commons.dict.wordnet.index.name.controller.x.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.x.e.n.a.WordnetNounIndexNameInstanceXENA;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.e.n.i.WordnetNounIndexNameInstanceXENI;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.e.n.o.WordnetNounIndexNameInstanceXENO;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.e.r.a.WordnetNounIndexNameInstanceXERA;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.e.r.o.WordnetNounIndexNameInstanceXERO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xena".equals(key)) return WordnetNounIndexNameInstanceXENA.get(TERM);
	if ("xeni".equals(key)) return WordnetNounIndexNameInstanceXENI.get(TERM);
	if ("xeno".equals(key)) return WordnetNounIndexNameInstanceXENO.get(TERM);
	if ("xera".equals(key)) return WordnetNounIndexNameInstanceXERA.get(TERM);
	if ("xero".equals(key)) return WordnetNounIndexNameInstanceXERO.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXENA.terms());
	set.addAll(WordnetNounIndexNameInstanceXENI.terms());
	set.addAll(WordnetNounIndexNameInstanceXENO.terms());
	set.addAll(WordnetNounIndexNameInstanceXERA.terms());
	set.addAll(WordnetNounIndexNameInstanceXERO.terms());
  		return set; 	} }