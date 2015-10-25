package org.swtk.commons.dict.wiktionary.generated.a.g.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAGU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ague", "{\"term\":\"ague\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"middle french (ca. 1400-1600)\", \"old french (842-ca. 1400)\"], \"text\":\"Middle english (1100-1500) \u0027agu\u0027 \u0027ague\u0027 from Old french (842-ca. 1400) and Middle french (ca. 1400-1600) (\u0027fievre\u0027 \u0027aguë\u0027 “acute (fever)” (Modern French \u0027fièvre\u0027 \u0027aigüe\u0027 , from (\u0027febris\u0027 \u0027acuta\u0027 (acute fever) from {{m|la|acūtus||sharp, acute}} + \u0027febris\u0027 (fever) Cognate to \u0027acute\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An acute fever\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Brenning agues. —P. Plowman\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An intermittent fever, attended by alternate cold and hot fits\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The cold fit or rigor of the intermittent fever; as, \u0027fever and ague\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A chill, or state of shaking, as with cold\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Malaria\", \"priority\":6}]}, \"synonyms\":{}}");

	add("agurin", "{\"term\":\"agurin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"acetaminophen\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }