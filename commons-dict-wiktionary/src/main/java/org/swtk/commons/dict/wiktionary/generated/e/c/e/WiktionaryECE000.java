package org.swtk.commons.dict.wiktionary.generated.e.c.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryECE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ecesis", "{\"term\":\"ecesis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) {{m|grc|οἴκισις||colonization}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The process of successful establishment of a plant or animal species in a habitat that was barren previously/ or was left barren due to some catastrophe\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }