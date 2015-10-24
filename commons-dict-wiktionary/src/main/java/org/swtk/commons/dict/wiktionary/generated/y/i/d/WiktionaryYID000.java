package org.swtk.commons.dict.wiktionary.generated.y.i.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yiddishist", "{\"term\":\"yiddishist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Yiddish|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A proponent of Yiddish as the language of the Zionist movement\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }