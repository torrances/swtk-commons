package org.swtk.commons.dict.wiktionary.generated.u.d.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUDA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("udaler", "{\"term\":\"udaler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|udal|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who holds property by udal, or allodial, right\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }