package org.swtk.commons.dict.wordnet.index.name.controller.f.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.a.l.WordnetNounIndexNameInstanceFEAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.a.r.WordnetNounIndexNameInstanceFEAR;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.a.s.WordnetNounIndexNameInstanceFEAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.a.t.WordnetNounIndexNameInstanceFEAT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.b.r.WordnetNounIndexNameInstanceFEBR;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.c.a.WordnetNounIndexNameInstanceFECA;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.c.e.WordnetNounIndexNameInstanceFECE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.c.h.WordnetNounIndexNameInstanceFECH;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.c.k.WordnetNounIndexNameInstanceFECK;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.c.u.WordnetNounIndexNameInstanceFECU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.d.a.WordnetNounIndexNameInstanceFEDA;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.d.e.WordnetNounIndexNameInstanceFEDE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.d.o.WordnetNounIndexNameInstanceFEDO;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.e.b.WordnetNounIndexNameInstanceFEEB;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.e.d.WordnetNounIndexNameInstanceFEED;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.e.l.WordnetNounIndexNameInstanceFEEL;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.i.f.WordnetNounIndexNameInstanceFEIF;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.i.g.WordnetNounIndexNameInstanceFEIG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.i.j.WordnetNounIndexNameInstanceFEIJ;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.i.n.WordnetNounIndexNameInstanceFEIN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.i.s.WordnetNounIndexNameInstanceFEIS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.a.WordnetNounIndexNameInstanceFELA;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.d.WordnetNounIndexNameInstanceFELD;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.i.WordnetNounIndexNameInstanceFELI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.l.WordnetNounIndexNameInstanceFELL;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.o.WordnetNounIndexNameInstanceFELO;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.s.WordnetNounIndexNameInstanceFELS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.t.WordnetNounIndexNameInstanceFELT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.u.WordnetNounIndexNameInstanceFELU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.w.WordnetNounIndexNameInstanceFELW;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.m.a.WordnetNounIndexNameInstanceFEMA;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.m.i.WordnetNounIndexNameInstanceFEMI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.m.o.WordnetNounIndexNameInstanceFEMO;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.m.t.WordnetNounIndexNameInstanceFEMT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.m.u.WordnetNounIndexNameInstanceFEMU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.c.WordnetNounIndexNameInstanceFENC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.d.WordnetNounIndexNameInstanceFEND;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.e.WordnetNounIndexNameInstanceFENE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.g.WordnetNounIndexNameInstanceFENG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.l.WordnetNounIndexNameInstanceFENL;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.n.WordnetNounIndexNameInstanceFENN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.o.WordnetNounIndexNameInstanceFENO;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.r.WordnetNounIndexNameInstanceFENR;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.t.WordnetNounIndexNameInstanceFENT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.u.WordnetNounIndexNameInstanceFENU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.o.f.WordnetNounIndexNameInstanceFEOF;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.o.s.WordnetNounIndexNameInstanceFEOS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.b.WordnetNounIndexNameInstanceFERB;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.d.WordnetNounIndexNameInstanceFERD;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.g.WordnetNounIndexNameInstanceFERG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.i.WordnetNounIndexNameInstanceFERI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.m.WordnetNounIndexNameInstanceFERM;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.n.WordnetNounIndexNameInstanceFERN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.o.WordnetNounIndexNameInstanceFERO;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.r.WordnetNounIndexNameInstanceFERR;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.t.WordnetNounIndexNameInstanceFERT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.u.WordnetNounIndexNameInstanceFERU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.v.WordnetNounIndexNameInstanceFERV;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.s.c.WordnetNounIndexNameInstanceFESC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.s.s.WordnetNounIndexNameInstanceFESS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.s.t.WordnetNounIndexNameInstanceFEST;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.t.c.WordnetNounIndexNameInstanceFETC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.t.e.WordnetNounIndexNameInstanceFETE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.t.i.WordnetNounIndexNameInstanceFETI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.t.l.WordnetNounIndexNameInstanceFETL;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.t.o.WordnetNounIndexNameInstanceFETO;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.t.t.WordnetNounIndexNameInstanceFETT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.t.u.WordnetNounIndexNameInstanceFETU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.u.d.WordnetNounIndexNameInstanceFEUD;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.v.e.WordnetNounIndexNameInstanceFEVE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.w.n.WordnetNounIndexNameInstanceFEWN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.e.y.n.WordnetNounIndexNameInstanceFEYN;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerFE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("feal".equals(key)) return WordnetNounIndexNameInstanceFEAL.get(TERM);
	if ("fear".equals(key)) return WordnetNounIndexNameInstanceFEAR.get(TERM);
	if ("feas".equals(key)) return WordnetNounIndexNameInstanceFEAS.get(TERM);
	if ("feat".equals(key)) return WordnetNounIndexNameInstanceFEAT.get(TERM);
	if ("febr".equals(key)) return WordnetNounIndexNameInstanceFEBR.get(TERM);
	if ("feca".equals(key)) return WordnetNounIndexNameInstanceFECA.get(TERM);
	if ("fece".equals(key)) return WordnetNounIndexNameInstanceFECE.get(TERM);
	if ("fech".equals(key)) return WordnetNounIndexNameInstanceFECH.get(TERM);
	if ("feck".equals(key)) return WordnetNounIndexNameInstanceFECK.get(TERM);
	if ("fecu".equals(key)) return WordnetNounIndexNameInstanceFECU.get(TERM);
	if ("feda".equals(key)) return WordnetNounIndexNameInstanceFEDA.get(TERM);
	if ("fede".equals(key)) return WordnetNounIndexNameInstanceFEDE.get(TERM);
	if ("fedo".equals(key)) return WordnetNounIndexNameInstanceFEDO.get(TERM);
	if ("feeb".equals(key)) return WordnetNounIndexNameInstanceFEEB.get(TERM);
	if ("feed".equals(key)) return WordnetNounIndexNameInstanceFEED.get(TERM);
	if ("feel".equals(key)) return WordnetNounIndexNameInstanceFEEL.get(TERM);
	if ("feif".equals(key)) return WordnetNounIndexNameInstanceFEIF.get(TERM);
	if ("feig".equals(key)) return WordnetNounIndexNameInstanceFEIG.get(TERM);
	if ("feij".equals(key)) return WordnetNounIndexNameInstanceFEIJ.get(TERM);
	if ("fein".equals(key)) return WordnetNounIndexNameInstanceFEIN.get(TERM);
	if ("feis".equals(key)) return WordnetNounIndexNameInstanceFEIS.get(TERM);
	if ("fela".equals(key)) return WordnetNounIndexNameInstanceFELA.get(TERM);
	if ("feld".equals(key)) return WordnetNounIndexNameInstanceFELD.get(TERM);
	if ("feli".equals(key)) return WordnetNounIndexNameInstanceFELI.get(TERM);
	if ("fell".equals(key)) return WordnetNounIndexNameInstanceFELL.get(TERM);
	if ("felo".equals(key)) return WordnetNounIndexNameInstanceFELO.get(TERM);
	if ("fels".equals(key)) return WordnetNounIndexNameInstanceFELS.get(TERM);
	if ("felt".equals(key)) return WordnetNounIndexNameInstanceFELT.get(TERM);
	if ("felu".equals(key)) return WordnetNounIndexNameInstanceFELU.get(TERM);
	if ("felw".equals(key)) return WordnetNounIndexNameInstanceFELW.get(TERM);
	if ("fema".equals(key)) return WordnetNounIndexNameInstanceFEMA.get(TERM);
	if ("femi".equals(key)) return WordnetNounIndexNameInstanceFEMI.get(TERM);
	if ("femo".equals(key)) return WordnetNounIndexNameInstanceFEMO.get(TERM);
	if ("femt".equals(key)) return WordnetNounIndexNameInstanceFEMT.get(TERM);
	if ("femu".equals(key)) return WordnetNounIndexNameInstanceFEMU.get(TERM);
	if ("fenc".equals(key)) return WordnetNounIndexNameInstanceFENC.get(TERM);
	if ("fend".equals(key)) return WordnetNounIndexNameInstanceFEND.get(TERM);
	if ("fene".equals(key)) return WordnetNounIndexNameInstanceFENE.get(TERM);
	if ("feng".equals(key)) return WordnetNounIndexNameInstanceFENG.get(TERM);
	if ("fenl".equals(key)) return WordnetNounIndexNameInstanceFENL.get(TERM);
	if ("fenn".equals(key)) return WordnetNounIndexNameInstanceFENN.get(TERM);
	if ("feno".equals(key)) return WordnetNounIndexNameInstanceFENO.get(TERM);
	if ("fenr".equals(key)) return WordnetNounIndexNameInstanceFENR.get(TERM);
	if ("fent".equals(key)) return WordnetNounIndexNameInstanceFENT.get(TERM);
	if ("fenu".equals(key)) return WordnetNounIndexNameInstanceFENU.get(TERM);
	if ("feof".equals(key)) return WordnetNounIndexNameInstanceFEOF.get(TERM);
	if ("feos".equals(key)) return WordnetNounIndexNameInstanceFEOS.get(TERM);
	if ("ferb".equals(key)) return WordnetNounIndexNameInstanceFERB.get(TERM);
	if ("ferd".equals(key)) return WordnetNounIndexNameInstanceFERD.get(TERM);
	if ("ferg".equals(key)) return WordnetNounIndexNameInstanceFERG.get(TERM);
	if ("feri".equals(key)) return WordnetNounIndexNameInstanceFERI.get(TERM);
	if ("ferm".equals(key)) return WordnetNounIndexNameInstanceFERM.get(TERM);
	if ("fern".equals(key)) return WordnetNounIndexNameInstanceFERN.get(TERM);
	if ("fero".equals(key)) return WordnetNounIndexNameInstanceFERO.get(TERM);
	if ("ferr".equals(key)) return WordnetNounIndexNameInstanceFERR.get(TERM);
	if ("fert".equals(key)) return WordnetNounIndexNameInstanceFERT.get(TERM);
	if ("feru".equals(key)) return WordnetNounIndexNameInstanceFERU.get(TERM);
	if ("ferv".equals(key)) return WordnetNounIndexNameInstanceFERV.get(TERM);
	if ("fesc".equals(key)) return WordnetNounIndexNameInstanceFESC.get(TERM);
	if ("fess".equals(key)) return WordnetNounIndexNameInstanceFESS.get(TERM);
	if ("fest".equals(key)) return WordnetNounIndexNameInstanceFEST.get(TERM);
	if ("fetc".equals(key)) return WordnetNounIndexNameInstanceFETC.get(TERM);
	if ("fete".equals(key)) return WordnetNounIndexNameInstanceFETE.get(TERM);
	if ("feti".equals(key)) return WordnetNounIndexNameInstanceFETI.get(TERM);
	if ("fetl".equals(key)) return WordnetNounIndexNameInstanceFETL.get(TERM);
	if ("feto".equals(key)) return WordnetNounIndexNameInstanceFETO.get(TERM);
	if ("fett".equals(key)) return WordnetNounIndexNameInstanceFETT.get(TERM);
	if ("fetu".equals(key)) return WordnetNounIndexNameInstanceFETU.get(TERM);
	if ("feud".equals(key)) return WordnetNounIndexNameInstanceFEUD.get(TERM);
	if ("feve".equals(key)) return WordnetNounIndexNameInstanceFEVE.get(TERM);
	if ("fewn".equals(key)) return WordnetNounIndexNameInstanceFEWN.get(TERM);
	if ("feyn".equals(key)) return WordnetNounIndexNameInstanceFEYN.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceFEAL.terms());
	set.addAll(WordnetNounIndexNameInstanceFEAR.terms());
	set.addAll(WordnetNounIndexNameInstanceFEAS.terms());
	set.addAll(WordnetNounIndexNameInstanceFEAT.terms());
	set.addAll(WordnetNounIndexNameInstanceFEBR.terms());
	set.addAll(WordnetNounIndexNameInstanceFECA.terms());
	set.addAll(WordnetNounIndexNameInstanceFECE.terms());
	set.addAll(WordnetNounIndexNameInstanceFECH.terms());
	set.addAll(WordnetNounIndexNameInstanceFECK.terms());
	set.addAll(WordnetNounIndexNameInstanceFECU.terms());
	set.addAll(WordnetNounIndexNameInstanceFEDA.terms());
	set.addAll(WordnetNounIndexNameInstanceFEDE.terms());
	set.addAll(WordnetNounIndexNameInstanceFEDO.terms());
	set.addAll(WordnetNounIndexNameInstanceFEEB.terms());
	set.addAll(WordnetNounIndexNameInstanceFEED.terms());
	set.addAll(WordnetNounIndexNameInstanceFEEL.terms());
	set.addAll(WordnetNounIndexNameInstanceFEIF.terms());
	set.addAll(WordnetNounIndexNameInstanceFEIG.terms());
	set.addAll(WordnetNounIndexNameInstanceFEIJ.terms());
	set.addAll(WordnetNounIndexNameInstanceFEIN.terms());
	set.addAll(WordnetNounIndexNameInstanceFEIS.terms());
	set.addAll(WordnetNounIndexNameInstanceFELA.terms());
	set.addAll(WordnetNounIndexNameInstanceFELD.terms());
	set.addAll(WordnetNounIndexNameInstanceFELI.terms());
	set.addAll(WordnetNounIndexNameInstanceFELL.terms());
	set.addAll(WordnetNounIndexNameInstanceFELO.terms());
	set.addAll(WordnetNounIndexNameInstanceFELS.terms());
	set.addAll(WordnetNounIndexNameInstanceFELT.terms());
	set.addAll(WordnetNounIndexNameInstanceFELU.terms());
	set.addAll(WordnetNounIndexNameInstanceFELW.terms());
	set.addAll(WordnetNounIndexNameInstanceFEMA.terms());
	set.addAll(WordnetNounIndexNameInstanceFEMI.terms());
	set.addAll(WordnetNounIndexNameInstanceFEMO.terms());
	set.addAll(WordnetNounIndexNameInstanceFEMT.terms());
	set.addAll(WordnetNounIndexNameInstanceFEMU.terms());
	set.addAll(WordnetNounIndexNameInstanceFENC.terms());
	set.addAll(WordnetNounIndexNameInstanceFEND.terms());
	set.addAll(WordnetNounIndexNameInstanceFENE.terms());
	set.addAll(WordnetNounIndexNameInstanceFENG.terms());
	set.addAll(WordnetNounIndexNameInstanceFENL.terms());
	set.addAll(WordnetNounIndexNameInstanceFENN.terms());
	set.addAll(WordnetNounIndexNameInstanceFENO.terms());
	set.addAll(WordnetNounIndexNameInstanceFENR.terms());
	set.addAll(WordnetNounIndexNameInstanceFENT.terms());
	set.addAll(WordnetNounIndexNameInstanceFENU.terms());
	set.addAll(WordnetNounIndexNameInstanceFEOF.terms());
	set.addAll(WordnetNounIndexNameInstanceFEOS.terms());
	set.addAll(WordnetNounIndexNameInstanceFERB.terms());
	set.addAll(WordnetNounIndexNameInstanceFERD.terms());
	set.addAll(WordnetNounIndexNameInstanceFERG.terms());
	set.addAll(WordnetNounIndexNameInstanceFERI.terms());
	set.addAll(WordnetNounIndexNameInstanceFERM.terms());
	set.addAll(WordnetNounIndexNameInstanceFERN.terms());
	set.addAll(WordnetNounIndexNameInstanceFERO.terms());
	set.addAll(WordnetNounIndexNameInstanceFERR.terms());
	set.addAll(WordnetNounIndexNameInstanceFERT.terms());
	set.addAll(WordnetNounIndexNameInstanceFERU.terms());
	set.addAll(WordnetNounIndexNameInstanceFERV.terms());
	set.addAll(WordnetNounIndexNameInstanceFESC.terms());
	set.addAll(WordnetNounIndexNameInstanceFESS.terms());
	set.addAll(WordnetNounIndexNameInstanceFEST.terms());
	set.addAll(WordnetNounIndexNameInstanceFETC.terms());
	set.addAll(WordnetNounIndexNameInstanceFETE.terms());
	set.addAll(WordnetNounIndexNameInstanceFETI.terms());
	set.addAll(WordnetNounIndexNameInstanceFETL.terms());
	set.addAll(WordnetNounIndexNameInstanceFETO.terms());
	set.addAll(WordnetNounIndexNameInstanceFETT.terms());
	set.addAll(WordnetNounIndexNameInstanceFETU.terms());
	set.addAll(WordnetNounIndexNameInstanceFEUD.terms());
	set.addAll(WordnetNounIndexNameInstanceFEVE.terms());
	set.addAll(WordnetNounIndexNameInstanceFEWN.terms());
	set.addAll(WordnetNounIndexNameInstanceFEYN.terms());
  		return set; 	} }