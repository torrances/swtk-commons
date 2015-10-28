package org.swtk.commons.dict.wordnet.indexbyname.controller.d.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.a.WordnetNounIndexNameInstanceDYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.b.WordnetNounIndexNameInstanceDYB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.e.WordnetNounIndexNameInstanceDYE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.i.WordnetNounIndexNameInstanceDYI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.k.WordnetNounIndexNameInstanceDYK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.l.WordnetNounIndexNameInstanceDYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.n.WordnetNounIndexNameInstanceDYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.s.WordnetNounIndexNameInstanceDYS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.t.WordnetNounIndexNameInstanceDYT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.y.u.WordnetNounIndexNameInstanceDYU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("dya".equals(key)) return WordnetNounIndexNameInstanceDYA.get(TERM);
	if ("dyb".equals(key)) return WordnetNounIndexNameInstanceDYB.get(TERM);
	if ("dye".equals(key)) return WordnetNounIndexNameInstanceDYE.get(TERM);
	if ("dyi".equals(key)) return WordnetNounIndexNameInstanceDYI.get(TERM);
	if ("dyk".equals(key)) return WordnetNounIndexNameInstanceDYK.get(TERM);
	if ("dyl".equals(key)) return WordnetNounIndexNameInstanceDYL.get(TERM);
	if ("dyn".equals(key)) return WordnetNounIndexNameInstanceDYN.get(TERM);
	if ("dys".equals(key)) return WordnetNounIndexNameInstanceDYS.get(TERM);
	if ("dyt".equals(key)) return WordnetNounIndexNameInstanceDYT.get(TERM);
	if ("dyu".equals(key)) return WordnetNounIndexNameInstanceDYU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDYA.terms());
	set.addAll(WordnetNounIndexNameInstanceDYB.terms());
	set.addAll(WordnetNounIndexNameInstanceDYE.terms());
	set.addAll(WordnetNounIndexNameInstanceDYI.terms());
	set.addAll(WordnetNounIndexNameInstanceDYK.terms());
	set.addAll(WordnetNounIndexNameInstanceDYL.terms());
	set.addAll(WordnetNounIndexNameInstanceDYN.terms());
	set.addAll(WordnetNounIndexNameInstanceDYS.terms());
	set.addAll(WordnetNounIndexNameInstanceDYT.terms());
	set.addAll(WordnetNounIndexNameInstanceDYU.terms());
  		return set; 	} }