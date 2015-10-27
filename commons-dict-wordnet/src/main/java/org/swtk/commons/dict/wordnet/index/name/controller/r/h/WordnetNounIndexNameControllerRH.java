package org.swtk.commons.dict.wordnet.index.name.controller.r.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.a.b.WordnetNounIndexNameInstanceRHAB;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.a.d.WordnetNounIndexNameInstanceRHAD;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.a.g.WordnetNounIndexNameInstanceRHAG;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.a.m.WordnetNounIndexNameInstanceRHAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.a.p.WordnetNounIndexNameInstanceRHAP;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.a.WordnetNounIndexNameInstanceRHEA;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.i.WordnetNounIndexNameInstanceRHEI;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.n.WordnetNounIndexNameInstanceRHEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.o.WordnetNounIndexNameInstanceRHEO;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.s.WordnetNounIndexNameInstanceRHES;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.t.WordnetNounIndexNameInstanceRHET;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.u.WordnetNounIndexNameInstanceRHEU;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.e.x.WordnetNounIndexNameInstanceRHEX;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.i.b.WordnetNounIndexNameInstanceRHIB;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.i.n.WordnetNounIndexNameInstanceRHIN;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.i.p.WordnetNounIndexNameInstanceRHIP;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.i.z.WordnetNounIndexNameInstanceRHIZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.o.d.WordnetNounIndexNameInstanceRHOD;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.o.e.WordnetNounIndexNameInstanceRHOE;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.o.m.WordnetNounIndexNameInstanceRHOM;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.o.n.WordnetNounIndexNameInstanceRHON;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.u.b.WordnetNounIndexNameInstanceRHUB;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.u.m.WordnetNounIndexNameInstanceRHUM;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.u.s.WordnetNounIndexNameInstanceRHUS;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.y.a.WordnetNounIndexNameInstanceRHYA;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.y.m.WordnetNounIndexNameInstanceRHYM;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.y.n.WordnetNounIndexNameInstanceRHYN;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.y.o.WordnetNounIndexNameInstanceRHYO;
	import org.swtk.commons.dict.wordnet.index.name.instance.r.h.y.t.WordnetNounIndexNameInstanceRHYT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerRH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("rhab".equals(key)) return WordnetNounIndexNameInstanceRHAB.get(TERM);
	if ("rhad".equals(key)) return WordnetNounIndexNameInstanceRHAD.get(TERM);
	if ("rhag".equals(key)) return WordnetNounIndexNameInstanceRHAG.get(TERM);
	if ("rham".equals(key)) return WordnetNounIndexNameInstanceRHAM.get(TERM);
	if ("rhap".equals(key)) return WordnetNounIndexNameInstanceRHAP.get(TERM);
	if ("rhea".equals(key)) return WordnetNounIndexNameInstanceRHEA.get(TERM);
	if ("rhei".equals(key)) return WordnetNounIndexNameInstanceRHEI.get(TERM);
	if ("rhen".equals(key)) return WordnetNounIndexNameInstanceRHEN.get(TERM);
	if ("rheo".equals(key)) return WordnetNounIndexNameInstanceRHEO.get(TERM);
	if ("rhes".equals(key)) return WordnetNounIndexNameInstanceRHES.get(TERM);
	if ("rhet".equals(key)) return WordnetNounIndexNameInstanceRHET.get(TERM);
	if ("rheu".equals(key)) return WordnetNounIndexNameInstanceRHEU.get(TERM);
	if ("rhex".equals(key)) return WordnetNounIndexNameInstanceRHEX.get(TERM);
	if ("rhib".equals(key)) return WordnetNounIndexNameInstanceRHIB.get(TERM);
	if ("rhin".equals(key)) return WordnetNounIndexNameInstanceRHIN.get(TERM);
	if ("rhip".equals(key)) return WordnetNounIndexNameInstanceRHIP.get(TERM);
	if ("rhiz".equals(key)) return WordnetNounIndexNameInstanceRHIZ.get(TERM);
	if ("rhod".equals(key)) return WordnetNounIndexNameInstanceRHOD.get(TERM);
	if ("rhoe".equals(key)) return WordnetNounIndexNameInstanceRHOE.get(TERM);
	if ("rhom".equals(key)) return WordnetNounIndexNameInstanceRHOM.get(TERM);
	if ("rhon".equals(key)) return WordnetNounIndexNameInstanceRHON.get(TERM);
	if ("rhub".equals(key)) return WordnetNounIndexNameInstanceRHUB.get(TERM);
	if ("rhum".equals(key)) return WordnetNounIndexNameInstanceRHUM.get(TERM);
	if ("rhus".equals(key)) return WordnetNounIndexNameInstanceRHUS.get(TERM);
	if ("rhya".equals(key)) return WordnetNounIndexNameInstanceRHYA.get(TERM);
	if ("rhym".equals(key)) return WordnetNounIndexNameInstanceRHYM.get(TERM);
	if ("rhyn".equals(key)) return WordnetNounIndexNameInstanceRHYN.get(TERM);
	if ("rhyo".equals(key)) return WordnetNounIndexNameInstanceRHYO.get(TERM);
	if ("rhyt".equals(key)) return WordnetNounIndexNameInstanceRHYT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceRHAB.terms());
	set.addAll(WordnetNounIndexNameInstanceRHAD.terms());
	set.addAll(WordnetNounIndexNameInstanceRHAG.terms());
	set.addAll(WordnetNounIndexNameInstanceRHAM.terms());
	set.addAll(WordnetNounIndexNameInstanceRHAP.terms());
	set.addAll(WordnetNounIndexNameInstanceRHEA.terms());
	set.addAll(WordnetNounIndexNameInstanceRHEI.terms());
	set.addAll(WordnetNounIndexNameInstanceRHEN.terms());
	set.addAll(WordnetNounIndexNameInstanceRHEO.terms());
	set.addAll(WordnetNounIndexNameInstanceRHES.terms());
	set.addAll(WordnetNounIndexNameInstanceRHET.terms());
	set.addAll(WordnetNounIndexNameInstanceRHEU.terms());
	set.addAll(WordnetNounIndexNameInstanceRHEX.terms());
	set.addAll(WordnetNounIndexNameInstanceRHIB.terms());
	set.addAll(WordnetNounIndexNameInstanceRHIN.terms());
	set.addAll(WordnetNounIndexNameInstanceRHIP.terms());
	set.addAll(WordnetNounIndexNameInstanceRHIZ.terms());
	set.addAll(WordnetNounIndexNameInstanceRHOD.terms());
	set.addAll(WordnetNounIndexNameInstanceRHOE.terms());
	set.addAll(WordnetNounIndexNameInstanceRHOM.terms());
	set.addAll(WordnetNounIndexNameInstanceRHON.terms());
	set.addAll(WordnetNounIndexNameInstanceRHUB.terms());
	set.addAll(WordnetNounIndexNameInstanceRHUM.terms());
	set.addAll(WordnetNounIndexNameInstanceRHUS.terms());
	set.addAll(WordnetNounIndexNameInstanceRHYA.terms());
	set.addAll(WordnetNounIndexNameInstanceRHYM.terms());
	set.addAll(WordnetNounIndexNameInstanceRHYN.terms());
	set.addAll(WordnetNounIndexNameInstanceRHYO.terms());
	set.addAll(WordnetNounIndexNameInstanceRHYT.terms());
  		return set; 	} }