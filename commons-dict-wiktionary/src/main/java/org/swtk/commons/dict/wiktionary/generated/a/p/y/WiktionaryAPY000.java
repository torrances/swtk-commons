package org.swtk.commons.dict.wiktionary.generated.a.p.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAPY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("apyrexia", "{\"term\":\"apyrexia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|a|pyrexia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The absence or intermission of fever\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }