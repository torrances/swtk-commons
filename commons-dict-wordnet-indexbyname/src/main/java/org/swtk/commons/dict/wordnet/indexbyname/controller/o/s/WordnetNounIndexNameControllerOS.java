package org.swtk.commons.dict.wordnet.indexbyname.controller.o.s;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.a.WordnetNounIndexNameInstanceOSA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.b.WordnetNounIndexNameInstanceOSB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.c.WordnetNounIndexNameInstanceOSC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.h.WordnetNounIndexNameInstanceOSH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.i.WordnetNounIndexNameInstanceOSI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.l.WordnetNounIndexNameInstanceOSL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.m.WordnetNounIndexNameInstanceOSM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.p.WordnetNounIndexNameInstanceOSP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.s.WordnetNounIndexNameInstanceOSS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.t.WordnetNounIndexNameInstanceOST;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.w.WordnetNounIndexNameInstanceOSW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOS {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("osa".equals(key)) return WordnetNounIndexNameInstanceOSA.get(TERM);
	if ("osb".equals(key)) return WordnetNounIndexNameInstanceOSB.get(TERM);
	if ("osc".equals(key)) return WordnetNounIndexNameInstanceOSC.get(TERM);
	if ("osh".equals(key)) return WordnetNounIndexNameInstanceOSH.get(TERM);
	if ("osi".equals(key)) return WordnetNounIndexNameInstanceOSI.get(TERM);
	if ("osl".equals(key)) return WordnetNounIndexNameInstanceOSL.get(TERM);
	if ("osm".equals(key)) return WordnetNounIndexNameInstanceOSM.get(TERM);
	if ("osp".equals(key)) return WordnetNounIndexNameInstanceOSP.get(TERM);
	if ("oss".equals(key)) return WordnetNounIndexNameInstanceOSS.get(TERM);
	if ("ost".equals(key)) return WordnetNounIndexNameInstanceOST.get(TERM);
	if ("osw".equals(key)) return WordnetNounIndexNameInstanceOSW.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOSA.terms());
	set.addAll(WordnetNounIndexNameInstanceOSB.terms());
	set.addAll(WordnetNounIndexNameInstanceOSC.terms());
	set.addAll(WordnetNounIndexNameInstanceOSH.terms());
	set.addAll(WordnetNounIndexNameInstanceOSI.terms());
	set.addAll(WordnetNounIndexNameInstanceOSL.terms());
	set.addAll(WordnetNounIndexNameInstanceOSM.terms());
	set.addAll(WordnetNounIndexNameInstanceOSP.terms());
	set.addAll(WordnetNounIndexNameInstanceOSS.terms());
	set.addAll(WordnetNounIndexNameInstanceOST.terms());
	set.addAll(WordnetNounIndexNameInstanceOSW.terms());
  		return set; 	} }