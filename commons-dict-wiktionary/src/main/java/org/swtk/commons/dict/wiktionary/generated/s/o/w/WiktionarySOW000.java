package org.swtk.commons.dict.wiktionary.generated.s.o.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySOW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sowthistle", "{\"term\":\"sowthistle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|sow|thistle|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the annual herbs in the genus \u0027Sonchus\u0027 of flowering plants\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }