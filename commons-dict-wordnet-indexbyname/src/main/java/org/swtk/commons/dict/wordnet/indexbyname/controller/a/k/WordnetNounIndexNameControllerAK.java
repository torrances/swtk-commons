package org.swtk.commons.dict.wordnet.indexbyname.controller.a.k;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.a.WordnetNounIndexNameInstanceAKA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.e.WordnetNounIndexNameInstanceAKE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.h.WordnetNounIndexNameInstanceAKH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.i.WordnetNounIndexNameInstanceAKI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.k.WordnetNounIndexNameInstanceAKK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.m.WordnetNounIndexNameInstanceAKM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.r.WordnetNounIndexNameInstanceAKR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.k.v.WordnetNounIndexNameInstanceAKV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAK {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("aka".equals(key)) return WordnetNounIndexNameInstanceAKA.get(TERM);
	if ("ake".equals(key)) return WordnetNounIndexNameInstanceAKE.get(TERM);
	if ("akh".equals(key)) return WordnetNounIndexNameInstanceAKH.get(TERM);
	if ("aki".equals(key)) return WordnetNounIndexNameInstanceAKI.get(TERM);
	if ("akk".equals(key)) return WordnetNounIndexNameInstanceAKK.get(TERM);
	if ("akm".equals(key)) return WordnetNounIndexNameInstanceAKM.get(TERM);
	if ("akr".equals(key)) return WordnetNounIndexNameInstanceAKR.get(TERM);
	if ("akv".equals(key)) return WordnetNounIndexNameInstanceAKV.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAKA.terms());
	set.addAll(WordnetNounIndexNameInstanceAKE.terms());
	set.addAll(WordnetNounIndexNameInstanceAKH.terms());
	set.addAll(WordnetNounIndexNameInstanceAKI.terms());
	set.addAll(WordnetNounIndexNameInstanceAKK.terms());
	set.addAll(WordnetNounIndexNameInstanceAKM.terms());
	set.addAll(WordnetNounIndexNameInstanceAKR.terms());
	set.addAll(WordnetNounIndexNameInstanceAKV.terms());
  		return set; 	} }