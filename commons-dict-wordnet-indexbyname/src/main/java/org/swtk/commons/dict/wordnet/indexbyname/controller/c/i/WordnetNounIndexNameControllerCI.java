package org.swtk.commons.dict.wordnet.indexbyname.controller.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.a.WordnetNounIndexNameInstanceCIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.b.WordnetNounIndexNameInstanceCIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.c.WordnetNounIndexNameInstanceCIC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.d.WordnetNounIndexNameInstanceCID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.g.WordnetNounIndexNameInstanceCIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.l.WordnetNounIndexNameInstanceCIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.m.WordnetNounIndexNameInstanceCIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.n.WordnetNounIndexNameInstanceCIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.p.WordnetNounIndexNameInstanceCIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.r.WordnetNounIndexNameInstanceCIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.s.WordnetNounIndexNameInstanceCIS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.t.WordnetNounIndexNameInstanceCIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.v.WordnetNounIndexNameInstanceCIV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("cia".equals(key)) return WordnetNounIndexNameInstanceCIA.get(TERM);
	if ("cib".equals(key)) return WordnetNounIndexNameInstanceCIB.get(TERM);
	if ("cic".equals(key)) return WordnetNounIndexNameInstanceCIC.get(TERM);
	if ("cid".equals(key)) return WordnetNounIndexNameInstanceCID.get(TERM);
	if ("cig".equals(key)) return WordnetNounIndexNameInstanceCIG.get(TERM);
	if ("cil".equals(key)) return WordnetNounIndexNameInstanceCIL.get(TERM);
	if ("cim".equals(key)) return WordnetNounIndexNameInstanceCIM.get(TERM);
	if ("cin".equals(key)) return WordnetNounIndexNameInstanceCIN.get(TERM);
	if ("cip".equals(key)) return WordnetNounIndexNameInstanceCIP.get(TERM);
	if ("cir".equals(key)) return WordnetNounIndexNameInstanceCIR.get(TERM);
	if ("cis".equals(key)) return WordnetNounIndexNameInstanceCIS.get(TERM);
	if ("cit".equals(key)) return WordnetNounIndexNameInstanceCIT.get(TERM);
	if ("civ".equals(key)) return WordnetNounIndexNameInstanceCIV.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCIA.terms());
	set.addAll(WordnetNounIndexNameInstanceCIB.terms());
	set.addAll(WordnetNounIndexNameInstanceCIC.terms());
	set.addAll(WordnetNounIndexNameInstanceCID.terms());
	set.addAll(WordnetNounIndexNameInstanceCIG.terms());
	set.addAll(WordnetNounIndexNameInstanceCIL.terms());
	set.addAll(WordnetNounIndexNameInstanceCIM.terms());
	set.addAll(WordnetNounIndexNameInstanceCIN.terms());
	set.addAll(WordnetNounIndexNameInstanceCIP.terms());
	set.addAll(WordnetNounIndexNameInstanceCIR.terms());
	set.addAll(WordnetNounIndexNameInstanceCIS.terms());
	set.addAll(WordnetNounIndexNameInstanceCIT.terms());
	set.addAll(WordnetNounIndexNameInstanceCIV.terms());
  		return set; 	} }