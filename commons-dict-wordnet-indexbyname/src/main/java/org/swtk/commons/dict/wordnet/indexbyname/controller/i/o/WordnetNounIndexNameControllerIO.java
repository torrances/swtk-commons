package org.swtk.commons.dict.wordnet.indexbyname.controller.i.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.o.d.WordnetNounIndexNameInstanceIOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.o.n.WordnetNounIndexNameInstanceION;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.o.t.WordnetNounIndexNameInstanceIOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.i.o.w.WordnetNounIndexNameInstanceIOW;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerIO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("iod".equals(key)) return WordnetNounIndexNameInstanceIOD.get(TERM);
	if ("ion".equals(key)) return WordnetNounIndexNameInstanceION.get(TERM);
	if ("iot".equals(key)) return WordnetNounIndexNameInstanceIOT.get(TERM);
	if ("iow".equals(key)) return WordnetNounIndexNameInstanceIOW.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceIOD.terms());
	set.addAll(WordnetNounIndexNameInstanceION.terms());
	set.addAll(WordnetNounIndexNameInstanceIOT.terms());
	set.addAll(WordnetNounIndexNameInstanceIOW.terms());
  		return set; 	} }