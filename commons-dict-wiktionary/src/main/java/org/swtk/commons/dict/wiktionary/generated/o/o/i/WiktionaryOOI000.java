package org.swtk.commons.dict.wiktionary.generated.o.o.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOOI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ooid", "{\"term\":\"ooid\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|oo|id|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small calcium carbonate or iron coated grain found on the seafloor\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }