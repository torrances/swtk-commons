package org.swtk.commons.dict.wiktionary.generated.n.y.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNYA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nyas", "{\"term\":\"nyas\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027niais\u0027 (bird from the nest) from Latin \u0027nidus\u0027 (nest)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An eyas\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nyala", "{\"term\":\"nyala\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A southern African antelope, (syn. ), with thin white stripes in the grey or brown coat, a ridge of tufted hair running all along the spine, and long horns with a spiral twist\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }