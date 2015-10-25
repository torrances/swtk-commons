package org.swtk.commons.dict.wiktionary.generated.p.y.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPYS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pysanka", "{\"term\":\"pysanka\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Ukrainian\"], \"text\":\"Ukrainian \u0027писанка\u0027 (tr\u003dpýsanka) \u0026lt; \u0027писати\u0027 (to write) referring to writing on an egg with a stylus in a wax-resist dyeing process, from Proto-slavic {{m|sla-pro|*pьsati}}, related to {{m|sla-pro|*pьstrъ||feathered}}, + Ukrainian feminine ending \u0027-ка\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hand-decorated Ukrainian Easter egg with intricate designs\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }