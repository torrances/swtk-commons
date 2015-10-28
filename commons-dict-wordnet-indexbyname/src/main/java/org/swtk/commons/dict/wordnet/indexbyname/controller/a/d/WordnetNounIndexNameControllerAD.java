package org.swtk.commons.dict.wordnet.indexbyname.controller.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.a.WordnetNounIndexNameInstanceADA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.d.WordnetNounIndexNameInstanceADD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.e.WordnetNounIndexNameInstanceADE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.h.WordnetNounIndexNameInstanceADH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.i.WordnetNounIndexNameInstanceADI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.j.WordnetNounIndexNameInstanceADJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.l.WordnetNounIndexNameInstanceADL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.m.WordnetNounIndexNameInstanceADM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.n.WordnetNounIndexNameInstanceADN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.o.WordnetNounIndexNameInstanceADO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.p.WordnetNounIndexNameInstanceADP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.r.WordnetNounIndexNameInstanceADR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.s.WordnetNounIndexNameInstanceADS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.u.WordnetNounIndexNameInstanceADU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.v.WordnetNounIndexNameInstanceADV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.y.WordnetNounIndexNameInstanceADY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.z.WordnetNounIndexNameInstanceADZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAD {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ada".equals(key)) return WordnetNounIndexNameInstanceADA.get(TERM);
	if ("add".equals(key)) return WordnetNounIndexNameInstanceADD.get(TERM);
	if ("ade".equals(key)) return WordnetNounIndexNameInstanceADE.get(TERM);
	if ("adh".equals(key)) return WordnetNounIndexNameInstanceADH.get(TERM);
	if ("adi".equals(key)) return WordnetNounIndexNameInstanceADI.get(TERM);
	if ("adj".equals(key)) return WordnetNounIndexNameInstanceADJ.get(TERM);
	if ("adl".equals(key)) return WordnetNounIndexNameInstanceADL.get(TERM);
	if ("adm".equals(key)) return WordnetNounIndexNameInstanceADM.get(TERM);
	if ("adn".equals(key)) return WordnetNounIndexNameInstanceADN.get(TERM);
	if ("ado".equals(key)) return WordnetNounIndexNameInstanceADO.get(TERM);
	if ("adp".equals(key)) return WordnetNounIndexNameInstanceADP.get(TERM);
	if ("adr".equals(key)) return WordnetNounIndexNameInstanceADR.get(TERM);
	if ("ads".equals(key)) return WordnetNounIndexNameInstanceADS.get(TERM);
	if ("adu".equals(key)) return WordnetNounIndexNameInstanceADU.get(TERM);
	if ("adv".equals(key)) return WordnetNounIndexNameInstanceADV.get(TERM);
	if ("ady".equals(key)) return WordnetNounIndexNameInstanceADY.get(TERM);
	if ("adz".equals(key)) return WordnetNounIndexNameInstanceADZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceADA.terms());
	set.addAll(WordnetNounIndexNameInstanceADD.terms());
	set.addAll(WordnetNounIndexNameInstanceADE.terms());
	set.addAll(WordnetNounIndexNameInstanceADH.terms());
	set.addAll(WordnetNounIndexNameInstanceADI.terms());
	set.addAll(WordnetNounIndexNameInstanceADJ.terms());
	set.addAll(WordnetNounIndexNameInstanceADL.terms());
	set.addAll(WordnetNounIndexNameInstanceADM.terms());
	set.addAll(WordnetNounIndexNameInstanceADN.terms());
	set.addAll(WordnetNounIndexNameInstanceADO.terms());
	set.addAll(WordnetNounIndexNameInstanceADP.terms());
	set.addAll(WordnetNounIndexNameInstanceADR.terms());
	set.addAll(WordnetNounIndexNameInstanceADS.terms());
	set.addAll(WordnetNounIndexNameInstanceADU.terms());
	set.addAll(WordnetNounIndexNameInstanceADV.terms());
	set.addAll(WordnetNounIndexNameInstanceADY.terms());
	set.addAll(WordnetNounIndexNameInstanceADZ.terms());
  		return set; 	} }