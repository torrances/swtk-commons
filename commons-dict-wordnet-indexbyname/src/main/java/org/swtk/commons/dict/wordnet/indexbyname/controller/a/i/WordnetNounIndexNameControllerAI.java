package org.swtk.commons.dict.wordnet.indexbyname.controller.a.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.a.WordnetNounIndexNameInstanceAIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.d.WordnetNounIndexNameInstanceAID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.g.WordnetNounIndexNameInstanceAIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.k.WordnetNounIndexNameInstanceAIK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.l.WordnetNounIndexNameInstanceAIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.m.WordnetNounIndexNameInstanceAIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.o.WordnetNounIndexNameInstanceAIO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.r.WordnetNounIndexNameInstanceAIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.s.WordnetNounIndexNameInstanceAIS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.t.WordnetNounIndexNameInstanceAIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.z.WordnetNounIndexNameInstanceAIZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("aia".equals(key)) return WordnetNounIndexNameInstanceAIA.get(TERM);
	if ("aid".equals(key)) return WordnetNounIndexNameInstanceAID.get(TERM);
	if ("aig".equals(key)) return WordnetNounIndexNameInstanceAIG.get(TERM);
	if ("aik".equals(key)) return WordnetNounIndexNameInstanceAIK.get(TERM);
	if ("ail".equals(key)) return WordnetNounIndexNameInstanceAIL.get(TERM);
	if ("aim".equals(key)) return WordnetNounIndexNameInstanceAIM.get(TERM);
	if ("aio".equals(key)) return WordnetNounIndexNameInstanceAIO.get(TERM);
	if ("air".equals(key)) return WordnetNounIndexNameInstanceAIR.get(TERM);
	if ("ais".equals(key)) return WordnetNounIndexNameInstanceAIS.get(TERM);
	if ("ait".equals(key)) return WordnetNounIndexNameInstanceAIT.get(TERM);
	if ("aiz".equals(key)) return WordnetNounIndexNameInstanceAIZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAIA.terms());
	set.addAll(WordnetNounIndexNameInstanceAID.terms());
	set.addAll(WordnetNounIndexNameInstanceAIG.terms());
	set.addAll(WordnetNounIndexNameInstanceAIK.terms());
	set.addAll(WordnetNounIndexNameInstanceAIL.terms());
	set.addAll(WordnetNounIndexNameInstanceAIM.terms());
	set.addAll(WordnetNounIndexNameInstanceAIO.terms());
	set.addAll(WordnetNounIndexNameInstanceAIR.terms());
	set.addAll(WordnetNounIndexNameInstanceAIS.terms());
	set.addAll(WordnetNounIndexNameInstanceAIT.terms());
	set.addAll(WordnetNounIndexNameInstanceAIZ.terms());
  		return set; 	} }