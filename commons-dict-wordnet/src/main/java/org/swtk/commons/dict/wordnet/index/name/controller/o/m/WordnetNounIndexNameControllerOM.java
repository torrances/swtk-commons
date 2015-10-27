package org.swtk.commons.dict.wordnet.index.name.controller.o.m;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.a.h.WordnetNounIndexNameInstanceOMAH;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.a.n.WordnetNounIndexNameInstanceOMAN;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.a.s.WordnetNounIndexNameInstanceOMAS;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.a.y.WordnetNounIndexNameInstanceOMAY;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.b.u.WordnetNounIndexNameInstanceOMBU;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.d.u.WordnetNounIndexNameInstanceOMDU;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.e.g.WordnetNounIndexNameInstanceOMEG;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.e.l.WordnetNounIndexNameInstanceOMEL;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.e.n.WordnetNounIndexNameInstanceOMEN;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.e.p.WordnetNounIndexNameInstanceOMEP;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.e.r.WordnetNounIndexNameInstanceOMER;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.i.c.WordnetNounIndexNameInstanceOMIC;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.i.s.WordnetNounIndexNameInstanceOMIS;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.i.y.WordnetNounIndexNameInstanceOMIY;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.m.a.WordnetNounIndexNameInstanceOMMA;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.m.i.WordnetNounIndexNameInstanceOMMI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.n.i.WordnetNounIndexNameInstanceOMNI;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.o.m.WordnetNounIndexNameInstanceOMOM;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.o.p.WordnetNounIndexNameInstanceOMOP;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.o.t.WordnetNounIndexNameInstanceOMOT;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.p.h.WordnetNounIndexNameInstanceOMPH;
	import org.swtk.commons.dict.wordnet.index.name.instance.o.m.s.k.WordnetNounIndexNameInstanceOMSK;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerOM {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("omah".equals(key)) return WordnetNounIndexNameInstanceOMAH.get(TERM);
	if ("oman".equals(key)) return WordnetNounIndexNameInstanceOMAN.get(TERM);
	if ("omas".equals(key)) return WordnetNounIndexNameInstanceOMAS.get(TERM);
	if ("omay".equals(key)) return WordnetNounIndexNameInstanceOMAY.get(TERM);
	if ("ombu".equals(key)) return WordnetNounIndexNameInstanceOMBU.get(TERM);
	if ("omdu".equals(key)) return WordnetNounIndexNameInstanceOMDU.get(TERM);
	if ("omeg".equals(key)) return WordnetNounIndexNameInstanceOMEG.get(TERM);
	if ("omel".equals(key)) return WordnetNounIndexNameInstanceOMEL.get(TERM);
	if ("omen".equals(key)) return WordnetNounIndexNameInstanceOMEN.get(TERM);
	if ("omep".equals(key)) return WordnetNounIndexNameInstanceOMEP.get(TERM);
	if ("omer".equals(key)) return WordnetNounIndexNameInstanceOMER.get(TERM);
	if ("omic".equals(key)) return WordnetNounIndexNameInstanceOMIC.get(TERM);
	if ("omis".equals(key)) return WordnetNounIndexNameInstanceOMIS.get(TERM);
	if ("omiy".equals(key)) return WordnetNounIndexNameInstanceOMIY.get(TERM);
	if ("omma".equals(key)) return WordnetNounIndexNameInstanceOMMA.get(TERM);
	if ("ommi".equals(key)) return WordnetNounIndexNameInstanceOMMI.get(TERM);
	if ("omni".equals(key)) return WordnetNounIndexNameInstanceOMNI.get(TERM);
	if ("omom".equals(key)) return WordnetNounIndexNameInstanceOMOM.get(TERM);
	if ("omop".equals(key)) return WordnetNounIndexNameInstanceOMOP.get(TERM);
	if ("omot".equals(key)) return WordnetNounIndexNameInstanceOMOT.get(TERM);
	if ("omph".equals(key)) return WordnetNounIndexNameInstanceOMPH.get(TERM);
	if ("omsk".equals(key)) return WordnetNounIndexNameInstanceOMSK.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceOMAH.terms());
	set.addAll(WordnetNounIndexNameInstanceOMAN.terms());
	set.addAll(WordnetNounIndexNameInstanceOMAS.terms());
	set.addAll(WordnetNounIndexNameInstanceOMAY.terms());
	set.addAll(WordnetNounIndexNameInstanceOMBU.terms());
	set.addAll(WordnetNounIndexNameInstanceOMDU.terms());
	set.addAll(WordnetNounIndexNameInstanceOMEG.terms());
	set.addAll(WordnetNounIndexNameInstanceOMEL.terms());
	set.addAll(WordnetNounIndexNameInstanceOMEN.terms());
	set.addAll(WordnetNounIndexNameInstanceOMEP.terms());
	set.addAll(WordnetNounIndexNameInstanceOMER.terms());
	set.addAll(WordnetNounIndexNameInstanceOMIC.terms());
	set.addAll(WordnetNounIndexNameInstanceOMIS.terms());
	set.addAll(WordnetNounIndexNameInstanceOMIY.terms());
	set.addAll(WordnetNounIndexNameInstanceOMMA.terms());
	set.addAll(WordnetNounIndexNameInstanceOMMI.terms());
	set.addAll(WordnetNounIndexNameInstanceOMNI.terms());
	set.addAll(WordnetNounIndexNameInstanceOMOM.terms());
	set.addAll(WordnetNounIndexNameInstanceOMOP.terms());
	set.addAll(WordnetNounIndexNameInstanceOMOT.terms());
	set.addAll(WordnetNounIndexNameInstanceOMPH.terms());
	set.addAll(WordnetNounIndexNameInstanceOMSK.terms());
  		return set; 	} }