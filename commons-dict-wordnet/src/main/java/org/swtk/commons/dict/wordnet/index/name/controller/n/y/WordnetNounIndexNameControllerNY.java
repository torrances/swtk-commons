package org.swtk.commons.dict.wordnet.index.name.controller.n.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.a.l.WordnetNounIndexNameInstanceNYAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.a.m.WordnetNounIndexNameInstanceNYAM;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.a.s.WordnetNounIndexNameInstanceNYAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.b.b.WordnetNounIndexNameInstanceNYBB;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.c.t.WordnetNounIndexNameInstanceNYCT;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.d.r.WordnetNounIndexNameInstanceNYDR;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.i.r.WordnetNounIndexNameInstanceNYIR;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.l.g.WordnetNounIndexNameInstanceNYLG;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.l.o.WordnetNounIndexNameInstanceNYLO;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.m.p.WordnetNounIndexNameInstanceNYMP;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.n.o.WordnetNounIndexNameInstanceNYNO;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.p.a.WordnetNounIndexNameInstanceNYPA;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.s.e.WordnetNounIndexNameInstanceNYSE;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.s.s.WordnetNounIndexNameInstanceNYSS;
	import org.swtk.commons.dict.wordnet.index.name.instance.n.y.s.t.WordnetNounIndexNameInstanceNYST;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerNY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("nyal".equals(key)) return WordnetNounIndexNameInstanceNYAL.get(TERM);
	if ("nyam".equals(key)) return WordnetNounIndexNameInstanceNYAM.get(TERM);
	if ("nyas".equals(key)) return WordnetNounIndexNameInstanceNYAS.get(TERM);
	if ("nybb".equals(key)) return WordnetNounIndexNameInstanceNYBB.get(TERM);
	if ("nyct".equals(key)) return WordnetNounIndexNameInstanceNYCT.get(TERM);
	if ("nydr".equals(key)) return WordnetNounIndexNameInstanceNYDR.get(TERM);
	if ("nyir".equals(key)) return WordnetNounIndexNameInstanceNYIR.get(TERM);
	if ("nylg".equals(key)) return WordnetNounIndexNameInstanceNYLG.get(TERM);
	if ("nylo".equals(key)) return WordnetNounIndexNameInstanceNYLO.get(TERM);
	if ("nymp".equals(key)) return WordnetNounIndexNameInstanceNYMP.get(TERM);
	if ("nyno".equals(key)) return WordnetNounIndexNameInstanceNYNO.get(TERM);
	if ("nypa".equals(key)) return WordnetNounIndexNameInstanceNYPA.get(TERM);
	if ("nyse".equals(key)) return WordnetNounIndexNameInstanceNYSE.get(TERM);
	if ("nyss".equals(key)) return WordnetNounIndexNameInstanceNYSS.get(TERM);
	if ("nyst".equals(key)) return WordnetNounIndexNameInstanceNYST.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceNYAL.terms());
	set.addAll(WordnetNounIndexNameInstanceNYAM.terms());
	set.addAll(WordnetNounIndexNameInstanceNYAS.terms());
	set.addAll(WordnetNounIndexNameInstanceNYBB.terms());
	set.addAll(WordnetNounIndexNameInstanceNYCT.terms());
	set.addAll(WordnetNounIndexNameInstanceNYDR.terms());
	set.addAll(WordnetNounIndexNameInstanceNYIR.terms());
	set.addAll(WordnetNounIndexNameInstanceNYLG.terms());
	set.addAll(WordnetNounIndexNameInstanceNYLO.terms());
	set.addAll(WordnetNounIndexNameInstanceNYMP.terms());
	set.addAll(WordnetNounIndexNameInstanceNYNO.terms());
	set.addAll(WordnetNounIndexNameInstanceNYPA.terms());
	set.addAll(WordnetNounIndexNameInstanceNYSE.terms());
	set.addAll(WordnetNounIndexNameInstanceNYSS.terms());
	set.addAll(WordnetNounIndexNameInstanceNYST.terms());
  		return set; 	} }