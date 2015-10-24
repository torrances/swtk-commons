package org.swtk.commons.dict.wiktionary.generated.r.a.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRAF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("raffia", "{\"term\":\"raffia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Malagasy\"], \"text\":\"From Malagasy \u0027rofia\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fibrous material used for tying plants, originating from the leaves of a palm tree of the genus\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }