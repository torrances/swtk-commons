package org.swtk.commons.dict.wordnet.indexbyname.controller.s.t;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.a.WordnetNounIndexNameInstanceSTA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.e.WordnetNounIndexNameInstanceSTE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.h.WordnetNounIndexNameInstanceSTH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.i.WordnetNounIndexNameInstanceSTI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.o.WordnetNounIndexNameInstanceSTO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.r.WordnetNounIndexNameInstanceSTR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.u.WordnetNounIndexNameInstanceSTU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.t.y.WordnetNounIndexNameInstanceSTY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerST {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("sta".equals(key)) return WordnetNounIndexNameInstanceSTA.get(TERM);
	if ("ste".equals(key)) return WordnetNounIndexNameInstanceSTE.get(TERM);
	if ("sth".equals(key)) return WordnetNounIndexNameInstanceSTH.get(TERM);
	if ("sti".equals(key)) return WordnetNounIndexNameInstanceSTI.get(TERM);
	if ("sto".equals(key)) return WordnetNounIndexNameInstanceSTO.get(TERM);
	if ("str".equals(key)) return WordnetNounIndexNameInstanceSTR.get(TERM);
	if ("stu".equals(key)) return WordnetNounIndexNameInstanceSTU.get(TERM);
	if ("sty".equals(key)) return WordnetNounIndexNameInstanceSTY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSTA.terms());
	set.addAll(WordnetNounIndexNameInstanceSTE.terms());
	set.addAll(WordnetNounIndexNameInstanceSTH.terms());
	set.addAll(WordnetNounIndexNameInstanceSTI.terms());
	set.addAll(WordnetNounIndexNameInstanceSTO.terms());
	set.addAll(WordnetNounIndexNameInstanceSTR.terms());
	set.addAll(WordnetNounIndexNameInstanceSTU.terms());
	set.addAll(WordnetNounIndexNameInstanceSTY.terms());
  		return set; 	} }