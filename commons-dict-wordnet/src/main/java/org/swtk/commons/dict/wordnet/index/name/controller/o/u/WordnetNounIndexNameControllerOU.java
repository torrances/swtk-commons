package org.swtk.commons.dict.wordnet.index.name.controller.o.u;  import java.util.Collection;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.c.y.WordnetNounIndexNameInstanceOOCY;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.d.l.WordnetNounIndexNameInstanceOODL;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.g.e.WordnetNounIndexNameInstanceOOGE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.l.o.WordnetNounIndexNameInstanceOOLO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.m.p.WordnetNounIndexNameInstanceOOMP;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.m.y.WordnetNounIndexNameInstanceOOMY;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.p.h.WordnetNounIndexNameInstanceOOPH;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.r.t.WordnetNounIndexNameInstanceOORT;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.s.p.WordnetNounIndexNameInstanceOOSP;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.t.i.WordnetNounIndexNameInstanceOOTI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.z.e.WordnetNounIndexNameInstanceOOZE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.o.z.i.WordnetNounIndexNameInstanceOOZI;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOU {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("oocy".equals(key)) return WordnetNounIndexNameInstanceOOCY.get(TERM);
	if ("oodl".equals(key)) return WordnetNounIndexNameInstanceOODL.get(TERM);
	if ("ooge".equals(key)) return WordnetNounIndexNameInstanceOOGE.get(TERM);
	if ("oolo".equals(key)) return WordnetNounIndexNameInstanceOOLO.get(TERM);
	if ("oomp".equals(key)) return WordnetNounIndexNameInstanceOOMP.get(TERM);
	if ("oomy".equals(key)) return WordnetNounIndexNameInstanceOOMY.get(TERM);
	if ("ooph".equals(key)) return WordnetNounIndexNameInstanceOOPH.get(TERM);
	if ("oort".equals(key)) return WordnetNounIndexNameInstanceOORT.get(TERM);
	if ("oosp".equals(key)) return WordnetNounIndexNameInstanceOOSP.get(TERM);
	if ("ooti".equals(key)) return WordnetNounIndexNameInstanceOOTI.get(TERM);
	if ("ooze".equals(key)) return WordnetNounIndexNameInstanceOOZE.get(TERM);
	if ("oozi".equals(key)) return WordnetNounIndexNameInstanceOOZI.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} }