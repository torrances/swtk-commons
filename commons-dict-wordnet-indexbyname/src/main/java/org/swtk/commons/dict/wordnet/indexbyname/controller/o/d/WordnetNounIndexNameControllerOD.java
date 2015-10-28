package org.swtk.commons.dict.wordnet.indexbyname.controller.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.a.WordnetNounIndexNameInstanceODA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.d.WordnetNounIndexNameInstanceODD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.e.WordnetNounIndexNameInstanceODE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.i.WordnetNounIndexNameInstanceODI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.o.WordnetNounIndexNameInstanceODO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.y.WordnetNounIndexNameInstanceODY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOD {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("oda".equals(key)) return WordnetNounIndexNameInstanceODA.get(TERM);
	if ("odd".equals(key)) return WordnetNounIndexNameInstanceODD.get(TERM);
	if ("ode".equals(key)) return WordnetNounIndexNameInstanceODE.get(TERM);
	if ("odi".equals(key)) return WordnetNounIndexNameInstanceODI.get(TERM);
	if ("odo".equals(key)) return WordnetNounIndexNameInstanceODO.get(TERM);
	if ("ody".equals(key)) return WordnetNounIndexNameInstanceODY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceODA.terms());
	set.addAll(WordnetNounIndexNameInstanceODD.terms());
	set.addAll(WordnetNounIndexNameInstanceODE.terms());
	set.addAll(WordnetNounIndexNameInstanceODI.terms());
	set.addAll(WordnetNounIndexNameInstanceODO.terms());
	set.addAll(WordnetNounIndexNameInstanceODY.terms());
  		return set; 	} }