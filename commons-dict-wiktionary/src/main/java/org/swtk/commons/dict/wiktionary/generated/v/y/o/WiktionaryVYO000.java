package org.swtk.commons.dict.wiktionary.generated.v.y.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVYO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vyomanaut", "{\"term\":\"vyomanaut\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027व्योमन्|tr\u003dvyoman\u0027 (sky) + \u0027-naut\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who travels in space for the Indian space program; an Indian astronaut\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }