package org.swtk.commons.dict.wiktionary.generated.a.h.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAHM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ahmed", "{\"term\":\"ahmed\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027أَحْمَد\u0027 from \u0027حَمِدَ\u0027 (to thank or to praise)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"variant of Ahmad. \u0026lt;!-- From meaning to thank or to praise. --\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"of Arabic origin\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }