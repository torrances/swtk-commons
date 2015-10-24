package org.swtk.commons.dict.wiktionary.generated.g.a.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGAG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gaggle", "{\"term\":\"gaggle\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027gagelen\u0027 (to cackle)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A group of geese when they are on the ground or on the water\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"page\u003d11|isbn\u003d978-1-4520-8633-0|passage\u003dThe Canada geese always flew over the 80 acre lake; it was a landmark on their route and a stopping point for many a \u0027\u0027gaggle\u0027\u0027, where many hours were spent after feeding in the farmers\u0027 fields\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any group or gathering of related things; bunch\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"date\u003d7 June page\u003d24|passage\u003dThere were no signs and no one quite knew how to navigate the museum, including, as it was Fleet Week, \u0027\u0027gaggles\u0027\u0027 of boyish sailors all in their summer whites. It looked like a Frank Sinatra movie\", \"priority\":4}]}, \"synonyms\":{}}");

	add("gagmeister", "{\"term\":\"gagmeister\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|gag|meister|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A joker or comedian\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }