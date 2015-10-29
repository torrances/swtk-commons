package org.swtk.commons.dict.wordnet.indexbyname.controller.o.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.c.WordnetNounIndexNameInstanceOOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.d.WordnetNounIndexNameInstanceOOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.g.WordnetNounIndexNameInstanceOOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.l.WordnetNounIndexNameInstanceOOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.m.WordnetNounIndexNameInstanceOOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.p.WordnetNounIndexNameInstanceOOP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.r.WordnetNounIndexNameInstanceOOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.s.WordnetNounIndexNameInstanceOOS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.t.WordnetNounIndexNameInstanceOOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.o.o.z.WordnetNounIndexNameInstanceOOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("ooc".equals(key)) return WordnetNounIndexNameInstanceOOC.get(TERM);
	if ("ood".equals(key)) return WordnetNounIndexNameInstanceOOD.get(TERM);
	if ("oog".equals(key)) return WordnetNounIndexNameInstanceOOG.get(TERM);
	if ("ool".equals(key)) return WordnetNounIndexNameInstanceOOL.get(TERM);
	if ("oom".equals(key)) return WordnetNounIndexNameInstanceOOM.get(TERM);
	if ("oop".equals(key)) return WordnetNounIndexNameInstanceOOP.get(TERM);
	if ("oor".equals(key)) return WordnetNounIndexNameInstanceOOR.get(TERM);
	if ("oos".equals(key)) return WordnetNounIndexNameInstanceOOS.get(TERM);
	if ("oot".equals(key)) return WordnetNounIndexNameInstanceOOT.get(TERM);
	if ("ooz".equals(key)) return WordnetNounIndexNameInstanceOOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOOC.terms());
	set.addAll(WordnetNounIndexNameInstanceOOD.terms());
	set.addAll(WordnetNounIndexNameInstanceOOG.terms());
	set.addAll(WordnetNounIndexNameInstanceOOL.terms());
	set.addAll(WordnetNounIndexNameInstanceOOM.terms());
	set.addAll(WordnetNounIndexNameInstanceOOP.terms());
	set.addAll(WordnetNounIndexNameInstanceOOR.terms());
	set.addAll(WordnetNounIndexNameInstanceOOS.terms());
	set.addAll(WordnetNounIndexNameInstanceOOT.terms());
	set.addAll(WordnetNounIndexNameInstanceOOZ.terms());
  		return set; 	} }