package org.swtk.commons.dict.wiktionary.generated.d.e.q;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDEQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("deque", "{\"term\":\"deque\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Shortened from \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A linear data structure in which elements may be appended to or removed from either end\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"This algorithm is difficult to implement with a standard queue, but with a \u0027\u0027deque\u0027\u0027 it\u0027s easy\", \"priority\":2}]}, \"synonyms\":{}}");

	add("dequity", "{\"term\":\"dequity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|debt|equity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Securities characterized by attributes of both fixed-income and equity securities\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }