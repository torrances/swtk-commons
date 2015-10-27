package org.swtk.commons.dict.wordnet.index.name.controller.s.v;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.s.v.a.l.WordnetNounIndexNameInstanceSVAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.v.e.d.WordnetNounIndexNameInstanceSVED;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.v.e.n.WordnetNounIndexNameInstanceSVEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.v.e.r.WordnetNounIndexNameInstanceSVER;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.v.i.z.WordnetNounIndexNameInstanceSVIZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.s.v.o.b.WordnetNounIndexNameInstanceSVOB;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSV {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("sval".equals(key)) return WordnetNounIndexNameInstanceSVAL.get(TERM);
	if ("sved".equals(key)) return WordnetNounIndexNameInstanceSVED.get(TERM);
	if ("sven".equals(key)) return WordnetNounIndexNameInstanceSVEN.get(TERM);
	if ("sver".equals(key)) return WordnetNounIndexNameInstanceSVER.get(TERM);
	if ("sviz".equals(key)) return WordnetNounIndexNameInstanceSVIZ.get(TERM);
	if ("svob".equals(key)) return WordnetNounIndexNameInstanceSVOB.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSVAL.terms());
	set.addAll(WordnetNounIndexNameInstanceSVED.terms());
	set.addAll(WordnetNounIndexNameInstanceSVEN.terms());
	set.addAll(WordnetNounIndexNameInstanceSVER.terms());
	set.addAll(WordnetNounIndexNameInstanceSVIZ.terms());
	set.addAll(WordnetNounIndexNameInstanceSVOB.terms());
  		return set; 	} }