package org.swtk.commons.dict.wordnet.indexbyname.controller.u.t;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.a.WordnetNounIndexNameInstanceUTA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.e.WordnetNounIndexNameInstanceUTE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.i.WordnetNounIndexNameInstanceUTI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.m.WordnetNounIndexNameInstanceUTM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.n.WordnetNounIndexNameInstanceUTN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.o.WordnetNounIndexNameInstanceUTO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.r.WordnetNounIndexNameInstanceUTR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.t.WordnetNounIndexNameInstanceUTT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.u.WordnetNounIndexNameInstanceUTU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUT {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("uta".equals(key)) return WordnetNounIndexNameInstanceUTA.get(TERM);
	if ("ute".equals(key)) return WordnetNounIndexNameInstanceUTE.get(TERM);
	if ("uti".equals(key)) return WordnetNounIndexNameInstanceUTI.get(TERM);
	if ("utm".equals(key)) return WordnetNounIndexNameInstanceUTM.get(TERM);
	if ("utn".equals(key)) return WordnetNounIndexNameInstanceUTN.get(TERM);
	if ("uto".equals(key)) return WordnetNounIndexNameInstanceUTO.get(TERM);
	if ("utr".equals(key)) return WordnetNounIndexNameInstanceUTR.get(TERM);
	if ("utt".equals(key)) return WordnetNounIndexNameInstanceUTT.get(TERM);
	if ("utu".equals(key)) return WordnetNounIndexNameInstanceUTU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceUTA.terms());
	set.addAll(WordnetNounIndexNameInstanceUTE.terms());
	set.addAll(WordnetNounIndexNameInstanceUTI.terms());
	set.addAll(WordnetNounIndexNameInstanceUTM.terms());
	set.addAll(WordnetNounIndexNameInstanceUTN.terms());
	set.addAll(WordnetNounIndexNameInstanceUTO.terms());
	set.addAll(WordnetNounIndexNameInstanceUTR.terms());
	set.addAll(WordnetNounIndexNameInstanceUTT.terms());
	set.addAll(WordnetNounIndexNameInstanceUTU.terms());
  		return set; 	} }