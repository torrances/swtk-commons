package org.swtk.commons.dict.wordnet.indexbyname.controller.q.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.a.b.WordnetNounIndexNameInstanceQAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.a.d.WordnetNounIndexNameInstanceQAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.a.e.WordnetNounIndexNameInstanceQAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.a.n.WordnetNounIndexNameInstanceQAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.q.a.t.WordnetNounIndexNameInstanceQAT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerQA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("qab".equals(key)) return WordnetNounIndexNameInstanceQAB.get(TERM);
	if ("qad".equals(key)) return WordnetNounIndexNameInstanceQAD.get(TERM);
	if ("qae".equals(key)) return WordnetNounIndexNameInstanceQAE.get(TERM);
	if ("qan".equals(key)) return WordnetNounIndexNameInstanceQAN.get(TERM);
	if ("qat".equals(key)) return WordnetNounIndexNameInstanceQAT.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceQAB.terms());
	set.addAll(WordnetNounIndexNameInstanceQAD.terms());
	set.addAll(WordnetNounIndexNameInstanceQAE.terms());
	set.addAll(WordnetNounIndexNameInstanceQAN.terms());
	set.addAll(WordnetNounIndexNameInstanceQAT.terms());
  		return set; 	} }