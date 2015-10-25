package org.swtk.commons.dict.wiktionary.generated.u.k.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUKU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ukulele", "{\"term\":\"ukulele\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"hawaiian\"], \"text\":\"From Hawaiian \u0027ʻukulele\u0027 from \u0027ʻuku\u0027 (flea) + \u0027lele\u0027 (jump, jumping)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small four-stringed guitar\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }