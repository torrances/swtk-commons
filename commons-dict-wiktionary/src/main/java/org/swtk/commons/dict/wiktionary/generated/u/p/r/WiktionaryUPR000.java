package org.swtk.commons.dict.wiktionary.generated.u.p.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUPR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("uprightness", "{\"term\":\"uprightness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|upright|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being moral, honest and honourable\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The state of being erect, or vertical\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The result or product of being upright\", \"priority\":3}]}, \"synonyms\":{}}");

	add("uprootedness", "{\"term\":\"uprootedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|uprooted|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being uprooted\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }