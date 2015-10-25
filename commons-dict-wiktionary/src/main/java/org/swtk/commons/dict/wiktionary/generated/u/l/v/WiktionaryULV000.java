package org.swtk.commons.dict.wiktionary.generated.u.l.v;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryULV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ulva", "{\"term\":\"ulva\", \"etymology\":{\"influencers\":[], \"languages\":[\"Latin\", \"multiple languages\"], \"text\":\"Latin \u0027ulva\u0027 (lang\u003dla)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small island in the Inner Hebrides\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }