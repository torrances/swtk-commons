package org.swtk.commons.dict.wordnet.indexbyname.controller.f.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.a.WordnetNounIndexNameInstanceFEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.b.WordnetNounIndexNameInstanceFEB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.c.WordnetNounIndexNameInstanceFEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.d.WordnetNounIndexNameInstanceFED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.e.WordnetNounIndexNameInstanceFEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.i.WordnetNounIndexNameInstanceFEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.l.WordnetNounIndexNameInstanceFEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.m.WordnetNounIndexNameInstanceFEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.n.WordnetNounIndexNameInstanceFEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.o.WordnetNounIndexNameInstanceFEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.r.WordnetNounIndexNameInstanceFER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.s.WordnetNounIndexNameInstanceFES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.t.WordnetNounIndexNameInstanceFET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.u.WordnetNounIndexNameInstanceFEU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.v.WordnetNounIndexNameInstanceFEV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.w.WordnetNounIndexNameInstanceFEW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.y.WordnetNounIndexNameInstanceFEY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerFE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("fea".equals(key)) return WordnetNounIndexNameInstanceFEA.get(TERM);
	if ("feb".equals(key)) return WordnetNounIndexNameInstanceFEB.get(TERM);
	if ("fec".equals(key)) return WordnetNounIndexNameInstanceFEC.get(TERM);
	if ("fed".equals(key)) return WordnetNounIndexNameInstanceFED.get(TERM);
	if ("fee".equals(key)) return WordnetNounIndexNameInstanceFEE.get(TERM);
	if ("fei".equals(key)) return WordnetNounIndexNameInstanceFEI.get(TERM);
	if ("fel".equals(key)) return WordnetNounIndexNameInstanceFEL.get(TERM);
	if ("fem".equals(key)) return WordnetNounIndexNameInstanceFEM.get(TERM);
	if ("fen".equals(key)) return WordnetNounIndexNameInstanceFEN.get(TERM);
	if ("feo".equals(key)) return WordnetNounIndexNameInstanceFEO.get(TERM);
	if ("fer".equals(key)) return WordnetNounIndexNameInstanceFER.get(TERM);
	if ("fes".equals(key)) return WordnetNounIndexNameInstanceFES.get(TERM);
	if ("fet".equals(key)) return WordnetNounIndexNameInstanceFET.get(TERM);
	if ("feu".equals(key)) return WordnetNounIndexNameInstanceFEU.get(TERM);
	if ("fev".equals(key)) return WordnetNounIndexNameInstanceFEV.get(TERM);
	if ("few".equals(key)) return WordnetNounIndexNameInstanceFEW.get(TERM);
	if ("fey".equals(key)) return WordnetNounIndexNameInstanceFEY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceFEA.terms());
	set.addAll(WordnetNounIndexNameInstanceFEB.terms());
	set.addAll(WordnetNounIndexNameInstanceFEC.terms());
	set.addAll(WordnetNounIndexNameInstanceFED.terms());
	set.addAll(WordnetNounIndexNameInstanceFEE.terms());
	set.addAll(WordnetNounIndexNameInstanceFEI.terms());
	set.addAll(WordnetNounIndexNameInstanceFEL.terms());
	set.addAll(WordnetNounIndexNameInstanceFEM.terms());
	set.addAll(WordnetNounIndexNameInstanceFEN.terms());
	set.addAll(WordnetNounIndexNameInstanceFEO.terms());
	set.addAll(WordnetNounIndexNameInstanceFER.terms());
	set.addAll(WordnetNounIndexNameInstanceFES.terms());
	set.addAll(WordnetNounIndexNameInstanceFET.terms());
	set.addAll(WordnetNounIndexNameInstanceFEU.terms());
	set.addAll(WordnetNounIndexNameInstanceFEV.terms());
	set.addAll(WordnetNounIndexNameInstanceFEW.terms());
	set.addAll(WordnetNounIndexNameInstanceFEY.terms());
  		return set; 	} }