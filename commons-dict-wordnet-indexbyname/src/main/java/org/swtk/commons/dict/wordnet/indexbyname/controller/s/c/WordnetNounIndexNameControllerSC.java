package org.swtk.commons.dict.wordnet.indexbyname.controller.s.c;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.a.WordnetNounIndexNameInstanceSCA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.e.WordnetNounIndexNameInstanceSCE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.h.WordnetNounIndexNameInstanceSCH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.i.WordnetNounIndexNameInstanceSCI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.l.WordnetNounIndexNameInstanceSCL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.n.WordnetNounIndexNameInstanceSCN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.o.WordnetNounIndexNameInstanceSCO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.p.WordnetNounIndexNameInstanceSCP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.r.WordnetNounIndexNameInstanceSCR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.s.WordnetNounIndexNameInstanceSCS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.u.WordnetNounIndexNameInstanceSCU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.y.WordnetNounIndexNameInstanceSCY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerSC {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("sca".equals(key)) return WordnetNounIndexNameInstanceSCA.get(TERM);
	if ("sce".equals(key)) return WordnetNounIndexNameInstanceSCE.get(TERM);
	if ("sch".equals(key)) return WordnetNounIndexNameInstanceSCH.get(TERM);
	if ("sci".equals(key)) return WordnetNounIndexNameInstanceSCI.get(TERM);
	if ("scl".equals(key)) return WordnetNounIndexNameInstanceSCL.get(TERM);
	if ("scn".equals(key)) return WordnetNounIndexNameInstanceSCN.get(TERM);
	if ("sco".equals(key)) return WordnetNounIndexNameInstanceSCO.get(TERM);
	if ("scp".equals(key)) return WordnetNounIndexNameInstanceSCP.get(TERM);
	if ("scr".equals(key)) return WordnetNounIndexNameInstanceSCR.get(TERM);
	if ("scs".equals(key)) return WordnetNounIndexNameInstanceSCS.get(TERM);
	if ("scu".equals(key)) return WordnetNounIndexNameInstanceSCU.get(TERM);
	if ("scy".equals(key)) return WordnetNounIndexNameInstanceSCY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceSCA.terms());
	set.addAll(WordnetNounIndexNameInstanceSCE.terms());
	set.addAll(WordnetNounIndexNameInstanceSCH.terms());
	set.addAll(WordnetNounIndexNameInstanceSCI.terms());
	set.addAll(WordnetNounIndexNameInstanceSCL.terms());
	set.addAll(WordnetNounIndexNameInstanceSCN.terms());
	set.addAll(WordnetNounIndexNameInstanceSCO.terms());
	set.addAll(WordnetNounIndexNameInstanceSCP.terms());
	set.addAll(WordnetNounIndexNameInstanceSCR.terms());
	set.addAll(WordnetNounIndexNameInstanceSCS.terms());
	set.addAll(WordnetNounIndexNameInstanceSCU.terms());
	set.addAll(WordnetNounIndexNameInstanceSCY.terms());
  		return set; 	} }