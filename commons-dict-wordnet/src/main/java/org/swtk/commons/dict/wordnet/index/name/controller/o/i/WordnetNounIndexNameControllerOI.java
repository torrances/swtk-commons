package org.swtk.commons.dict.wordnet.index.name.controller.o.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.b.WordnetNounIndexNameInstanceOILB;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.c.WordnetNounIndexNameInstanceOILC;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.e.WordnetNounIndexNameInstanceOILE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.f.WordnetNounIndexNameInstanceOILF;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.i.WordnetNounIndexNameInstanceOILI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.m.WordnetNounIndexNameInstanceOILM;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.p.WordnetNounIndexNameInstanceOILP;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.r.WordnetNounIndexNameInstanceOILR;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.l.s.WordnetNounIndexNameInstanceOILS;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.n.k.WordnetNounIndexNameInstanceOINK;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.n.t.WordnetNounIndexNameInstanceOINT;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.i.r.e.WordnetNounIndexNameInstanceOIRE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("oilb".equals(key)) return WordnetNounIndexNameInstanceOILB.get(TERM);
	if ("oilc".equals(key)) return WordnetNounIndexNameInstanceOILC.get(TERM);
	if ("oile".equals(key)) return WordnetNounIndexNameInstanceOILE.get(TERM);
	if ("oilf".equals(key)) return WordnetNounIndexNameInstanceOILF.get(TERM);
	if ("oili".equals(key)) return WordnetNounIndexNameInstanceOILI.get(TERM);
	if ("oilm".equals(key)) return WordnetNounIndexNameInstanceOILM.get(TERM);
	if ("oilp".equals(key)) return WordnetNounIndexNameInstanceOILP.get(TERM);
	if ("oilr".equals(key)) return WordnetNounIndexNameInstanceOILR.get(TERM);
	if ("oils".equals(key)) return WordnetNounIndexNameInstanceOILS.get(TERM);
	if ("oink".equals(key)) return WordnetNounIndexNameInstanceOINK.get(TERM);
	if ("oint".equals(key)) return WordnetNounIndexNameInstanceOINT.get(TERM);
	if ("oire".equals(key)) return WordnetNounIndexNameInstanceOIRE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOILB.terms());
	set.addAll(WordnetNounIndexNameInstanceOILC.terms());
	set.addAll(WordnetNounIndexNameInstanceOILE.terms());
	set.addAll(WordnetNounIndexNameInstanceOILF.terms());
	set.addAll(WordnetNounIndexNameInstanceOILI.terms());
	set.addAll(WordnetNounIndexNameInstanceOILM.terms());
	set.addAll(WordnetNounIndexNameInstanceOILP.terms());
	set.addAll(WordnetNounIndexNameInstanceOILR.terms());
	set.addAll(WordnetNounIndexNameInstanceOILS.terms());
	set.addAll(WordnetNounIndexNameInstanceOINK.terms());
	set.addAll(WordnetNounIndexNameInstanceOINT.terms());
	set.addAll(WordnetNounIndexNameInstanceOIRE.terms());
  		return set; 	} }