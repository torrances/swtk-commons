package org.swtk.commons.dict.wiktionary.generated.a.i.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAIS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aisle", "{\"term\":\"aisle\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"Middle french (ca. 1400-1600) \u0027aisle\u0027 (Modern French \u0027aile\u0027 from Latin \u0027ala\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A wing of a building, notably in a church separated from the nave proper by piers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A clear path through rows of seating\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A clear corridor in a supermarket with shelves on both sides containing goods for sale\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Any path through an otherwise obstructed space\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }