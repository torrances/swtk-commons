package org.swtk.commons.dict.wiktionary.generated.b.u.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBUX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("buxine", "{\"term\":\"buxine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Buxus|ine|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alkaloid obtained from the \u0027Buxus sempervirens\u0027, or common box tree, identical with bebeerine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }