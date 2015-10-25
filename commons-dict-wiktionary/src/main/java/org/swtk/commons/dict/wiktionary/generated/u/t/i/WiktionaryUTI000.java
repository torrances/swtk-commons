package org.swtk.commons.dict.wiktionary.generated.u.t.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUTI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("utilisation", "{\"term\":\"utilisation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027utilisation\u0027 or from {{suffix|utilise|ation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of using something\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The manner in which something is used\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The state of being used\", \"priority\":3}]}, \"synonyms\":{}}");

	add("utilitarianist", "{\"term\":\"utilitarianist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|utilitarian|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who subscribes to the philosophy of utilitarianism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("utility", "{\"term\":\"utility\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027utilitet\u0027 (usefulness) (Modern French \u0027utilité\u0027 , ultimately from Latin \u0027uti\u0027 (to use, enjoy)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being useful; usefulness\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Something that is useful\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The ability of a commodity to satisfy needs or wants; the satisfaction experienced by the consumer of that commodity\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A service provider, such as an electric company or water company; \u0027or\u0027, the securities of such a provider\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A software program designed to perform a single task or a small range of tasks, often to help manage and tune computer hardware, an operating system or application software\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"I\u0027ve bought a new disk \u0027\u0027utility\u0027\u0027 that can recover deleted files\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The ability to play multiple positions\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }