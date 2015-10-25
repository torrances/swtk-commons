package org.swtk.commons.dict.wiktionary.generated.b.y.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBYP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bypass", "{\"term\":\"bypass\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|by|pass|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a road that passes around something, such as a residential are\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a circumventio\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a section of pipe that conducts a fluid around some other fixtur\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"an electrical shun\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"an alternative passage created to divert a bodily fluid around a damaged organ; the surgical procedure to construct such a bypass\", \"priority\":5}]}, \"synonyms\":{}}");

	add("bypath", "{\"term\":\"bypath\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|by|path|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an unfrequented path; an indirect route; a bywa\", \"priority\":1}]}, \"synonyms\":{}}");

	add("byplay", "{\"term\":\"byplay\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|by|play|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any action, carried out onstage during a performance, apart from the main action\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }