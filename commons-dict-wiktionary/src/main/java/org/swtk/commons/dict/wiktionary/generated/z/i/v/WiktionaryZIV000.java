package org.swtk.commons.dict.wiktionary.generated.z.i.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZIV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zivania", "{\"term\":\"zivania\", \"etymology\":{\"influencers\":[], \"languages\":[\"Greek\", \"English\"], \"text\":\"From Greek \u0027ζιβανία\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a traditional Cypriot alcoholic beverage\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }