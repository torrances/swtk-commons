package org.swtk.commons.dict.wordnet.indexbyname.controller.k.e;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.a.WordnetNounIndexNameInstanceKEA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.b.WordnetNounIndexNameInstanceKEB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.c.WordnetNounIndexNameInstanceKEC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.d.WordnetNounIndexNameInstanceKED;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.e.WordnetNounIndexNameInstanceKEE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.f.WordnetNounIndexNameInstanceKEF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.g.WordnetNounIndexNameInstanceKEG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.i.WordnetNounIndexNameInstanceKEI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.k.WordnetNounIndexNameInstanceKEK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.l.WordnetNounIndexNameInstanceKEL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.m.WordnetNounIndexNameInstanceKEM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.n.WordnetNounIndexNameInstanceKEN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.o.WordnetNounIndexNameInstanceKEO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.p.WordnetNounIndexNameInstanceKEP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.r.WordnetNounIndexNameInstanceKER;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.s.WordnetNounIndexNameInstanceKES;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.t.WordnetNounIndexNameInstanceKET;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.u.WordnetNounIndexNameInstanceKEU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.y.WordnetNounIndexNameInstanceKEY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerKE {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("kea".equals(key)) return WordnetNounIndexNameInstanceKEA.get(TERM);
	if ("keb".equals(key)) return WordnetNounIndexNameInstanceKEB.get(TERM);
	if ("kec".equals(key)) return WordnetNounIndexNameInstanceKEC.get(TERM);
	if ("ked".equals(key)) return WordnetNounIndexNameInstanceKED.get(TERM);
	if ("kee".equals(key)) return WordnetNounIndexNameInstanceKEE.get(TERM);
	if ("kef".equals(key)) return WordnetNounIndexNameInstanceKEF.get(TERM);
	if ("keg".equals(key)) return WordnetNounIndexNameInstanceKEG.get(TERM);
	if ("kei".equals(key)) return WordnetNounIndexNameInstanceKEI.get(TERM);
	if ("kek".equals(key)) return WordnetNounIndexNameInstanceKEK.get(TERM);
	if ("kel".equals(key)) return WordnetNounIndexNameInstanceKEL.get(TERM);
	if ("kem".equals(key)) return WordnetNounIndexNameInstanceKEM.get(TERM);
	if ("ken".equals(key)) return WordnetNounIndexNameInstanceKEN.get(TERM);
	if ("keo".equals(key)) return WordnetNounIndexNameInstanceKEO.get(TERM);
	if ("kep".equals(key)) return WordnetNounIndexNameInstanceKEP.get(TERM);
	if ("ker".equals(key)) return WordnetNounIndexNameInstanceKER.get(TERM);
	if ("kes".equals(key)) return WordnetNounIndexNameInstanceKES.get(TERM);
	if ("ket".equals(key)) return WordnetNounIndexNameInstanceKET.get(TERM);
	if ("keu".equals(key)) return WordnetNounIndexNameInstanceKEU.get(TERM);
	if ("key".equals(key)) return WordnetNounIndexNameInstanceKEY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceKEA.terms());
	set.addAll(WordnetNounIndexNameInstanceKEB.terms());
	set.addAll(WordnetNounIndexNameInstanceKEC.terms());
	set.addAll(WordnetNounIndexNameInstanceKED.terms());
	set.addAll(WordnetNounIndexNameInstanceKEE.terms());
	set.addAll(WordnetNounIndexNameInstanceKEF.terms());
	set.addAll(WordnetNounIndexNameInstanceKEG.terms());
	set.addAll(WordnetNounIndexNameInstanceKEI.terms());
	set.addAll(WordnetNounIndexNameInstanceKEK.terms());
	set.addAll(WordnetNounIndexNameInstanceKEL.terms());
	set.addAll(WordnetNounIndexNameInstanceKEM.terms());
	set.addAll(WordnetNounIndexNameInstanceKEN.terms());
	set.addAll(WordnetNounIndexNameInstanceKEO.terms());
	set.addAll(WordnetNounIndexNameInstanceKEP.terms());
	set.addAll(WordnetNounIndexNameInstanceKER.terms());
	set.addAll(WordnetNounIndexNameInstanceKES.terms());
	set.addAll(WordnetNounIndexNameInstanceKET.terms());
	set.addAll(WordnetNounIndexNameInstanceKEU.terms());
	set.addAll(WordnetNounIndexNameInstanceKEY.terms());
  		return set; 	} }