package org.swtk.commons.dict.wiktionary.generated.n.a.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNAH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nahuatlism", "{\"term\":\"nahuatlism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Nahuatl|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A word or phrase borrowed from the Nahuatl language\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any mode of speaking that is exclusive to the Nahuatl people\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }