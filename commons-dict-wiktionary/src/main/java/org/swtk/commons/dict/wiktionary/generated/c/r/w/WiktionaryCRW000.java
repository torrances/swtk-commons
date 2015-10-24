package org.swtk.commons.dict.wiktionary.generated.c.r.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCRW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("crwth", "{\"term\":\"crwth\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"{{borrowing|cy|crwth|lang\u003den}}, from Proto-celtic {{m|cel-pro|*krottos||round thing}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An archaic stringed instrument associated particularly with Wales, though once played widely in Europe, and characterized by a vaulted back and enough space for the player to stop each of the six strings on the fingerboard\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }