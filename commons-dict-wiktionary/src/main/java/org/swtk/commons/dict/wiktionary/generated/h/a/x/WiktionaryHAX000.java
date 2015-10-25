package org.swtk.commons.dict.wiktionary.generated.h.a.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHAX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("haxx", "{\"term\":\"haxx\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"hacking; the act of hacking something\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"He did beat me on that level so hard, so he must have been doing \u0027\u0027haxx\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a situation where hacking is present\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The game was pretty good, but the multiplayer was so \u0027\u0027haxx\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }