package org.swtk.commons.dict.wordnet.index.name.controller.a.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.c.h.WordnetNounIndexNameInstanceAACH;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.l.b.WordnetNounIndexNameInstanceAALB;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.l.i.WordnetNounIndexNameInstanceAALI;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.l.s.WordnetNounIndexNameInstanceAALS;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.l.t.WordnetNounIndexNameInstanceAALT;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.r.d.WordnetNounIndexNameInstanceAARD;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.r.e.WordnetNounIndexNameInstanceAARE;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.r.h.WordnetNounIndexNameInstanceAARH;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.r.o.WordnetNounIndexNameInstanceAARO;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.r.p.WordnetNounIndexNameInstanceAARP;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.a.v.e.WordnetNounIndexNameInstanceAAVE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("aach".equals(key)) return WordnetNounIndexNameInstanceAACH.get(TERM);
	if ("aalb".equals(key)) return WordnetNounIndexNameInstanceAALB.get(TERM);
	if ("aali".equals(key)) return WordnetNounIndexNameInstanceAALI.get(TERM);
	if ("aals".equals(key)) return WordnetNounIndexNameInstanceAALS.get(TERM);
	if ("aalt".equals(key)) return WordnetNounIndexNameInstanceAALT.get(TERM);
	if ("aard".equals(key)) return WordnetNounIndexNameInstanceAARD.get(TERM);
	if ("aare".equals(key)) return WordnetNounIndexNameInstanceAARE.get(TERM);
	if ("aarh".equals(key)) return WordnetNounIndexNameInstanceAARH.get(TERM);
	if ("aaro".equals(key)) return WordnetNounIndexNameInstanceAARO.get(TERM);
	if ("aarp".equals(key)) return WordnetNounIndexNameInstanceAARP.get(TERM);
	if ("aave".equals(key)) return WordnetNounIndexNameInstanceAAVE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAACH.terms());
	set.addAll(WordnetNounIndexNameInstanceAALB.terms());
	set.addAll(WordnetNounIndexNameInstanceAALI.terms());
	set.addAll(WordnetNounIndexNameInstanceAALS.terms());
	set.addAll(WordnetNounIndexNameInstanceAALT.terms());
	set.addAll(WordnetNounIndexNameInstanceAARD.terms());
	set.addAll(WordnetNounIndexNameInstanceAARE.terms());
	set.addAll(WordnetNounIndexNameInstanceAARH.terms());
	set.addAll(WordnetNounIndexNameInstanceAARO.terms());
	set.addAll(WordnetNounIndexNameInstanceAARP.terms());
	set.addAll(WordnetNounIndexNameInstanceAAVE.terms());
  		return set; 	} }