package org.swtk.commons.dict.wiktionary.generated.s.e.y;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySEY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("seychelles", "{\"term\":\"seychelles\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"After French official and politician {{w|Jean Moreau de Séchelles}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Country in East Africa. Official name: Republic of Seychelles\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }