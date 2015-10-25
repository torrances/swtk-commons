package org.swtk.commons.dict.wiktionary.generated.b.u.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBUO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("buoyance", "{\"term\":\"buoyance\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Alteration of \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being buoyan\", \"priority\":1}]}, \"synonyms\":{}}");

	add("buoyancy", "{\"term\":\"buoyancy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|buoyant|cy|lang\u003den}} or {{suffix|buoy|ancy|lang\u003den}}.{{wikipedia}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The upward force on a body immersed or partly immersed in a fluid\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The ability of an object to stay afloat in a fluid\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Resilience or cheerfulness\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }