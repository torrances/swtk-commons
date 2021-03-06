package org.swtk.commons.dict.wordnet.indexbyname.controller.p.t;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.t.a.WordnetNounIndexNameInstancePTA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.t.e.WordnetNounIndexNameInstancePTE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.t.i.WordnetNounIndexNameInstancePTI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.t.l.WordnetNounIndexNameInstancePTL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.t.o.WordnetNounIndexNameInstancePTO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.t.s.WordnetNounIndexNameInstancePTS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.t.y.WordnetNounIndexNameInstancePTY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("pta".equals(key)) return WordnetNounIndexNameInstancePTA.get(TERM);
	if ("pte".equals(key)) return WordnetNounIndexNameInstancePTE.get(TERM);
	if ("pti".equals(key)) return WordnetNounIndexNameInstancePTI.get(TERM);
	if ("ptl".equals(key)) return WordnetNounIndexNameInstancePTL.get(TERM);
	if ("pto".equals(key)) return WordnetNounIndexNameInstancePTO.get(TERM);
	if ("pts".equals(key)) return WordnetNounIndexNameInstancePTS.get(TERM);
	if ("pty".equals(key)) return WordnetNounIndexNameInstancePTY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePTA.terms());
	set.addAll(WordnetNounIndexNameInstancePTE.terms());
	set.addAll(WordnetNounIndexNameInstancePTI.terms());
	set.addAll(WordnetNounIndexNameInstancePTL.terms());
	set.addAll(WordnetNounIndexNameInstancePTO.terms());
	set.addAll(WordnetNounIndexNameInstancePTS.terms());
	set.addAll(WordnetNounIndexNameInstancePTY.terms());
  		return set; 	} }