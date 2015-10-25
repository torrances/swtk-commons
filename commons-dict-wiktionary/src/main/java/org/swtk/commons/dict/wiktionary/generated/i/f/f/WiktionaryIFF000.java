package org.swtk.commons.dict.wiktionary.generated.i.f.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryIFF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("iffiness", "{\"term\":\"iffiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|iffy|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being iffy\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }