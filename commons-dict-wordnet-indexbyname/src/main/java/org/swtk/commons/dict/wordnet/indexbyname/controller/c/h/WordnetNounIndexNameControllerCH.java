package org.swtk.commons.dict.wordnet.indexbyname.controller.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.a.WordnetNounIndexNameInstanceCHA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.e.WordnetNounIndexNameInstanceCHE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.i.WordnetNounIndexNameInstanceCHI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.l.WordnetNounIndexNameInstanceCHL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.o.WordnetNounIndexNameInstanceCHO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.r.WordnetNounIndexNameInstanceCHR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.u.WordnetNounIndexNameInstanceCHU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.y.WordnetNounIndexNameInstanceCHY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("cha".equals(key)) return WordnetNounIndexNameInstanceCHA.get(TERM);
	if ("che".equals(key)) return WordnetNounIndexNameInstanceCHE.get(TERM);
	if ("chi".equals(key)) return WordnetNounIndexNameInstanceCHI.get(TERM);
	if ("chl".equals(key)) return WordnetNounIndexNameInstanceCHL.get(TERM);
	if ("cho".equals(key)) return WordnetNounIndexNameInstanceCHO.get(TERM);
	if ("chr".equals(key)) return WordnetNounIndexNameInstanceCHR.get(TERM);
	if ("chu".equals(key)) return WordnetNounIndexNameInstanceCHU.get(TERM);
	if ("chy".equals(key)) return WordnetNounIndexNameInstanceCHY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCHA.terms());
	set.addAll(WordnetNounIndexNameInstanceCHE.terms());
	set.addAll(WordnetNounIndexNameInstanceCHI.terms());
	set.addAll(WordnetNounIndexNameInstanceCHL.terms());
	set.addAll(WordnetNounIndexNameInstanceCHO.terms());
	set.addAll(WordnetNounIndexNameInstanceCHR.terms());
	set.addAll(WordnetNounIndexNameInstanceCHU.terms());
	set.addAll(WordnetNounIndexNameInstanceCHY.terms());
  		return set; 	} }