package org.swtk.commons.dict.wordnet.index.name.controller.i.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.a.e.a.WordnetNounIndexNameInstanceIAEA;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.a.g.o.WordnetNounIndexNameInstanceIAGO;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.a.m.b.WordnetNounIndexNameInstanceIAMB;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.a.n.f.WordnetNounIndexNameInstanceIANF;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.a.p.e.WordnetNounIndexNameInstanceIAPE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("iaea".equals(key)) return WordnetNounIndexNameInstanceIAEA.get(TERM);
	if ("iago".equals(key)) return WordnetNounIndexNameInstanceIAGO.get(TERM);
	if ("iamb".equals(key)) return WordnetNounIndexNameInstanceIAMB.get(TERM);
	if ("ianf".equals(key)) return WordnetNounIndexNameInstanceIANF.get(TERM);
	if ("iape".equals(key)) return WordnetNounIndexNameInstanceIAPE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIAEA.terms());
	set.addAll(WordnetNounIndexNameInstanceIAGO.terms());
	set.addAll(WordnetNounIndexNameInstanceIAMB.terms());
	set.addAll(WordnetNounIndexNameInstanceIANF.terms());
	set.addAll(WordnetNounIndexNameInstanceIAPE.terms());
  		return set; 	} }