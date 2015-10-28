package org.swtk.commons.dict.wordnet.indexbyname.controller.c.a;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.a.WordnetNounIndexNameInstanceCAA;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.b.WordnetNounIndexNameInstanceCAB;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.c.WordnetNounIndexNameInstanceCAC;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.d.WordnetNounIndexNameInstanceCAD;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.e.WordnetNounIndexNameInstanceCAE;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.f.WordnetNounIndexNameInstanceCAF;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.g.WordnetNounIndexNameInstanceCAG;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.h.WordnetNounIndexNameInstanceCAH;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.i.WordnetNounIndexNameInstanceCAI;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.j.WordnetNounIndexNameInstanceCAJ;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.k.WordnetNounIndexNameInstanceCAK;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.l.WordnetNounIndexNameInstanceCAL;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.m.WordnetNounIndexNameInstanceCAM;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.n.WordnetNounIndexNameInstanceCAN;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.o.WordnetNounIndexNameInstanceCAO;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.p.WordnetNounIndexNameInstanceCAP;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.r.WordnetNounIndexNameInstanceCAR;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.s.WordnetNounIndexNameInstanceCAS;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.t.WordnetNounIndexNameInstanceCAT;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.u.WordnetNounIndexNameInstanceCAU;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.v.WordnetNounIndexNameInstanceCAV;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.x.WordnetNounIndexNameInstanceCAX;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.y.WordnetNounIndexNameInstanceCAY;
	import org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.z.WordnetNounIndexNameInstanceCAZ;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCA {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("caa".equals(key)) return WordnetNounIndexNameInstanceCAA.get(TERM);
	if ("cab".equals(key)) return WordnetNounIndexNameInstanceCAB.get(TERM);
	if ("cac".equals(key)) return WordnetNounIndexNameInstanceCAC.get(TERM);
	if ("cad".equals(key)) return WordnetNounIndexNameInstanceCAD.get(TERM);
	if ("cae".equals(key)) return WordnetNounIndexNameInstanceCAE.get(TERM);
	if ("caf".equals(key)) return WordnetNounIndexNameInstanceCAF.get(TERM);
	if ("cag".equals(key)) return WordnetNounIndexNameInstanceCAG.get(TERM);
	if ("cah".equals(key)) return WordnetNounIndexNameInstanceCAH.get(TERM);
	if ("cai".equals(key)) return WordnetNounIndexNameInstanceCAI.get(TERM);
	if ("caj".equals(key)) return WordnetNounIndexNameInstanceCAJ.get(TERM);
	if ("cak".equals(key)) return WordnetNounIndexNameInstanceCAK.get(TERM);
	if ("cal".equals(key)) return WordnetNounIndexNameInstanceCAL.get(TERM);
	if ("cam".equals(key)) return WordnetNounIndexNameInstanceCAM.get(TERM);
	if ("can".equals(key)) return WordnetNounIndexNameInstanceCAN.get(TERM);
	if ("cao".equals(key)) return WordnetNounIndexNameInstanceCAO.get(TERM);
	if ("cap".equals(key)) return WordnetNounIndexNameInstanceCAP.get(TERM);
	if ("car".equals(key)) return WordnetNounIndexNameInstanceCAR.get(TERM);
	if ("cas".equals(key)) return WordnetNounIndexNameInstanceCAS.get(TERM);
	if ("cat".equals(key)) return WordnetNounIndexNameInstanceCAT.get(TERM);
	if ("cau".equals(key)) return WordnetNounIndexNameInstanceCAU.get(TERM);
	if ("cav".equals(key)) return WordnetNounIndexNameInstanceCAV.get(TERM);
	if ("cax".equals(key)) return WordnetNounIndexNameInstanceCAX.get(TERM);
	if ("cay".equals(key)) return WordnetNounIndexNameInstanceCAY.get(TERM);
	if ("caz".equals(key)) return WordnetNounIndexNameInstanceCAZ.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCAA.terms());
	set.addAll(WordnetNounIndexNameInstanceCAB.terms());
	set.addAll(WordnetNounIndexNameInstanceCAC.terms());
	set.addAll(WordnetNounIndexNameInstanceCAD.terms());
	set.addAll(WordnetNounIndexNameInstanceCAE.terms());
	set.addAll(WordnetNounIndexNameInstanceCAF.terms());
	set.addAll(WordnetNounIndexNameInstanceCAG.terms());
	set.addAll(WordnetNounIndexNameInstanceCAH.terms());
	set.addAll(WordnetNounIndexNameInstanceCAI.terms());
	set.addAll(WordnetNounIndexNameInstanceCAJ.terms());
	set.addAll(WordnetNounIndexNameInstanceCAK.terms());
	set.addAll(WordnetNounIndexNameInstanceCAL.terms());
	set.addAll(WordnetNounIndexNameInstanceCAM.terms());
	set.addAll(WordnetNounIndexNameInstanceCAN.terms());
	set.addAll(WordnetNounIndexNameInstanceCAO.terms());
	set.addAll(WordnetNounIndexNameInstanceCAP.terms());
	set.addAll(WordnetNounIndexNameInstanceCAR.terms());
	set.addAll(WordnetNounIndexNameInstanceCAS.terms());
	set.addAll(WordnetNounIndexNameInstanceCAT.terms());
	set.addAll(WordnetNounIndexNameInstanceCAU.terms());
	set.addAll(WordnetNounIndexNameInstanceCAV.terms());
	set.addAll(WordnetNounIndexNameInstanceCAX.terms());
	set.addAll(WordnetNounIndexNameInstanceCAY.terms());
	set.addAll(WordnetNounIndexNameInstanceCAZ.terms());
  		return set; 	} }