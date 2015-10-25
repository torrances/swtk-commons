package org.swtk.commons.dict.wiktionary.generated.d.a.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDAA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("daalder", "{\"term\":\"daalder\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Dutch\"], \"text\":\"From Dutch \u0027daalder\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A historic unit of currency of the Netherlands, equivalent to 1 and a half guilders\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }