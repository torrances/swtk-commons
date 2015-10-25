package org.swtk.commons.dict.wiktionary.generated.k.u.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKUT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kutenai", "{\"term\":\"kutenai\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An indigenous people of North America\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The language isolate spoken by this people\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }