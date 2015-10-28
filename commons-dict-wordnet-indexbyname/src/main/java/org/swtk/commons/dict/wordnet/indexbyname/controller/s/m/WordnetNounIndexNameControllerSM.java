package org.swtk.commons.dict.wordnet.indexbyname.controller.s.m;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.a.WordnetNounIndexNameInstanceSMA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.e.WordnetNounIndexNameInstanceSME;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.i.WordnetNounIndexNameInstanceSMI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.o.WordnetNounIndexNameInstanceSMO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.s.WordnetNounIndexNameInstanceSMS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.u.WordnetNounIndexNameInstanceSMU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.y.WordnetNounIndexNameInstanceSMY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSM {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("sma".equals(key)) return WordnetNounIndexNameInstanceSMA.get(TERM);
	if ("sme".equals(key)) return WordnetNounIndexNameInstanceSME.get(TERM);
	if ("smi".equals(key)) return WordnetNounIndexNameInstanceSMI.get(TERM);
	if ("smo".equals(key)) return WordnetNounIndexNameInstanceSMO.get(TERM);
	if ("sms".equals(key)) return WordnetNounIndexNameInstanceSMS.get(TERM);
	if ("smu".equals(key)) return WordnetNounIndexNameInstanceSMU.get(TERM);
	if ("smy".equals(key)) return WordnetNounIndexNameInstanceSMY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSMA.terms());
	set.addAll(WordnetNounIndexNameInstanceSME.terms());
	set.addAll(WordnetNounIndexNameInstanceSMI.terms());
	set.addAll(WordnetNounIndexNameInstanceSMO.terms());
	set.addAll(WordnetNounIndexNameInstanceSMS.terms());
	set.addAll(WordnetNounIndexNameInstanceSMU.terms());
	set.addAll(WordnetNounIndexNameInstanceSMY.terms());
  		return set; 	} }