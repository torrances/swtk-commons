package org.swtk.commons.dict.wiktionary.generated.b.a.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBAV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bavardage", "{\"term\":\"bavardage\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"French\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"chatter, banter\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bavette", "{\"term\":\"bavette\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a type of thick spaghett\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a flank steak\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }