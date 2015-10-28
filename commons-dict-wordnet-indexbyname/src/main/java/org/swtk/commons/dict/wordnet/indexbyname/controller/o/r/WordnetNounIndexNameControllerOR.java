package org.swtk.commons.dict.wordnet.indexbyname.controller.o.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.a.WordnetNounIndexNameInstanceORA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.b.WordnetNounIndexNameInstanceORB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.c.WordnetNounIndexNameInstanceORC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.d.WordnetNounIndexNameInstanceORD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.e.WordnetNounIndexNameInstanceORE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.f.WordnetNounIndexNameInstanceORF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.g.WordnetNounIndexNameInstanceORG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.i.WordnetNounIndexNameInstanceORI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.l.WordnetNounIndexNameInstanceORL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.m.WordnetNounIndexNameInstanceORM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.n.WordnetNounIndexNameInstanceORN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.o.WordnetNounIndexNameInstanceORO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.p.WordnetNounIndexNameInstanceORP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.r.WordnetNounIndexNameInstanceORR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.t.WordnetNounIndexNameInstanceORT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.u.WordnetNounIndexNameInstanceORU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.w.WordnetNounIndexNameInstanceORW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.y.WordnetNounIndexNameInstanceORY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.z.WordnetNounIndexNameInstanceORZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ora".equals(key)) return WordnetNounIndexNameInstanceORA.get(TERM);
	if ("orb".equals(key)) return WordnetNounIndexNameInstanceORB.get(TERM);
	if ("orc".equals(key)) return WordnetNounIndexNameInstanceORC.get(TERM);
	if ("ord".equals(key)) return WordnetNounIndexNameInstanceORD.get(TERM);
	if ("ore".equals(key)) return WordnetNounIndexNameInstanceORE.get(TERM);
	if ("orf".equals(key)) return WordnetNounIndexNameInstanceORF.get(TERM);
	if ("org".equals(key)) return WordnetNounIndexNameInstanceORG.get(TERM);
	if ("ori".equals(key)) return WordnetNounIndexNameInstanceORI.get(TERM);
	if ("orl".equals(key)) return WordnetNounIndexNameInstanceORL.get(TERM);
	if ("orm".equals(key)) return WordnetNounIndexNameInstanceORM.get(TERM);
	if ("orn".equals(key)) return WordnetNounIndexNameInstanceORN.get(TERM);
	if ("oro".equals(key)) return WordnetNounIndexNameInstanceORO.get(TERM);
	if ("orp".equals(key)) return WordnetNounIndexNameInstanceORP.get(TERM);
	if ("orr".equals(key)) return WordnetNounIndexNameInstanceORR.get(TERM);
	if ("ort".equals(key)) return WordnetNounIndexNameInstanceORT.get(TERM);
	if ("oru".equals(key)) return WordnetNounIndexNameInstanceORU.get(TERM);
	if ("orw".equals(key)) return WordnetNounIndexNameInstanceORW.get(TERM);
	if ("ory".equals(key)) return WordnetNounIndexNameInstanceORY.get(TERM);
	if ("orz".equals(key)) return WordnetNounIndexNameInstanceORZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceORA.terms());
	set.addAll(WordnetNounIndexNameInstanceORB.terms());
	set.addAll(WordnetNounIndexNameInstanceORC.terms());
	set.addAll(WordnetNounIndexNameInstanceORD.terms());
	set.addAll(WordnetNounIndexNameInstanceORE.terms());
	set.addAll(WordnetNounIndexNameInstanceORF.terms());
	set.addAll(WordnetNounIndexNameInstanceORG.terms());
	set.addAll(WordnetNounIndexNameInstanceORI.terms());
	set.addAll(WordnetNounIndexNameInstanceORL.terms());
	set.addAll(WordnetNounIndexNameInstanceORM.terms());
	set.addAll(WordnetNounIndexNameInstanceORN.terms());
	set.addAll(WordnetNounIndexNameInstanceORO.terms());
	set.addAll(WordnetNounIndexNameInstanceORP.terms());
	set.addAll(WordnetNounIndexNameInstanceORR.terms());
	set.addAll(WordnetNounIndexNameInstanceORT.terms());
	set.addAll(WordnetNounIndexNameInstanceORU.terms());
	set.addAll(WordnetNounIndexNameInstanceORW.terms());
	set.addAll(WordnetNounIndexNameInstanceORY.terms());
	set.addAll(WordnetNounIndexNameInstanceORZ.terms());
  		return set; 	} }