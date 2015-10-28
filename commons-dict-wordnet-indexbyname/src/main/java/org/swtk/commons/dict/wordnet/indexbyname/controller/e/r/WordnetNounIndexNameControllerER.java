package org.swtk.commons.dict.wordnet.indexbyname.controller.e.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.a.WordnetNounIndexNameInstanceERA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.b.WordnetNounIndexNameInstanceERB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.c.WordnetNounIndexNameInstanceERC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.e.WordnetNounIndexNameInstanceERE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.g.WordnetNounIndexNameInstanceERG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.i.WordnetNounIndexNameInstanceERI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.l.WordnetNounIndexNameInstanceERL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.m.WordnetNounIndexNameInstanceERM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.n.WordnetNounIndexNameInstanceERN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.o.WordnetNounIndexNameInstanceERO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.r.WordnetNounIndexNameInstanceERR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.s.WordnetNounIndexNameInstanceERS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.u.WordnetNounIndexNameInstanceERU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.v.WordnetNounIndexNameInstanceERV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.w.WordnetNounIndexNameInstanceERW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.y.WordnetNounIndexNameInstanceERY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerER {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("era".equals(key)) return WordnetNounIndexNameInstanceERA.get(TERM);
	if ("erb".equals(key)) return WordnetNounIndexNameInstanceERB.get(TERM);
	if ("erc".equals(key)) return WordnetNounIndexNameInstanceERC.get(TERM);
	if ("ere".equals(key)) return WordnetNounIndexNameInstanceERE.get(TERM);
	if ("erg".equals(key)) return WordnetNounIndexNameInstanceERG.get(TERM);
	if ("eri".equals(key)) return WordnetNounIndexNameInstanceERI.get(TERM);
	if ("erl".equals(key)) return WordnetNounIndexNameInstanceERL.get(TERM);
	if ("erm".equals(key)) return WordnetNounIndexNameInstanceERM.get(TERM);
	if ("ern".equals(key)) return WordnetNounIndexNameInstanceERN.get(TERM);
	if ("ero".equals(key)) return WordnetNounIndexNameInstanceERO.get(TERM);
	if ("err".equals(key)) return WordnetNounIndexNameInstanceERR.get(TERM);
	if ("ers".equals(key)) return WordnetNounIndexNameInstanceERS.get(TERM);
	if ("eru".equals(key)) return WordnetNounIndexNameInstanceERU.get(TERM);
	if ("erv".equals(key)) return WordnetNounIndexNameInstanceERV.get(TERM);
	if ("erw".equals(key)) return WordnetNounIndexNameInstanceERW.get(TERM);
	if ("ery".equals(key)) return WordnetNounIndexNameInstanceERY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceERA.terms());
	set.addAll(WordnetNounIndexNameInstanceERB.terms());
	set.addAll(WordnetNounIndexNameInstanceERC.terms());
	set.addAll(WordnetNounIndexNameInstanceERE.terms());
	set.addAll(WordnetNounIndexNameInstanceERG.terms());
	set.addAll(WordnetNounIndexNameInstanceERI.terms());
	set.addAll(WordnetNounIndexNameInstanceERL.terms());
	set.addAll(WordnetNounIndexNameInstanceERM.terms());
	set.addAll(WordnetNounIndexNameInstanceERN.terms());
	set.addAll(WordnetNounIndexNameInstanceERO.terms());
	set.addAll(WordnetNounIndexNameInstanceERR.terms());
	set.addAll(WordnetNounIndexNameInstanceERS.terms());
	set.addAll(WordnetNounIndexNameInstanceERU.terms());
	set.addAll(WordnetNounIndexNameInstanceERV.terms());
	set.addAll(WordnetNounIndexNameInstanceERW.terms());
	set.addAll(WordnetNounIndexNameInstanceERY.terms());
  		return set; 	} }