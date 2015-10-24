package org.swtk.commons.dict.wiktionary.generated.w.a.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWAZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("wazz", "{\"term\":\"wazz\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An act of urination, a piss or a leak; urine\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, \u0027How to Be a Woman\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Here was a man who took so much cocaine that he took to keeping his urine in bottles, in the fridge, because he was scared that wizards ‘might steal it’. And yet despite storing his rotting \u0027\u0027wazz\u0027\u0027 next to his ham, it doesn\u0027t stop him being cool\", \"priority\":3}]}, \"synonyms\":{}}");

	add("wazoo", "{\"term\":\"wazoo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Probably a variant of {{m|en|kazoo}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the anus; ass\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }