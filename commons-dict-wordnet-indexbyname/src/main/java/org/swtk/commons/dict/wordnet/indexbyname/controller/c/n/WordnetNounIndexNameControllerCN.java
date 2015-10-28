package org.swtk.commons.dict.wordnet.indexbyname.controller.c.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.n.e.WordnetNounIndexNameInstanceCNE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.n.i.WordnetNounIndexNameInstanceCNI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.n.o.WordnetNounIndexNameInstanceCNO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.n.p.WordnetNounIndexNameInstanceCNP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.n.u.WordnetNounIndexNameInstanceCNU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("cne".equals(key)) return WordnetNounIndexNameInstanceCNE.get(TERM);
	if ("cni".equals(key)) return WordnetNounIndexNameInstanceCNI.get(TERM);
	if ("cno".equals(key)) return WordnetNounIndexNameInstanceCNO.get(TERM);
	if ("cnp".equals(key)) return WordnetNounIndexNameInstanceCNP.get(TERM);
	if ("cnu".equals(key)) return WordnetNounIndexNameInstanceCNU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCNE.terms());
	set.addAll(WordnetNounIndexNameInstanceCNI.terms());
	set.addAll(WordnetNounIndexNameInstanceCNO.terms());
	set.addAll(WordnetNounIndexNameInstanceCNP.terms());
	set.addAll(WordnetNounIndexNameInstanceCNU.terms());
  		return set; 	} }