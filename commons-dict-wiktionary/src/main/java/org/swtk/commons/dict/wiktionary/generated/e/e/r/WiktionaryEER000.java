package org.swtk.commons.dict.wiktionary.generated.e.e.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEER000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eeriness", "{\"term\":\"eeriness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|eerie|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being eerie\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }