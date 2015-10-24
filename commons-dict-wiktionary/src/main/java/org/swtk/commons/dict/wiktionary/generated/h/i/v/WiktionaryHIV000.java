package org.swtk.commons.dict.wiktionary.generated.h.i.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHIV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hiver", "{\"term\":\"hiver\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hive|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who collects bees into a hive\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }