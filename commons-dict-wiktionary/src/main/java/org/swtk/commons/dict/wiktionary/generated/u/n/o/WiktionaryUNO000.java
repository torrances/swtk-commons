package org.swtk.commons.dict.wiktionary.generated.u.n.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("unobtanium", "{\"term\":\"unobtanium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027unobtainable\u0027 + \u0027-ium\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fictitious substance, which, if it existed, would enable one to solve an intractable problem with ease\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An especially rare component that is almost impossible to get hold of\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A high tech component that is extremely expensive\", \"priority\":3}]}, \"synonyms\":{}}");

	add("unopinionatedness", "{\"term\":\"unopinionatedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unopinionated|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unopinionated\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unorthodoxy", "{\"term\":\"unorthodoxy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|orthodoxy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lack of orthodoxy; the quality or state of being unorthodo\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }