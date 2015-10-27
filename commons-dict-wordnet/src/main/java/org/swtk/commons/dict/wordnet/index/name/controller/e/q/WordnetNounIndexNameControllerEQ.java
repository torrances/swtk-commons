package org.swtk.commons.dict.wordnet.index.name.controller.e.q;  import java.util.Collection;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.e.e.l.a.WordnetNounIndexNameInstanceEELA;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.e.l.b.WordnetNounIndexNameInstanceEELB;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.e.l.g.WordnetNounIndexNameInstanceEELG;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.e.l.p.WordnetNounIndexNameInstanceEELP;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.e.l.w.WordnetNounIndexNameInstanceEELW;
	import org.swtk.commons.dict.wordnet.index.name.instance.e.e.r.i.WordnetNounIndexNameInstanceEERI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerEQ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("eela".equals(key)) return WordnetNounIndexNameInstanceEELA.get(TERM);
	if ("eelb".equals(key)) return WordnetNounIndexNameInstanceEELB.get(TERM);
	if ("eelg".equals(key)) return WordnetNounIndexNameInstanceEELG.get(TERM);
	if ("eelp".equals(key)) return WordnetNounIndexNameInstanceEELP.get(TERM);
	if ("eelw".equals(key)) return WordnetNounIndexNameInstanceEELW.get(TERM);
	if ("eeri".equals(key)) return WordnetNounIndexNameInstanceEERI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} }