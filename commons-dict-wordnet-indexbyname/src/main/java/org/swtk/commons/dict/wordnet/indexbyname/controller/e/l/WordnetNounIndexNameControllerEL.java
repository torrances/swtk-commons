package org.swtk.commons.dict.wordnet.indexbyname.controller.e.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.a.WordnetNounIndexNameInstanceELA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.b.WordnetNounIndexNameInstanceELB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.d.WordnetNounIndexNameInstanceELD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.e.WordnetNounIndexNameInstanceELE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.g.WordnetNounIndexNameInstanceELG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.i.WordnetNounIndexNameInstanceELI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.k.WordnetNounIndexNameInstanceELK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.l.WordnetNounIndexNameInstanceELL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.m.WordnetNounIndexNameInstanceELM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.o.WordnetNounIndexNameInstanceELO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.s.WordnetNounIndexNameInstanceELS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.u.WordnetNounIndexNameInstanceELU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.v.WordnetNounIndexNameInstanceELV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.y.WordnetNounIndexNameInstanceELY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ela".equals(key)) return WordnetNounIndexNameInstanceELA.get(TERM);
	if ("elb".equals(key)) return WordnetNounIndexNameInstanceELB.get(TERM);
	if ("eld".equals(key)) return WordnetNounIndexNameInstanceELD.get(TERM);
	if ("ele".equals(key)) return WordnetNounIndexNameInstanceELE.get(TERM);
	if ("elg".equals(key)) return WordnetNounIndexNameInstanceELG.get(TERM);
	if ("eli".equals(key)) return WordnetNounIndexNameInstanceELI.get(TERM);
	if ("elk".equals(key)) return WordnetNounIndexNameInstanceELK.get(TERM);
	if ("ell".equals(key)) return WordnetNounIndexNameInstanceELL.get(TERM);
	if ("elm".equals(key)) return WordnetNounIndexNameInstanceELM.get(TERM);
	if ("elo".equals(key)) return WordnetNounIndexNameInstanceELO.get(TERM);
	if ("els".equals(key)) return WordnetNounIndexNameInstanceELS.get(TERM);
	if ("elu".equals(key)) return WordnetNounIndexNameInstanceELU.get(TERM);
	if ("elv".equals(key)) return WordnetNounIndexNameInstanceELV.get(TERM);
	if ("ely".equals(key)) return WordnetNounIndexNameInstanceELY.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceELA.terms());
	set.addAll(WordnetNounIndexNameInstanceELB.terms());
	set.addAll(WordnetNounIndexNameInstanceELD.terms());
	set.addAll(WordnetNounIndexNameInstanceELE.terms());
	set.addAll(WordnetNounIndexNameInstanceELG.terms());
	set.addAll(WordnetNounIndexNameInstanceELI.terms());
	set.addAll(WordnetNounIndexNameInstanceELK.terms());
	set.addAll(WordnetNounIndexNameInstanceELL.terms());
	set.addAll(WordnetNounIndexNameInstanceELM.terms());
	set.addAll(WordnetNounIndexNameInstanceELO.terms());
	set.addAll(WordnetNounIndexNameInstanceELS.terms());
	set.addAll(WordnetNounIndexNameInstanceELU.terms());
	set.addAll(WordnetNounIndexNameInstanceELV.terms());
	set.addAll(WordnetNounIndexNameInstanceELY.terms());
  		return set; 	} }