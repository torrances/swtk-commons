package org.swtk.commons.dict.wordnet.indexbyname.controller.o.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.a.h.WordnetNounIndexNameInstanceOAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.a.k.WordnetNounIndexNameInstanceOAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.a.r.WordnetNounIndexNameInstanceOAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.a.s.WordnetNounIndexNameInstanceOAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.a.t.WordnetNounIndexNameInstanceOAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.a.x.WordnetNounIndexNameInstanceOAX;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("oah".equals(key)) return WordnetNounIndexNameInstanceOAH.get(TERM);
	if ("oak".equals(key)) return WordnetNounIndexNameInstanceOAK.get(TERM);
	if ("oar".equals(key)) return WordnetNounIndexNameInstanceOAR.get(TERM);
	if ("oas".equals(key)) return WordnetNounIndexNameInstanceOAS.get(TERM);
	if ("oat".equals(key)) return WordnetNounIndexNameInstanceOAT.get(TERM);
	if ("oax".equals(key)) return WordnetNounIndexNameInstanceOAX.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOAH.terms());
	set.addAll(WordnetNounIndexNameInstanceOAK.terms());
	set.addAll(WordnetNounIndexNameInstanceOAR.terms());
	set.addAll(WordnetNounIndexNameInstanceOAS.terms());
	set.addAll(WordnetNounIndexNameInstanceOAT.terms());
	set.addAll(WordnetNounIndexNameInstanceOAX.terms());
  		return set; 	} }