package org.swtk.commons.dict.wiktionary.generated.o.x.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOXH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oxherd", "{\"term\":\"oxherd\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|ox|herd|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who herds oxen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oxhide", "{\"term\":\"oxhide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|ox|hide|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The skin (hide) of an ox\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Leather made from the hide of an ox\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }