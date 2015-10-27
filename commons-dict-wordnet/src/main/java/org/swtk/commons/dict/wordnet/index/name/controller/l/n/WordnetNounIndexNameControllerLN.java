package org.swtk.commons.dict.wordnet.index.name.controller.l.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.l.l.a.m.WordnetNounIndexNameInstanceLLAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.l.l.a.n.WordnetNounIndexNameInstanceLLAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.l.l.o.y.WordnetNounIndexNameInstanceLLOY;
	import org.swtk.commons.dict.wordnet.index.name.instance.l.l.u.d.WordnetNounIndexNameInstanceLLUD;
	import org.swtk.commons.dict.wordnet.index.name.instance.l.l.u.l.WordnetNounIndexNameInstanceLLUL;
	import org.swtk.commons.dict.wordnet.index.name.instance.l.l.y.r.WordnetNounIndexNameInstanceLLYR;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerLN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("llam".equals(key)) return WordnetNounIndexNameInstanceLLAM.get(TERM);
	if ("llan".equals(key)) return WordnetNounIndexNameInstanceLLAN.get(TERM);
	if ("lloy".equals(key)) return WordnetNounIndexNameInstanceLLOY.get(TERM);
	if ("llud".equals(key)) return WordnetNounIndexNameInstanceLLUD.get(TERM);
	if ("llul".equals(key)) return WordnetNounIndexNameInstanceLLUL.get(TERM);
	if ("llyr".equals(key)) return WordnetNounIndexNameInstanceLLYR.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceLLAM.terms());
	set.addAll(WordnetNounIndexNameInstanceLLAN.terms());
	set.addAll(WordnetNounIndexNameInstanceLLOY.terms());
	set.addAll(WordnetNounIndexNameInstanceLLUD.terms());
	set.addAll(WordnetNounIndexNameInstanceLLUL.terms());
	set.addAll(WordnetNounIndexNameInstanceLLYR.terms());
  		return set; 	} }