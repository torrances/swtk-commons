package org.swtk.commons.dict.wiktionary.generated.s.u.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySUD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("suda", "{\"term\":\"suda\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From the {{m|la|Sūda}}, from the {{m|grc|Σοῦδᾰ}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A massive tenth-century Byzantine encyclopaedia of the ancient Mediterranean world, written in Greek\", \"priority\":1}]}, \"synonyms\":{}}");

	add("suds", "{\"term\":\"suds\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"lather, foam\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sudetenland", "{\"term\":\"sudetenland\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a region in Bohemia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sudser", "{\"term\":\"sudser\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027\u0027 an allusion to \u0027\u0027 in \u0027\u0027 {{suffix||er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A foaming agent used in detergents etc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A serial melodrama shown on television, especially one broadcast during the daytime, often sponsored by household products manufacturers\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }