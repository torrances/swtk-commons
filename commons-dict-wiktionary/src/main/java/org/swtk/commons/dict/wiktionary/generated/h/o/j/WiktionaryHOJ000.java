package org.swtk.commons.dict.wiktionary.generated.h.o.j;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHOJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hojillion", "{\"term\":\"hojillion\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"See {{suffix||illion|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unspecified large number (of\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }