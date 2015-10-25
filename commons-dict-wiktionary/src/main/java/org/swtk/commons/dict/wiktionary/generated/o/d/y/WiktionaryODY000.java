package org.swtk.commons.dict.wiktionary.generated.o.d.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryODY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("odyssey", "{\"term\":\"odyssey\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027odyssey\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An extended adventurous voyage\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An intellectual or spiritual quest\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }