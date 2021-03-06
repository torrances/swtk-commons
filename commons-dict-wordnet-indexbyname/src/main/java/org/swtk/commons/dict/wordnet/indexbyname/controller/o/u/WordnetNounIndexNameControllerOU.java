package org.swtk.commons.dict.wordnet.indexbyname.controller.o.u;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.a.WordnetNounIndexNameInstanceOUA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.b.WordnetNounIndexNameInstanceOUB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.g.WordnetNounIndexNameInstanceOUG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.i.WordnetNounIndexNameInstanceOUI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.j.WordnetNounIndexNameInstanceOUJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.n.WordnetNounIndexNameInstanceOUN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.r.WordnetNounIndexNameInstanceOUR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.s.WordnetNounIndexNameInstanceOUS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.t.WordnetNounIndexNameInstanceOUT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.u.z.WordnetNounIndexNameInstanceOUZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("oua".equals(key)) return WordnetNounIndexNameInstanceOUA.get(TERM);
	if ("oub".equals(key)) return WordnetNounIndexNameInstanceOUB.get(TERM);
	if ("oug".equals(key)) return WordnetNounIndexNameInstanceOUG.get(TERM);
	if ("oui".equals(key)) return WordnetNounIndexNameInstanceOUI.get(TERM);
	if ("ouj".equals(key)) return WordnetNounIndexNameInstanceOUJ.get(TERM);
	if ("oun".equals(key)) return WordnetNounIndexNameInstanceOUN.get(TERM);
	if ("our".equals(key)) return WordnetNounIndexNameInstanceOUR.get(TERM);
	if ("ous".equals(key)) return WordnetNounIndexNameInstanceOUS.get(TERM);
	if ("out".equals(key)) return WordnetNounIndexNameInstanceOUT.get(TERM);
	if ("ouz".equals(key)) return WordnetNounIndexNameInstanceOUZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOUA.terms());
	set.addAll(WordnetNounIndexNameInstanceOUB.terms());
	set.addAll(WordnetNounIndexNameInstanceOUG.terms());
	set.addAll(WordnetNounIndexNameInstanceOUI.terms());
	set.addAll(WordnetNounIndexNameInstanceOUJ.terms());
	set.addAll(WordnetNounIndexNameInstanceOUN.terms());
	set.addAll(WordnetNounIndexNameInstanceOUR.terms());
	set.addAll(WordnetNounIndexNameInstanceOUS.terms());
	set.addAll(WordnetNounIndexNameInstanceOUT.terms());
	set.addAll(WordnetNounIndexNameInstanceOUZ.terms());
  		return set; 	} }