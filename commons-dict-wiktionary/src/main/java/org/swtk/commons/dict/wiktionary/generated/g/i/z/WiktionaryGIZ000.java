package org.swtk.commons.dict.wiktionary.generated.g.i.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGIZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gizzard", "{\"term\":\"gizzard\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027gesier\u0027 \u0027giser\u0027 et al. (French \u0027gésier\u0027 , from Latin {{m|la|gigēria}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A portion of the esophagus of either a bird or an annelid that contains ingested grit and is used to grind up ingested food before it is transferred to the stomach\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }