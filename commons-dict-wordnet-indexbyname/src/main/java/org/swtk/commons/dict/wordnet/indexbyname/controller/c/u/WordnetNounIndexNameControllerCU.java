package org.swtk.commons.dict.wordnet.indexbyname.controller.c.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.b.WordnetNounIndexNameInstanceCUB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.c.WordnetNounIndexNameInstanceCUC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.d.WordnetNounIndexNameInstanceCUD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.f.WordnetNounIndexNameInstanceCUF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.i.WordnetNounIndexNameInstanceCUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.k.WordnetNounIndexNameInstanceCUK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.l.WordnetNounIndexNameInstanceCUL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.m.WordnetNounIndexNameInstanceCUM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.n.WordnetNounIndexNameInstanceCUN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.o.WordnetNounIndexNameInstanceCUO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.p.WordnetNounIndexNameInstanceCUP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.q.WordnetNounIndexNameInstanceCUQ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.r.WordnetNounIndexNameInstanceCUR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.s.WordnetNounIndexNameInstanceCUS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.t.WordnetNounIndexNameInstanceCUT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.v.WordnetNounIndexNameInstanceCUV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.z.WordnetNounIndexNameInstanceCUZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("cub".equals(key)) return WordnetNounIndexNameInstanceCUB.get(TERM);
	if ("cuc".equals(key)) return WordnetNounIndexNameInstanceCUC.get(TERM);
	if ("cud".equals(key)) return WordnetNounIndexNameInstanceCUD.get(TERM);
	if ("cuf".equals(key)) return WordnetNounIndexNameInstanceCUF.get(TERM);
	if ("cui".equals(key)) return WordnetNounIndexNameInstanceCUI.get(TERM);
	if ("cuk".equals(key)) return WordnetNounIndexNameInstanceCUK.get(TERM);
	if ("cul".equals(key)) return WordnetNounIndexNameInstanceCUL.get(TERM);
	if ("cum".equals(key)) return WordnetNounIndexNameInstanceCUM.get(TERM);
	if ("cun".equals(key)) return WordnetNounIndexNameInstanceCUN.get(TERM);
	if ("cuo".equals(key)) return WordnetNounIndexNameInstanceCUO.get(TERM);
	if ("cup".equals(key)) return WordnetNounIndexNameInstanceCUP.get(TERM);
	if ("cuq".equals(key)) return WordnetNounIndexNameInstanceCUQ.get(TERM);
	if ("cur".equals(key)) return WordnetNounIndexNameInstanceCUR.get(TERM);
	if ("cus".equals(key)) return WordnetNounIndexNameInstanceCUS.get(TERM);
	if ("cut".equals(key)) return WordnetNounIndexNameInstanceCUT.get(TERM);
	if ("cuv".equals(key)) return WordnetNounIndexNameInstanceCUV.get(TERM);
	if ("cuz".equals(key)) return WordnetNounIndexNameInstanceCUZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCUB.terms());
	set.addAll(WordnetNounIndexNameInstanceCUC.terms());
	set.addAll(WordnetNounIndexNameInstanceCUD.terms());
	set.addAll(WordnetNounIndexNameInstanceCUF.terms());
	set.addAll(WordnetNounIndexNameInstanceCUI.terms());
	set.addAll(WordnetNounIndexNameInstanceCUK.terms());
	set.addAll(WordnetNounIndexNameInstanceCUL.terms());
	set.addAll(WordnetNounIndexNameInstanceCUM.terms());
	set.addAll(WordnetNounIndexNameInstanceCUN.terms());
	set.addAll(WordnetNounIndexNameInstanceCUO.terms());
	set.addAll(WordnetNounIndexNameInstanceCUP.terms());
	set.addAll(WordnetNounIndexNameInstanceCUQ.terms());
	set.addAll(WordnetNounIndexNameInstanceCUR.terms());
	set.addAll(WordnetNounIndexNameInstanceCUS.terms());
	set.addAll(WordnetNounIndexNameInstanceCUT.terms());
	set.addAll(WordnetNounIndexNameInstanceCUV.terms());
	set.addAll(WordnetNounIndexNameInstanceCUZ.terms());
  		return set; 	} }