package org.swtk.commons.dict.wiktionary.generated.r.u.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRUL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ruler", "{\"term\":\"ruler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{-er|rule}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A (usually rigid), flat, rectangular measuring or drawing device with graduations in units of measurement; a rule; a straightedge with markings; a measure\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person who rules or governs; a person who exercises dominion or controlling power over others\", \"priority\":2}]}, \"synonyms\":{}}");

	add("rulebreaking", "{\"term\":\"rulebreaking\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The breaking of a rule or rules\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"His flagrant \u0027\u0027rulebreaking\u0027\u0027 earned him a demotion\", \"priority\":2}]}, \"synonyms\":{}}");

	add("rulership", "{\"term\":\"rulership\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|ruler|ship|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a position in which one rules or has sovereignty over others\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }