package org.swtk.commons.dict.wordnet.indexbyname.controller.p.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.a.WordnetNounIndexNameInstancePOA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.c.WordnetNounIndexNameInstancePOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.d.WordnetNounIndexNameInstancePOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.e.WordnetNounIndexNameInstancePOE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.g.WordnetNounIndexNameInstancePOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.i.WordnetNounIndexNameInstancePOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.k.WordnetNounIndexNameInstancePOK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.l.WordnetNounIndexNameInstancePOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.m.WordnetNounIndexNameInstancePOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.n.WordnetNounIndexNameInstancePON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.o.WordnetNounIndexNameInstancePOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.p.WordnetNounIndexNameInstancePOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.r.WordnetNounIndexNameInstancePOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.s.WordnetNounIndexNameInstancePOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.t.WordnetNounIndexNameInstancePOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.u.WordnetNounIndexNameInstancePOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.v.WordnetNounIndexNameInstancePOV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.w.WordnetNounIndexNameInstancePOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.x.WordnetNounIndexNameInstancePOX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.y.WordnetNounIndexNameInstancePOY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.z.WordnetNounIndexNameInstancePOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerPO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("poa".equals(key)) return WordnetNounIndexNameInstancePOA.get(TERM);
	if ("poc".equals(key)) return WordnetNounIndexNameInstancePOC.get(TERM);
	if ("pod".equals(key)) return WordnetNounIndexNameInstancePOD.get(TERM);
	if ("poe".equals(key)) return WordnetNounIndexNameInstancePOE.get(TERM);
	if ("pog".equals(key)) return WordnetNounIndexNameInstancePOG.get(TERM);
	if ("poi".equals(key)) return WordnetNounIndexNameInstancePOI.get(TERM);
	if ("pok".equals(key)) return WordnetNounIndexNameInstancePOK.get(TERM);
	if ("pol".equals(key)) return WordnetNounIndexNameInstancePOL.get(TERM);
	if ("pom".equals(key)) return WordnetNounIndexNameInstancePOM.get(TERM);
	if ("pon".equals(key)) return WordnetNounIndexNameInstancePON.get(TERM);
	if ("poo".equals(key)) return WordnetNounIndexNameInstancePOO.get(TERM);
	if ("pop".equals(key)) return WordnetNounIndexNameInstancePOP.get(TERM);
	if ("por".equals(key)) return WordnetNounIndexNameInstancePOR.get(TERM);
	if ("pos".equals(key)) return WordnetNounIndexNameInstancePOS.get(TERM);
	if ("pot".equals(key)) return WordnetNounIndexNameInstancePOT.get(TERM);
	if ("pou".equals(key)) return WordnetNounIndexNameInstancePOU.get(TERM);
	if ("pov".equals(key)) return WordnetNounIndexNameInstancePOV.get(TERM);
	if ("pow".equals(key)) return WordnetNounIndexNameInstancePOW.get(TERM);
	if ("pox".equals(key)) return WordnetNounIndexNameInstancePOX.get(TERM);
	if ("poy".equals(key)) return WordnetNounIndexNameInstancePOY.get(TERM);
	if ("poz".equals(key)) return WordnetNounIndexNameInstancePOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstancePOA.terms());
	set.addAll(WordnetNounIndexNameInstancePOC.terms());
	set.addAll(WordnetNounIndexNameInstancePOD.terms());
	set.addAll(WordnetNounIndexNameInstancePOE.terms());
	set.addAll(WordnetNounIndexNameInstancePOG.terms());
	set.addAll(WordnetNounIndexNameInstancePOI.terms());
	set.addAll(WordnetNounIndexNameInstancePOK.terms());
	set.addAll(WordnetNounIndexNameInstancePOL.terms());
	set.addAll(WordnetNounIndexNameInstancePOM.terms());
	set.addAll(WordnetNounIndexNameInstancePON.terms());
	set.addAll(WordnetNounIndexNameInstancePOO.terms());
	set.addAll(WordnetNounIndexNameInstancePOP.terms());
	set.addAll(WordnetNounIndexNameInstancePOR.terms());
	set.addAll(WordnetNounIndexNameInstancePOS.terms());
	set.addAll(WordnetNounIndexNameInstancePOT.terms());
	set.addAll(WordnetNounIndexNameInstancePOU.terms());
	set.addAll(WordnetNounIndexNameInstancePOV.terms());
	set.addAll(WordnetNounIndexNameInstancePOW.terms());
	set.addAll(WordnetNounIndexNameInstancePOX.terms());
	set.addAll(WordnetNounIndexNameInstancePOY.terms());
	set.addAll(WordnetNounIndexNameInstancePOZ.terms());
  		return set; 	} }