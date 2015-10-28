package org.swtk.commons.dict.wordnet.indexbyname.controller.e.c;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.a.WordnetNounIndexNameInstanceECA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.b.WordnetNounIndexNameInstanceECB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.c.WordnetNounIndexNameInstanceECC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.d.WordnetNounIndexNameInstanceECD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.e.WordnetNounIndexNameInstanceECE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.h.WordnetNounIndexNameInstanceECH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.k.WordnetNounIndexNameInstanceECK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.l.WordnetNounIndexNameInstanceECL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.o.WordnetNounIndexNameInstanceECO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.p.WordnetNounIndexNameInstanceECP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.r.WordnetNounIndexNameInstanceECR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.s.WordnetNounIndexNameInstanceECS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.t.WordnetNounIndexNameInstanceECT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.u.WordnetNounIndexNameInstanceECU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.z.WordnetNounIndexNameInstanceECZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEC {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("eca".equals(key)) return WordnetNounIndexNameInstanceECA.get(TERM);
	if ("ecb".equals(key)) return WordnetNounIndexNameInstanceECB.get(TERM);
	if ("ecc".equals(key)) return WordnetNounIndexNameInstanceECC.get(TERM);
	if ("ecd".equals(key)) return WordnetNounIndexNameInstanceECD.get(TERM);
	if ("ece".equals(key)) return WordnetNounIndexNameInstanceECE.get(TERM);
	if ("ech".equals(key)) return WordnetNounIndexNameInstanceECH.get(TERM);
	if ("eck".equals(key)) return WordnetNounIndexNameInstanceECK.get(TERM);
	if ("ecl".equals(key)) return WordnetNounIndexNameInstanceECL.get(TERM);
	if ("eco".equals(key)) return WordnetNounIndexNameInstanceECO.get(TERM);
	if ("ecp".equals(key)) return WordnetNounIndexNameInstanceECP.get(TERM);
	if ("ecr".equals(key)) return WordnetNounIndexNameInstanceECR.get(TERM);
	if ("ecs".equals(key)) return WordnetNounIndexNameInstanceECS.get(TERM);
	if ("ect".equals(key)) return WordnetNounIndexNameInstanceECT.get(TERM);
	if ("ecu".equals(key)) return WordnetNounIndexNameInstanceECU.get(TERM);
	if ("ecz".equals(key)) return WordnetNounIndexNameInstanceECZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceECA.terms());
	set.addAll(WordnetNounIndexNameInstanceECB.terms());
	set.addAll(WordnetNounIndexNameInstanceECC.terms());
	set.addAll(WordnetNounIndexNameInstanceECD.terms());
	set.addAll(WordnetNounIndexNameInstanceECE.terms());
	set.addAll(WordnetNounIndexNameInstanceECH.terms());
	set.addAll(WordnetNounIndexNameInstanceECK.terms());
	set.addAll(WordnetNounIndexNameInstanceECL.terms());
	set.addAll(WordnetNounIndexNameInstanceECO.terms());
	set.addAll(WordnetNounIndexNameInstanceECP.terms());
	set.addAll(WordnetNounIndexNameInstanceECR.terms());
	set.addAll(WordnetNounIndexNameInstanceECS.terms());
	set.addAll(WordnetNounIndexNameInstanceECT.terms());
	set.addAll(WordnetNounIndexNameInstanceECU.terms());
	set.addAll(WordnetNounIndexNameInstanceECZ.terms());
  		return set; 	} }