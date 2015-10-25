package org.swtk.commons.dict.wiktionary.generated.a.u.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAUL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aulis", "{\"term\":\"aulis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027αὐλίς\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an ancient port-town, located in Boeotia in central Greece, at the Euripus Strait, opposite of the island of Euboea; identified with the modern Avlida\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }