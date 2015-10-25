package org.swtk.commons.dict.wiktionary.generated.e.x.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEXU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("exuberance", "{\"term\":\"exuberance\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From French \u0027exubérance\u0027 from Latin \u0027exuberantia\u0027 (superabundance) from \u0027exuberare\u0027 (to grow thickly, to abound) from \u0027e\u0027 and \u0027uber\u0027 (udder) and originally would have referred to a cow or she-goat which was making so much milk that it naturally dripped or sprayed from the udder.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being exuberant; cheerful or vigorous enthusiasm; liveliness\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An instance of exuberant behaviour\", \"priority\":2}]}, \"synonyms\":{}}");

	add("exultation", "{\"term\":\"exultation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027exultacion\u0027 from Latin \u0027exsultatio\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of exulting; lively joy at success or victory, or at any advantage gained; rapturous delight; triumph\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }