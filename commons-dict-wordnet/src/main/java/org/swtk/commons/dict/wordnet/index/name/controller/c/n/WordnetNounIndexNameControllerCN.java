package org.swtk.commons.dict.wordnet.index.name.controller.c.n;  import java.util.Collection; import java.util.Set; import java.util.TreeSet;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  	import org.swtk.commons.dict.wordnet.index.name.instance.c.n.e.m.WordnetNounIndexNameInstanceCNEM;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.n.i.c.WordnetNounIndexNameInstanceCNIC;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.n.i.d.WordnetNounIndexNameInstanceCNID;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.n.o.s.WordnetNounIndexNameInstanceCNOS;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.n.p.z.WordnetNounIndexNameInstanceCNPZ;
	import org.swtk.commons.dict.wordnet.index.name.instance.c.n.u.t.WordnetNounIndexNameInstanceCNUT;
  import com.trimc.blogger.commons.exception.BusinessException;  public final class WordnetNounIndexNameControllerCN {  	public static Collection<IndexNoun> get(final String TERM) throws BusinessException {  		String key = TERM.substring(0, 4).toLowerCase(); 			if ("cnem".equals(key)) return WordnetNounIndexNameInstanceCNEM.get(TERM);
	if ("cnic".equals(key)) return WordnetNounIndexNameInstanceCNIC.get(TERM);
	if ("cnid".equals(key)) return WordnetNounIndexNameInstanceCNID.get(TERM);
	if ("cnos".equals(key)) return WordnetNounIndexNameInstanceCNOS.get(TERM);
	if ("cnpz".equals(key)) return WordnetNounIndexNameInstanceCNPZ.get(TERM);
	if ("cnut".equals(key)) return WordnetNounIndexNameInstanceCNUT.get(TERM);
  		throw new BusinessException("TERM not found (id = %s)", TERM); 	} 	 	public static Collection<String> terms() throws BusinessException { 		Set<String> set = new TreeSet<String>();  			set.addAll(WordnetNounIndexNameInstanceCNEM.terms());
	set.addAll(WordnetNounIndexNameInstanceCNIC.terms());
	set.addAll(WordnetNounIndexNameInstanceCNID.terms());
	set.addAll(WordnetNounIndexNameInstanceCNOS.terms());
	set.addAll(WordnetNounIndexNameInstanceCNPZ.terms());
	set.addAll(WordnetNounIndexNameInstanceCNUT.terms());
  		return set; 	} }