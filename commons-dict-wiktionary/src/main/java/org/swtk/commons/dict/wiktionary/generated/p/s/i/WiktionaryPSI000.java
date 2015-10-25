package org.swtk.commons.dict.wiktionary.generated.p.s.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPSI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("psilocin", "{\"term\":\"psilocin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"4-hydroxy-dimethyltryptamine, a hallucinogenic alkaloid found in most psychedelic mushrooms\", \"priority\":1}]}, \"synonyms\":{}}");

	add("psilocybin", "{\"term\":\"psilocybin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"After German \u0027Psilocybin\u0027 (coined by w:Albert Hofmann|Albert Hofmann), from modern Latin \u0027psilocybe\u0027, from Greek \u0027ψιλός\u0027 ‘smooth’ + \u0027κύβη\u0027 ‘head’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hallucinogenic alkaloid, C₁₂H₁₅N₂O·H₂PO₃, present in several species of Central American mushroom and producing effects similar to LSD\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027: The problem of the mushroom supply was solved straight away when Leary learned from a graduate student named George Litwin that a chemist at the Sandoz Corporation, Dr. Albert Hofmann, had recently synthesized the psychoactive molecule of the mushroom, calling it \u0027\u0027psilocybin\u0027\u0027. — Martin Torgoff, \u0027Can\u0027t Find My Way Home\u0027 (Simon \u0026amp; Schuster 2005, p. 70\", \"priority\":2}]}, \"synonyms\":{}}");

	add("psittacosis", "{\"term\":\"psittacosis\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin \u0027psittacus\u0027 (parrot) {{suffix||osis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An infection by \u0027Chlamydia\u0027 bacteria, caught from infected birds, and characterised by fever, pneumonia and headaches\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }