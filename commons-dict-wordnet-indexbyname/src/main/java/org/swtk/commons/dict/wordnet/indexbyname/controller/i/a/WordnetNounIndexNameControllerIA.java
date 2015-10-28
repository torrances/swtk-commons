package org.swtk.commons.dict.wordnet.indexbyname.controller.i.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.a.e.WordnetNounIndexNameInstanceIAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.a.g.WordnetNounIndexNameInstanceIAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.a.m.WordnetNounIndexNameInstanceIAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.a.n.WordnetNounIndexNameInstanceIAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.a.p.WordnetNounIndexNameInstanceIAP;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("iae".equals(key)) return WordnetNounIndexNameInstanceIAE.get(TERM);
	if ("iag".equals(key)) return WordnetNounIndexNameInstanceIAG.get(TERM);
	if ("iam".equals(key)) return WordnetNounIndexNameInstanceIAM.get(TERM);
	if ("ian".equals(key)) return WordnetNounIndexNameInstanceIAN.get(TERM);
	if ("iap".equals(key)) return WordnetNounIndexNameInstanceIAP.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIAE.terms());
	set.addAll(WordnetNounIndexNameInstanceIAG.terms());
	set.addAll(WordnetNounIndexNameInstanceIAM.terms());
	set.addAll(WordnetNounIndexNameInstanceIAN.terms());
	set.addAll(WordnetNounIndexNameInstanceIAP.terms());
  		return set; 	} }