package org.swtk.commons.dict.wiktionary.generated.g.e.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGET000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("getter", "{\"term\":\"getter\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"middle french (ca. 1400-1600)\", \"old french (842-ca. 1400)\"], \"text\":\"Specifically from Old french (842-ca. 1400) \u0027geter\u0027 the northern variant of \u0027jeter\u0027 (to throw)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who gets\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1838\u0027\u0027, William Evans, ‎Thomas Evans, \u0027The Friends\u0027 Library\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"rich men and the eager \u0027\u0027getters\u0027\u0027 of this worl\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A function used to retrieve the value of some property of an object, contrasted with the setter\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A material which is included in a vacuum system or device for removing gas by sorption\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }