package org.swtk.commons.dict.wordnet.indexbyname.controller.o.k;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.k.a.WordnetNounIndexNameInstanceOKA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.k.e.WordnetNounIndexNameInstanceOKE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.k.i.WordnetNounIndexNameInstanceOKI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.k.l.WordnetNounIndexNameInstanceOKL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.k.r.WordnetNounIndexNameInstanceOKR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.k.t.WordnetNounIndexNameInstanceOKT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOK {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("oka".equals(key)) return WordnetNounIndexNameInstanceOKA.get(TERM);
	if ("oke".equals(key)) return WordnetNounIndexNameInstanceOKE.get(TERM);
	if ("oki".equals(key)) return WordnetNounIndexNameInstanceOKI.get(TERM);
	if ("okl".equals(key)) return WordnetNounIndexNameInstanceOKL.get(TERM);
	if ("okr".equals(key)) return WordnetNounIndexNameInstanceOKR.get(TERM);
	if ("okt".equals(key)) return WordnetNounIndexNameInstanceOKT.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOKA.terms());
	set.addAll(WordnetNounIndexNameInstanceOKE.terms());
	set.addAll(WordnetNounIndexNameInstanceOKI.terms());
	set.addAll(WordnetNounIndexNameInstanceOKL.terms());
	set.addAll(WordnetNounIndexNameInstanceOKR.terms());
	set.addAll(WordnetNounIndexNameInstanceOKT.terms());
  		return set; 	} }