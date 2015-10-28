package org.swtk.commons.dict.wordnet.indexbyname.controller.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.a.WordnetNounIndexNameInstanceRIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.b.WordnetNounIndexNameInstanceRIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.c.WordnetNounIndexNameInstanceRIC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.d.WordnetNounIndexNameInstanceRID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.e.WordnetNounIndexNameInstanceRIE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.f.WordnetNounIndexNameInstanceRIF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.g.WordnetNounIndexNameInstanceRIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.j.WordnetNounIndexNameInstanceRIJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.k.WordnetNounIndexNameInstanceRIK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.l.WordnetNounIndexNameInstanceRIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.m.WordnetNounIndexNameInstanceRIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.n.WordnetNounIndexNameInstanceRIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.o.WordnetNounIndexNameInstanceRIO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.p.WordnetNounIndexNameInstanceRIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.r.WordnetNounIndexNameInstanceRIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.s.WordnetNounIndexNameInstanceRIS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.t.WordnetNounIndexNameInstanceRIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.v.WordnetNounIndexNameInstanceRIV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.y.WordnetNounIndexNameInstanceRIY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerRI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ria".equals(key)) return WordnetNounIndexNameInstanceRIA.get(TERM);
	if ("rib".equals(key)) return WordnetNounIndexNameInstanceRIB.get(TERM);
	if ("ric".equals(key)) return WordnetNounIndexNameInstanceRIC.get(TERM);
	if ("rid".equals(key)) return WordnetNounIndexNameInstanceRID.get(TERM);
	if ("rie".equals(key)) return WordnetNounIndexNameInstanceRIE.get(TERM);
	if ("rif".equals(key)) return WordnetNounIndexNameInstanceRIF.get(TERM);
	if ("rig".equals(key)) return WordnetNounIndexNameInstanceRIG.get(TERM);
	if ("rij".equals(key)) return WordnetNounIndexNameInstanceRIJ.get(TERM);
	if ("rik".equals(key)) return WordnetNounIndexNameInstanceRIK.get(TERM);
	if ("ril".equals(key)) return WordnetNounIndexNameInstanceRIL.get(TERM);
	if ("rim".equals(key)) return WordnetNounIndexNameInstanceRIM.get(TERM);
	if ("rin".equals(key)) return WordnetNounIndexNameInstanceRIN.get(TERM);
	if ("rio".equals(key)) return WordnetNounIndexNameInstanceRIO.get(TERM);
	if ("rip".equals(key)) return WordnetNounIndexNameInstanceRIP.get(TERM);
	if ("rir".equals(key)) return WordnetNounIndexNameInstanceRIR.get(TERM);
	if ("ris".equals(key)) return WordnetNounIndexNameInstanceRIS.get(TERM);
	if ("rit".equals(key)) return WordnetNounIndexNameInstanceRIT.get(TERM);
	if ("riv".equals(key)) return WordnetNounIndexNameInstanceRIV.get(TERM);
	if ("riy".equals(key)) return WordnetNounIndexNameInstanceRIY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceRIA.terms());
	set.addAll(WordnetNounIndexNameInstanceRIB.terms());
	set.addAll(WordnetNounIndexNameInstanceRIC.terms());
	set.addAll(WordnetNounIndexNameInstanceRID.terms());
	set.addAll(WordnetNounIndexNameInstanceRIE.terms());
	set.addAll(WordnetNounIndexNameInstanceRIF.terms());
	set.addAll(WordnetNounIndexNameInstanceRIG.terms());
	set.addAll(WordnetNounIndexNameInstanceRIJ.terms());
	set.addAll(WordnetNounIndexNameInstanceRIK.terms());
	set.addAll(WordnetNounIndexNameInstanceRIL.terms());
	set.addAll(WordnetNounIndexNameInstanceRIM.terms());
	set.addAll(WordnetNounIndexNameInstanceRIN.terms());
	set.addAll(WordnetNounIndexNameInstanceRIO.terms());
	set.addAll(WordnetNounIndexNameInstanceRIP.terms());
	set.addAll(WordnetNounIndexNameInstanceRIR.terms());
	set.addAll(WordnetNounIndexNameInstanceRIS.terms());
	set.addAll(WordnetNounIndexNameInstanceRIT.terms());
	set.addAll(WordnetNounIndexNameInstanceRIV.terms());
	set.addAll(WordnetNounIndexNameInstanceRIY.terms());
  		return set; 	} }