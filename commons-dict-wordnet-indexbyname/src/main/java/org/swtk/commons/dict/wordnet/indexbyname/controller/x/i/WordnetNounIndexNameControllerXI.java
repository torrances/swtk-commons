package org.swtk.commons.dict.wordnet.indexbyname.controller.x.i;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.i.a.WordnetNounIndexNameInstanceXIA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.i.i.WordnetNounIndexNameInstanceXII;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.i.n.WordnetNounIndexNameInstanceXIN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.i.p.WordnetNounIndexNameInstanceXIP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.x.i.z.WordnetNounIndexNameInstanceXIZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerXI {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.replaceAll(" ", "").substring(0, 3).toLowerCase(); 			if ("xia".equals(key)) return WordnetNounIndexNameInstanceXIA.get(TERM);
	if ("xii".equals(key)) return WordnetNounIndexNameInstanceXII.get(TERM);
	if ("xin".equals(key)) return WordnetNounIndexNameInstanceXIN.get(TERM);
	if ("xip".equals(key)) return WordnetNounIndexNameInstanceXIP.get(TERM);
	if ("xiz".equals(key)) return WordnetNounIndexNameInstanceXIZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	}  	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceXIA.terms());
	set.addAll(WordnetNounIndexNameInstanceXII.terms());
	set.addAll(WordnetNounIndexNameInstanceXIN.terms());
	set.addAll(WordnetNounIndexNameInstanceXIP.terms());
	set.addAll(WordnetNounIndexNameInstanceXIZ.terms());
  		return set; 	} }