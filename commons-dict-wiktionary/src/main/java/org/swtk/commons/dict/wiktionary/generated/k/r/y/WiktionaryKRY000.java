package org.swtk.commons.dict.wiktionary.generated.k.r.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKRY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("krym", "{\"term\":\"krym\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\", \"Ukrainian\"], \"text\":\"From Russian \u0027крым\u0027 or Ukrainian \u0027крим\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alternative name\u0027 of Crimea\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }