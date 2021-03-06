package org.swtk.commons.dict.wordnet.indexbyname.controller.n.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.a.WordnetNounIndexNameInstanceNYA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.b.WordnetNounIndexNameInstanceNYB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.c.WordnetNounIndexNameInstanceNYC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.d.WordnetNounIndexNameInstanceNYD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.i.WordnetNounIndexNameInstanceNYI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.l.WordnetNounIndexNameInstanceNYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.m.WordnetNounIndexNameInstanceNYM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.n.WordnetNounIndexNameInstanceNYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.p.WordnetNounIndexNameInstanceNYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.n.y.s.WordnetNounIndexNameInstanceNYS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("nya".equals(key)) return WordnetNounIndexNameInstanceNYA.get(TERM);
	if ("nyb".equals(key)) return WordnetNounIndexNameInstanceNYB.get(TERM);
	if ("nyc".equals(key)) return WordnetNounIndexNameInstanceNYC.get(TERM);
	if ("nyd".equals(key)) return WordnetNounIndexNameInstanceNYD.get(TERM);
	if ("nyi".equals(key)) return WordnetNounIndexNameInstanceNYI.get(TERM);
	if ("nyl".equals(key)) return WordnetNounIndexNameInstanceNYL.get(TERM);
	if ("nym".equals(key)) return WordnetNounIndexNameInstanceNYM.get(TERM);
	if ("nyn".equals(key)) return WordnetNounIndexNameInstanceNYN.get(TERM);
	if ("nyp".equals(key)) return WordnetNounIndexNameInstanceNYP.get(TERM);
	if ("nys".equals(key)) return WordnetNounIndexNameInstanceNYS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNYA.terms());
	set.addAll(WordnetNounIndexNameInstanceNYB.terms());
	set.addAll(WordnetNounIndexNameInstanceNYC.terms());
	set.addAll(WordnetNounIndexNameInstanceNYD.terms());
	set.addAll(WordnetNounIndexNameInstanceNYI.terms());
	set.addAll(WordnetNounIndexNameInstanceNYL.terms());
	set.addAll(WordnetNounIndexNameInstanceNYM.terms());
	set.addAll(WordnetNounIndexNameInstanceNYN.terms());
	set.addAll(WordnetNounIndexNameInstanceNYP.terms());
	set.addAll(WordnetNounIndexNameInstanceNYS.terms());
  		return set; 	} }