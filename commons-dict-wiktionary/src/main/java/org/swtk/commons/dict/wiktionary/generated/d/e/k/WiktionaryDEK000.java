package org.swtk.commons.dict.wiktionary.generated.d.e.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDEK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("deke", "{\"term\":\"deke\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Canadian English, a contraction of \u0027decoy\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A feint, fake, or other move made by the player with the puck to deceive a goaltender or other defender\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A series of feints, fakes, or other moves made by the player with the puck to deceive a goaltender or other defender\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A quick detour\", \"priority\":3}]}, \"synonyms\":{}}");

	add("dekameter", "{\"term\":\"dekameter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A decameter / decametre\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }