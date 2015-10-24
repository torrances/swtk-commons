package org.swtk.commons.dict.wiktionary.generated.t.e.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTEB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tebowing", "{\"term\":\"tebowing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"After w:Tim Tebo. Tebowing|Tim Tebow, American football player, {{suffix||ing|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The practice of going down on one knee after a touchdown or other celebratory occasion\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }