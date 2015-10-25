package org.swtk.commons.dict.wiktionary.generated.o.b.r;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOBR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("obround", "{\"term\":\"obround\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|ob|round|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A shape consisting of two semicircles connected by parallel lines tangent to their endpoints\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A feature or component with an obround shape\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"author\u003dU.S. Atomic Energy Commission\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }