package org.swtk.commons.dict.wordnet.indexbyname.controller.z.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.b.WordnetNounIndexNameInstanceZIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.d.WordnetNounIndexNameInstanceZID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.e.WordnetNounIndexNameInstanceZIE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.g.WordnetNounIndexNameInstanceZIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.k.WordnetNounIndexNameInstanceZIK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.l.WordnetNounIndexNameInstanceZIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.m.WordnetNounIndexNameInstanceZIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.n.WordnetNounIndexNameInstanceZIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.o.WordnetNounIndexNameInstanceZIO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.p.WordnetNounIndexNameInstanceZIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.r.WordnetNounIndexNameInstanceZIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.t.WordnetNounIndexNameInstanceZIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.z.WordnetNounIndexNameInstanceZIZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerZI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("zib".equals(key)) return WordnetNounIndexNameInstanceZIB.get(TERM);
	if ("zid".equals(key)) return WordnetNounIndexNameInstanceZID.get(TERM);
	if ("zie".equals(key)) return WordnetNounIndexNameInstanceZIE.get(TERM);
	if ("zig".equals(key)) return WordnetNounIndexNameInstanceZIG.get(TERM);
	if ("zik".equals(key)) return WordnetNounIndexNameInstanceZIK.get(TERM);
	if ("zil".equals(key)) return WordnetNounIndexNameInstanceZIL.get(TERM);
	if ("zim".equals(key)) return WordnetNounIndexNameInstanceZIM.get(TERM);
	if ("zin".equals(key)) return WordnetNounIndexNameInstanceZIN.get(TERM);
	if ("zio".equals(key)) return WordnetNounIndexNameInstanceZIO.get(TERM);
	if ("zip".equals(key)) return WordnetNounIndexNameInstanceZIP.get(TERM);
	if ("zir".equals(key)) return WordnetNounIndexNameInstanceZIR.get(TERM);
	if ("zit".equals(key)) return WordnetNounIndexNameInstanceZIT.get(TERM);
	if ("ziz".equals(key)) return WordnetNounIndexNameInstanceZIZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceZIB.terms());
	set.addAll(WordnetNounIndexNameInstanceZID.terms());
	set.addAll(WordnetNounIndexNameInstanceZIE.terms());
	set.addAll(WordnetNounIndexNameInstanceZIG.terms());
	set.addAll(WordnetNounIndexNameInstanceZIK.terms());
	set.addAll(WordnetNounIndexNameInstanceZIL.terms());
	set.addAll(WordnetNounIndexNameInstanceZIM.terms());
	set.addAll(WordnetNounIndexNameInstanceZIN.terms());
	set.addAll(WordnetNounIndexNameInstanceZIO.terms());
	set.addAll(WordnetNounIndexNameInstanceZIP.terms());
	set.addAll(WordnetNounIndexNameInstanceZIR.terms());
	set.addAll(WordnetNounIndexNameInstanceZIT.terms());
	set.addAll(WordnetNounIndexNameInstanceZIZ.terms());
  		return set; 	} }