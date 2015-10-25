package org.swtk.commons.dict.wiktionary.generated.d.i.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDII000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("diimine", "{\"term\":\"diimine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|di|imine|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any compound having two imine functional groups\", \"priority\":1}]}, \"synonyms\":{}}");

	add("diindole", "{\"term\":\"diindole\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|di|indole|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A bicyclic heterocycle consisting of two fused indole rings\", \"priority\":1}]}, \"synonyms\":{}}");

	add("diiodide", "{\"term\":\"diiodide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|di|iodide|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any iodide containing two iodine atoms in each molecule\", \"priority\":1}]}, \"synonyms\":{}}");

	add("diiodohydroxyquinoline", "{\"term\":\"diiodohydroxyquinoline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|di-|iodo-|hydroxy|quinoline|lang\u003den}}{{wikipedia}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A quinoline derivative used in the treatment of amoebiasis\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }