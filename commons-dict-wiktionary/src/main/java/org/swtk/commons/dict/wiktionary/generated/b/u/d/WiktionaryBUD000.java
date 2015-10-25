package org.swtk.commons.dict.wiktionary.generated.b.u.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBUD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("budo", "{\"term\":\"budo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Japanese martial arts\", \"priority\":1}]}, \"synonyms\":{}}");

	add("budapest", "{\"term\":\"budapest\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hungarian\"], \"text\":\"From Hungarian {{m|hu|Budapest}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The capital city of Hungary\", \"priority\":1}]}, \"synonyms\":{}}");

	add("buddha", "{\"term\":\"buddha\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An enlightened human being\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A statue or image of the Buddha\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"marijuana\", \"priority\":3}]}, \"synonyms\":{}}");

	add("budesonide", "{\"term\":\"budesonide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A corticosteroid used in the treatment of various diseases\", \"priority\":1}]}, \"synonyms\":{}}");

	add("budgeter", "{\"term\":\"budgeter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|budget|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who budgets\", \"priority\":1}]}, \"synonyms\":{}}");

	add("budgeting", "{\"term\":\"budgeting\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The activity of constructing a budget\", \"priority\":1}]}, \"synonyms\":{}}");

	add("budworm", "{\"term\":\"budworm\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|bud|worm|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various moth caterpillars\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }