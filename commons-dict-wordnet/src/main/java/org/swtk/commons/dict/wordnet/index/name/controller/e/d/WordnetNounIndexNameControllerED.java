package org.swtk.commons.dict.wordnet.index.name.controller.e.d;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.a.c.WordnetNounIndexNameInstanceEDAC;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.a.m.WordnetNounIndexNameInstanceEDAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.a.p.WordnetNounIndexNameInstanceEDAP;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.d.a.WordnetNounIndexNameInstanceEDDA;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.d.i.WordnetNounIndexNameInstanceEDDI;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.d.o.WordnetNounIndexNameInstanceEDDO;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.d.y.WordnetNounIndexNameInstanceEDDY;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.e.c.WordnetNounIndexNameInstanceEDEC;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.e.l.WordnetNounIndexNameInstanceEDEL;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.e.m.WordnetNounIndexNameInstanceEDEM;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.e.n.WordnetNounIndexNameInstanceEDEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.e.r.WordnetNounIndexNameInstanceEDER;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.g.a.WordnetNounIndexNameInstanceEDGA;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.g.e.WordnetNounIndexNameInstanceEDGE;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.g.i.WordnetNounIndexNameInstanceEDGI;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.i.b.WordnetNounIndexNameInstanceEDIB;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.i.c.WordnetNounIndexNameInstanceEDIC;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.i.f.WordnetNounIndexNameInstanceEDIF;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.i.n.WordnetNounIndexNameInstanceEDIN;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.i.r.WordnetNounIndexNameInstanceEDIR;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.i.s.WordnetNounIndexNameInstanceEDIS;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.i.t.WordnetNounIndexNameInstanceEDIT;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.m.o.WordnetNounIndexNameInstanceEDMO;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.r.o.WordnetNounIndexNameInstanceEDRO;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.t.a.WordnetNounIndexNameInstanceEDTA;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.u.c.WordnetNounIndexNameInstanceEDUC;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.u.t.WordnetNounIndexNameInstanceEDUT;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.w.a.WordnetNounIndexNameInstanceEDWA;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.w.i.WordnetNounIndexNameInstanceEDWI;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.d.w.y.WordnetNounIndexNameInstanceEDWY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerED {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("edac".equals(key)) return WordnetNounIndexNameInstanceEDAC.get(TERM);
	if ("edam".equals(key)) return WordnetNounIndexNameInstanceEDAM.get(TERM);
	if ("edap".equals(key)) return WordnetNounIndexNameInstanceEDAP.get(TERM);
	if ("edda".equals(key)) return WordnetNounIndexNameInstanceEDDA.get(TERM);
	if ("eddi".equals(key)) return WordnetNounIndexNameInstanceEDDI.get(TERM);
	if ("eddo".equals(key)) return WordnetNounIndexNameInstanceEDDO.get(TERM);
	if ("eddy".equals(key)) return WordnetNounIndexNameInstanceEDDY.get(TERM);
	if ("edec".equals(key)) return WordnetNounIndexNameInstanceEDEC.get(TERM);
	if ("edel".equals(key)) return WordnetNounIndexNameInstanceEDEL.get(TERM);
	if ("edem".equals(key)) return WordnetNounIndexNameInstanceEDEM.get(TERM);
	if ("eden".equals(key)) return WordnetNounIndexNameInstanceEDEN.get(TERM);
	if ("eder".equals(key)) return WordnetNounIndexNameInstanceEDER.get(TERM);
	if ("edga".equals(key)) return WordnetNounIndexNameInstanceEDGA.get(TERM);
	if ("edge".equals(key)) return WordnetNounIndexNameInstanceEDGE.get(TERM);
	if ("edgi".equals(key)) return WordnetNounIndexNameInstanceEDGI.get(TERM);
	if ("edib".equals(key)) return WordnetNounIndexNameInstanceEDIB.get(TERM);
	if ("edic".equals(key)) return WordnetNounIndexNameInstanceEDIC.get(TERM);
	if ("edif".equals(key)) return WordnetNounIndexNameInstanceEDIF.get(TERM);
	if ("edin".equals(key)) return WordnetNounIndexNameInstanceEDIN.get(TERM);
	if ("edir".equals(key)) return WordnetNounIndexNameInstanceEDIR.get(TERM);
	if ("edis".equals(key)) return WordnetNounIndexNameInstanceEDIS.get(TERM);
	if ("edit".equals(key)) return WordnetNounIndexNameInstanceEDIT.get(TERM);
	if ("edmo".equals(key)) return WordnetNounIndexNameInstanceEDMO.get(TERM);
	if ("edro".equals(key)) return WordnetNounIndexNameInstanceEDRO.get(TERM);
	if ("edta".equals(key)) return WordnetNounIndexNameInstanceEDTA.get(TERM);
	if ("educ".equals(key)) return WordnetNounIndexNameInstanceEDUC.get(TERM);
	if ("edut".equals(key)) return WordnetNounIndexNameInstanceEDUT.get(TERM);
	if ("edwa".equals(key)) return WordnetNounIndexNameInstanceEDWA.get(TERM);
	if ("edwi".equals(key)) return WordnetNounIndexNameInstanceEDWI.get(TERM);
	if ("edwy".equals(key)) return WordnetNounIndexNameInstanceEDWY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEDAC.terms());
	set.addAll(WordnetNounIndexNameInstanceEDAM.terms());
	set.addAll(WordnetNounIndexNameInstanceEDAP.terms());
	set.addAll(WordnetNounIndexNameInstanceEDDA.terms());
	set.addAll(WordnetNounIndexNameInstanceEDDI.terms());
	set.addAll(WordnetNounIndexNameInstanceEDDO.terms());
	set.addAll(WordnetNounIndexNameInstanceEDDY.terms());
	set.addAll(WordnetNounIndexNameInstanceEDEC.terms());
	set.addAll(WordnetNounIndexNameInstanceEDEL.terms());
	set.addAll(WordnetNounIndexNameInstanceEDEM.terms());
	set.addAll(WordnetNounIndexNameInstanceEDEN.terms());
	set.addAll(WordnetNounIndexNameInstanceEDER.terms());
	set.addAll(WordnetNounIndexNameInstanceEDGA.terms());
	set.addAll(WordnetNounIndexNameInstanceEDGE.terms());
	set.addAll(WordnetNounIndexNameInstanceEDGI.terms());
	set.addAll(WordnetNounIndexNameInstanceEDIB.terms());
	set.addAll(WordnetNounIndexNameInstanceEDIC.terms());
	set.addAll(WordnetNounIndexNameInstanceEDIF.terms());
	set.addAll(WordnetNounIndexNameInstanceEDIN.terms());
	set.addAll(WordnetNounIndexNameInstanceEDIR.terms());
	set.addAll(WordnetNounIndexNameInstanceEDIS.terms());
	set.addAll(WordnetNounIndexNameInstanceEDIT.terms());
	set.addAll(WordnetNounIndexNameInstanceEDMO.terms());
	set.addAll(WordnetNounIndexNameInstanceEDRO.terms());
	set.addAll(WordnetNounIndexNameInstanceEDTA.terms());
	set.addAll(WordnetNounIndexNameInstanceEDUC.terms());
	set.addAll(WordnetNounIndexNameInstanceEDUT.terms());
	set.addAll(WordnetNounIndexNameInstanceEDWA.terms());
	set.addAll(WordnetNounIndexNameInstanceEDWI.terms());
	set.addAll(WordnetNounIndexNameInstanceEDWY.terms());
  		return set; 	} }