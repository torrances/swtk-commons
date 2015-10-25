package org.swtk.commons.dict.wiktionary.generated.d.u.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDUE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dues", "{\"term\":\"dues\", \"etymology\":{\"influencers\":[], \"languages\":[\"Catalan\", \"Latin\"], \"text\":\"From Latin {{m|la|duas}}, feminine accusative form of \u0027lang\u003dla|duo\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Membership fees\", \"priority\":1}]}, \"synonyms\":{}}");

	add("duetter", "{\"term\":\"duetter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|duet|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A creature that duets (communicates between the sexes using song\", \"priority\":1}]}, \"synonyms\":{}}");

	add("duettist", "{\"term\":\"duettist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|duet|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who performs in a duet\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }