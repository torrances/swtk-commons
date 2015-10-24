package org.swtk.commons.dict.wiktionary.generated.h.y.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHYE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hyetograph", "{\"term\":\"hyetograph\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{etystub|en}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A graphical representation of rainfall over time\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }