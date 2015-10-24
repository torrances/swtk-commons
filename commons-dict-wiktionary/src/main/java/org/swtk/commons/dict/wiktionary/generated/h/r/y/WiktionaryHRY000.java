package org.swtk.commons.dict.wiktionary.generated.h.r.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHRY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hryvnia", "{\"term\":\"hryvnia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Ukrainian\"], \"text\":\"From Ukrainian \u0027гривня\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The currency of Ukraine, symbol ₴, divided into 100 kopiykas\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }