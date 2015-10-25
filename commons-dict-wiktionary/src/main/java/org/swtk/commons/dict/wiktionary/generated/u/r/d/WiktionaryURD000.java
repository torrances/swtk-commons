package org.swtk.commons.dict.wiktionary.generated.u.r.d;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryURD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("urdu", "{\"term\":\"urdu\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\"], \"text\":\"From Persian \u0027lang\u003dfa\u0027 from {{m|trk-pro|*ordu||army, camp}} ( \u0026gt; Azeri \u0027ordu\u0027 Turkish \u0027ordu\u0027 Turkmen \u0027oorda\u0027 . Compare \u0027horde\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Indo-Aryan language with native speakers mainly in Pakistan and North India\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }