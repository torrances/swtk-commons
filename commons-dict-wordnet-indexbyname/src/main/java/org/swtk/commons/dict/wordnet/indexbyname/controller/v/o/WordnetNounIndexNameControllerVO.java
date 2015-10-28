package org.swtk.commons.dict.wordnet.indexbyname.controller.v.o;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.c.WordnetNounIndexNameInstanceVOC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.d.WordnetNounIndexNameInstanceVOD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.g.WordnetNounIndexNameInstanceVOG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.i.WordnetNounIndexNameInstanceVOI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.l.WordnetNounIndexNameInstanceVOL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.m.WordnetNounIndexNameInstanceVOM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.n.WordnetNounIndexNameInstanceVON;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.o.WordnetNounIndexNameInstanceVOO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.r.WordnetNounIndexNameInstanceVOR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.t.WordnetNounIndexNameInstanceVOT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.u.WordnetNounIndexNameInstanceVOU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.w.WordnetNounIndexNameInstanceVOW;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.y.WordnetNounIndexNameInstanceVOY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.z.WordnetNounIndexNameInstanceVOZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerVO {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException { 		if (TERM.length() < 3) throw new BusinessException("TERM not found (term = %s)", TERM); 		 		String key = TERM.substring(0, 3).toLowerCase(); 			if ("voc".equals(key)) return WordnetNounIndexNameInstanceVOC.get(TERM);
	if ("vod".equals(key)) return WordnetNounIndexNameInstanceVOD.get(TERM);
	if ("vog".equals(key)) return WordnetNounIndexNameInstanceVOG.get(TERM);
	if ("voi".equals(key)) return WordnetNounIndexNameInstanceVOI.get(TERM);
	if ("vol".equals(key)) return WordnetNounIndexNameInstanceVOL.get(TERM);
	if ("vom".equals(key)) return WordnetNounIndexNameInstanceVOM.get(TERM);
	if ("von".equals(key)) return WordnetNounIndexNameInstanceVON.get(TERM);
	if ("voo".equals(key)) return WordnetNounIndexNameInstanceVOO.get(TERM);
	if ("vor".equals(key)) return WordnetNounIndexNameInstanceVOR.get(TERM);
	if ("vot".equals(key)) return WordnetNounIndexNameInstanceVOT.get(TERM);
	if ("vou".equals(key)) return WordnetNounIndexNameInstanceVOU.get(TERM);
	if ("vow".equals(key)) return WordnetNounIndexNameInstanceVOW.get(TERM);
	if ("voy".equals(key)) return WordnetNounIndexNameInstanceVOY.get(TERM);
	if ("voz".equals(key)) return WordnetNounIndexNameInstanceVOZ.get(TERM);
  		throw new BusinessException("TERM not found (term = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceVOC.terms());
	set.addAll(WordnetNounIndexNameInstanceVOD.terms());
	set.addAll(WordnetNounIndexNameInstanceVOG.terms());
	set.addAll(WordnetNounIndexNameInstanceVOI.terms());
	set.addAll(WordnetNounIndexNameInstanceVOL.terms());
	set.addAll(WordnetNounIndexNameInstanceVOM.terms());
	set.addAll(WordnetNounIndexNameInstanceVON.terms());
	set.addAll(WordnetNounIndexNameInstanceVOO.terms());
	set.addAll(WordnetNounIndexNameInstanceVOR.terms());
	set.addAll(WordnetNounIndexNameInstanceVOT.terms());
	set.addAll(WordnetNounIndexNameInstanceVOU.terms());
	set.addAll(WordnetNounIndexNameInstanceVOW.terms());
	set.addAll(WordnetNounIndexNameInstanceVOY.terms());
	set.addAll(WordnetNounIndexNameInstanceVOZ.terms());
  		return set; 	} }