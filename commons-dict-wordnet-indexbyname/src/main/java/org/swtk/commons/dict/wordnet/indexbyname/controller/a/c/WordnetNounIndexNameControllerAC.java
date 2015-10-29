package org.swtk.commons.dict.wordnet.indexbyname.controller.a.c;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.a.WordnetNounIndexNameInstanceACA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.c.WordnetNounIndexNameInstanceACC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.e.WordnetNounIndexNameInstanceACE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.h.WordnetNounIndexNameInstanceACH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.i.WordnetNounIndexNameInstanceACI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.k.WordnetNounIndexNameInstanceACK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.l.WordnetNounIndexNameInstanceACL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.m.WordnetNounIndexNameInstanceACM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.n.WordnetNounIndexNameInstanceACN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.o.WordnetNounIndexNameInstanceACO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.q.WordnetNounIndexNameInstanceACQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.r.WordnetNounIndexNameInstanceACR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.t.WordnetNounIndexNameInstanceACT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.u.WordnetNounIndexNameInstanceACU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.y.WordnetNounIndexNameInstanceACY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAC {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("aca".equals(key)) return WordnetNounIndexNameInstanceACA.get(TERM);
	if ("acc".equals(key)) return WordnetNounIndexNameInstanceACC.get(TERM);
	if ("ace".equals(key)) return WordnetNounIndexNameInstanceACE.get(TERM);
	if ("ach".equals(key)) return WordnetNounIndexNameInstanceACH.get(TERM);
	if ("aci".equals(key)) return WordnetNounIndexNameInstanceACI.get(TERM);
	if ("ack".equals(key)) return WordnetNounIndexNameInstanceACK.get(TERM);
	if ("acl".equals(key)) return WordnetNounIndexNameInstanceACL.get(TERM);
	if ("acm".equals(key)) return WordnetNounIndexNameInstanceACM.get(TERM);
	if ("acn".equals(key)) return WordnetNounIndexNameInstanceACN.get(TERM);
	if ("aco".equals(key)) return WordnetNounIndexNameInstanceACO.get(TERM);
	if ("acq".equals(key)) return WordnetNounIndexNameInstanceACQ.get(TERM);
	if ("acr".equals(key)) return WordnetNounIndexNameInstanceACR.get(TERM);
	if ("act".equals(key)) return WordnetNounIndexNameInstanceACT.get(TERM);
	if ("acu".equals(key)) return WordnetNounIndexNameInstanceACU.get(TERM);
	if ("acy".equals(key)) return WordnetNounIndexNameInstanceACY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceACA.terms());
	set.addAll(WordnetNounIndexNameInstanceACC.terms());
	set.addAll(WordnetNounIndexNameInstanceACE.terms());
	set.addAll(WordnetNounIndexNameInstanceACH.terms());
	set.addAll(WordnetNounIndexNameInstanceACI.terms());
	set.addAll(WordnetNounIndexNameInstanceACK.terms());
	set.addAll(WordnetNounIndexNameInstanceACL.terms());
	set.addAll(WordnetNounIndexNameInstanceACM.terms());
	set.addAll(WordnetNounIndexNameInstanceACN.terms());
	set.addAll(WordnetNounIndexNameInstanceACO.terms());
	set.addAll(WordnetNounIndexNameInstanceACQ.terms());
	set.addAll(WordnetNounIndexNameInstanceACR.terms());
	set.addAll(WordnetNounIndexNameInstanceACT.terms());
	set.addAll(WordnetNounIndexNameInstanceACU.terms());
	set.addAll(WordnetNounIndexNameInstanceACY.terms());
  		return set; 	} }