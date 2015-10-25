package org.swtk.commons.dict.wiktionary.generated.a.x.o;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAXO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("axogenesis", "{\"term\":\"axogenesis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|axon|genesis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The creation of\", \"priority\":1}]}, \"synonyms\":{}}");

	add("axonography", "{\"term\":\"axonography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|axon|graphy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The detection and recording of electrical impulses in axons\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }