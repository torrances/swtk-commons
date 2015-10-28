package org.swtk.commons.dict.wordnet.indexbyname.controller.a.p;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.a.WordnetNounIndexNameInstanceAPA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.e.WordnetNounIndexNameInstanceAPE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.h.WordnetNounIndexNameInstanceAPH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.i.WordnetNounIndexNameInstanceAPI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.l.WordnetNounIndexNameInstanceAPL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.n.WordnetNounIndexNameInstanceAPN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.o.WordnetNounIndexNameInstanceAPO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.p.WordnetNounIndexNameInstanceAPP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.r.WordnetNounIndexNameInstanceAPR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.s.WordnetNounIndexNameInstanceAPS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.t.WordnetNounIndexNameInstanceAPT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.u.WordnetNounIndexNameInstanceAPU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAP {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("apa".equals(key)) return WordnetNounIndexNameInstanceAPA.get(TERM);
	if ("ape".equals(key)) return WordnetNounIndexNameInstanceAPE.get(TERM);
	if ("aph".equals(key)) return WordnetNounIndexNameInstanceAPH.get(TERM);
	if ("api".equals(key)) return WordnetNounIndexNameInstanceAPI.get(TERM);
	if ("apl".equals(key)) return WordnetNounIndexNameInstanceAPL.get(TERM);
	if ("apn".equals(key)) return WordnetNounIndexNameInstanceAPN.get(TERM);
	if ("apo".equals(key)) return WordnetNounIndexNameInstanceAPO.get(TERM);
	if ("app".equals(key)) return WordnetNounIndexNameInstanceAPP.get(TERM);
	if ("apr".equals(key)) return WordnetNounIndexNameInstanceAPR.get(TERM);
	if ("aps".equals(key)) return WordnetNounIndexNameInstanceAPS.get(TERM);
	if ("apt".equals(key)) return WordnetNounIndexNameInstanceAPT.get(TERM);
	if ("apu".equals(key)) return WordnetNounIndexNameInstanceAPU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAPA.terms());
	set.addAll(WordnetNounIndexNameInstanceAPE.terms());
	set.addAll(WordnetNounIndexNameInstanceAPH.terms());
	set.addAll(WordnetNounIndexNameInstanceAPI.terms());
	set.addAll(WordnetNounIndexNameInstanceAPL.terms());
	set.addAll(WordnetNounIndexNameInstanceAPN.terms());
	set.addAll(WordnetNounIndexNameInstanceAPO.terms());
	set.addAll(WordnetNounIndexNameInstanceAPP.terms());
	set.addAll(WordnetNounIndexNameInstanceAPR.terms());
	set.addAll(WordnetNounIndexNameInstanceAPS.terms());
	set.addAll(WordnetNounIndexNameInstanceAPT.terms());
	set.addAll(WordnetNounIndexNameInstanceAPU.terms());
  		return set; 	} }