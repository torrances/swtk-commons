package org.swtk.commons.dict.wiktionary.generated.u.n.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("unpleasantness", "{\"term\":\"unpleasantness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|unpleasant|ness|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of being unpleasant or disagreeable\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An unpleasant behaviour, occurrence, etc\", \"priority\":2}]}, \"synonyms\":{}}");

	add("unpopularity", "{\"term\":\"unpopularity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|popularity|lang\u003den}} or {{suffix|unpopular|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the property or degree of being unpopular\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unpredictableness", "{\"term\":\"unpredictableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|unpredictable|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being unpredictable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unpreparedness", "{\"term\":\"unpreparedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|unprepared|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being unprepared\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The presentation went badly due to the team\u0027s \u0027\u0027unpreparedness\", \"priority\":2}]}, \"synonyms\":{}}");

	add("unprintability", "{\"term\":\"unprintability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unprintable|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unprintable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unprofessionalization", "{\"term\":\"unprofessionalization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|professionalization|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the process of making something unprofessional\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unprofitability", "{\"term\":\"unprofitability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unprofitable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unpunctualness", "{\"term\":\"unpunctualness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unpunctual|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Not being punctual; lateness\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }