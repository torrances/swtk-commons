package org.swtk.commons.dict.wiktionary.generated.n.i.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNIP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nipplewort", "{\"term\":\"nipplewort\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|nipple|wort|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A flowering plant, that yields a milky juice\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nippon", "{\"term\":\"nippon\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027日本\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Japan\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nipponism", "{\"term\":\"nipponism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Nippon|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Anything of Japanese origin\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A Japanese word or phrase used in English\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }