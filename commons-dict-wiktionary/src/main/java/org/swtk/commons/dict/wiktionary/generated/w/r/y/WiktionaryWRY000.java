package org.swtk.commons.dict.wiktionary.generated.w.r.y;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWRY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("wrybill", "{\"term\":\"wrybill\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027wry\u0027 + \u0027bill\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Anarhynchus frontalis\u0027, a species of small bird in the plover family Charadriidae, unique in having a beak that is bent sideways, endemic to New Zealand\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wryneck", "{\"term\":\"wryneck\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|wry|neck|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Either of two small woodpeckers, and , of the Old World that can turn their heads almost 180 degrees\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A twisted or distorted neck; a deformity in which the neck is drawn to one side by a rigid contraction of one of the muscles; torticollis\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }