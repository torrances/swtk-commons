package org.swtk.commons.dict.wiktionary.generated.b.y.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBYO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("byoyomi", "{\"term\":\"byoyomi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"Japanese \u0027秒読み\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A system of time control in some board games, especially g\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Etymology go and shogi, in which the player is assigned a number of additional periods (of a fixed time per move) when his/her initial allotted time runs out\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }