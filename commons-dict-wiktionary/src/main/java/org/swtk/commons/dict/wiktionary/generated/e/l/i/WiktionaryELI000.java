package org.swtk.commons.dict.wiktionary.generated.e.l.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryELI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eliminativism", "{\"term\":\"eliminativism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|eliminative|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The materialist position which holds that folk psychology presents a false view of the min\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eliminator", "{\"term\":\"eliminator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|eliminate|or|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, eliminates\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elitarian", "{\"term\":\"elitarian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|elite|arian|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who believes that a society or community should be ruled by an elite\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }