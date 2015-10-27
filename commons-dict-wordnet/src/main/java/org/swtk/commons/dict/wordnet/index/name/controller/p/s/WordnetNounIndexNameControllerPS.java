package org.swtk.commons.dict.wordnet.index.name.controller.p.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.a.l.WordnetNounIndexNameInstancePSAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.a.m.WordnetNounIndexNameInstancePSAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.e.n.WordnetNounIndexNameInstancePSEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.e.p.WordnetNounIndexNameInstancePSEP;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.e.t.WordnetNounIndexNameInstancePSET;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.e.u.WordnetNounIndexNameInstancePSEU;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.i.d.WordnetNounIndexNameInstancePSID;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.i.l.WordnetNounIndexNameInstancePSIL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.i.t.WordnetNounIndexNameInstancePSIT;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.o.a.WordnetNounIndexNameInstancePSOA;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.o.c.WordnetNounIndexNameInstancePSOC;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.o.p.WordnetNounIndexNameInstancePSOP;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.o.r.WordnetNounIndexNameInstancePSOR;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.y.c.WordnetNounIndexNameInstancePSYC;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.y.l.WordnetNounIndexNameInstancePSYL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.s.y.o.WordnetNounIndexNameInstancePSYO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("psal".equals(key)) return WordnetNounIndexNameInstancePSAL.get(TERM);
	if ("psam".equals(key)) return WordnetNounIndexNameInstancePSAM.get(TERM);
	if ("psen".equals(key)) return WordnetNounIndexNameInstancePSEN.get(TERM);
	if ("psep".equals(key)) return WordnetNounIndexNameInstancePSEP.get(TERM);
	if ("pset".equals(key)) return WordnetNounIndexNameInstancePSET.get(TERM);
	if ("pseu".equals(key)) return WordnetNounIndexNameInstancePSEU.get(TERM);
	if ("psid".equals(key)) return WordnetNounIndexNameInstancePSID.get(TERM);
	if ("psil".equals(key)) return WordnetNounIndexNameInstancePSIL.get(TERM);
	if ("psit".equals(key)) return WordnetNounIndexNameInstancePSIT.get(TERM);
	if ("psoa".equals(key)) return WordnetNounIndexNameInstancePSOA.get(TERM);
	if ("psoc".equals(key)) return WordnetNounIndexNameInstancePSOC.get(TERM);
	if ("psop".equals(key)) return WordnetNounIndexNameInstancePSOP.get(TERM);
	if ("psor".equals(key)) return WordnetNounIndexNameInstancePSOR.get(TERM);
	if ("psyc".equals(key)) return WordnetNounIndexNameInstancePSYC.get(TERM);
	if ("psyl".equals(key)) return WordnetNounIndexNameInstancePSYL.get(TERM);
	if ("psyo".equals(key)) return WordnetNounIndexNameInstancePSYO.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePSAL.terms());
	set.addAll(WordnetNounIndexNameInstancePSAM.terms());
	set.addAll(WordnetNounIndexNameInstancePSEN.terms());
	set.addAll(WordnetNounIndexNameInstancePSEP.terms());
	set.addAll(WordnetNounIndexNameInstancePSET.terms());
	set.addAll(WordnetNounIndexNameInstancePSEU.terms());
	set.addAll(WordnetNounIndexNameInstancePSID.terms());
	set.addAll(WordnetNounIndexNameInstancePSIL.terms());
	set.addAll(WordnetNounIndexNameInstancePSIT.terms());
	set.addAll(WordnetNounIndexNameInstancePSOA.terms());
	set.addAll(WordnetNounIndexNameInstancePSOC.terms());
	set.addAll(WordnetNounIndexNameInstancePSOP.terms());
	set.addAll(WordnetNounIndexNameInstancePSOR.terms());
	set.addAll(WordnetNounIndexNameInstancePSYC.terms());
	set.addAll(WordnetNounIndexNameInstancePSYL.terms());
	set.addAll(WordnetNounIndexNameInstancePSYO.terms());
  		return set; 	} }