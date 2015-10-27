package org.swtk.commons.dict.wordnet.index.name.controller.a.z;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.a.c.WordnetNounIndexNameInstanceAZAC;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.a.d.WordnetNounIndexNameInstanceAZAD;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.a.l.WordnetNounIndexNameInstanceAZAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.a.t.WordnetNounIndexNameInstanceAZAT;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.e.d.WordnetNounIndexNameInstanceAZED;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.e.r.WordnetNounIndexNameInstanceAZER;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.i.d.WordnetNounIndexNameInstanceAZID;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.i.m.WordnetNounIndexNameInstanceAZIM;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.i.t.WordnetNounIndexNameInstanceAZIT;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.o.i.WordnetNounIndexNameInstanceAZOI;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.o.l.WordnetNounIndexNameInstanceAZOL;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.o.r.WordnetNounIndexNameInstanceAZOR;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.o.t.WordnetNounIndexNameInstanceAZOT;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.t.e.WordnetNounIndexNameInstanceAZTE;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.t.r.WordnetNounIndexNameInstanceAZTR;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.u.r.WordnetNounIndexNameInstanceAZUR;
	import org.swtk.commons.dict.wordnet.index.name.instance.a.z.y.m.WordnetNounIndexNameInstanceAZYM;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerAZ {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("azac".equals(key)) return WordnetNounIndexNameInstanceAZAC.get(TERM);
	if ("azad".equals(key)) return WordnetNounIndexNameInstanceAZAD.get(TERM);
	if ("azal".equals(key)) return WordnetNounIndexNameInstanceAZAL.get(TERM);
	if ("azat".equals(key)) return WordnetNounIndexNameInstanceAZAT.get(TERM);
	if ("azed".equals(key)) return WordnetNounIndexNameInstanceAZED.get(TERM);
	if ("azer".equals(key)) return WordnetNounIndexNameInstanceAZER.get(TERM);
	if ("azid".equals(key)) return WordnetNounIndexNameInstanceAZID.get(TERM);
	if ("azim".equals(key)) return WordnetNounIndexNameInstanceAZIM.get(TERM);
	if ("azit".equals(key)) return WordnetNounIndexNameInstanceAZIT.get(TERM);
	if ("azoi".equals(key)) return WordnetNounIndexNameInstanceAZOI.get(TERM);
	if ("azol".equals(key)) return WordnetNounIndexNameInstanceAZOL.get(TERM);
	if ("azor".equals(key)) return WordnetNounIndexNameInstanceAZOR.get(TERM);
	if ("azot".equals(key)) return WordnetNounIndexNameInstanceAZOT.get(TERM);
	if ("azte".equals(key)) return WordnetNounIndexNameInstanceAZTE.get(TERM);
	if ("aztr".equals(key)) return WordnetNounIndexNameInstanceAZTR.get(TERM);
	if ("azur".equals(key)) return WordnetNounIndexNameInstanceAZUR.get(TERM);
	if ("azym".equals(key)) return WordnetNounIndexNameInstanceAZYM.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceAZAC.terms());
	set.addAll(WordnetNounIndexNameInstanceAZAD.terms());
	set.addAll(WordnetNounIndexNameInstanceAZAL.terms());
	set.addAll(WordnetNounIndexNameInstanceAZAT.terms());
	set.addAll(WordnetNounIndexNameInstanceAZED.terms());
	set.addAll(WordnetNounIndexNameInstanceAZER.terms());
	set.addAll(WordnetNounIndexNameInstanceAZID.terms());
	set.addAll(WordnetNounIndexNameInstanceAZIM.terms());
	set.addAll(WordnetNounIndexNameInstanceAZIT.terms());
	set.addAll(WordnetNounIndexNameInstanceAZOI.terms());
	set.addAll(WordnetNounIndexNameInstanceAZOL.terms());
	set.addAll(WordnetNounIndexNameInstanceAZOR.terms());
	set.addAll(WordnetNounIndexNameInstanceAZOT.terms());
	set.addAll(WordnetNounIndexNameInstanceAZTE.terms());
	set.addAll(WordnetNounIndexNameInstanceAZTR.terms());
	set.addAll(WordnetNounIndexNameInstanceAZUR.terms());
	set.addAll(WordnetNounIndexNameInstanceAZYM.terms());
  		return set; 	} }