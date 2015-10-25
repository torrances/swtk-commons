package org.swtk.commons.dict.wiktionary.generated.j.e.d;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJED000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jeddah", "{\"term\":\"jeddah\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city in Saudi Arabia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jediism", "{\"term\":\"jediism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Jedi|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A minor modern religion based on the Jedis of the \u0027w:Star Star Wars\u0027 series\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jedwabite", "{\"term\":\"jedwabite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Jedwab|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hexagonal-dihexagonal pyramidal grayish yellow mineral containing iron, niobium, and tantalum\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }