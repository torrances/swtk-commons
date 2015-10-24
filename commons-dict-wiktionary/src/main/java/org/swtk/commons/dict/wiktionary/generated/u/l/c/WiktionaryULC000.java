package org.swtk.commons.dict.wiktionary.generated.u.l.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryULC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ulcer", "{\"term\":\"ulcer\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027ulcere\u0027 from Latin \u0027ulcus\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An open sore of the skin, eyes or mucous membrane, often caused by an initial abrasion and generally maintained by an inflammation and/or an infection\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"peptic ulce\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Anything that festers and corrupts like an open sore; a vice in character\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }