package org.swtk.commons.dict.wiktionary.generated.u.n.j;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("unjoyfulness", "{\"term\":\"unjoyfulness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|un|joyfulness|lang\u003den}} or {{suffix|unjoyful|ness|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state, quality, or condition of being unjoyful\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1908\u0027\u0027, Ernest James Oldmeadow, \u0027Great Musicians - Page 121\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"After their onslaughts on Gabrieli and Merullo for the \u0027\u0027unjoyfulness\u0027\u0027 of their wedding music at Venice, no doubt the academicians felt bound to give Euridice a happy ending\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }