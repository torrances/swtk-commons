package org.swtk.commons.dict.wordnet.indexbyname.controller.i.b;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.b.a.WordnetNounIndexNameInstanceIBA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.b.e.WordnetNounIndexNameInstanceIBE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.b.i.WordnetNounIndexNameInstanceIBI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.b.r.WordnetNounIndexNameInstanceIBR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.b.s.WordnetNounIndexNameInstanceIBS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.b.u.WordnetNounIndexNameInstanceIBU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("iba".equals(key)) return WordnetNounIndexNameInstanceIBA.get(TERM);
	if ("ibe".equals(key)) return WordnetNounIndexNameInstanceIBE.get(TERM);
	if ("ibi".equals(key)) return WordnetNounIndexNameInstanceIBI.get(TERM);
	if ("ibr".equals(key)) return WordnetNounIndexNameInstanceIBR.get(TERM);
	if ("ibs".equals(key)) return WordnetNounIndexNameInstanceIBS.get(TERM);
	if ("ibu".equals(key)) return WordnetNounIndexNameInstanceIBU.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIBA.terms());
	set.addAll(WordnetNounIndexNameInstanceIBE.terms());
	set.addAll(WordnetNounIndexNameInstanceIBI.terms());
	set.addAll(WordnetNounIndexNameInstanceIBR.terms());
	set.addAll(WordnetNounIndexNameInstanceIBS.terms());
	set.addAll(WordnetNounIndexNameInstanceIBU.terms());
  		return set; 	} }