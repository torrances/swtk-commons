package org.swtk.commons.dict.wordnet.indexbyname.controller.v.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.a.WordnetNounIndexNameInstanceVEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.b.WordnetNounIndexNameInstanceVEB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.c.WordnetNounIndexNameInstanceVEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.d.WordnetNounIndexNameInstanceVED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.e.WordnetNounIndexNameInstanceVEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.g.WordnetNounIndexNameInstanceVEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.h.WordnetNounIndexNameInstanceVEH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.i.WordnetNounIndexNameInstanceVEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.l.WordnetNounIndexNameInstanceVEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.n.WordnetNounIndexNameInstanceVEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.p.WordnetNounIndexNameInstanceVEP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.r.WordnetNounIndexNameInstanceVER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.s.WordnetNounIndexNameInstanceVES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.t.WordnetNounIndexNameInstanceVET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.x.WordnetNounIndexNameInstanceVEX;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerVE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("vea".equals(key)) return WordnetNounIndexNameInstanceVEA.get(TERM);
	if ("veb".equals(key)) return WordnetNounIndexNameInstanceVEB.get(TERM);
	if ("vec".equals(key)) return WordnetNounIndexNameInstanceVEC.get(TERM);
	if ("ved".equals(key)) return WordnetNounIndexNameInstanceVED.get(TERM);
	if ("vee".equals(key)) return WordnetNounIndexNameInstanceVEE.get(TERM);
	if ("veg".equals(key)) return WordnetNounIndexNameInstanceVEG.get(TERM);
	if ("veh".equals(key)) return WordnetNounIndexNameInstanceVEH.get(TERM);
	if ("vei".equals(key)) return WordnetNounIndexNameInstanceVEI.get(TERM);
	if ("vel".equals(key)) return WordnetNounIndexNameInstanceVEL.get(TERM);
	if ("ven".equals(key)) return WordnetNounIndexNameInstanceVEN.get(TERM);
	if ("vep".equals(key)) return WordnetNounIndexNameInstanceVEP.get(TERM);
	if ("ver".equals(key)) return WordnetNounIndexNameInstanceVER.get(TERM);
	if ("ves".equals(key)) return WordnetNounIndexNameInstanceVES.get(TERM);
	if ("vet".equals(key)) return WordnetNounIndexNameInstanceVET.get(TERM);
	if ("vex".equals(key)) return WordnetNounIndexNameInstanceVEX.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceVEA.terms());
	set.addAll(WordnetNounIndexNameInstanceVEB.terms());
	set.addAll(WordnetNounIndexNameInstanceVEC.terms());
	set.addAll(WordnetNounIndexNameInstanceVED.terms());
	set.addAll(WordnetNounIndexNameInstanceVEE.terms());
	set.addAll(WordnetNounIndexNameInstanceVEG.terms());
	set.addAll(WordnetNounIndexNameInstanceVEH.terms());
	set.addAll(WordnetNounIndexNameInstanceVEI.terms());
	set.addAll(WordnetNounIndexNameInstanceVEL.terms());
	set.addAll(WordnetNounIndexNameInstanceVEN.terms());
	set.addAll(WordnetNounIndexNameInstanceVEP.terms());
	set.addAll(WordnetNounIndexNameInstanceVER.terms());
	set.addAll(WordnetNounIndexNameInstanceVES.terms());
	set.addAll(WordnetNounIndexNameInstanceVET.terms());
	set.addAll(WordnetNounIndexNameInstanceVEX.terms());
  		return set; 	} }