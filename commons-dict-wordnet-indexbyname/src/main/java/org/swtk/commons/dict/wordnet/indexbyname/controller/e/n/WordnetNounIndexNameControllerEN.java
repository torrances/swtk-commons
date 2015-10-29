package org.swtk.commons.dict.wordnet.indexbyname.controller.e.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.a.WordnetNounIndexNameInstanceENA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.b.WordnetNounIndexNameInstanceENB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.c.WordnetNounIndexNameInstanceENC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.d.WordnetNounIndexNameInstanceEND;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.e.WordnetNounIndexNameInstanceENE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.f.WordnetNounIndexNameInstanceENF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.g.WordnetNounIndexNameInstanceENG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.h.WordnetNounIndexNameInstanceENH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.i.WordnetNounIndexNameInstanceENI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.j.WordnetNounIndexNameInstanceENJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.k.WordnetNounIndexNameInstanceENK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.l.WordnetNounIndexNameInstanceENL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.m.WordnetNounIndexNameInstanceENM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.n.WordnetNounIndexNameInstanceENN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.o.WordnetNounIndexNameInstanceENO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.q.WordnetNounIndexNameInstanceENQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.r.WordnetNounIndexNameInstanceENR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.s.WordnetNounIndexNameInstanceENS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.t.WordnetNounIndexNameInstanceENT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.u.WordnetNounIndexNameInstanceENU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.v.WordnetNounIndexNameInstanceENV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.z.WordnetNounIndexNameInstanceENZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("ena".equals(key)) return WordnetNounIndexNameInstanceENA.get(TERM);
	if ("enb".equals(key)) return WordnetNounIndexNameInstanceENB.get(TERM);
	if ("enc".equals(key)) return WordnetNounIndexNameInstanceENC.get(TERM);
	if ("end".equals(key)) return WordnetNounIndexNameInstanceEND.get(TERM);
	if ("ene".equals(key)) return WordnetNounIndexNameInstanceENE.get(TERM);
	if ("enf".equals(key)) return WordnetNounIndexNameInstanceENF.get(TERM);
	if ("eng".equals(key)) return WordnetNounIndexNameInstanceENG.get(TERM);
	if ("enh".equals(key)) return WordnetNounIndexNameInstanceENH.get(TERM);
	if ("eni".equals(key)) return WordnetNounIndexNameInstanceENI.get(TERM);
	if ("enj".equals(key)) return WordnetNounIndexNameInstanceENJ.get(TERM);
	if ("enk".equals(key)) return WordnetNounIndexNameInstanceENK.get(TERM);
	if ("enl".equals(key)) return WordnetNounIndexNameInstanceENL.get(TERM);
	if ("enm".equals(key)) return WordnetNounIndexNameInstanceENM.get(TERM);
	if ("enn".equals(key)) return WordnetNounIndexNameInstanceENN.get(TERM);
	if ("eno".equals(key)) return WordnetNounIndexNameInstanceENO.get(TERM);
	if ("enq".equals(key)) return WordnetNounIndexNameInstanceENQ.get(TERM);
	if ("enr".equals(key)) return WordnetNounIndexNameInstanceENR.get(TERM);
	if ("ens".equals(key)) return WordnetNounIndexNameInstanceENS.get(TERM);
	if ("ent".equals(key)) return WordnetNounIndexNameInstanceENT.get(TERM);
	if ("enu".equals(key)) return WordnetNounIndexNameInstanceENU.get(TERM);
	if ("env".equals(key)) return WordnetNounIndexNameInstanceENV.get(TERM);
	if ("enz".equals(key)) return WordnetNounIndexNameInstanceENZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceENA.terms());
	set.addAll(WordnetNounIndexNameInstanceENB.terms());
	set.addAll(WordnetNounIndexNameInstanceENC.terms());
	set.addAll(WordnetNounIndexNameInstanceEND.terms());
	set.addAll(WordnetNounIndexNameInstanceENE.terms());
	set.addAll(WordnetNounIndexNameInstanceENF.terms());
	set.addAll(WordnetNounIndexNameInstanceENG.terms());
	set.addAll(WordnetNounIndexNameInstanceENH.terms());
	set.addAll(WordnetNounIndexNameInstanceENI.terms());
	set.addAll(WordnetNounIndexNameInstanceENJ.terms());
	set.addAll(WordnetNounIndexNameInstanceENK.terms());
	set.addAll(WordnetNounIndexNameInstanceENL.terms());
	set.addAll(WordnetNounIndexNameInstanceENM.terms());
	set.addAll(WordnetNounIndexNameInstanceENN.terms());
	set.addAll(WordnetNounIndexNameInstanceENO.terms());
	set.addAll(WordnetNounIndexNameInstanceENQ.terms());
	set.addAll(WordnetNounIndexNameInstanceENR.terms());
	set.addAll(WordnetNounIndexNameInstanceENS.terms());
	set.addAll(WordnetNounIndexNameInstanceENT.terms());
	set.addAll(WordnetNounIndexNameInstanceENU.terms());
	set.addAll(WordnetNounIndexNameInstanceENV.terms());
	set.addAll(WordnetNounIndexNameInstanceENZ.terms());
  		return set; 	} }