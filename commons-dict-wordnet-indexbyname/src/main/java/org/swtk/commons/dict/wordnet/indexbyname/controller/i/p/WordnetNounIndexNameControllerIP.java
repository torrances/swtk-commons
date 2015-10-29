package org.swtk.commons.dict.wordnet.indexbyname.controller.i.p;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.p.e.WordnetNounIndexNameInstanceIPE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.p.h.WordnetNounIndexNameInstanceIPH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.p.i.WordnetNounIndexNameInstanceIPI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.p.o.WordnetNounIndexNameInstanceIPO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.p.r.WordnetNounIndexNameInstanceIPR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.p.s.WordnetNounIndexNameInstanceIPS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIP {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("ipe".equals(key)) return WordnetNounIndexNameInstanceIPE.get(TERM);
	if ("iph".equals(key)) return WordnetNounIndexNameInstanceIPH.get(TERM);
	if ("ipi".equals(key)) return WordnetNounIndexNameInstanceIPI.get(TERM);
	if ("ipo".equals(key)) return WordnetNounIndexNameInstanceIPO.get(TERM);
	if ("ipr".equals(key)) return WordnetNounIndexNameInstanceIPR.get(TERM);
	if ("ips".equals(key)) return WordnetNounIndexNameInstanceIPS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIPE.terms());
	set.addAll(WordnetNounIndexNameInstanceIPH.terms());
	set.addAll(WordnetNounIndexNameInstanceIPI.terms());
	set.addAll(WordnetNounIndexNameInstanceIPO.terms());
	set.addAll(WordnetNounIndexNameInstanceIPR.terms());
	set.addAll(WordnetNounIndexNameInstanceIPS.terms());
  		return set; 	} }