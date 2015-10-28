package org.swtk.commons.dict.wordnet.indexbyname.controller.y.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.a.WordnetNounIndexNameInstanceYEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.d.WordnetNounIndexNameInstanceYED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.k.WordnetNounIndexNameInstanceYEK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.l.WordnetNounIndexNameInstanceYEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.m.WordnetNounIndexNameInstanceYEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.n.WordnetNounIndexNameInstanceYEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.o.WordnetNounIndexNameInstanceYEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.r.WordnetNounIndexNameInstanceYER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.s.WordnetNounIndexNameInstanceYES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.t.WordnetNounIndexNameInstanceYET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.v.WordnetNounIndexNameInstanceYEV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.z.WordnetNounIndexNameInstanceYEZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerYE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("yea".equals(key)) return WordnetNounIndexNameInstanceYEA.get(TERM);
	if ("yed".equals(key)) return WordnetNounIndexNameInstanceYED.get(TERM);
	if ("yek".equals(key)) return WordnetNounIndexNameInstanceYEK.get(TERM);
	if ("yel".equals(key)) return WordnetNounIndexNameInstanceYEL.get(TERM);
	if ("yem".equals(key)) return WordnetNounIndexNameInstanceYEM.get(TERM);
	if ("yen".equals(key)) return WordnetNounIndexNameInstanceYEN.get(TERM);
	if ("yeo".equals(key)) return WordnetNounIndexNameInstanceYEO.get(TERM);
	if ("yer".equals(key)) return WordnetNounIndexNameInstanceYER.get(TERM);
	if ("yes".equals(key)) return WordnetNounIndexNameInstanceYES.get(TERM);
	if ("yet".equals(key)) return WordnetNounIndexNameInstanceYET.get(TERM);
	if ("yev".equals(key)) return WordnetNounIndexNameInstanceYEV.get(TERM);
	if ("yez".equals(key)) return WordnetNounIndexNameInstanceYEZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceYEA.terms());
	set.addAll(WordnetNounIndexNameInstanceYED.terms());
	set.addAll(WordnetNounIndexNameInstanceYEK.terms());
	set.addAll(WordnetNounIndexNameInstanceYEL.terms());
	set.addAll(WordnetNounIndexNameInstanceYEM.terms());
	set.addAll(WordnetNounIndexNameInstanceYEN.terms());
	set.addAll(WordnetNounIndexNameInstanceYEO.terms());
	set.addAll(WordnetNounIndexNameInstanceYER.terms());
	set.addAll(WordnetNounIndexNameInstanceYES.terms());
	set.addAll(WordnetNounIndexNameInstanceYET.terms());
	set.addAll(WordnetNounIndexNameInstanceYEV.terms());
	set.addAll(WordnetNounIndexNameInstanceYEZ.terms());
  		return set; 	} }