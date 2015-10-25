package org.swtk.commons.dict.wiktionary.generated.e.c.r;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryECR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ecru", "{\"term\":\"ecru\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027écru\u0027 (raw, unbleached)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A beige colour\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }