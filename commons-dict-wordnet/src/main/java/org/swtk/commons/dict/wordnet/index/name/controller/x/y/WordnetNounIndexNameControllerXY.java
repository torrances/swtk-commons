package org.swtk.commons.dict.wordnet.index.name.controller.x.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.x.y.l.a.WordnetNounIndexNameInstanceXYLA;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.y.l.e.WordnetNounIndexNameInstanceXYLE;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.y.l.o.WordnetNounIndexNameInstanceXYLO;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.y.p.h.WordnetNounIndexNameInstanceXYPH;
	import org.swtk.commons.dict.wordnet.index.name.instance.x.y.r.i.WordnetNounIndexNameInstanceXYRI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("xyla".equals(key)) return WordnetNounIndexNameInstanceXYLA.get(TERM);
	if ("xyle".equals(key)) return WordnetNounIndexNameInstanceXYLE.get(TERM);
	if ("xylo".equals(key)) return WordnetNounIndexNameInstanceXYLO.get(TERM);
	if ("xyph".equals(key)) return WordnetNounIndexNameInstanceXYPH.get(TERM);
	if ("xyri".equals(key)) return WordnetNounIndexNameInstanceXYRI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXYLA.terms());
	set.addAll(WordnetNounIndexNameInstanceXYLE.terms());
	set.addAll(WordnetNounIndexNameInstanceXYLO.terms());
	set.addAll(WordnetNounIndexNameInstanceXYPH.terms());
	set.addAll(WordnetNounIndexNameInstanceXYRI.terms());
  		return set; 	} }