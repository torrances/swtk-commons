package org.swtk.commons.dict.wordnet.index.name.controller.o.w;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.w.e.n.WordnetNounIndexNameInstanceOWEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.w.l.c.WordnetNounIndexNameInstanceOWLC;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.w.l.e.WordnetNounIndexNameInstanceOWLE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.w.l.t.WordnetNounIndexNameInstanceOWLT;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.w.n.e.WordnetNounIndexNameInstanceOWNE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOW {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("owen".equals(key)) return WordnetNounIndexNameInstanceOWEN.get(TERM);
	if ("owlc".equals(key)) return WordnetNounIndexNameInstanceOWLC.get(TERM);
	if ("owle".equals(key)) return WordnetNounIndexNameInstanceOWLE.get(TERM);
	if ("owlt".equals(key)) return WordnetNounIndexNameInstanceOWLT.get(TERM);
	if ("owne".equals(key)) return WordnetNounIndexNameInstanceOWNE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOWEN.terms());
	set.addAll(WordnetNounIndexNameInstanceOWLC.terms());
	set.addAll(WordnetNounIndexNameInstanceOWLE.terms());
	set.addAll(WordnetNounIndexNameInstanceOWLT.terms());
	set.addAll(WordnetNounIndexNameInstanceOWNE.terms());
  		return set; 	} }