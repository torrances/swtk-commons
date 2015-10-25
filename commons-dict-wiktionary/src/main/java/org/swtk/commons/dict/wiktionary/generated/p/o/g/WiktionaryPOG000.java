package org.swtk.commons.dict.wiktionary.generated.p.o.g;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPOG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pogonophile", "{\"term\":\"pogonophile\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pogono|phile|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who loves or studies beards\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pogonotomy", "{\"term\":\"pogonotomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pogono|otomy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The cutting of beards; shaving\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pogrom", "{\"term\":\"pogrom\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\", \"Yiddish\"], \"text\":\"Via Yiddish {{m|yi|פּאָגראָם}}, from Russian {{m|ru|погро́м}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A riot aimed at persecution or massacre of a particular ethnic or religious group, usually Jews\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }