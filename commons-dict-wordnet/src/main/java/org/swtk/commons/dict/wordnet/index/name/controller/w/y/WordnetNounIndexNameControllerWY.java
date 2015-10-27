package org.swtk.commons.dict.wordnet.index.name.controller.w.y;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.a.t.WordnetNounIndexNameInstanceWYAT;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.c.h.WordnetNounIndexNameInstanceWYCH;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.c.l.WordnetNounIndexNameInstanceWYCL;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.e.t.WordnetNounIndexNameInstanceWYET;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.k.e.WordnetNounIndexNameInstanceWYKE;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.l.e.WordnetNounIndexNameInstanceWYLE;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.l.i.WordnetNounIndexNameInstanceWYLI;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.n.e.WordnetNounIndexNameInstanceWYNE;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.n.f.WordnetNounIndexNameInstanceWYNF;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.n.n.WordnetNounIndexNameInstanceWYNN;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.o.m.WordnetNounIndexNameInstanceWYOM;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.r.d.WordnetNounIndexNameInstanceWYRD;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.s.z.WordnetNounIndexNameInstanceWYSZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.t.e.WordnetNounIndexNameInstanceWYTE;
	import org.swtk.commons.dict.wordnet.index.name.instance.w.y.v.e.WordnetNounIndexNameInstanceWYVE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerWY {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("wyat".equals(key)) return WordnetNounIndexNameInstanceWYAT.get(TERM);
	if ("wych".equals(key)) return WordnetNounIndexNameInstanceWYCH.get(TERM);
	if ("wycl".equals(key)) return WordnetNounIndexNameInstanceWYCL.get(TERM);
	if ("wyet".equals(key)) return WordnetNounIndexNameInstanceWYET.get(TERM);
	if ("wyke".equals(key)) return WordnetNounIndexNameInstanceWYKE.get(TERM);
	if ("wyle".equals(key)) return WordnetNounIndexNameInstanceWYLE.get(TERM);
	if ("wyli".equals(key)) return WordnetNounIndexNameInstanceWYLI.get(TERM);
	if ("wyne".equals(key)) return WordnetNounIndexNameInstanceWYNE.get(TERM);
	if ("wynf".equals(key)) return WordnetNounIndexNameInstanceWYNF.get(TERM);
	if ("wynn".equals(key)) return WordnetNounIndexNameInstanceWYNN.get(TERM);
	if ("wyom".equals(key)) return WordnetNounIndexNameInstanceWYOM.get(TERM);
	if ("wyrd".equals(key)) return WordnetNounIndexNameInstanceWYRD.get(TERM);
	if ("wysz".equals(key)) return WordnetNounIndexNameInstanceWYSZ.get(TERM);
	if ("wyte".equals(key)) return WordnetNounIndexNameInstanceWYTE.get(TERM);
	if ("wyve".equals(key)) return WordnetNounIndexNameInstanceWYVE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceWYAT.terms());
	set.addAll(WordnetNounIndexNameInstanceWYCH.terms());
	set.addAll(WordnetNounIndexNameInstanceWYCL.terms());
	set.addAll(WordnetNounIndexNameInstanceWYET.terms());
	set.addAll(WordnetNounIndexNameInstanceWYKE.terms());
	set.addAll(WordnetNounIndexNameInstanceWYLE.terms());
	set.addAll(WordnetNounIndexNameInstanceWYLI.terms());
	set.addAll(WordnetNounIndexNameInstanceWYNE.terms());
	set.addAll(WordnetNounIndexNameInstanceWYNF.terms());
	set.addAll(WordnetNounIndexNameInstanceWYNN.terms());
	set.addAll(WordnetNounIndexNameInstanceWYOM.terms());
	set.addAll(WordnetNounIndexNameInstanceWYRD.terms());
	set.addAll(WordnetNounIndexNameInstanceWYSZ.terms());
	set.addAll(WordnetNounIndexNameInstanceWYTE.terms());
	set.addAll(WordnetNounIndexNameInstanceWYVE.terms());
  		return set; 	} }