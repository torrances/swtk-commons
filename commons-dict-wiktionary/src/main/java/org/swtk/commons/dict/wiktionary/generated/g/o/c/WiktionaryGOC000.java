package org.swtk.commons.dict.wiktionary.generated.g.o.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGOC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gochujang", "{\"term\":\"gochujang\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Korean\"], \"text\":\"From Korean {{m|ko|고추장}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A condiment based on red chili, used in Korean cuisine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }