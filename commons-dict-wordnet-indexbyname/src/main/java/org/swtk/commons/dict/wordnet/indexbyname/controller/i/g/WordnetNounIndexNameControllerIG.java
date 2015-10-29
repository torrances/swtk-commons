package org.swtk.commons.dict.wordnet.indexbyname.controller.i.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.g.b.WordnetNounIndexNameInstanceIGB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.g.i.WordnetNounIndexNameInstanceIGI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.g.l.WordnetNounIndexNameInstanceIGL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.g.n.WordnetNounIndexNameInstanceIGN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.g.u.WordnetNounIndexNameInstanceIGU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("igb".equals(key)) return WordnetNounIndexNameInstanceIGB.get(TERM);
	if ("igi".equals(key)) return WordnetNounIndexNameInstanceIGI.get(TERM);
	if ("igl".equals(key)) return WordnetNounIndexNameInstanceIGL.get(TERM);
	if ("ign".equals(key)) return WordnetNounIndexNameInstanceIGN.get(TERM);
	if ("igu".equals(key)) return WordnetNounIndexNameInstanceIGU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIGB.terms());
	set.addAll(WordnetNounIndexNameInstanceIGI.terms());
	set.addAll(WordnetNounIndexNameInstanceIGL.terms());
	set.addAll(WordnetNounIndexNameInstanceIGN.terms());
	set.addAll(WordnetNounIndexNameInstanceIGU.terms());
  		return set; 	} }