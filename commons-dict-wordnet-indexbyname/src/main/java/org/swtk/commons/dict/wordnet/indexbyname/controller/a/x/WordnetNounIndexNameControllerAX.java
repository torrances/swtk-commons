package org.swtk.commons.dict.wordnet.indexbyname.controller.a.x;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.x.e.WordnetNounIndexNameInstanceAXE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.x.i.WordnetNounIndexNameInstanceAXI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.x.l.WordnetNounIndexNameInstanceAXL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.x.o.WordnetNounIndexNameInstanceAXO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.x.s.WordnetNounIndexNameInstanceAXS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAX {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("axe".equals(key)) return WordnetNounIndexNameInstanceAXE.get(TERM);
	if ("axi".equals(key)) return WordnetNounIndexNameInstanceAXI.get(TERM);
	if ("axl".equals(key)) return WordnetNounIndexNameInstanceAXL.get(TERM);
	if ("axo".equals(key)) return WordnetNounIndexNameInstanceAXO.get(TERM);
	if ("axs".equals(key)) return WordnetNounIndexNameInstanceAXS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAXE.terms());
	set.addAll(WordnetNounIndexNameInstanceAXI.terms());
	set.addAll(WordnetNounIndexNameInstanceAXL.terms());
	set.addAll(WordnetNounIndexNameInstanceAXO.terms());
	set.addAll(WordnetNounIndexNameInstanceAXS.terms());
  		return set; 	} }