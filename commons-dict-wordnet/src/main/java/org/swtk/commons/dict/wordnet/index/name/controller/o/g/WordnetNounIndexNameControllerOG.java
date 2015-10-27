package org.swtk.commons.dict.wordnet.index.name.controller.o.g;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.a.l.WordnetNounIndexNameInstanceOGAL;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.c.o.WordnetNounIndexNameInstanceOGCO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.d.e.WordnetNounIndexNameInstanceOGDE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.d.o.WordnetNounIndexNameInstanceOGDO;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.e.e.WordnetNounIndexNameInstanceOGEE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.i.v.WordnetNounIndexNameInstanceOGIV;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.l.a.WordnetNounIndexNameInstanceOGLA;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.l.e.WordnetNounIndexNameInstanceOGLE;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.g.r.e.WordnetNounIndexNameInstanceOGRE;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOG {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("ogal".equals(key)) return WordnetNounIndexNameInstanceOGAL.get(TERM);
	if ("ogco".equals(key)) return WordnetNounIndexNameInstanceOGCO.get(TERM);
	if ("ogde".equals(key)) return WordnetNounIndexNameInstanceOGDE.get(TERM);
	if ("ogdo".equals(key)) return WordnetNounIndexNameInstanceOGDO.get(TERM);
	if ("ogee".equals(key)) return WordnetNounIndexNameInstanceOGEE.get(TERM);
	if ("ogiv".equals(key)) return WordnetNounIndexNameInstanceOGIV.get(TERM);
	if ("ogla".equals(key)) return WordnetNounIndexNameInstanceOGLA.get(TERM);
	if ("ogle".equals(key)) return WordnetNounIndexNameInstanceOGLE.get(TERM);
	if ("ogre".equals(key)) return WordnetNounIndexNameInstanceOGRE.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOGAL.terms());
	set.addAll(WordnetNounIndexNameInstanceOGCO.terms());
	set.addAll(WordnetNounIndexNameInstanceOGDE.terms());
	set.addAll(WordnetNounIndexNameInstanceOGDO.terms());
	set.addAll(WordnetNounIndexNameInstanceOGEE.terms());
	set.addAll(WordnetNounIndexNameInstanceOGIV.terms());
	set.addAll(WordnetNounIndexNameInstanceOGLA.terms());
	set.addAll(WordnetNounIndexNameInstanceOGLE.terms());
	set.addAll(WordnetNounIndexNameInstanceOGRE.terms());
  		return set; 	} }