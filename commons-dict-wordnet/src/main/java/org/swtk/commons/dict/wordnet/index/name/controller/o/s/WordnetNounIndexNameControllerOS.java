package org.swtk.commons.dict.wordnet.index.name.controller.o.s;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.a.g.WordnetNounIndexNameInstanceOSAG;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.a.k.WordnetNounIndexNameInstanceOSAK;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.a.s.WordnetNounIndexNameInstanceOSAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.b.o.WordnetNounIndexNameInstanceOSBO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.c.a.WordnetNounIndexNameInstanceOSCA;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.c.h.WordnetNounIndexNameInstanceOSCH;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.c.i.WordnetNounIndexNameInstanceOSCI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.c.u.WordnetNounIndexNameInstanceOSCU;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.h.a.WordnetNounIndexNameInstanceOSHA;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.i.e.WordnetNounIndexNameInstanceOSIE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.i.r.WordnetNounIndexNameInstanceOSIR;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.l.o.WordnetNounIndexNameInstanceOSLO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.m.a.WordnetNounIndexNameInstanceOSMA;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.m.e.WordnetNounIndexNameInstanceOSME;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.m.i.WordnetNounIndexNameInstanceOSMI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.m.o.WordnetNounIndexNameInstanceOSMO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.m.u.WordnetNounIndexNameInstanceOSMU;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.p.r.WordnetNounIndexNameInstanceOSPR;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.s.e.WordnetNounIndexNameInstanceOSSE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.s.i.WordnetNounIndexNameInstanceOSSI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.s.u.WordnetNounIndexNameInstanceOSSU;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.a.WordnetNounIndexNameInstanceOSTA;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.e.WordnetNounIndexNameInstanceOSTE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.i.WordnetNounIndexNameInstanceOSTI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.l.WordnetNounIndexNameInstanceOSTL;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.o.WordnetNounIndexNameInstanceOSTO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.r.WordnetNounIndexNameInstanceOSTR;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.w.WordnetNounIndexNameInstanceOSTW;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.y.WordnetNounIndexNameInstanceOSTY;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.s.w.a.WordnetNounIndexNameInstanceOSWA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("osag".equals(key)) return WordnetNounIndexNameInstanceOSAG.get(TERM);
	if ("osak".equals(key)) return WordnetNounIndexNameInstanceOSAK.get(TERM);
	if ("osas".equals(key)) return WordnetNounIndexNameInstanceOSAS.get(TERM);
	if ("osbo".equals(key)) return WordnetNounIndexNameInstanceOSBO.get(TERM);
	if ("osca".equals(key)) return WordnetNounIndexNameInstanceOSCA.get(TERM);
	if ("osch".equals(key)) return WordnetNounIndexNameInstanceOSCH.get(TERM);
	if ("osci".equals(key)) return WordnetNounIndexNameInstanceOSCI.get(TERM);
	if ("oscu".equals(key)) return WordnetNounIndexNameInstanceOSCU.get(TERM);
	if ("osha".equals(key)) return WordnetNounIndexNameInstanceOSHA.get(TERM);
	if ("osie".equals(key)) return WordnetNounIndexNameInstanceOSIE.get(TERM);
	if ("osir".equals(key)) return WordnetNounIndexNameInstanceOSIR.get(TERM);
	if ("oslo".equals(key)) return WordnetNounIndexNameInstanceOSLO.get(TERM);
	if ("osma".equals(key)) return WordnetNounIndexNameInstanceOSMA.get(TERM);
	if ("osme".equals(key)) return WordnetNounIndexNameInstanceOSME.get(TERM);
	if ("osmi".equals(key)) return WordnetNounIndexNameInstanceOSMI.get(TERM);
	if ("osmo".equals(key)) return WordnetNounIndexNameInstanceOSMO.get(TERM);
	if ("osmu".equals(key)) return WordnetNounIndexNameInstanceOSMU.get(TERM);
	if ("ospr".equals(key)) return WordnetNounIndexNameInstanceOSPR.get(TERM);
	if ("osse".equals(key)) return WordnetNounIndexNameInstanceOSSE.get(TERM);
	if ("ossi".equals(key)) return WordnetNounIndexNameInstanceOSSI.get(TERM);
	if ("ossu".equals(key)) return WordnetNounIndexNameInstanceOSSU.get(TERM);
	if ("osta".equals(key)) return WordnetNounIndexNameInstanceOSTA.get(TERM);
	if ("oste".equals(key)) return WordnetNounIndexNameInstanceOSTE.get(TERM);
	if ("osti".equals(key)) return WordnetNounIndexNameInstanceOSTI.get(TERM);
	if ("ostl".equals(key)) return WordnetNounIndexNameInstanceOSTL.get(TERM);
	if ("osto".equals(key)) return WordnetNounIndexNameInstanceOSTO.get(TERM);
	if ("ostr".equals(key)) return WordnetNounIndexNameInstanceOSTR.get(TERM);
	if ("ostw".equals(key)) return WordnetNounIndexNameInstanceOSTW.get(TERM);
	if ("osty".equals(key)) return WordnetNounIndexNameInstanceOSTY.get(TERM);
	if ("oswa".equals(key)) return WordnetNounIndexNameInstanceOSWA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOSAG.terms());
	set.addAll(WordnetNounIndexNameInstanceOSAK.terms());
	set.addAll(WordnetNounIndexNameInstanceOSAS.terms());
	set.addAll(WordnetNounIndexNameInstanceOSBO.terms());
	set.addAll(WordnetNounIndexNameInstanceOSCA.terms());
	set.addAll(WordnetNounIndexNameInstanceOSCH.terms());
	set.addAll(WordnetNounIndexNameInstanceOSCI.terms());
	set.addAll(WordnetNounIndexNameInstanceOSCU.terms());
	set.addAll(WordnetNounIndexNameInstanceOSHA.terms());
	set.addAll(WordnetNounIndexNameInstanceOSIE.terms());
	set.addAll(WordnetNounIndexNameInstanceOSIR.terms());
	set.addAll(WordnetNounIndexNameInstanceOSLO.terms());
	set.addAll(WordnetNounIndexNameInstanceOSMA.terms());
	set.addAll(WordnetNounIndexNameInstanceOSME.terms());
	set.addAll(WordnetNounIndexNameInstanceOSMI.terms());
	set.addAll(WordnetNounIndexNameInstanceOSMO.terms());
	set.addAll(WordnetNounIndexNameInstanceOSMU.terms());
	set.addAll(WordnetNounIndexNameInstanceOSPR.terms());
	set.addAll(WordnetNounIndexNameInstanceOSSE.terms());
	set.addAll(WordnetNounIndexNameInstanceOSSI.terms());
	set.addAll(WordnetNounIndexNameInstanceOSSU.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTA.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTE.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTI.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTL.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTO.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTR.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTW.terms());
	set.addAll(WordnetNounIndexNameInstanceOSTY.terms());
	set.addAll(WordnetNounIndexNameInstanceOSWA.terms());
  		return set; 	} }