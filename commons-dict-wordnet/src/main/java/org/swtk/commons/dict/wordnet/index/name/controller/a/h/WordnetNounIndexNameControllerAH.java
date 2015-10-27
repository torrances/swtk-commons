package org.swtk.commons.dict.wordnet.index.name.controller.a.h;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.a.b.WordnetNounIndexNameInstanceAHAB;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.e.m.WordnetNounIndexNameInstanceAHEM;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.i.m.WordnetNounIndexNameInstanceAHIM;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.p.c.WordnetNounIndexNameInstanceAHPC;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.r.i.WordnetNounIndexNameInstanceAHRI;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.u.e.WordnetNounIndexNameInstanceAHUE;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.u.r.WordnetNounIndexNameInstanceAHUR;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.h.v.e.WordnetNounIndexNameInstanceAHVE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAH {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ahab".equals(key)) return WordnetNounIndexNameInstanceAHAB.get(TERM);
	if ("ahem".equals(key)) return WordnetNounIndexNameInstanceAHEM.get(TERM);
	if ("ahim".equals(key)) return WordnetNounIndexNameInstanceAHIM.get(TERM);
	if ("ahpc".equals(key)) return WordnetNounIndexNameInstanceAHPC.get(TERM);
	if ("ahri".equals(key)) return WordnetNounIndexNameInstanceAHRI.get(TERM);
	if ("ahue".equals(key)) return WordnetNounIndexNameInstanceAHUE.get(TERM);
	if ("ahur".equals(key)) return WordnetNounIndexNameInstanceAHUR.get(TERM);
	if ("ahve".equals(key)) return WordnetNounIndexNameInstanceAHVE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAHAB.terms());
	set.addAll(WordnetNounIndexNameInstanceAHEM.terms());
	set.addAll(WordnetNounIndexNameInstanceAHIM.terms());
	set.addAll(WordnetNounIndexNameInstanceAHPC.terms());
	set.addAll(WordnetNounIndexNameInstanceAHRI.terms());
	set.addAll(WordnetNounIndexNameInstanceAHUE.terms());
	set.addAll(WordnetNounIndexNameInstanceAHUR.terms());
	set.addAll(WordnetNounIndexNameInstanceAHVE.terms());
  		return set; 	} }