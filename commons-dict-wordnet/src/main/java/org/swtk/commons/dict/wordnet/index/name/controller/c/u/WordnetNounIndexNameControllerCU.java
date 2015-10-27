package org.swtk.commons.dict.wordnet.index.name.controller.c.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.b.a.WordnetNounIndexNameInstanceCUBA;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.b.b.WordnetNounIndexNameInstanceCUBB;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.b.e.WordnetNounIndexNameInstanceCUBE;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.b.i.WordnetNounIndexNameInstanceCUBI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.b.o.WordnetNounIndexNameInstanceCUBO;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.c.k.WordnetNounIndexNameInstanceCUCK;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.c.u.WordnetNounIndexNameInstanceCUCU;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.d.b.WordnetNounIndexNameInstanceCUDB;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.d.d.WordnetNounIndexNameInstanceCUDD;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.d.g.WordnetNounIndexNameInstanceCUDG;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.d.w.WordnetNounIndexNameInstanceCUDW;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.f.f.WordnetNounIndexNameInstanceCUFF;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.i.r.WordnetNounIndexNameInstanceCUIR;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.i.s.WordnetNounIndexNameInstanceCUIS;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.k.e.WordnetNounIndexNameInstanceCUKE;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.b.WordnetNounIndexNameInstanceCULB;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.c.WordnetNounIndexNameInstanceCULC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.d.WordnetNounIndexNameInstanceCULD;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.e.WordnetNounIndexNameInstanceCULE;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.i.WordnetNounIndexNameInstanceCULI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.l.WordnetNounIndexNameInstanceCULL;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.m.WordnetNounIndexNameInstanceCULM;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.o.WordnetNounIndexNameInstanceCULO;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.p.WordnetNounIndexNameInstanceCULP;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.t.WordnetNounIndexNameInstanceCULT;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.v.WordnetNounIndexNameInstanceCULV;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.m.a.WordnetNounIndexNameInstanceCUMA;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.m.b.WordnetNounIndexNameInstanceCUMB;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.m.f.WordnetNounIndexNameInstanceCUMF;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.m.i.WordnetNounIndexNameInstanceCUMI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.m.m.WordnetNounIndexNameInstanceCUMM;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.m.q.WordnetNounIndexNameInstanceCUMQ;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.m.u.WordnetNounIndexNameInstanceCUMU;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.n.a.WordnetNounIndexNameInstanceCUNA;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.n.c.WordnetNounIndexNameInstanceCUNC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.n.e.WordnetNounIndexNameInstanceCUNE;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.n.i.WordnetNounIndexNameInstanceCUNI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.n.n.WordnetNounIndexNameInstanceCUNN;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.n.o.WordnetNounIndexNameInstanceCUNO;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.n.t.WordnetNounIndexNameInstanceCUNT;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.o.n.WordnetNounIndexNameInstanceCUON;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.b.WordnetNounIndexNameInstanceCUPB;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.c.WordnetNounIndexNameInstanceCUPC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.e.WordnetNounIndexNameInstanceCUPE;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.f.WordnetNounIndexNameInstanceCUPF;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.i.WordnetNounIndexNameInstanceCUPI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.o.WordnetNounIndexNameInstanceCUPO;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.p.WordnetNounIndexNameInstanceCUPP;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.r.WordnetNounIndexNameInstanceCUPR;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.p.u.WordnetNounIndexNameInstanceCUPU;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.q.u.WordnetNounIndexNameInstanceCUQU;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.a.WordnetNounIndexNameInstanceCURA;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.b.WordnetNounIndexNameInstanceCURB;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.c.WordnetNounIndexNameInstanceCURC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.d.WordnetNounIndexNameInstanceCURD;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.e.WordnetNounIndexNameInstanceCURE;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.f.WordnetNounIndexNameInstanceCURF;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.i.WordnetNounIndexNameInstanceCURI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.l.WordnetNounIndexNameInstanceCURL;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.m.WordnetNounIndexNameInstanceCURM;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.r.WordnetNounIndexNameInstanceCURR;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.s.WordnetNounIndexNameInstanceCURS;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.t.WordnetNounIndexNameInstanceCURT;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.v.WordnetNounIndexNameInstanceCURV;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.s.c.WordnetNounIndexNameInstanceCUSC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.s.h.WordnetNounIndexNameInstanceCUSH;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.s.k.WordnetNounIndexNameInstanceCUSK;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.s.p.WordnetNounIndexNameInstanceCUSP;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.s.s.WordnetNounIndexNameInstanceCUSS;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.s.t.WordnetNounIndexNameInstanceCUST;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.a.WordnetNounIndexNameInstanceCUTA;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.b.WordnetNounIndexNameInstanceCUTB;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.c.WordnetNounIndexNameInstanceCUTC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.e.WordnetNounIndexNameInstanceCUTE;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.i.WordnetNounIndexNameInstanceCUTI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.l.WordnetNounIndexNameInstanceCUTL;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.o.WordnetNounIndexNameInstanceCUTO;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.p.WordnetNounIndexNameInstanceCUTP;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.t.WordnetNounIndexNameInstanceCUTT;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.w.WordnetNounIndexNameInstanceCUTW;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.v.i.WordnetNounIndexNameInstanceCUVI;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.u.z.c.WordnetNounIndexNameInstanceCUZC;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("cuba".equals(key)) return WordnetNounIndexNameInstanceCUBA.get(TERM);
	if ("cubb".equals(key)) return WordnetNounIndexNameInstanceCUBB.get(TERM);
	if ("cube".equals(key)) return WordnetNounIndexNameInstanceCUBE.get(TERM);
	if ("cubi".equals(key)) return WordnetNounIndexNameInstanceCUBI.get(TERM);
	if ("cubo".equals(key)) return WordnetNounIndexNameInstanceCUBO.get(TERM);
	if ("cuck".equals(key)) return WordnetNounIndexNameInstanceCUCK.get(TERM);
	if ("cucu".equals(key)) return WordnetNounIndexNameInstanceCUCU.get(TERM);
	if ("cudb".equals(key)) return WordnetNounIndexNameInstanceCUDB.get(TERM);
	if ("cudd".equals(key)) return WordnetNounIndexNameInstanceCUDD.get(TERM);
	if ("cudg".equals(key)) return WordnetNounIndexNameInstanceCUDG.get(TERM);
	if ("cudw".equals(key)) return WordnetNounIndexNameInstanceCUDW.get(TERM);
	if ("cuff".equals(key)) return WordnetNounIndexNameInstanceCUFF.get(TERM);
	if ("cuir".equals(key)) return WordnetNounIndexNameInstanceCUIR.get(TERM);
	if ("cuis".equals(key)) return WordnetNounIndexNameInstanceCUIS.get(TERM);
	if ("cuke".equals(key)) return WordnetNounIndexNameInstanceCUKE.get(TERM);
	if ("culb".equals(key)) return WordnetNounIndexNameInstanceCULB.get(TERM);
	if ("culc".equals(key)) return WordnetNounIndexNameInstanceCULC.get(TERM);
	if ("culd".equals(key)) return WordnetNounIndexNameInstanceCULD.get(TERM);
	if ("cule".equals(key)) return WordnetNounIndexNameInstanceCULE.get(TERM);
	if ("culi".equals(key)) return WordnetNounIndexNameInstanceCULI.get(TERM);
	if ("cull".equals(key)) return WordnetNounIndexNameInstanceCULL.get(TERM);
	if ("culm".equals(key)) return WordnetNounIndexNameInstanceCULM.get(TERM);
	if ("culo".equals(key)) return WordnetNounIndexNameInstanceCULO.get(TERM);
	if ("culp".equals(key)) return WordnetNounIndexNameInstanceCULP.get(TERM);
	if ("cult".equals(key)) return WordnetNounIndexNameInstanceCULT.get(TERM);
	if ("culv".equals(key)) return WordnetNounIndexNameInstanceCULV.get(TERM);
	if ("cuma".equals(key)) return WordnetNounIndexNameInstanceCUMA.get(TERM);
	if ("cumb".equals(key)) return WordnetNounIndexNameInstanceCUMB.get(TERM);
	if ("cumf".equals(key)) return WordnetNounIndexNameInstanceCUMF.get(TERM);
	if ("cumi".equals(key)) return WordnetNounIndexNameInstanceCUMI.get(TERM);
	if ("cumm".equals(key)) return WordnetNounIndexNameInstanceCUMM.get(TERM);
	if ("cumq".equals(key)) return WordnetNounIndexNameInstanceCUMQ.get(TERM);
	if ("cumu".equals(key)) return WordnetNounIndexNameInstanceCUMU.get(TERM);
	if ("cuna".equals(key)) return WordnetNounIndexNameInstanceCUNA.get(TERM);
	if ("cunc".equals(key)) return WordnetNounIndexNameInstanceCUNC.get(TERM);
	if ("cune".equals(key)) return WordnetNounIndexNameInstanceCUNE.get(TERM);
	if ("cuni".equals(key)) return WordnetNounIndexNameInstanceCUNI.get(TERM);
	if ("cunn".equals(key)) return WordnetNounIndexNameInstanceCUNN.get(TERM);
	if ("cuno".equals(key)) return WordnetNounIndexNameInstanceCUNO.get(TERM);
	if ("cunt".equals(key)) return WordnetNounIndexNameInstanceCUNT.get(TERM);
	if ("cuon".equals(key)) return WordnetNounIndexNameInstanceCUON.get(TERM);
	if ("cupb".equals(key)) return WordnetNounIndexNameInstanceCUPB.get(TERM);
	if ("cupc".equals(key)) return WordnetNounIndexNameInstanceCUPC.get(TERM);
	if ("cupe".equals(key)) return WordnetNounIndexNameInstanceCUPE.get(TERM);
	if ("cupf".equals(key)) return WordnetNounIndexNameInstanceCUPF.get(TERM);
	if ("cupi".equals(key)) return WordnetNounIndexNameInstanceCUPI.get(TERM);
	if ("cupo".equals(key)) return WordnetNounIndexNameInstanceCUPO.get(TERM);
	if ("cupp".equals(key)) return WordnetNounIndexNameInstanceCUPP.get(TERM);
	if ("cupr".equals(key)) return WordnetNounIndexNameInstanceCUPR.get(TERM);
	if ("cupu".equals(key)) return WordnetNounIndexNameInstanceCUPU.get(TERM);
	if ("cuqu".equals(key)) return WordnetNounIndexNameInstanceCUQU.get(TERM);
	if ("cura".equals(key)) return WordnetNounIndexNameInstanceCURA.get(TERM);
	if ("curb".equals(key)) return WordnetNounIndexNameInstanceCURB.get(TERM);
	if ("curc".equals(key)) return WordnetNounIndexNameInstanceCURC.get(TERM);
	if ("curd".equals(key)) return WordnetNounIndexNameInstanceCURD.get(TERM);
	if ("cure".equals(key)) return WordnetNounIndexNameInstanceCURE.get(TERM);
	if ("curf".equals(key)) return WordnetNounIndexNameInstanceCURF.get(TERM);
	if ("curi".equals(key)) return WordnetNounIndexNameInstanceCURI.get(TERM);
	if ("curl".equals(key)) return WordnetNounIndexNameInstanceCURL.get(TERM);
	if ("curm".equals(key)) return WordnetNounIndexNameInstanceCURM.get(TERM);
	if ("curr".equals(key)) return WordnetNounIndexNameInstanceCURR.get(TERM);
	if ("curs".equals(key)) return WordnetNounIndexNameInstanceCURS.get(TERM);
	if ("curt".equals(key)) return WordnetNounIndexNameInstanceCURT.get(TERM);
	if ("curv".equals(key)) return WordnetNounIndexNameInstanceCURV.get(TERM);
	if ("cusc".equals(key)) return WordnetNounIndexNameInstanceCUSC.get(TERM);
	if ("cush".equals(key)) return WordnetNounIndexNameInstanceCUSH.get(TERM);
	if ("cusk".equals(key)) return WordnetNounIndexNameInstanceCUSK.get(TERM);
	if ("cusp".equals(key)) return WordnetNounIndexNameInstanceCUSP.get(TERM);
	if ("cuss".equals(key)) return WordnetNounIndexNameInstanceCUSS.get(TERM);
	if ("cust".equals(key)) return WordnetNounIndexNameInstanceCUST.get(TERM);
	if ("cuta".equals(key)) return WordnetNounIndexNameInstanceCUTA.get(TERM);
	if ("cutb".equals(key)) return WordnetNounIndexNameInstanceCUTB.get(TERM);
	if ("cutc".equals(key)) return WordnetNounIndexNameInstanceCUTC.get(TERM);
	if ("cute".equals(key)) return WordnetNounIndexNameInstanceCUTE.get(TERM);
	if ("cuti".equals(key)) return WordnetNounIndexNameInstanceCUTI.get(TERM);
	if ("cutl".equals(key)) return WordnetNounIndexNameInstanceCUTL.get(TERM);
	if ("cuto".equals(key)) return WordnetNounIndexNameInstanceCUTO.get(TERM);
	if ("cutp".equals(key)) return WordnetNounIndexNameInstanceCUTP.get(TERM);
	if ("cutt".equals(key)) return WordnetNounIndexNameInstanceCUTT.get(TERM);
	if ("cutw".equals(key)) return WordnetNounIndexNameInstanceCUTW.get(TERM);
	if ("cuvi".equals(key)) return WordnetNounIndexNameInstanceCUVI.get(TERM);
	if ("cuzc".equals(key)) return WordnetNounIndexNameInstanceCUZC.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCUBA.terms());
	set.addAll(WordnetNounIndexNameInstanceCUBB.terms());
	set.addAll(WordnetNounIndexNameInstanceCUBE.terms());
	set.addAll(WordnetNounIndexNameInstanceCUBI.terms());
	set.addAll(WordnetNounIndexNameInstanceCUBO.terms());
	set.addAll(WordnetNounIndexNameInstanceCUCK.terms());
	set.addAll(WordnetNounIndexNameInstanceCUCU.terms());
	set.addAll(WordnetNounIndexNameInstanceCUDB.terms());
	set.addAll(WordnetNounIndexNameInstanceCUDD.terms());
	set.addAll(WordnetNounIndexNameInstanceCUDG.terms());
	set.addAll(WordnetNounIndexNameInstanceCUDW.terms());
	set.addAll(WordnetNounIndexNameInstanceCUFF.terms());
	set.addAll(WordnetNounIndexNameInstanceCUIR.terms());
	set.addAll(WordnetNounIndexNameInstanceCUIS.terms());
	set.addAll(WordnetNounIndexNameInstanceCUKE.terms());
	set.addAll(WordnetNounIndexNameInstanceCULB.terms());
	set.addAll(WordnetNounIndexNameInstanceCULC.terms());
	set.addAll(WordnetNounIndexNameInstanceCULD.terms());
	set.addAll(WordnetNounIndexNameInstanceCULE.terms());
	set.addAll(WordnetNounIndexNameInstanceCULI.terms());
	set.addAll(WordnetNounIndexNameInstanceCULL.terms());
	set.addAll(WordnetNounIndexNameInstanceCULM.terms());
	set.addAll(WordnetNounIndexNameInstanceCULO.terms());
	set.addAll(WordnetNounIndexNameInstanceCULP.terms());
	set.addAll(WordnetNounIndexNameInstanceCULT.terms());
	set.addAll(WordnetNounIndexNameInstanceCULV.terms());
	set.addAll(WordnetNounIndexNameInstanceCUMA.terms());
	set.addAll(WordnetNounIndexNameInstanceCUMB.terms());
	set.addAll(WordnetNounIndexNameInstanceCUMF.terms());
	set.addAll(WordnetNounIndexNameInstanceCUMI.terms());
	set.addAll(WordnetNounIndexNameInstanceCUMM.terms());
	set.addAll(WordnetNounIndexNameInstanceCUMQ.terms());
	set.addAll(WordnetNounIndexNameInstanceCUMU.terms());
	set.addAll(WordnetNounIndexNameInstanceCUNA.terms());
	set.addAll(WordnetNounIndexNameInstanceCUNC.terms());
	set.addAll(WordnetNounIndexNameInstanceCUNE.terms());
	set.addAll(WordnetNounIndexNameInstanceCUNI.terms());
	set.addAll(WordnetNounIndexNameInstanceCUNN.terms());
	set.addAll(WordnetNounIndexNameInstanceCUNO.terms());
	set.addAll(WordnetNounIndexNameInstanceCUNT.terms());
	set.addAll(WordnetNounIndexNameInstanceCUON.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPB.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPC.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPE.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPF.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPI.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPO.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPP.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPR.terms());
	set.addAll(WordnetNounIndexNameInstanceCUPU.terms());
	set.addAll(WordnetNounIndexNameInstanceCUQU.terms());
	set.addAll(WordnetNounIndexNameInstanceCURA.terms());
	set.addAll(WordnetNounIndexNameInstanceCURB.terms());
	set.addAll(WordnetNounIndexNameInstanceCURC.terms());
	set.addAll(WordnetNounIndexNameInstanceCURD.terms());
	set.addAll(WordnetNounIndexNameInstanceCURE.terms());
	set.addAll(WordnetNounIndexNameInstanceCURF.terms());
	set.addAll(WordnetNounIndexNameInstanceCURI.terms());
	set.addAll(WordnetNounIndexNameInstanceCURL.terms());
	set.addAll(WordnetNounIndexNameInstanceCURM.terms());
	set.addAll(WordnetNounIndexNameInstanceCURR.terms());
	set.addAll(WordnetNounIndexNameInstanceCURS.terms());
	set.addAll(WordnetNounIndexNameInstanceCURT.terms());
	set.addAll(WordnetNounIndexNameInstanceCURV.terms());
	set.addAll(WordnetNounIndexNameInstanceCUSC.terms());
	set.addAll(WordnetNounIndexNameInstanceCUSH.terms());
	set.addAll(WordnetNounIndexNameInstanceCUSK.terms());
	set.addAll(WordnetNounIndexNameInstanceCUSP.terms());
	set.addAll(WordnetNounIndexNameInstanceCUSS.terms());
	set.addAll(WordnetNounIndexNameInstanceCUST.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTA.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTB.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTC.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTE.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTI.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTL.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTO.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTP.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTT.terms());
	set.addAll(WordnetNounIndexNameInstanceCUTW.terms());
	set.addAll(WordnetNounIndexNameInstanceCUVI.terms());
	set.addAll(WordnetNounIndexNameInstanceCUZC.terms());
  		return set; 	} }