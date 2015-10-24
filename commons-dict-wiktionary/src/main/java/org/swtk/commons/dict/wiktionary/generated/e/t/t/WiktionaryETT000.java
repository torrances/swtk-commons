package org.swtk.commons.dict.wiktionary.generated.e.t.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryETT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ettin", "{\"term\":\"ettin\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"Icelandic\"], \"text\":\"From Middle english (1100-1500) \u0027eten\u0027 \u0027etend\u0027 from Old english (ca. 450-1100) \u0027eoten\u0027 (giant, monster, enemy) from Proto-germanic {{m|gem-pro|*etunaz||giant, glutton}}, from Proto-indo-european {{m|ine-pro|*h₁ed-||to eat}}. Cognate with Icelandic \u0027jötunn\u0027 (giant) Swedish \u0027jätte\u0027 (giant) Danish \u0027jætte\u0027 (giant) Compare \u0027ent\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A giant\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A giant with two heads.nl:ettintr:ettin\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }