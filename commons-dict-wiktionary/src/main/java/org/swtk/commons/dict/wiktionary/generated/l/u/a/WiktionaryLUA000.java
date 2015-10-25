package org.swtk.commons.dict.wiktionary.generated.l.u.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLUA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("luau", "{\"term\":\"luau\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"hawaiian\"], \"text\":\"Hawaiian \u0027lūʻau\u0027 Attested 1856 in the \u0027Pacific Commercial Advertiser\u0027.Replaced earlier \u0027paina\u0027 (from \u0027pāʻina\u0027 and \u0027ahaaina\u0027 (from \u0027ʻahaʻaina\u0027 .\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An elaborate Hawaiian feast featuring traditional foods and entertainment\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }