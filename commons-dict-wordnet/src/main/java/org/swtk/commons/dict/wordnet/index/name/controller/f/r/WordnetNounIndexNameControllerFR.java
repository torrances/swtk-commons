package org.swtk.commons.dict.wordnet.index.name.controller.f.r;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.c.WordnetNounIndexNameInstanceFRAC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.d.WordnetNounIndexNameInstanceFRAD;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.g.WordnetNounIndexNameInstanceFRAG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.i.WordnetNounIndexNameInstanceFRAI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.m.WordnetNounIndexNameInstanceFRAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.n.WordnetNounIndexNameInstanceFRAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.p.WordnetNounIndexNameInstanceFRAP;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.s.WordnetNounIndexNameInstanceFRAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.t.WordnetNounIndexNameInstanceFRAT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.u.WordnetNounIndexNameInstanceFRAU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.x.WordnetNounIndexNameInstanceFRAX;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.y.WordnetNounIndexNameInstanceFRAY;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.z.WordnetNounIndexNameInstanceFRAZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.a.WordnetNounIndexNameInstanceFREA;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.c.WordnetNounIndexNameInstanceFREC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.d.WordnetNounIndexNameInstanceFRED;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.e.WordnetNounIndexNameInstanceFREE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.g.WordnetNounIndexNameInstanceFREG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.i.WordnetNounIndexNameInstanceFREI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.m.WordnetNounIndexNameInstanceFREM;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.n.WordnetNounIndexNameInstanceFREN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.o.WordnetNounIndexNameInstanceFREO;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.q.WordnetNounIndexNameInstanceFREQ;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.s.WordnetNounIndexNameInstanceFRES;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.t.WordnetNounIndexNameInstanceFRET;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.u.WordnetNounIndexNameInstanceFREU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.y.WordnetNounIndexNameInstanceFREY;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.a.WordnetNounIndexNameInstanceFRIA;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.c.WordnetNounIndexNameInstanceFRIC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.d.WordnetNounIndexNameInstanceFRID;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.e.WordnetNounIndexNameInstanceFRIE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.g.WordnetNounIndexNameInstanceFRIG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.j.WordnetNounIndexNameInstanceFRIJ;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.l.WordnetNounIndexNameInstanceFRIL;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.m.WordnetNounIndexNameInstanceFRIM;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.n.WordnetNounIndexNameInstanceFRIN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.p.WordnetNounIndexNameInstanceFRIP;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.s.WordnetNounIndexNameInstanceFRIS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.t.WordnetNounIndexNameInstanceFRIT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.u.WordnetNounIndexNameInstanceFRIU;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.v.WordnetNounIndexNameInstanceFRIV;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.z.WordnetNounIndexNameInstanceFRIZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.b.WordnetNounIndexNameInstanceFROB;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.c.WordnetNounIndexNameInstanceFROC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.e.WordnetNounIndexNameInstanceFROE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.g.WordnetNounIndexNameInstanceFROG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.l.WordnetNounIndexNameInstanceFROL;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.n.WordnetNounIndexNameInstanceFRON;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.s.WordnetNounIndexNameInstanceFROS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.t.WordnetNounIndexNameInstanceFROT;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.w.WordnetNounIndexNameInstanceFROW;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.u.c.WordnetNounIndexNameInstanceFRUC;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.u.g.WordnetNounIndexNameInstanceFRUG;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.u.i.WordnetNounIndexNameInstanceFRUI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.u.m.WordnetNounIndexNameInstanceFRUM;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.u.n.WordnetNounIndexNameInstanceFRUN;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.u.s.WordnetNounIndexNameInstanceFRUS;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.y.e.WordnetNounIndexNameInstanceFRYE;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.y.i.WordnetNounIndexNameInstanceFRYI;
	import org.swtk.commons.dict.wordnet.index.name.instance.f.r.y.p.WordnetNounIndexNameInstanceFRYP;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerFR {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("frac".equals(key)) return WordnetNounIndexNameInstanceFRAC.get(TERM);
	if ("frad".equals(key)) return WordnetNounIndexNameInstanceFRAD.get(TERM);
	if ("frag".equals(key)) return WordnetNounIndexNameInstanceFRAG.get(TERM);
	if ("frai".equals(key)) return WordnetNounIndexNameInstanceFRAI.get(TERM);
	if ("fram".equals(key)) return WordnetNounIndexNameInstanceFRAM.get(TERM);
	if ("fran".equals(key)) return WordnetNounIndexNameInstanceFRAN.get(TERM);
	if ("frap".equals(key)) return WordnetNounIndexNameInstanceFRAP.get(TERM);
	if ("fras".equals(key)) return WordnetNounIndexNameInstanceFRAS.get(TERM);
	if ("frat".equals(key)) return WordnetNounIndexNameInstanceFRAT.get(TERM);
	if ("frau".equals(key)) return WordnetNounIndexNameInstanceFRAU.get(TERM);
	if ("frax".equals(key)) return WordnetNounIndexNameInstanceFRAX.get(TERM);
	if ("fray".equals(key)) return WordnetNounIndexNameInstanceFRAY.get(TERM);
	if ("fraz".equals(key)) return WordnetNounIndexNameInstanceFRAZ.get(TERM);
	if ("frea".equals(key)) return WordnetNounIndexNameInstanceFREA.get(TERM);
	if ("frec".equals(key)) return WordnetNounIndexNameInstanceFREC.get(TERM);
	if ("fred".equals(key)) return WordnetNounIndexNameInstanceFRED.get(TERM);
	if ("free".equals(key)) return WordnetNounIndexNameInstanceFREE.get(TERM);
	if ("freg".equals(key)) return WordnetNounIndexNameInstanceFREG.get(TERM);
	if ("frei".equals(key)) return WordnetNounIndexNameInstanceFREI.get(TERM);
	if ("frem".equals(key)) return WordnetNounIndexNameInstanceFREM.get(TERM);
	if ("fren".equals(key)) return WordnetNounIndexNameInstanceFREN.get(TERM);
	if ("freo".equals(key)) return WordnetNounIndexNameInstanceFREO.get(TERM);
	if ("freq".equals(key)) return WordnetNounIndexNameInstanceFREQ.get(TERM);
	if ("fres".equals(key)) return WordnetNounIndexNameInstanceFRES.get(TERM);
	if ("fret".equals(key)) return WordnetNounIndexNameInstanceFRET.get(TERM);
	if ("freu".equals(key)) return WordnetNounIndexNameInstanceFREU.get(TERM);
	if ("frey".equals(key)) return WordnetNounIndexNameInstanceFREY.get(TERM);
	if ("fria".equals(key)) return WordnetNounIndexNameInstanceFRIA.get(TERM);
	if ("fric".equals(key)) return WordnetNounIndexNameInstanceFRIC.get(TERM);
	if ("frid".equals(key)) return WordnetNounIndexNameInstanceFRID.get(TERM);
	if ("frie".equals(key)) return WordnetNounIndexNameInstanceFRIE.get(TERM);
	if ("frig".equals(key)) return WordnetNounIndexNameInstanceFRIG.get(TERM);
	if ("frij".equals(key)) return WordnetNounIndexNameInstanceFRIJ.get(TERM);
	if ("fril".equals(key)) return WordnetNounIndexNameInstanceFRIL.get(TERM);
	if ("frim".equals(key)) return WordnetNounIndexNameInstanceFRIM.get(TERM);
	if ("frin".equals(key)) return WordnetNounIndexNameInstanceFRIN.get(TERM);
	if ("frip".equals(key)) return WordnetNounIndexNameInstanceFRIP.get(TERM);
	if ("fris".equals(key)) return WordnetNounIndexNameInstanceFRIS.get(TERM);
	if ("frit".equals(key)) return WordnetNounIndexNameInstanceFRIT.get(TERM);
	if ("friu".equals(key)) return WordnetNounIndexNameInstanceFRIU.get(TERM);
	if ("friv".equals(key)) return WordnetNounIndexNameInstanceFRIV.get(TERM);
	if ("friz".equals(key)) return WordnetNounIndexNameInstanceFRIZ.get(TERM);
	if ("frob".equals(key)) return WordnetNounIndexNameInstanceFROB.get(TERM);
	if ("froc".equals(key)) return WordnetNounIndexNameInstanceFROC.get(TERM);
	if ("froe".equals(key)) return WordnetNounIndexNameInstanceFROE.get(TERM);
	if ("frog".equals(key)) return WordnetNounIndexNameInstanceFROG.get(TERM);
	if ("frol".equals(key)) return WordnetNounIndexNameInstanceFROL.get(TERM);
	if ("fron".equals(key)) return WordnetNounIndexNameInstanceFRON.get(TERM);
	if ("fros".equals(key)) return WordnetNounIndexNameInstanceFROS.get(TERM);
	if ("frot".equals(key)) return WordnetNounIndexNameInstanceFROT.get(TERM);
	if ("frow".equals(key)) return WordnetNounIndexNameInstanceFROW.get(TERM);
	if ("fruc".equals(key)) return WordnetNounIndexNameInstanceFRUC.get(TERM);
	if ("frug".equals(key)) return WordnetNounIndexNameInstanceFRUG.get(TERM);
	if ("frui".equals(key)) return WordnetNounIndexNameInstanceFRUI.get(TERM);
	if ("frum".equals(key)) return WordnetNounIndexNameInstanceFRUM.get(TERM);
	if ("frun".equals(key)) return WordnetNounIndexNameInstanceFRUN.get(TERM);
	if ("frus".equals(key)) return WordnetNounIndexNameInstanceFRUS.get(TERM);
	if ("frye".equals(key)) return WordnetNounIndexNameInstanceFRYE.get(TERM);
	if ("fryi".equals(key)) return WordnetNounIndexNameInstanceFRYI.get(TERM);
	if ("fryp".equals(key)) return WordnetNounIndexNameInstanceFRYP.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceFRAC.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAD.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAG.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAI.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAM.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAN.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAP.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAS.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAT.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAU.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAX.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAY.terms());
	set.addAll(WordnetNounIndexNameInstanceFRAZ.terms());
	set.addAll(WordnetNounIndexNameInstanceFREA.terms());
	set.addAll(WordnetNounIndexNameInstanceFREC.terms());
	set.addAll(WordnetNounIndexNameInstanceFRED.terms());
	set.addAll(WordnetNounIndexNameInstanceFREE.terms());
	set.addAll(WordnetNounIndexNameInstanceFREG.terms());
	set.addAll(WordnetNounIndexNameInstanceFREI.terms());
	set.addAll(WordnetNounIndexNameInstanceFREM.terms());
	set.addAll(WordnetNounIndexNameInstanceFREN.terms());
	set.addAll(WordnetNounIndexNameInstanceFREO.terms());
	set.addAll(WordnetNounIndexNameInstanceFREQ.terms());
	set.addAll(WordnetNounIndexNameInstanceFRES.terms());
	set.addAll(WordnetNounIndexNameInstanceFRET.terms());
	set.addAll(WordnetNounIndexNameInstanceFREU.terms());
	set.addAll(WordnetNounIndexNameInstanceFREY.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIA.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIC.terms());
	set.addAll(WordnetNounIndexNameInstanceFRID.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIE.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIG.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIJ.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIL.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIM.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIN.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIP.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIS.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIT.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIU.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIV.terms());
	set.addAll(WordnetNounIndexNameInstanceFRIZ.terms());
	set.addAll(WordnetNounIndexNameInstanceFROB.terms());
	set.addAll(WordnetNounIndexNameInstanceFROC.terms());
	set.addAll(WordnetNounIndexNameInstanceFROE.terms());
	set.addAll(WordnetNounIndexNameInstanceFROG.terms());
	set.addAll(WordnetNounIndexNameInstanceFROL.terms());
	set.addAll(WordnetNounIndexNameInstanceFRON.terms());
	set.addAll(WordnetNounIndexNameInstanceFROS.terms());
	set.addAll(WordnetNounIndexNameInstanceFROT.terms());
	set.addAll(WordnetNounIndexNameInstanceFROW.terms());
	set.addAll(WordnetNounIndexNameInstanceFRUC.terms());
	set.addAll(WordnetNounIndexNameInstanceFRUG.terms());
	set.addAll(WordnetNounIndexNameInstanceFRUI.terms());
	set.addAll(WordnetNounIndexNameInstanceFRUM.terms());
	set.addAll(WordnetNounIndexNameInstanceFRUN.terms());
	set.addAll(WordnetNounIndexNameInstanceFRUS.terms());
	set.addAll(WordnetNounIndexNameInstanceFRYE.terms());
	set.addAll(WordnetNounIndexNameInstanceFRYI.terms());
	set.addAll(WordnetNounIndexNameInstanceFRYP.terms());
  		return set; 	} }