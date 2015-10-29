package org.swtk.commons.dict.wordnet.indexbyname.controller.y.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.b.WordnetNounIndexNameInstanceYOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.d.WordnetNounIndexNameInstanceYOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.g.WordnetNounIndexNameInstanceYOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.k.WordnetNounIndexNameInstanceYOK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.l.WordnetNounIndexNameInstanceYOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.r.WordnetNounIndexNameInstanceYOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.s.WordnetNounIndexNameInstanceYOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.t.WordnetNounIndexNameInstanceYOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.u.WordnetNounIndexNameInstanceYOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.w.WordnetNounIndexNameInstanceYOW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("yob".equals(key)) return WordnetNounIndexNameInstanceYOB.get(TERM);
	if ("yod".equals(key)) return WordnetNounIndexNameInstanceYOD.get(TERM);
	if ("yog".equals(key)) return WordnetNounIndexNameInstanceYOG.get(TERM);
	if ("yok".equals(key)) return WordnetNounIndexNameInstanceYOK.get(TERM);
	if ("yol".equals(key)) return WordnetNounIndexNameInstanceYOL.get(TERM);
	if ("yor".equals(key)) return WordnetNounIndexNameInstanceYOR.get(TERM);
	if ("yos".equals(key)) return WordnetNounIndexNameInstanceYOS.get(TERM);
	if ("yot".equals(key)) return WordnetNounIndexNameInstanceYOT.get(TERM);
	if ("you".equals(key)) return WordnetNounIndexNameInstanceYOU.get(TERM);
	if ("yow".equals(key)) return WordnetNounIndexNameInstanceYOW.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYOB.terms());
	set.addAll(WordnetNounIndexNameInstanceYOD.terms());
	set.addAll(WordnetNounIndexNameInstanceYOG.terms());
	set.addAll(WordnetNounIndexNameInstanceYOK.terms());
	set.addAll(WordnetNounIndexNameInstanceYOL.terms());
	set.addAll(WordnetNounIndexNameInstanceYOR.terms());
	set.addAll(WordnetNounIndexNameInstanceYOS.terms());
	set.addAll(WordnetNounIndexNameInstanceYOT.terms());
	set.addAll(WordnetNounIndexNameInstanceYOU.terms());
	set.addAll(WordnetNounIndexNameInstanceYOW.terms());
  		return set; 	} }