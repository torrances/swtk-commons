package org.swtk.commons.dict.wiktionary.generated.i.n.p;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryINP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("input", "{\"term\":\"input\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027inputten\u0027 equivalent to {{prefix|in|put|lang\u003den|nocat\u003d1}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or process of putting in; infusion\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"That which is put in, as in an amount\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Contribution, or share in a contribution\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Something fed into a process with the intention of it shaping or affecting the output of that process\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }