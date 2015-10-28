package org.swtk.commons.dict.wordnet.indexbyname.controller.c.l;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.l.a.WordnetNounIndexNameInstanceCLA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.l.e.WordnetNounIndexNameInstanceCLE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.l.i.WordnetNounIndexNameInstanceCLI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.l.o.WordnetNounIndexNameInstanceCLO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.l.u.WordnetNounIndexNameInstanceCLU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.l.y.WordnetNounIndexNameInstanceCLY;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCL {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("cla".equals(key)) return WordnetNounIndexNameInstanceCLA.get(TERM);
	if ("cle".equals(key)) return WordnetNounIndexNameInstanceCLE.get(TERM);
	if ("cli".equals(key)) return WordnetNounIndexNameInstanceCLI.get(TERM);
	if ("clo".equals(key)) return WordnetNounIndexNameInstanceCLO.get(TERM);
	if ("clu".equals(key)) return WordnetNounIndexNameInstanceCLU.get(TERM);
	if ("cly".equals(key)) return WordnetNounIndexNameInstanceCLY.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCLA.terms());
	set.addAll(WordnetNounIndexNameInstanceCLE.terms());
	set.addAll(WordnetNounIndexNameInstanceCLI.terms());
	set.addAll(WordnetNounIndexNameInstanceCLO.terms());
	set.addAll(WordnetNounIndexNameInstanceCLU.terms());
	set.addAll(WordnetNounIndexNameInstanceCLY.terms());
  		return set; 	} }