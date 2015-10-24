package org.swtk.commons.dict.wiktionary.generated.u.n.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("unease", "{\"term\":\"unease\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A feeling of disquiet or concern\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unemployability", "{\"term\":\"unemployability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unemployable|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unemployable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unendingness", "{\"term\":\"unendingness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|unending|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being unending\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unendurableness", "{\"term\":\"unendurableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unendurable|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unendurable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unexistence", "{\"term\":\"unexistence\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|existence|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lack of existence\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unexpectedness", "{\"term\":\"unexpectedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unexpected|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being unexpected\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }