package org.swtk.commons.dict.wiktionary.generated.u.n.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("unreadability", "{\"term\":\"unreadability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027\u0027 \u0027\u0027 and \u0027\u0027 compare \u0027\u0027 \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of being impossible to read\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The property of being unfit for reading\", \"priority\":2}]}, \"synonyms\":{}}");

	add("unrealisticness", "{\"term\":\"unrealisticness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|unrealistic|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality or state of being unrealistic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unreason", "{\"term\":\"unreason\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|un|reason|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lack of reason or rationality; unreasonableness; irrationality\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Nonsense; folly; absurdity\", \"priority\":2}]}, \"synonyms\":{}}");

	add("unregistrability", "{\"term\":\"unregistrability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"In United States trademark law, the characteristic of a trademark being unregistrable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unremarkableness", "{\"term\":\"unremarkableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unremarkable|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unremarkable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unrepair", "{\"term\":\"unrepair\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|un|repair|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unsound state, as that of a building; dilapidation\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unreserve", "{\"term\":\"unreserve\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|un|reserve|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lack or absence of reserve; frankness; freedom of communication\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unresistance", "{\"term\":\"unresistance\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lack of resistance; passive submission\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Bishop Joseph Hal\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"How do they [animals] bear our stripes with a trembling \u0027\u0027unresistance\", \"priority\":3}]}, \"synonyms\":{}}");

	add("unrest", "{\"term\":\"unrest\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|un|rest|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A state of trouble, confusion and turbulence, especially in a political context; a time of riots, demonstrations and protests\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unrestrainedness", "{\"term\":\"unrestrainedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unrestrained|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being unrestrained\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unrestraint", "{\"term\":\"unrestraint\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|restraint|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lack of restraint; the quality of being unrestrained\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unrhyme", "{\"term\":\"unrhyme\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|rhyme|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A line of verse that does not rhyme\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }