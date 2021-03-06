package org.swtk.commons.dict.wordnet.indexbyname.controller.b.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.b.WordnetNounIndexNameInstanceBYB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.c.WordnetNounIndexNameInstanceBYC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.d.WordnetNounIndexNameInstanceBYD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.e.WordnetNounIndexNameInstanceBYE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.g.WordnetNounIndexNameInstanceBYG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.l.WordnetNounIndexNameInstanceBYL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.n.WordnetNounIndexNameInstanceBYN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.p.WordnetNounIndexNameInstanceBYP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.r.WordnetNounIndexNameInstanceBYR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.s.WordnetNounIndexNameInstanceBYS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.t.WordnetNounIndexNameInstanceBYT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.w.WordnetNounIndexNameInstanceBYW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.b.y.z.WordnetNounIndexNameInstanceBYZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerBY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("byb".equals(key)) return WordnetNounIndexNameInstanceBYB.get(TERM);
	if ("byc".equals(key)) return WordnetNounIndexNameInstanceBYC.get(TERM);
	if ("byd".equals(key)) return WordnetNounIndexNameInstanceBYD.get(TERM);
	if ("bye".equals(key)) return WordnetNounIndexNameInstanceBYE.get(TERM);
	if ("byg".equals(key)) return WordnetNounIndexNameInstanceBYG.get(TERM);
	if ("byl".equals(key)) return WordnetNounIndexNameInstanceBYL.get(TERM);
	if ("byn".equals(key)) return WordnetNounIndexNameInstanceBYN.get(TERM);
	if ("byp".equals(key)) return WordnetNounIndexNameInstanceBYP.get(TERM);
	if ("byr".equals(key)) return WordnetNounIndexNameInstanceBYR.get(TERM);
	if ("bys".equals(key)) return WordnetNounIndexNameInstanceBYS.get(TERM);
	if ("byt".equals(key)) return WordnetNounIndexNameInstanceBYT.get(TERM);
	if ("byw".equals(key)) return WordnetNounIndexNameInstanceBYW.get(TERM);
	if ("byz".equals(key)) return WordnetNounIndexNameInstanceBYZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceBYB.terms());
	set.addAll(WordnetNounIndexNameInstanceBYC.terms());
	set.addAll(WordnetNounIndexNameInstanceBYD.terms());
	set.addAll(WordnetNounIndexNameInstanceBYE.terms());
	set.addAll(WordnetNounIndexNameInstanceBYG.terms());
	set.addAll(WordnetNounIndexNameInstanceBYL.terms());
	set.addAll(WordnetNounIndexNameInstanceBYN.terms());
	set.addAll(WordnetNounIndexNameInstanceBYP.terms());
	set.addAll(WordnetNounIndexNameInstanceBYR.terms());
	set.addAll(WordnetNounIndexNameInstanceBYS.terms());
	set.addAll(WordnetNounIndexNameInstanceBYT.terms());
	set.addAll(WordnetNounIndexNameInstanceBYW.terms());
	set.addAll(WordnetNounIndexNameInstanceBYZ.terms());
  		return set; 	} }