package org.swtk.commons.dict.wiktionary.generated.e.u.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEUD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eudemonia", "{\"term\":\"eudemonia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027εὐδαιμονία\u0027 from \u0027εὐ-\u0027 (good) + \u0027δαίμων\u0027 (spirit, genius, demon) + \u0027-ία\u0027 (feminine abstract substantive)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"happiness, well-being\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person’s state of excellence characterized by objective flourishing across a lifetime, and brought about through the exercise of moral virtue, practical wisdom, and rationality\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }