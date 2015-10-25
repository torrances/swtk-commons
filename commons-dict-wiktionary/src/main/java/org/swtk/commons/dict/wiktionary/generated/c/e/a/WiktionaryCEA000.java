package org.swtk.commons.dict.wiktionary.generated.c.e.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCEA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ceanothus", "{\"term\":\"ceanothus\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the genus name.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the genus \u0027Ceanothus\u0027 of North American buckthorns\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }