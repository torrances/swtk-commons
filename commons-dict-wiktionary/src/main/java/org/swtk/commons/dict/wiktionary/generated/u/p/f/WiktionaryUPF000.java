package org.swtk.commons.dict.wiktionary.generated.u.p.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUPF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("upfault", "{\"term\":\"upfault\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|up|fault|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A horst (area raised relative to surrounding land\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }