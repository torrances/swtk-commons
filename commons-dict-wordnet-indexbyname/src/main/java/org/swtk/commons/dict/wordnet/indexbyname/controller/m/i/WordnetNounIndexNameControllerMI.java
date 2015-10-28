package org.swtk.commons.dict.wordnet.indexbyname.controller.m.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.a.WordnetNounIndexNameInstanceMIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.b.WordnetNounIndexNameInstanceMIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.c.WordnetNounIndexNameInstanceMIC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.d.WordnetNounIndexNameInstanceMID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.e.WordnetNounIndexNameInstanceMIE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.f.WordnetNounIndexNameInstanceMIF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.g.WordnetNounIndexNameInstanceMIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.h.WordnetNounIndexNameInstanceMIH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.k.WordnetNounIndexNameInstanceMIK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.l.WordnetNounIndexNameInstanceMIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.m.WordnetNounIndexNameInstanceMIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.n.WordnetNounIndexNameInstanceMIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.o.WordnetNounIndexNameInstanceMIO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.p.WordnetNounIndexNameInstanceMIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.r.WordnetNounIndexNameInstanceMIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.s.WordnetNounIndexNameInstanceMIS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.t.WordnetNounIndexNameInstanceMIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.w.WordnetNounIndexNameInstanceMIW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.x.WordnetNounIndexNameInstanceMIX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.z.WordnetNounIndexNameInstanceMIZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerMI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("mia".equals(key)) return WordnetNounIndexNameInstanceMIA.get(TERM);
	if ("mib".equals(key)) return WordnetNounIndexNameInstanceMIB.get(TERM);
	if ("mic".equals(key)) return WordnetNounIndexNameInstanceMIC.get(TERM);
	if ("mid".equals(key)) return WordnetNounIndexNameInstanceMID.get(TERM);
	if ("mie".equals(key)) return WordnetNounIndexNameInstanceMIE.get(TERM);
	if ("mif".equals(key)) return WordnetNounIndexNameInstanceMIF.get(TERM);
	if ("mig".equals(key)) return WordnetNounIndexNameInstanceMIG.get(TERM);
	if ("mih".equals(key)) return WordnetNounIndexNameInstanceMIH.get(TERM);
	if ("mik".equals(key)) return WordnetNounIndexNameInstanceMIK.get(TERM);
	if ("mil".equals(key)) return WordnetNounIndexNameInstanceMIL.get(TERM);
	if ("mim".equals(key)) return WordnetNounIndexNameInstanceMIM.get(TERM);
	if ("min".equals(key)) return WordnetNounIndexNameInstanceMIN.get(TERM);
	if ("mio".equals(key)) return WordnetNounIndexNameInstanceMIO.get(TERM);
	if ("mip".equals(key)) return WordnetNounIndexNameInstanceMIP.get(TERM);
	if ("mir".equals(key)) return WordnetNounIndexNameInstanceMIR.get(TERM);
	if ("mis".equals(key)) return WordnetNounIndexNameInstanceMIS.get(TERM);
	if ("mit".equals(key)) return WordnetNounIndexNameInstanceMIT.get(TERM);
	if ("miw".equals(key)) return WordnetNounIndexNameInstanceMIW.get(TERM);
	if ("mix".equals(key)) return WordnetNounIndexNameInstanceMIX.get(TERM);
	if ("miz".equals(key)) return WordnetNounIndexNameInstanceMIZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceMIA.terms());
	set.addAll(WordnetNounIndexNameInstanceMIB.terms());
	set.addAll(WordnetNounIndexNameInstanceMIC.terms());
	set.addAll(WordnetNounIndexNameInstanceMID.terms());
	set.addAll(WordnetNounIndexNameInstanceMIE.terms());
	set.addAll(WordnetNounIndexNameInstanceMIF.terms());
	set.addAll(WordnetNounIndexNameInstanceMIG.terms());
	set.addAll(WordnetNounIndexNameInstanceMIH.terms());
	set.addAll(WordnetNounIndexNameInstanceMIK.terms());
	set.addAll(WordnetNounIndexNameInstanceMIL.terms());
	set.addAll(WordnetNounIndexNameInstanceMIM.terms());
	set.addAll(WordnetNounIndexNameInstanceMIN.terms());
	set.addAll(WordnetNounIndexNameInstanceMIO.terms());
	set.addAll(WordnetNounIndexNameInstanceMIP.terms());
	set.addAll(WordnetNounIndexNameInstanceMIR.terms());
	set.addAll(WordnetNounIndexNameInstanceMIS.terms());
	set.addAll(WordnetNounIndexNameInstanceMIT.terms());
	set.addAll(WordnetNounIndexNameInstanceMIW.terms());
	set.addAll(WordnetNounIndexNameInstanceMIX.terms());
	set.addAll(WordnetNounIndexNameInstanceMIZ.terms());
  		return set; 	} }