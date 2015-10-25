package org.swtk.commons.dict.wiktionary.generated.k.e.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKEG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kegs", "{\"term\":\"kegs\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Underpants\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Trousers\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kegger", "{\"term\":\"kegger\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|keg|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A party at which beer is served from a keg\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }