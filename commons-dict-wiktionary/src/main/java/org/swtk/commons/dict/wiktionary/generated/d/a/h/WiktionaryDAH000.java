package org.swtk.commons.dict.wiktionary.generated.d.a.h;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDAH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dahlia", "{\"term\":\"dahlia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Named 1791 by Spanish botanist Antonio José Cavanilles for Anders Dahl.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any plant of the genus \u0027Dahlia\u0027, tuberous perennial flowering plants native to Mexico\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }