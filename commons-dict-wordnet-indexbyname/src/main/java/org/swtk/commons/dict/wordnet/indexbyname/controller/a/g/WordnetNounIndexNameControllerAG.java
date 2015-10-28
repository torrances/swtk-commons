package org.swtk.commons.dict.wordnet.indexbyname.controller.a.g;  import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.a.WordnetNounIndexNameInstanceAGA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.d.WordnetNounIndexNameInstanceAGD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.e.WordnetNounIndexNameInstanceAGE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.g.WordnetNounIndexNameInstanceAGG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.h.WordnetNounIndexNameInstanceAGH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.i.WordnetNounIndexNameInstanceAGI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.k.WordnetNounIndexNameInstanceAGK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.l.WordnetNounIndexNameInstanceAGL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.n.WordnetNounIndexNameInstanceAGN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.o.WordnetNounIndexNameInstanceAGO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.r.WordnetNounIndexNameInstanceAGR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.u.WordnetNounIndexNameInstanceAGU;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("aga".equals(key)) return WordnetNounIndexNameInstanceAGA.get(TERM);
	if ("agd".equals(key)) return WordnetNounIndexNameInstanceAGD.get(TERM);
	if ("age".equals(key)) return WordnetNounIndexNameInstanceAGE.get(TERM);
	if ("agg".equals(key)) return WordnetNounIndexNameInstanceAGG.get(TERM);
	if ("agh".equals(key)) return WordnetNounIndexNameInstanceAGH.get(TERM);
	if ("agi".equals(key)) return WordnetNounIndexNameInstanceAGI.get(TERM);
	if ("agk".equals(key)) return WordnetNounIndexNameInstanceAGK.get(TERM);
	if ("agl".equals(key)) return WordnetNounIndexNameInstanceAGL.get(TERM);
	if ("agn".equals(key)) return WordnetNounIndexNameInstanceAGN.get(TERM);
	if ("ago".equals(key)) return WordnetNounIndexNameInstanceAGO.get(TERM);
	if ("agr".equals(key)) return WordnetNounIndexNameInstanceAGR.get(TERM);
	if ("agu".equals(key)) return WordnetNounIndexNameInstanceAGU.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAGA.terms());
	set.addAll(WordnetNounIndexNameInstanceAGD.terms());
	set.addAll(WordnetNounIndexNameInstanceAGE.terms());
	set.addAll(WordnetNounIndexNameInstanceAGG.terms());
	set.addAll(WordnetNounIndexNameInstanceAGH.terms());
	set.addAll(WordnetNounIndexNameInstanceAGI.terms());
	set.addAll(WordnetNounIndexNameInstanceAGK.terms());
	set.addAll(WordnetNounIndexNameInstanceAGL.terms());
	set.addAll(WordnetNounIndexNameInstanceAGN.terms());
	set.addAll(WordnetNounIndexNameInstanceAGO.terms());
	set.addAll(WordnetNounIndexNameInstanceAGR.terms());
	set.addAll(WordnetNounIndexNameInstanceAGU.terms());
  		return set; 	} }