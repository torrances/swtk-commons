package org.swtk.commons.dict.wiktionary.generated.s.a.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("saker", "{\"term\":\"saker\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"Spanish\", \"French\"], \"text\":\"From French \u0027sacre\u0027 from Spanish \u0027sacro\u0027 from Arabic \u0027صقر\u0027 probably from \u0027soŋqur\u0027. \u0026lt;ref\u0026gt;[http://www.bartleby.com/61/47/S0034700.html \u0026quot;saker.\u0026quot;] The American Heritage Dictionary of the English Language: Fourth Edition. 2008.\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A falcon (\u0027w:Falco Falco cherrug\u0027) native of Southern Europe and Asia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A medium cannon slightly smaller than a culverin developed during the early 17th century\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1663\u0027\u0027, Hudibras\u0027, by Samuel Butler, part 1, s:Hudibras/Part 1/Canto canto\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Of warlike engines he was author, / Devised for quick despatch of slaughter: / The cannon, blunderbuss, and \u0027\u0027saker\u0027\u0027, / He was th\u0027 inventor of, and maker\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }