package org.swtk.commons.dict.wordnet.index.name.controller.x.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.x.i.a.n.WordnetNounIndexNameInstanceXIAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.i.i.i.WordnetNounIndexNameInstanceXIII;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.i.n.j.WordnetNounIndexNameInstanceXINJ;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.i.p.h.WordnetNounIndexNameInstanceXIPH;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.i.z.a.WordnetNounIndexNameInstanceXIZA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xian".equals(key)) return WordnetNounIndexNameInstanceXIAN.get(TERM);
	if ("xiii".equals(key)) return WordnetNounIndexNameInstanceXIII.get(TERM);
	if ("xinj".equals(key)) return WordnetNounIndexNameInstanceXINJ.get(TERM);
	if ("xiph".equals(key)) return WordnetNounIndexNameInstanceXIPH.get(TERM);
	if ("xiza".equals(key)) return WordnetNounIndexNameInstanceXIZA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXIAN.terms());
	set.addAll(WordnetNounIndexNameInstanceXIII.terms());
	set.addAll(WordnetNounIndexNameInstanceXINJ.terms());
	set.addAll(WordnetNounIndexNameInstanceXIPH.terms());
	set.addAll(WordnetNounIndexNameInstanceXIZA.terms());
  		return set; 	} }