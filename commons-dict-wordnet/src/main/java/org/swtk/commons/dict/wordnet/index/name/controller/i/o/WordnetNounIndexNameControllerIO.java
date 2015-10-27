package org.swtk.commons.dict.wordnet.index.name.controller.i.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.d.i.WordnetNounIndexNameInstanceIODI;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.d.o.WordnetNounIndexNameInstanceIODO;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.n.e.WordnetNounIndexNameInstanceIONE;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.n.i.WordnetNounIndexNameInstanceIONI;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.n.o.WordnetNounIndexNameInstanceIONO;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.n.t.WordnetNounIndexNameInstanceIONT;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.t.a.WordnetNounIndexNameInstanceIOTA;
	import org.swtk.commons.dict.wordnet.index.name.instance.i.o.w.a.WordnetNounIndexNameInstanceIOWA;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("iodi".equals(key)) return WordnetNounIndexNameInstanceIODI.get(TERM);
	if ("iodo".equals(key)) return WordnetNounIndexNameInstanceIODO.get(TERM);
	if ("ione".equals(key)) return WordnetNounIndexNameInstanceIONE.get(TERM);
	if ("ioni".equals(key)) return WordnetNounIndexNameInstanceIONI.get(TERM);
	if ("iono".equals(key)) return WordnetNounIndexNameInstanceIONO.get(TERM);
	if ("iont".equals(key)) return WordnetNounIndexNameInstanceIONT.get(TERM);
	if ("iota".equals(key)) return WordnetNounIndexNameInstanceIOTA.get(TERM);
	if ("iowa".equals(key)) return WordnetNounIndexNameInstanceIOWA.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIODI.terms());
	set.addAll(WordnetNounIndexNameInstanceIODO.terms());
	set.addAll(WordnetNounIndexNameInstanceIONE.terms());
	set.addAll(WordnetNounIndexNameInstanceIONI.terms());
	set.addAll(WordnetNounIndexNameInstanceIONO.terms());
	set.addAll(WordnetNounIndexNameInstanceIONT.terms());
	set.addAll(WordnetNounIndexNameInstanceIOTA.terms());
	set.addAll(WordnetNounIndexNameInstanceIOWA.terms());
  		return set; 	} }