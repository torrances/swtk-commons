package org.swtk.commons.dict.wordnet.indexbyname.controller.e.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.a.WordnetNounIndexNameInstanceEGA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.b.WordnetNounIndexNameInstanceEGB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.e.WordnetNounIndexNameInstanceEGE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.g.WordnetNounIndexNameInstanceEGG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.i.WordnetNounIndexNameInstanceEGI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.l.WordnetNounIndexNameInstanceEGL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.o.WordnetNounIndexNameInstanceEGO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.r.WordnetNounIndexNameInstanceEGR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.t.WordnetNounIndexNameInstanceEGT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.y.WordnetNounIndexNameInstanceEGY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("ega".equals(key)) return WordnetNounIndexNameInstanceEGA.get(TERM);
	if ("egb".equals(key)) return WordnetNounIndexNameInstanceEGB.get(TERM);
	if ("ege".equals(key)) return WordnetNounIndexNameInstanceEGE.get(TERM);
	if ("egg".equals(key)) return WordnetNounIndexNameInstanceEGG.get(TERM);
	if ("egi".equals(key)) return WordnetNounIndexNameInstanceEGI.get(TERM);
	if ("egl".equals(key)) return WordnetNounIndexNameInstanceEGL.get(TERM);
	if ("ego".equals(key)) return WordnetNounIndexNameInstanceEGO.get(TERM);
	if ("egr".equals(key)) return WordnetNounIndexNameInstanceEGR.get(TERM);
	if ("egt".equals(key)) return WordnetNounIndexNameInstanceEGT.get(TERM);
	if ("egy".equals(key)) return WordnetNounIndexNameInstanceEGY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceEGA.terms());
	set.addAll(WordnetNounIndexNameInstanceEGB.terms());
	set.addAll(WordnetNounIndexNameInstanceEGE.terms());
	set.addAll(WordnetNounIndexNameInstanceEGG.terms());
	set.addAll(WordnetNounIndexNameInstanceEGI.terms());
	set.addAll(WordnetNounIndexNameInstanceEGL.terms());
	set.addAll(WordnetNounIndexNameInstanceEGO.terms());
	set.addAll(WordnetNounIndexNameInstanceEGR.terms());
	set.addAll(WordnetNounIndexNameInstanceEGT.terms());
	set.addAll(WordnetNounIndexNameInstanceEGY.terms());
  		return set; 	} }