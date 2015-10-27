package org.swtk.commons.dict.wordnet.index.name.controller.p.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.c.WordnetNounIndexNameInstancePRAC;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.e.WordnetNounIndexNameInstancePRAE;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.g.WordnetNounIndexNameInstancePRAG;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.h.WordnetNounIndexNameInstancePRAH;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.i.WordnetNounIndexNameInstancePRAI;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.j.WordnetNounIndexNameInstancePRAJ;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.k.WordnetNounIndexNameInstancePRAK;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.l.WordnetNounIndexNameInstancePRAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.m.WordnetNounIndexNameInstancePRAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.n.WordnetNounIndexNameInstancePRAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.s.WordnetNounIndexNameInstancePRAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.t.WordnetNounIndexNameInstancePRAT;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.u.WordnetNounIndexNameInstancePRAU;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.v.WordnetNounIndexNameInstancePRAV;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.w.WordnetNounIndexNameInstancePRAW;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.x.WordnetNounIndexNameInstancePRAX;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.y.WordnetNounIndexNameInstancePRAY;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.a.z.WordnetNounIndexNameInstancePRAZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.a.WordnetNounIndexNameInstancePREA;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.b.WordnetNounIndexNameInstancePREB;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.c.WordnetNounIndexNameInstancePREC;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.d.WordnetNounIndexNameInstancePRED;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.e.WordnetNounIndexNameInstancePREE;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.f.WordnetNounIndexNameInstancePREF;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.g.WordnetNounIndexNameInstancePREG;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.h.WordnetNounIndexNameInstancePREH;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.i.WordnetNounIndexNameInstancePREI;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.j.WordnetNounIndexNameInstancePREJ;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.l.WordnetNounIndexNameInstancePREL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.m.WordnetNounIndexNameInstancePREM;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.n.WordnetNounIndexNameInstancePREN;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.o.WordnetNounIndexNameInstancePREO;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.p.WordnetNounIndexNameInstancePREP;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.r.WordnetNounIndexNameInstancePRER;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.s.WordnetNounIndexNameInstancePRES;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.t.WordnetNounIndexNameInstancePRET;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.u.WordnetNounIndexNameInstancePREU;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.v.WordnetNounIndexNameInstancePREV;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.x.WordnetNounIndexNameInstancePREX;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.y.WordnetNounIndexNameInstancePREY;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.a.WordnetNounIndexNameInstancePRIA;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.c.WordnetNounIndexNameInstancePRIC;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.d.WordnetNounIndexNameInstancePRID;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.e.WordnetNounIndexNameInstancePRIE;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.g.WordnetNounIndexNameInstancePRIG;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.l.WordnetNounIndexNameInstancePRIL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.m.WordnetNounIndexNameInstancePRIM;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.n.WordnetNounIndexNameInstancePRIN;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.o.WordnetNounIndexNameInstancePRIO;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.s.WordnetNounIndexNameInstancePRIS;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.t.WordnetNounIndexNameInstancePRIT;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.v.WordnetNounIndexNameInstancePRIV;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.z.WordnetNounIndexNameInstancePRIZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.a.WordnetNounIndexNameInstancePROA;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.b.WordnetNounIndexNameInstancePROB;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.c.WordnetNounIndexNameInstancePROC;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.d.WordnetNounIndexNameInstancePROD;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.e.WordnetNounIndexNameInstancePROE;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.f.WordnetNounIndexNameInstancePROF;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.g.WordnetNounIndexNameInstancePROG;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.h.WordnetNounIndexNameInstancePROH;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.j.WordnetNounIndexNameInstancePROJ;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.k.WordnetNounIndexNameInstancePROK;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.l.WordnetNounIndexNameInstancePROL;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.m.WordnetNounIndexNameInstancePROM;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.n.WordnetNounIndexNameInstancePRON;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.o.WordnetNounIndexNameInstancePROO;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.p.WordnetNounIndexNameInstancePROP;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.r.WordnetNounIndexNameInstancePROR;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.s.WordnetNounIndexNameInstancePROS;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.t.WordnetNounIndexNameInstancePROT;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.u.WordnetNounIndexNameInstancePROU;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.v.WordnetNounIndexNameInstancePROV;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.w.WordnetNounIndexNameInstancePROW;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.x.WordnetNounIndexNameInstancePROX;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.z.WordnetNounIndexNameInstancePROZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.u.d.WordnetNounIndexNameInstancePRUD;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.u.m.WordnetNounIndexNameInstancePRUM;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.u.n.WordnetNounIndexNameInstancePRUN;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.u.r.WordnetNounIndexNameInstancePRUR;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.u.s.WordnetNounIndexNameInstancePRUS;
	import org.swtk.commons.dict.wordnet.index.name.instance.p.r.y.i.WordnetNounIndexNameInstancePRYI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("prac".equals(key)) return WordnetNounIndexNameInstancePRAC.get(TERM);
	if ("prae".equals(key)) return WordnetNounIndexNameInstancePRAE.get(TERM);
	if ("prag".equals(key)) return WordnetNounIndexNameInstancePRAG.get(TERM);
	if ("prah".equals(key)) return WordnetNounIndexNameInstancePRAH.get(TERM);
	if ("prai".equals(key)) return WordnetNounIndexNameInstancePRAI.get(TERM);
	if ("praj".equals(key)) return WordnetNounIndexNameInstancePRAJ.get(TERM);
	if ("prak".equals(key)) return WordnetNounIndexNameInstancePRAK.get(TERM);
	if ("pral".equals(key)) return WordnetNounIndexNameInstancePRAL.get(TERM);
	if ("pram".equals(key)) return WordnetNounIndexNameInstancePRAM.get(TERM);
	if ("pran".equals(key)) return WordnetNounIndexNameInstancePRAN.get(TERM);
	if ("pras".equals(key)) return WordnetNounIndexNameInstancePRAS.get(TERM);
	if ("prat".equals(key)) return WordnetNounIndexNameInstancePRAT.get(TERM);
	if ("prau".equals(key)) return WordnetNounIndexNameInstancePRAU.get(TERM);
	if ("prav".equals(key)) return WordnetNounIndexNameInstancePRAV.get(TERM);
	if ("praw".equals(key)) return WordnetNounIndexNameInstancePRAW.get(TERM);
	if ("prax".equals(key)) return WordnetNounIndexNameInstancePRAX.get(TERM);
	if ("pray".equals(key)) return WordnetNounIndexNameInstancePRAY.get(TERM);
	if ("praz".equals(key)) return WordnetNounIndexNameInstancePRAZ.get(TERM);
	if ("prea".equals(key)) return WordnetNounIndexNameInstancePREA.get(TERM);
	if ("preb".equals(key)) return WordnetNounIndexNameInstancePREB.get(TERM);
	if ("prec".equals(key)) return WordnetNounIndexNameInstancePREC.get(TERM);
	if ("pred".equals(key)) return WordnetNounIndexNameInstancePRED.get(TERM);
	if ("pree".equals(key)) return WordnetNounIndexNameInstancePREE.get(TERM);
	if ("pref".equals(key)) return WordnetNounIndexNameInstancePREF.get(TERM);
	if ("preg".equals(key)) return WordnetNounIndexNameInstancePREG.get(TERM);
	if ("preh".equals(key)) return WordnetNounIndexNameInstancePREH.get(TERM);
	if ("prei".equals(key)) return WordnetNounIndexNameInstancePREI.get(TERM);
	if ("prej".equals(key)) return WordnetNounIndexNameInstancePREJ.get(TERM);
	if ("prel".equals(key)) return WordnetNounIndexNameInstancePREL.get(TERM);
	if ("prem".equals(key)) return WordnetNounIndexNameInstancePREM.get(TERM);
	if ("pren".equals(key)) return WordnetNounIndexNameInstancePREN.get(TERM);
	if ("preo".equals(key)) return WordnetNounIndexNameInstancePREO.get(TERM);
	if ("prep".equals(key)) return WordnetNounIndexNameInstancePREP.get(TERM);
	if ("prer".equals(key)) return WordnetNounIndexNameInstancePRER.get(TERM);
	if ("pres".equals(key)) return WordnetNounIndexNameInstancePRES.get(TERM);
	if ("pret".equals(key)) return WordnetNounIndexNameInstancePRET.get(TERM);
	if ("preu".equals(key)) return WordnetNounIndexNameInstancePREU.get(TERM);
	if ("prev".equals(key)) return WordnetNounIndexNameInstancePREV.get(TERM);
	if ("prex".equals(key)) return WordnetNounIndexNameInstancePREX.get(TERM);
	if ("prey".equals(key)) return WordnetNounIndexNameInstancePREY.get(TERM);
	if ("pria".equals(key)) return WordnetNounIndexNameInstancePRIA.get(TERM);
	if ("pric".equals(key)) return WordnetNounIndexNameInstancePRIC.get(TERM);
	if ("prid".equals(key)) return WordnetNounIndexNameInstancePRID.get(TERM);
	if ("prie".equals(key)) return WordnetNounIndexNameInstancePRIE.get(TERM);
	if ("prig".equals(key)) return WordnetNounIndexNameInstancePRIG.get(TERM);
	if ("pril".equals(key)) return WordnetNounIndexNameInstancePRIL.get(TERM);
	if ("prim".equals(key)) return WordnetNounIndexNameInstancePRIM.get(TERM);
	if ("prin".equals(key)) return WordnetNounIndexNameInstancePRIN.get(TERM);
	if ("prio".equals(key)) return WordnetNounIndexNameInstancePRIO.get(TERM);
	if ("pris".equals(key)) return WordnetNounIndexNameInstancePRIS.get(TERM);
	if ("prit".equals(key)) return WordnetNounIndexNameInstancePRIT.get(TERM);
	if ("priv".equals(key)) return WordnetNounIndexNameInstancePRIV.get(TERM);
	if ("priz".equals(key)) return WordnetNounIndexNameInstancePRIZ.get(TERM);
	if ("proa".equals(key)) return WordnetNounIndexNameInstancePROA.get(TERM);
	if ("prob".equals(key)) return WordnetNounIndexNameInstancePROB.get(TERM);
	if ("proc".equals(key)) return WordnetNounIndexNameInstancePROC.get(TERM);
	if ("prod".equals(key)) return WordnetNounIndexNameInstancePROD.get(TERM);
	if ("proe".equals(key)) return WordnetNounIndexNameInstancePROE.get(TERM);
	if ("prof".equals(key)) return WordnetNounIndexNameInstancePROF.get(TERM);
	if ("prog".equals(key)) return WordnetNounIndexNameInstancePROG.get(TERM);
	if ("proh".equals(key)) return WordnetNounIndexNameInstancePROH.get(TERM);
	if ("proj".equals(key)) return WordnetNounIndexNameInstancePROJ.get(TERM);
	if ("prok".equals(key)) return WordnetNounIndexNameInstancePROK.get(TERM);
	if ("prol".equals(key)) return WordnetNounIndexNameInstancePROL.get(TERM);
	if ("prom".equals(key)) return WordnetNounIndexNameInstancePROM.get(TERM);
	if ("pron".equals(key)) return WordnetNounIndexNameInstancePRON.get(TERM);
	if ("proo".equals(key)) return WordnetNounIndexNameInstancePROO.get(TERM);
	if ("prop".equals(key)) return WordnetNounIndexNameInstancePROP.get(TERM);
	if ("pror".equals(key)) return WordnetNounIndexNameInstancePROR.get(TERM);
	if ("pros".equals(key)) return WordnetNounIndexNameInstancePROS.get(TERM);
	if ("prot".equals(key)) return WordnetNounIndexNameInstancePROT.get(TERM);
	if ("prou".equals(key)) return WordnetNounIndexNameInstancePROU.get(TERM);
	if ("prov".equals(key)) return WordnetNounIndexNameInstancePROV.get(TERM);
	if ("prow".equals(key)) return WordnetNounIndexNameInstancePROW.get(TERM);
	if ("prox".equals(key)) return WordnetNounIndexNameInstancePROX.get(TERM);
	if ("proz".equals(key)) return WordnetNounIndexNameInstancePROZ.get(TERM);
	if ("prud".equals(key)) return WordnetNounIndexNameInstancePRUD.get(TERM);
	if ("prum".equals(key)) return WordnetNounIndexNameInstancePRUM.get(TERM);
	if ("prun".equals(key)) return WordnetNounIndexNameInstancePRUN.get(TERM);
	if ("prur".equals(key)) return WordnetNounIndexNameInstancePRUR.get(TERM);
	if ("prus".equals(key)) return WordnetNounIndexNameInstancePRUS.get(TERM);
	if ("pryi".equals(key)) return WordnetNounIndexNameInstancePRYI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePRAC.terms());
	set.addAll(WordnetNounIndexNameInstancePRAE.terms());
	set.addAll(WordnetNounIndexNameInstancePRAG.terms());
	set.addAll(WordnetNounIndexNameInstancePRAH.terms());
	set.addAll(WordnetNounIndexNameInstancePRAI.terms());
	set.addAll(WordnetNounIndexNameInstancePRAJ.terms());
	set.addAll(WordnetNounIndexNameInstancePRAK.terms());
	set.addAll(WordnetNounIndexNameInstancePRAL.terms());
	set.addAll(WordnetNounIndexNameInstancePRAM.terms());
	set.addAll(WordnetNounIndexNameInstancePRAN.terms());
	set.addAll(WordnetNounIndexNameInstancePRAS.terms());
	set.addAll(WordnetNounIndexNameInstancePRAT.terms());
	set.addAll(WordnetNounIndexNameInstancePRAU.terms());
	set.addAll(WordnetNounIndexNameInstancePRAV.terms());
	set.addAll(WordnetNounIndexNameInstancePRAW.terms());
	set.addAll(WordnetNounIndexNameInstancePRAX.terms());
	set.addAll(WordnetNounIndexNameInstancePRAY.terms());
	set.addAll(WordnetNounIndexNameInstancePRAZ.terms());
	set.addAll(WordnetNounIndexNameInstancePREA.terms());
	set.addAll(WordnetNounIndexNameInstancePREB.terms());
	set.addAll(WordnetNounIndexNameInstancePREC.terms());
	set.addAll(WordnetNounIndexNameInstancePRED.terms());
	set.addAll(WordnetNounIndexNameInstancePREE.terms());
	set.addAll(WordnetNounIndexNameInstancePREF.terms());
	set.addAll(WordnetNounIndexNameInstancePREG.terms());
	set.addAll(WordnetNounIndexNameInstancePREH.terms());
	set.addAll(WordnetNounIndexNameInstancePREI.terms());
	set.addAll(WordnetNounIndexNameInstancePREJ.terms());
	set.addAll(WordnetNounIndexNameInstancePREL.terms());
	set.addAll(WordnetNounIndexNameInstancePREM.terms());
	set.addAll(WordnetNounIndexNameInstancePREN.terms());
	set.addAll(WordnetNounIndexNameInstancePREO.terms());
	set.addAll(WordnetNounIndexNameInstancePREP.terms());
	set.addAll(WordnetNounIndexNameInstancePRER.terms());
	set.addAll(WordnetNounIndexNameInstancePRES.terms());
	set.addAll(WordnetNounIndexNameInstancePRET.terms());
	set.addAll(WordnetNounIndexNameInstancePREU.terms());
	set.addAll(WordnetNounIndexNameInstancePREV.terms());
	set.addAll(WordnetNounIndexNameInstancePREX.terms());
	set.addAll(WordnetNounIndexNameInstancePREY.terms());
	set.addAll(WordnetNounIndexNameInstancePRIA.terms());
	set.addAll(WordnetNounIndexNameInstancePRIC.terms());
	set.addAll(WordnetNounIndexNameInstancePRID.terms());
	set.addAll(WordnetNounIndexNameInstancePRIE.terms());
	set.addAll(WordnetNounIndexNameInstancePRIG.terms());
	set.addAll(WordnetNounIndexNameInstancePRIL.terms());
	set.addAll(WordnetNounIndexNameInstancePRIM.terms());
	set.addAll(WordnetNounIndexNameInstancePRIN.terms());
	set.addAll(WordnetNounIndexNameInstancePRIO.terms());
	set.addAll(WordnetNounIndexNameInstancePRIS.terms());
	set.addAll(WordnetNounIndexNameInstancePRIT.terms());
	set.addAll(WordnetNounIndexNameInstancePRIV.terms());
	set.addAll(WordnetNounIndexNameInstancePRIZ.terms());
	set.addAll(WordnetNounIndexNameInstancePROA.terms());
	set.addAll(WordnetNounIndexNameInstancePROB.terms());
	set.addAll(WordnetNounIndexNameInstancePROC.terms());
	set.addAll(WordnetNounIndexNameInstancePROD.terms());
	set.addAll(WordnetNounIndexNameInstancePROE.terms());
	set.addAll(WordnetNounIndexNameInstancePROF.terms());
	set.addAll(WordnetNounIndexNameInstancePROG.terms());
	set.addAll(WordnetNounIndexNameInstancePROH.terms());
	set.addAll(WordnetNounIndexNameInstancePROJ.terms());
	set.addAll(WordnetNounIndexNameInstancePROK.terms());
	set.addAll(WordnetNounIndexNameInstancePROL.terms());
	set.addAll(WordnetNounIndexNameInstancePROM.terms());
	set.addAll(WordnetNounIndexNameInstancePRON.terms());
	set.addAll(WordnetNounIndexNameInstancePROO.terms());
	set.addAll(WordnetNounIndexNameInstancePROP.terms());
	set.addAll(WordnetNounIndexNameInstancePROR.terms());
	set.addAll(WordnetNounIndexNameInstancePROS.terms());
	set.addAll(WordnetNounIndexNameInstancePROT.terms());
	set.addAll(WordnetNounIndexNameInstancePROU.terms());
	set.addAll(WordnetNounIndexNameInstancePROV.terms());
	set.addAll(WordnetNounIndexNameInstancePROW.terms());
	set.addAll(WordnetNounIndexNameInstancePROX.terms());
	set.addAll(WordnetNounIndexNameInstancePROZ.terms());
	set.addAll(WordnetNounIndexNameInstancePRUD.terms());
	set.addAll(WordnetNounIndexNameInstancePRUM.terms());
	set.addAll(WordnetNounIndexNameInstancePRUN.terms());
	set.addAll(WordnetNounIndexNameInstancePRUR.terms());
	set.addAll(WordnetNounIndexNameInstancePRUS.terms());
	set.addAll(WordnetNounIndexNameInstancePRYI.terms());
  		return set; 	} }