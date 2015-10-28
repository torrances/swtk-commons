package org.swtk.commons.dict.wordnet.indexbyname.controller.r.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.a.WordnetNounIndexNameInstanceROA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.b.WordnetNounIndexNameInstanceROB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.c.WordnetNounIndexNameInstanceROC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.d.WordnetNounIndexNameInstanceROD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.e.WordnetNounIndexNameInstanceROE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.f.WordnetNounIndexNameInstanceROF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.g.WordnetNounIndexNameInstanceROG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.h.WordnetNounIndexNameInstanceROH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.i.WordnetNounIndexNameInstanceROI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.l.WordnetNounIndexNameInstanceROL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.m.WordnetNounIndexNameInstanceROM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.n.WordnetNounIndexNameInstanceRON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.o.WordnetNounIndexNameInstanceROO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.p.WordnetNounIndexNameInstanceROP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.q.WordnetNounIndexNameInstanceROQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.r.WordnetNounIndexNameInstanceROR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.s.WordnetNounIndexNameInstanceROS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.t.WordnetNounIndexNameInstanceROT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.u.WordnetNounIndexNameInstanceROU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.v.WordnetNounIndexNameInstanceROV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.w.WordnetNounIndexNameInstanceROW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.y.WordnetNounIndexNameInstanceROY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.z.WordnetNounIndexNameInstanceROZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerRO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("roa".equals(key)) return WordnetNounIndexNameInstanceROA.get(TERM);
	if ("rob".equals(key)) return WordnetNounIndexNameInstanceROB.get(TERM);
	if ("roc".equals(key)) return WordnetNounIndexNameInstanceROC.get(TERM);
	if ("rod".equals(key)) return WordnetNounIndexNameInstanceROD.get(TERM);
	if ("roe".equals(key)) return WordnetNounIndexNameInstanceROE.get(TERM);
	if ("rof".equals(key)) return WordnetNounIndexNameInstanceROF.get(TERM);
	if ("rog".equals(key)) return WordnetNounIndexNameInstanceROG.get(TERM);
	if ("roh".equals(key)) return WordnetNounIndexNameInstanceROH.get(TERM);
	if ("roi".equals(key)) return WordnetNounIndexNameInstanceROI.get(TERM);
	if ("rol".equals(key)) return WordnetNounIndexNameInstanceROL.get(TERM);
	if ("rom".equals(key)) return WordnetNounIndexNameInstanceROM.get(TERM);
	if ("ron".equals(key)) return WordnetNounIndexNameInstanceRON.get(TERM);
	if ("roo".equals(key)) return WordnetNounIndexNameInstanceROO.get(TERM);
	if ("rop".equals(key)) return WordnetNounIndexNameInstanceROP.get(TERM);
	if ("roq".equals(key)) return WordnetNounIndexNameInstanceROQ.get(TERM);
	if ("ror".equals(key)) return WordnetNounIndexNameInstanceROR.get(TERM);
	if ("ros".equals(key)) return WordnetNounIndexNameInstanceROS.get(TERM);
	if ("rot".equals(key)) return WordnetNounIndexNameInstanceROT.get(TERM);
	if ("rou".equals(key)) return WordnetNounIndexNameInstanceROU.get(TERM);
	if ("rov".equals(key)) return WordnetNounIndexNameInstanceROV.get(TERM);
	if ("row".equals(key)) return WordnetNounIndexNameInstanceROW.get(TERM);
	if ("roy".equals(key)) return WordnetNounIndexNameInstanceROY.get(TERM);
	if ("roz".equals(key)) return WordnetNounIndexNameInstanceROZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceROA.terms());
	set.addAll(WordnetNounIndexNameInstanceROB.terms());
	set.addAll(WordnetNounIndexNameInstanceROC.terms());
	set.addAll(WordnetNounIndexNameInstanceROD.terms());
	set.addAll(WordnetNounIndexNameInstanceROE.terms());
	set.addAll(WordnetNounIndexNameInstanceROF.terms());
	set.addAll(WordnetNounIndexNameInstanceROG.terms());
	set.addAll(WordnetNounIndexNameInstanceROH.terms());
	set.addAll(WordnetNounIndexNameInstanceROI.terms());
	set.addAll(WordnetNounIndexNameInstanceROL.terms());
	set.addAll(WordnetNounIndexNameInstanceROM.terms());
	set.addAll(WordnetNounIndexNameInstanceRON.terms());
	set.addAll(WordnetNounIndexNameInstanceROO.terms());
	set.addAll(WordnetNounIndexNameInstanceROP.terms());
	set.addAll(WordnetNounIndexNameInstanceROQ.terms());
	set.addAll(WordnetNounIndexNameInstanceROR.terms());
	set.addAll(WordnetNounIndexNameInstanceROS.terms());
	set.addAll(WordnetNounIndexNameInstanceROT.terms());
	set.addAll(WordnetNounIndexNameInstanceROU.terms());
	set.addAll(WordnetNounIndexNameInstanceROV.terms());
	set.addAll(WordnetNounIndexNameInstanceROW.terms());
	set.addAll(WordnetNounIndexNameInstanceROY.terms());
	set.addAll(WordnetNounIndexNameInstanceROZ.terms());
  		return set; 	} }