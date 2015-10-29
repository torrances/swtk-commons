package org.swtk.commons.dict.wordnet.indexbyname.controller.i.l;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.a.WordnetNounIndexNameInstanceILA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.e.WordnetNounIndexNameInstanceILE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.i.WordnetNounIndexNameInstanceILI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.l.WordnetNounIndexNameInstanceILL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.m.WordnetNounIndexNameInstanceILM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.o.WordnetNounIndexNameInstanceILO;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("ila".equals(key)) return WordnetNounIndexNameInstanceILA.get(TERM);
	if ("ile".equals(key)) return WordnetNounIndexNameInstanceILE.get(TERM);
	if ("ili".equals(key)) return WordnetNounIndexNameInstanceILI.get(TERM);
	if ("ill".equals(key)) return WordnetNounIndexNameInstanceILL.get(TERM);
	if ("ilm".equals(key)) return WordnetNounIndexNameInstanceILM.get(TERM);
	if ("ilo".equals(key)) return WordnetNounIndexNameInstanceILO.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceILA.terms());
	set.addAll(WordnetNounIndexNameInstanceILE.terms());
	set.addAll(WordnetNounIndexNameInstanceILI.terms());
	set.addAll(WordnetNounIndexNameInstanceILL.terms());
	set.addAll(WordnetNounIndexNameInstanceILM.terms());
	set.addAll(WordnetNounIndexNameInstanceILO.terms());
  		return set; 	} }