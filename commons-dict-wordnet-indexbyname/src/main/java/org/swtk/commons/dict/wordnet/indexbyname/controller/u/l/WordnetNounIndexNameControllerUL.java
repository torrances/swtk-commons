package org.swtk.commons.dict.wordnet.indexbyname.controller.u.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.a.WordnetNounIndexNameInstanceULA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.c.WordnetNounIndexNameInstanceULC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.e.WordnetNounIndexNameInstanceULE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.f.WordnetNounIndexNameInstanceULF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.i.WordnetNounIndexNameInstanceULI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.l.WordnetNounIndexNameInstanceULL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.m.WordnetNounIndexNameInstanceULM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.n.WordnetNounIndexNameInstanceULN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.s.WordnetNounIndexNameInstanceULS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.t.WordnetNounIndexNameInstanceULT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.u.WordnetNounIndexNameInstanceULU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.v.WordnetNounIndexNameInstanceULV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.y.WordnetNounIndexNameInstanceULY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerUL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ula".equals(key)) return WordnetNounIndexNameInstanceULA.get(TERM);
	if ("ulc".equals(key)) return WordnetNounIndexNameInstanceULC.get(TERM);
	if ("ule".equals(key)) return WordnetNounIndexNameInstanceULE.get(TERM);
	if ("ulf".equals(key)) return WordnetNounIndexNameInstanceULF.get(TERM);
	if ("uli".equals(key)) return WordnetNounIndexNameInstanceULI.get(TERM);
	if ("ull".equals(key)) return WordnetNounIndexNameInstanceULL.get(TERM);
	if ("ulm".equals(key)) return WordnetNounIndexNameInstanceULM.get(TERM);
	if ("uln".equals(key)) return WordnetNounIndexNameInstanceULN.get(TERM);
	if ("uls".equals(key)) return WordnetNounIndexNameInstanceULS.get(TERM);
	if ("ult".equals(key)) return WordnetNounIndexNameInstanceULT.get(TERM);
	if ("ulu".equals(key)) return WordnetNounIndexNameInstanceULU.get(TERM);
	if ("ulv".equals(key)) return WordnetNounIndexNameInstanceULV.get(TERM);
	if ("uly".equals(key)) return WordnetNounIndexNameInstanceULY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceULA.terms());
	set.addAll(WordnetNounIndexNameInstanceULC.terms());
	set.addAll(WordnetNounIndexNameInstanceULE.terms());
	set.addAll(WordnetNounIndexNameInstanceULF.terms());
	set.addAll(WordnetNounIndexNameInstanceULI.terms());
	set.addAll(WordnetNounIndexNameInstanceULL.terms());
	set.addAll(WordnetNounIndexNameInstanceULM.terms());
	set.addAll(WordnetNounIndexNameInstanceULN.terms());
	set.addAll(WordnetNounIndexNameInstanceULS.terms());
	set.addAll(WordnetNounIndexNameInstanceULT.terms());
	set.addAll(WordnetNounIndexNameInstanceULU.terms());
	set.addAll(WordnetNounIndexNameInstanceULV.terms());
	set.addAll(WordnetNounIndexNameInstanceULY.terms());
  		return set; 	} }