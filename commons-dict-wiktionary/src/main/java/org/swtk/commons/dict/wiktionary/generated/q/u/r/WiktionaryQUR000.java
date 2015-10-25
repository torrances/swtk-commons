package org.swtk.commons.dict.wiktionary.generated.q.u.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryQUR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("quranism", "{\"term\":\"quranism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A denomination in Islam that generally rejects the authoritative role of hadiths, and considers the Qur\u0027an to be the only dependable religious text\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }