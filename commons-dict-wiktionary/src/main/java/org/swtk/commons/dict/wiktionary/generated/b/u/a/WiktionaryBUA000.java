package org.swtk.commons.dict.wiktionary.generated.b.u.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBUA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("buaze", "{\"term\":\"buaze\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfelite|en}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A strong fiber produced from , a small tree of Africa\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }