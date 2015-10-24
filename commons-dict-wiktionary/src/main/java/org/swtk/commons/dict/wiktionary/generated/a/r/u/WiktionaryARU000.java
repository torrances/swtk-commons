package org.swtk.commons.dict.wiktionary.generated.a.r.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryARU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("arugula", "{\"term\":\"arugula\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Italian\"], \"text\":\"Probably Italian (dial. Lombardy) \u0027arigola\u0027 (Eng. usg. 1967)Cognate to \u0027rocket\u0027 (plant)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of three yellowish-flowered Mediterranean herb of the mustard family; which has flavoured leaves, often eaten in salads. Has a distinct, peppery flavor\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Eruca sativa\u0027, sometimes\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Eruca vesicaria\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }