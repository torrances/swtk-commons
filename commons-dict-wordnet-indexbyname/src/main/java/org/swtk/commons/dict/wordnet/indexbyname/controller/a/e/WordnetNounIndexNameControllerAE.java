package org.swtk.commons.dict.wordnet.indexbyname.controller.a.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.c.WordnetNounIndexNameInstanceAEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.d.WordnetNounIndexNameInstanceAED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.g.WordnetNounIndexNameInstanceAEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.n.WordnetNounIndexNameInstanceAEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.o.WordnetNounIndexNameInstanceAEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.p.WordnetNounIndexNameInstanceAEP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.r.WordnetNounIndexNameInstanceAER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.s.WordnetNounIndexNameInstanceAES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.t.WordnetNounIndexNameInstanceAET;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("aec".equals(key)) return WordnetNounIndexNameInstanceAEC.get(TERM);
	if ("aed".equals(key)) return WordnetNounIndexNameInstanceAED.get(TERM);
	if ("aeg".equals(key)) return WordnetNounIndexNameInstanceAEG.get(TERM);
	if ("aen".equals(key)) return WordnetNounIndexNameInstanceAEN.get(TERM);
	if ("aeo".equals(key)) return WordnetNounIndexNameInstanceAEO.get(TERM);
	if ("aep".equals(key)) return WordnetNounIndexNameInstanceAEP.get(TERM);
	if ("aer".equals(key)) return WordnetNounIndexNameInstanceAER.get(TERM);
	if ("aes".equals(key)) return WordnetNounIndexNameInstanceAES.get(TERM);
	if ("aet".equals(key)) return WordnetNounIndexNameInstanceAET.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAEC.terms());
	set.addAll(WordnetNounIndexNameInstanceAED.terms());
	set.addAll(WordnetNounIndexNameInstanceAEG.terms());
	set.addAll(WordnetNounIndexNameInstanceAEN.terms());
	set.addAll(WordnetNounIndexNameInstanceAEO.terms());
	set.addAll(WordnetNounIndexNameInstanceAEP.terms());
	set.addAll(WordnetNounIndexNameInstanceAER.terms());
	set.addAll(WordnetNounIndexNameInstanceAES.terms());
	set.addAll(WordnetNounIndexNameInstanceAET.terms());
  		return set; 	} }