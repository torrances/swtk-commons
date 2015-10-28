package org.swtk.commons.dict.wordnet.indexbyname.controller.e.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.b.WordnetNounIndexNameInstanceEIB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.c.WordnetNounIndexNameInstanceEIC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.d.WordnetNounIndexNameInstanceEID;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.f.WordnetNounIndexNameInstanceEIF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.g.WordnetNounIndexNameInstanceEIG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.j.WordnetNounIndexNameInstanceEIJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.m.WordnetNounIndexNameInstanceEIM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.n.WordnetNounIndexNameInstanceEIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.r.WordnetNounIndexNameInstanceEIR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.i.s.WordnetNounIndexNameInstanceEIS;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("eib".equals(key)) return WordnetNounIndexNameInstanceEIB.get(TERM);
	if ("eic".equals(key)) return WordnetNounIndexNameInstanceEIC.get(TERM);
	if ("eid".equals(key)) return WordnetNounIndexNameInstanceEID.get(TERM);
	if ("eif".equals(key)) return WordnetNounIndexNameInstanceEIF.get(TERM);
	if ("eig".equals(key)) return WordnetNounIndexNameInstanceEIG.get(TERM);
	if ("eij".equals(key)) return WordnetNounIndexNameInstanceEIJ.get(TERM);
	if ("eim".equals(key)) return WordnetNounIndexNameInstanceEIM.get(TERM);
	if ("ein".equals(key)) return WordnetNounIndexNameInstanceEIN.get(TERM);
	if ("eir".equals(key)) return WordnetNounIndexNameInstanceEIR.get(TERM);
	if ("eis".equals(key)) return WordnetNounIndexNameInstanceEIS.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEIB.terms());
	set.addAll(WordnetNounIndexNameInstanceEIC.terms());
	set.addAll(WordnetNounIndexNameInstanceEID.terms());
	set.addAll(WordnetNounIndexNameInstanceEIF.terms());
	set.addAll(WordnetNounIndexNameInstanceEIG.terms());
	set.addAll(WordnetNounIndexNameInstanceEIJ.terms());
	set.addAll(WordnetNounIndexNameInstanceEIM.terms());
	set.addAll(WordnetNounIndexNameInstanceEIN.terms());
	set.addAll(WordnetNounIndexNameInstanceEIR.terms());
	set.addAll(WordnetNounIndexNameInstanceEIS.terms());
  		return set; 	} }