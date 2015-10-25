package org.swtk.commons.dict.wiktionary.generated.k.u.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKUV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kuvasz", "{\"term\":\"kuvasz\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hungarian\"], \"text\":\"From Hungarian \u0027kuvasz\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A large, usually white breed of dog with its ancient origins in Hungary\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }