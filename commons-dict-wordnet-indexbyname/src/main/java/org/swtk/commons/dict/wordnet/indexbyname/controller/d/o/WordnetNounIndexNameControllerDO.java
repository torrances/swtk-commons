package org.swtk.commons.dict.wordnet.indexbyname.controller.d.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.b.WordnetNounIndexNameInstanceDOB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.c.WordnetNounIndexNameInstanceDOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.d.WordnetNounIndexNameInstanceDOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.e.WordnetNounIndexNameInstanceDOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.g.WordnetNounIndexNameInstanceDOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.h.WordnetNounIndexNameInstanceDOH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.i.WordnetNounIndexNameInstanceDOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.j.WordnetNounIndexNameInstanceDOJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.l.WordnetNounIndexNameInstanceDOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.m.WordnetNounIndexNameInstanceDOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.n.WordnetNounIndexNameInstanceDON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.o.WordnetNounIndexNameInstanceDOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.p.WordnetNounIndexNameInstanceDOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.r.WordnetNounIndexNameInstanceDOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.s.WordnetNounIndexNameInstanceDOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.t.WordnetNounIndexNameInstanceDOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.u.WordnetNounIndexNameInstanceDOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.v.WordnetNounIndexNameInstanceDOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.w.WordnetNounIndexNameInstanceDOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.x.WordnetNounIndexNameInstanceDOX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.y.WordnetNounIndexNameInstanceDOY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.z.WordnetNounIndexNameInstanceDOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerDO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("dob".equals(key)) return WordnetNounIndexNameInstanceDOB.get(TERM);
	if ("doc".equals(key)) return WordnetNounIndexNameInstanceDOC.get(TERM);
	if ("dod".equals(key)) return WordnetNounIndexNameInstanceDOD.get(TERM);
	if ("doe".equals(key)) return WordnetNounIndexNameInstanceDOE.get(TERM);
	if ("dog".equals(key)) return WordnetNounIndexNameInstanceDOG.get(TERM);
	if ("doh".equals(key)) return WordnetNounIndexNameInstanceDOH.get(TERM);
	if ("doi".equals(key)) return WordnetNounIndexNameInstanceDOI.get(TERM);
	if ("doj".equals(key)) return WordnetNounIndexNameInstanceDOJ.get(TERM);
	if ("dol".equals(key)) return WordnetNounIndexNameInstanceDOL.get(TERM);
	if ("dom".equals(key)) return WordnetNounIndexNameInstanceDOM.get(TERM);
	if ("don".equals(key)) return WordnetNounIndexNameInstanceDON.get(TERM);
	if ("doo".equals(key)) return WordnetNounIndexNameInstanceDOO.get(TERM);
	if ("dop".equals(key)) return WordnetNounIndexNameInstanceDOP.get(TERM);
	if ("dor".equals(key)) return WordnetNounIndexNameInstanceDOR.get(TERM);
	if ("dos".equals(key)) return WordnetNounIndexNameInstanceDOS.get(TERM);
	if ("dot".equals(key)) return WordnetNounIndexNameInstanceDOT.get(TERM);
	if ("dou".equals(key)) return WordnetNounIndexNameInstanceDOU.get(TERM);
	if ("dov".equals(key)) return WordnetNounIndexNameInstanceDOV.get(TERM);
	if ("dow".equals(key)) return WordnetNounIndexNameInstanceDOW.get(TERM);
	if ("dox".equals(key)) return WordnetNounIndexNameInstanceDOX.get(TERM);
	if ("doy".equals(key)) return WordnetNounIndexNameInstanceDOY.get(TERM);
	if ("doz".equals(key)) return WordnetNounIndexNameInstanceDOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceDOB.terms());
	set.addAll(WordnetNounIndexNameInstanceDOC.terms());
	set.addAll(WordnetNounIndexNameInstanceDOD.terms());
	set.addAll(WordnetNounIndexNameInstanceDOE.terms());
	set.addAll(WordnetNounIndexNameInstanceDOG.terms());
	set.addAll(WordnetNounIndexNameInstanceDOH.terms());
	set.addAll(WordnetNounIndexNameInstanceDOI.terms());
	set.addAll(WordnetNounIndexNameInstanceDOJ.terms());
	set.addAll(WordnetNounIndexNameInstanceDOL.terms());
	set.addAll(WordnetNounIndexNameInstanceDOM.terms());
	set.addAll(WordnetNounIndexNameInstanceDON.terms());
	set.addAll(WordnetNounIndexNameInstanceDOO.terms());
	set.addAll(WordnetNounIndexNameInstanceDOP.terms());
	set.addAll(WordnetNounIndexNameInstanceDOR.terms());
	set.addAll(WordnetNounIndexNameInstanceDOS.terms());
	set.addAll(WordnetNounIndexNameInstanceDOT.terms());
	set.addAll(WordnetNounIndexNameInstanceDOU.terms());
	set.addAll(WordnetNounIndexNameInstanceDOV.terms());
	set.addAll(WordnetNounIndexNameInstanceDOW.terms());
	set.addAll(WordnetNounIndexNameInstanceDOX.terms());
	set.addAll(WordnetNounIndexNameInstanceDOY.terms());
	set.addAll(WordnetNounIndexNameInstanceDOZ.terms());
  		return set; 	} }