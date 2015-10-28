package org.swtk.commons.dict.wordnet.indexbyname.controller.e.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.b.WordnetNounIndexNameInstanceEBB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.e.WordnetNounIndexNameInstanceEBE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.i.WordnetNounIndexNameInstanceEBI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.l.WordnetNounIndexNameInstanceEBL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.o.WordnetNounIndexNameInstanceEBO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.r.WordnetNounIndexNameInstanceEBR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.u.WordnetNounIndexNameInstanceEBU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEB {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ebb".equals(key)) return WordnetNounIndexNameInstanceEBB.get(TERM);
	if ("ebe".equals(key)) return WordnetNounIndexNameInstanceEBE.get(TERM);
	if ("ebi".equals(key)) return WordnetNounIndexNameInstanceEBI.get(TERM);
	if ("ebl".equals(key)) return WordnetNounIndexNameInstanceEBL.get(TERM);
	if ("ebo".equals(key)) return WordnetNounIndexNameInstanceEBO.get(TERM);
	if ("ebr".equals(key)) return WordnetNounIndexNameInstanceEBR.get(TERM);
	if ("ebu".equals(key)) return WordnetNounIndexNameInstanceEBU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEBB.terms());
	set.addAll(WordnetNounIndexNameInstanceEBE.terms());
	set.addAll(WordnetNounIndexNameInstanceEBI.terms());
	set.addAll(WordnetNounIndexNameInstanceEBL.terms());
	set.addAll(WordnetNounIndexNameInstanceEBO.terms());
	set.addAll(WordnetNounIndexNameInstanceEBR.terms());
	set.addAll(WordnetNounIndexNameInstanceEBU.terms());
  		return set; 	} }