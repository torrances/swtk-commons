package org.swtk.commons.dict.wiktionary.generated.u.m.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUMA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("umami", "{\"term\":\"umami\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027sc\u003djpan\u0027 \u0027sc\u003djpan\u0027 which describes the quality of a pleasant, savory taste.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the five basic tastes, the savory taste of foods such as seaweed, cured fish, aged cheeses and meats\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, \u0027How to be a Woman\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"But we are, of course, sweaty, fleshy lady-animals – all fur and \u0027\u0027umami\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The taste of flavor enhancers added to food to accentuate savoriness, notably monosodium glutamate\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }