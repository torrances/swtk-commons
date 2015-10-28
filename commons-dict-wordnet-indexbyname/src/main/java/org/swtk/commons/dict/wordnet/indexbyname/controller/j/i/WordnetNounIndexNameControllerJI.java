package org.swtk.commons.dict.wordnet.indexbyname.controller.j.i;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.a.WordnetNounIndexNameInstanceJIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.b.WordnetNounIndexNameInstanceJIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.d.WordnetNounIndexNameInstanceJID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.f.WordnetNounIndexNameInstanceJIF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.g.WordnetNounIndexNameInstanceJIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.h.WordnetNounIndexNameInstanceJIH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.l.WordnetNounIndexNameInstanceJIL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.m.WordnetNounIndexNameInstanceJIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.n.WordnetNounIndexNameInstanceJIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.q.WordnetNounIndexNameInstanceJIQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.r.WordnetNounIndexNameInstanceJIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.t.WordnetNounIndexNameInstanceJIT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.u.WordnetNounIndexNameInstanceJIU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.v.WordnetNounIndexNameInstanceJIV;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerJI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("jia".equals(key)) return WordnetNounIndexNameInstanceJIA.get(TERM);
	if ("jib".equals(key)) return WordnetNounIndexNameInstanceJIB.get(TERM);
	if ("jid".equals(key)) return WordnetNounIndexNameInstanceJID.get(TERM);
	if ("jif".equals(key)) return WordnetNounIndexNameInstanceJIF.get(TERM);
	if ("jig".equals(key)) return WordnetNounIndexNameInstanceJIG.get(TERM);
	if ("jih".equals(key)) return WordnetNounIndexNameInstanceJIH.get(TERM);
	if ("jil".equals(key)) return WordnetNounIndexNameInstanceJIL.get(TERM);
	if ("jim".equals(key)) return WordnetNounIndexNameInstanceJIM.get(TERM);
	if ("jin".equals(key)) return WordnetNounIndexNameInstanceJIN.get(TERM);
	if ("jiq".equals(key)) return WordnetNounIndexNameInstanceJIQ.get(TERM);
	if ("jir".equals(key)) return WordnetNounIndexNameInstanceJIR.get(TERM);
	if ("jit".equals(key)) return WordnetNounIndexNameInstanceJIT.get(TERM);
	if ("jiu".equals(key)) return WordnetNounIndexNameInstanceJIU.get(TERM);
	if ("jiv".equals(key)) return WordnetNounIndexNameInstanceJIV.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceJIA.terms());
	set.addAll(WordnetNounIndexNameInstanceJIB.terms());
	set.addAll(WordnetNounIndexNameInstanceJID.terms());
	set.addAll(WordnetNounIndexNameInstanceJIF.terms());
	set.addAll(WordnetNounIndexNameInstanceJIG.terms());
	set.addAll(WordnetNounIndexNameInstanceJIH.terms());
	set.addAll(WordnetNounIndexNameInstanceJIL.terms());
	set.addAll(WordnetNounIndexNameInstanceJIM.terms());
	set.addAll(WordnetNounIndexNameInstanceJIN.terms());
	set.addAll(WordnetNounIndexNameInstanceJIQ.terms());
	set.addAll(WordnetNounIndexNameInstanceJIR.terms());
	set.addAll(WordnetNounIndexNameInstanceJIT.terms());
	set.addAll(WordnetNounIndexNameInstanceJIU.terms());
	set.addAll(WordnetNounIndexNameInstanceJIV.terms());
  		return set; 	} }