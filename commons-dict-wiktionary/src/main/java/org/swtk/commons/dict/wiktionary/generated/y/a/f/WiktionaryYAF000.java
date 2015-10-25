package org.swtk.commons.dict.wiktionary.generated.y.a.f;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYAF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yaffle", "{\"term\":\"yaffle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Imitative of the bird\u0027s cry.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The European green woodpecker, \u0027Picus viridis\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1924\u0027\u0027, \u0027Some Do Not…\u0027, Penguin 2012 (\u0027Parade\u0027s End\u0027), p. 119\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"“‘Punched that rotton strap,’ he goes on saying, ‘like a gret ol\u0027 \u0027\u0027yaffle\u0027\u0027 punchin\u0027 a \u0027ollow log!’”\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }