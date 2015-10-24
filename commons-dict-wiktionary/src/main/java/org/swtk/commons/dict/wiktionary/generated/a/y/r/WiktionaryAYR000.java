package org.swtk.commons.dict.wiktionary.generated.a.y.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAYR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ayrab", "{\"term\":\"ayrab\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1991\u0027\u0027, Paul Mann, \u0027The traitor\u0027s contract\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"That\u0027s what I think of fuckin\u0027 \u0027\u0027Ayrabs\u0027\u0027. How\u0027s the old man takin\u0027 it\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Abraham Rothberg, \u0027The Holy Warriors\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"They all Muslims, and they don\u0027 wanna see a fuck-up like them \u0027\u0027Ayrabs\u0027\u0027 who blew up the Trade Center gittin\u0027 caught\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }