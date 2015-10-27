package org.swtk.commons.dict.wordnet.index.name.controller.g.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.a.c.WordnetNounIndexNameInstanceGIAC;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.a.n.WordnetNounIndexNameInstanceGIAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.a.r.WordnetNounIndexNameInstanceGIAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.b.b.WordnetNounIndexNameInstanceGIBB;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.b.e.WordnetNounIndexNameInstanceGIBE;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.b.i.WordnetNounIndexNameInstanceGIBI;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.b.l.WordnetNounIndexNameInstanceGIBL;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.b.r.WordnetNounIndexNameInstanceGIBR;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.b.s.WordnetNounIndexNameInstanceGIBS;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.d.a.WordnetNounIndexNameInstanceGIDA;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.d.d.WordnetNounIndexNameInstanceGIDD;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.d.e.WordnetNounIndexNameInstanceGIDE;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.d.g.WordnetNounIndexNameInstanceGIDG;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.e.l.WordnetNounIndexNameInstanceGIEL;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.f.t.WordnetNounIndexNameInstanceGIFT;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.g.a.WordnetNounIndexNameInstanceGIGA;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.g.g.WordnetNounIndexNameInstanceGIGG;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.g.o.WordnetNounIndexNameInstanceGIGO;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.g.u.WordnetNounIndexNameInstanceGIGU;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.k.u.WordnetNounIndexNameInstanceGIKU;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.l.a.WordnetNounIndexNameInstanceGILA;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.l.b.WordnetNounIndexNameInstanceGILB;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.l.d.WordnetNounIndexNameInstanceGILD;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.l.g.WordnetNounIndexNameInstanceGILG;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.l.l.WordnetNounIndexNameInstanceGILL;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.l.m.WordnetNounIndexNameInstanceGILM;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.l.t.WordnetNounIndexNameInstanceGILT;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.m.b.WordnetNounIndexNameInstanceGIMB;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.m.c.WordnetNounIndexNameInstanceGIMC;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.m.e.WordnetNounIndexNameInstanceGIME;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.m.l.WordnetNounIndexNameInstanceGIML;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.m.m.WordnetNounIndexNameInstanceGIMM;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.m.p.WordnetNounIndexNameInstanceGIMP;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.n.e.WordnetNounIndexNameInstanceGINE;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.n.g.WordnetNounIndexNameInstanceGING;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.n.k.WordnetNounIndexNameInstanceGINK;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.n.m.WordnetNounIndexNameInstanceGINM;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.n.s.WordnetNounIndexNameInstanceGINS;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.n.z.WordnetNounIndexNameInstanceGINZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.o.t.WordnetNounIndexNameInstanceGIOT;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.p.s.WordnetNounIndexNameInstanceGIPS;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.a.WordnetNounIndexNameInstanceGIRA;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.d.WordnetNounIndexNameInstanceGIRD;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.i.WordnetNounIndexNameInstanceGIRI;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.l.WordnetNounIndexNameInstanceGIRL;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.o.WordnetNounIndexNameInstanceGIRO;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.r.WordnetNounIndexNameInstanceGIRR;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.t.WordnetNounIndexNameInstanceGIRT;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.s.h.WordnetNounIndexNameInstanceGISH;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.s.m.WordnetNounIndexNameInstanceGISM;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.s.t.WordnetNounIndexNameInstanceGIST;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.t.a.WordnetNounIndexNameInstanceGITA;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.t.t.WordnetNounIndexNameInstanceGITT;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.v.e.WordnetNounIndexNameInstanceGIVE;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.v.i.WordnetNounIndexNameInstanceGIVI;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.z.a.WordnetNounIndexNameInstanceGIZA;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.z.e.WordnetNounIndexNameInstanceGIZE;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.z.m.WordnetNounIndexNameInstanceGIZM;
	import org.swtk.commons.dict.wordnet.index.name.instance.g.i.z.z.WordnetNounIndexNameInstanceGIZZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerGI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("giac".equals(key)) return WordnetNounIndexNameInstanceGIAC.get(TERM);
	if ("gian".equals(key)) return WordnetNounIndexNameInstanceGIAN.get(TERM);
	if ("giar".equals(key)) return WordnetNounIndexNameInstanceGIAR.get(TERM);
	if ("gibb".equals(key)) return WordnetNounIndexNameInstanceGIBB.get(TERM);
	if ("gibe".equals(key)) return WordnetNounIndexNameInstanceGIBE.get(TERM);
	if ("gibi".equals(key)) return WordnetNounIndexNameInstanceGIBI.get(TERM);
	if ("gibl".equals(key)) return WordnetNounIndexNameInstanceGIBL.get(TERM);
	if ("gibr".equals(key)) return WordnetNounIndexNameInstanceGIBR.get(TERM);
	if ("gibs".equals(key)) return WordnetNounIndexNameInstanceGIBS.get(TERM);
	if ("gida".equals(key)) return WordnetNounIndexNameInstanceGIDA.get(TERM);
	if ("gidd".equals(key)) return WordnetNounIndexNameInstanceGIDD.get(TERM);
	if ("gide".equals(key)) return WordnetNounIndexNameInstanceGIDE.get(TERM);
	if ("gidg".equals(key)) return WordnetNounIndexNameInstanceGIDG.get(TERM);
	if ("giel".equals(key)) return WordnetNounIndexNameInstanceGIEL.get(TERM);
	if ("gift".equals(key)) return WordnetNounIndexNameInstanceGIFT.get(TERM);
	if ("giga".equals(key)) return WordnetNounIndexNameInstanceGIGA.get(TERM);
	if ("gigg".equals(key)) return WordnetNounIndexNameInstanceGIGG.get(TERM);
	if ("gigo".equals(key)) return WordnetNounIndexNameInstanceGIGO.get(TERM);
	if ("gigu".equals(key)) return WordnetNounIndexNameInstanceGIGU.get(TERM);
	if ("giku".equals(key)) return WordnetNounIndexNameInstanceGIKU.get(TERM);
	if ("gila".equals(key)) return WordnetNounIndexNameInstanceGILA.get(TERM);
	if ("gilb".equals(key)) return WordnetNounIndexNameInstanceGILB.get(TERM);
	if ("gild".equals(key)) return WordnetNounIndexNameInstanceGILD.get(TERM);
	if ("gilg".equals(key)) return WordnetNounIndexNameInstanceGILG.get(TERM);
	if ("gill".equals(key)) return WordnetNounIndexNameInstanceGILL.get(TERM);
	if ("gilm".equals(key)) return WordnetNounIndexNameInstanceGILM.get(TERM);
	if ("gilt".equals(key)) return WordnetNounIndexNameInstanceGILT.get(TERM);
	if ("gimb".equals(key)) return WordnetNounIndexNameInstanceGIMB.get(TERM);
	if ("gimc".equals(key)) return WordnetNounIndexNameInstanceGIMC.get(TERM);
	if ("gime".equals(key)) return WordnetNounIndexNameInstanceGIME.get(TERM);
	if ("giml".equals(key)) return WordnetNounIndexNameInstanceGIML.get(TERM);
	if ("gimm".equals(key)) return WordnetNounIndexNameInstanceGIMM.get(TERM);
	if ("gimp".equals(key)) return WordnetNounIndexNameInstanceGIMP.get(TERM);
	if ("gine".equals(key)) return WordnetNounIndexNameInstanceGINE.get(TERM);
	if ("ging".equals(key)) return WordnetNounIndexNameInstanceGING.get(TERM);
	if ("gink".equals(key)) return WordnetNounIndexNameInstanceGINK.get(TERM);
	if ("ginm".equals(key)) return WordnetNounIndexNameInstanceGINM.get(TERM);
	if ("gins".equals(key)) return WordnetNounIndexNameInstanceGINS.get(TERM);
	if ("ginz".equals(key)) return WordnetNounIndexNameInstanceGINZ.get(TERM);
	if ("giot".equals(key)) return WordnetNounIndexNameInstanceGIOT.get(TERM);
	if ("gips".equals(key)) return WordnetNounIndexNameInstanceGIPS.get(TERM);
	if ("gira".equals(key)) return WordnetNounIndexNameInstanceGIRA.get(TERM);
	if ("gird".equals(key)) return WordnetNounIndexNameInstanceGIRD.get(TERM);
	if ("giri".equals(key)) return WordnetNounIndexNameInstanceGIRI.get(TERM);
	if ("girl".equals(key)) return WordnetNounIndexNameInstanceGIRL.get(TERM);
	if ("giro".equals(key)) return WordnetNounIndexNameInstanceGIRO.get(TERM);
	if ("girr".equals(key)) return WordnetNounIndexNameInstanceGIRR.get(TERM);
	if ("girt".equals(key)) return WordnetNounIndexNameInstanceGIRT.get(TERM);
	if ("gish".equals(key)) return WordnetNounIndexNameInstanceGISH.get(TERM);
	if ("gism".equals(key)) return WordnetNounIndexNameInstanceGISM.get(TERM);
	if ("gist".equals(key)) return WordnetNounIndexNameInstanceGIST.get(TERM);
	if ("gita".equals(key)) return WordnetNounIndexNameInstanceGITA.get(TERM);
	if ("gitt".equals(key)) return WordnetNounIndexNameInstanceGITT.get(TERM);
	if ("give".equals(key)) return WordnetNounIndexNameInstanceGIVE.get(TERM);
	if ("givi".equals(key)) return WordnetNounIndexNameInstanceGIVI.get(TERM);
	if ("giza".equals(key)) return WordnetNounIndexNameInstanceGIZA.get(TERM);
	if ("gize".equals(key)) return WordnetNounIndexNameInstanceGIZE.get(TERM);
	if ("gizm".equals(key)) return WordnetNounIndexNameInstanceGIZM.get(TERM);
	if ("gizz".equals(key)) return WordnetNounIndexNameInstanceGIZZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceGIAC.terms());
	set.addAll(WordnetNounIndexNameInstanceGIAN.terms());
	set.addAll(WordnetNounIndexNameInstanceGIAR.terms());
	set.addAll(WordnetNounIndexNameInstanceGIBB.terms());
	set.addAll(WordnetNounIndexNameInstanceGIBE.terms());
	set.addAll(WordnetNounIndexNameInstanceGIBI.terms());
	set.addAll(WordnetNounIndexNameInstanceGIBL.terms());
	set.addAll(WordnetNounIndexNameInstanceGIBR.terms());
	set.addAll(WordnetNounIndexNameInstanceGIBS.terms());
	set.addAll(WordnetNounIndexNameInstanceGIDA.terms());
	set.addAll(WordnetNounIndexNameInstanceGIDD.terms());
	set.addAll(WordnetNounIndexNameInstanceGIDE.terms());
	set.addAll(WordnetNounIndexNameInstanceGIDG.terms());
	set.addAll(WordnetNounIndexNameInstanceGIEL.terms());
	set.addAll(WordnetNounIndexNameInstanceGIFT.terms());
	set.addAll(WordnetNounIndexNameInstanceGIGA.terms());
	set.addAll(WordnetNounIndexNameInstanceGIGG.terms());
	set.addAll(WordnetNounIndexNameInstanceGIGO.terms());
	set.addAll(WordnetNounIndexNameInstanceGIGU.terms());
	set.addAll(WordnetNounIndexNameInstanceGIKU.terms());
	set.addAll(WordnetNounIndexNameInstanceGILA.terms());
	set.addAll(WordnetNounIndexNameInstanceGILB.terms());
	set.addAll(WordnetNounIndexNameInstanceGILD.terms());
	set.addAll(WordnetNounIndexNameInstanceGILG.terms());
	set.addAll(WordnetNounIndexNameInstanceGILL.terms());
	set.addAll(WordnetNounIndexNameInstanceGILM.terms());
	set.addAll(WordnetNounIndexNameInstanceGILT.terms());
	set.addAll(WordnetNounIndexNameInstanceGIMB.terms());
	set.addAll(WordnetNounIndexNameInstanceGIMC.terms());
	set.addAll(WordnetNounIndexNameInstanceGIME.terms());
	set.addAll(WordnetNounIndexNameInstanceGIML.terms());
	set.addAll(WordnetNounIndexNameInstanceGIMM.terms());
	set.addAll(WordnetNounIndexNameInstanceGIMP.terms());
	set.addAll(WordnetNounIndexNameInstanceGINE.terms());
	set.addAll(WordnetNounIndexNameInstanceGING.terms());
	set.addAll(WordnetNounIndexNameInstanceGINK.terms());
	set.addAll(WordnetNounIndexNameInstanceGINM.terms());
	set.addAll(WordnetNounIndexNameInstanceGINS.terms());
	set.addAll(WordnetNounIndexNameInstanceGINZ.terms());
	set.addAll(WordnetNounIndexNameInstanceGIOT.terms());
	set.addAll(WordnetNounIndexNameInstanceGIPS.terms());
	set.addAll(WordnetNounIndexNameInstanceGIRA.terms());
	set.addAll(WordnetNounIndexNameInstanceGIRD.terms());
	set.addAll(WordnetNounIndexNameInstanceGIRI.terms());
	set.addAll(WordnetNounIndexNameInstanceGIRL.terms());
	set.addAll(WordnetNounIndexNameInstanceGIRO.terms());
	set.addAll(WordnetNounIndexNameInstanceGIRR.terms());
	set.addAll(WordnetNounIndexNameInstanceGIRT.terms());
	set.addAll(WordnetNounIndexNameInstanceGISH.terms());
	set.addAll(WordnetNounIndexNameInstanceGISM.terms());
	set.addAll(WordnetNounIndexNameInstanceGIST.terms());
	set.addAll(WordnetNounIndexNameInstanceGITA.terms());
	set.addAll(WordnetNounIndexNameInstanceGITT.terms());
	set.addAll(WordnetNounIndexNameInstanceGIVE.terms());
	set.addAll(WordnetNounIndexNameInstanceGIVI.terms());
	set.addAll(WordnetNounIndexNameInstanceGIZA.terms());
	set.addAll(WordnetNounIndexNameInstanceGIZE.terms());
	set.addAll(WordnetNounIndexNameInstanceGIZM.terms());
	set.addAll(WordnetNounIndexNameInstanceGIZZ.terms());
  		return set; 	} }