package org.swtk.commons.dict.wiktionary.generated.i.y.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryIYA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("iyaric", "{\"term\":\"iyaric\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|I|Amharic|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dialect of English used by the Rastafari\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }