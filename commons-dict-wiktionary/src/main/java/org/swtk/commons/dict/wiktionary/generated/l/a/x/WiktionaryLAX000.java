package org.swtk.commons.dict.wiktionary.generated.l.a.x;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLAX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("laxist", "{\"term\":\"laxist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|lax|ist|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone promoting lax views or relaxed interpretations of something\", \"priority\":1}]}, \"synonyms\":{}}");

	add("laxness", "{\"term\":\"laxness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lax|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of being lax, lacking strictness\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"There was a certain \u0027\u0027laxness\u0027\u0027 in safety preparations that made the fire worse\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }