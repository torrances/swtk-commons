package org.swtk.commons.dict.wiktionary.generated.w.y.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWYT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("wythe", "{\"term\":\"wythe\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"Middle english (1100-1500) from Old english (ca. 450-1100) \u0027withthe\u0027 (withe)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A unit of thickness in masonry construction defined by the quantity of masonry units 4\u0026quot; or greater\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"That wall has to be at least three \u0027\u0027wythes\u0027\u0027 of brick to support your load\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }