package org.swtk.commons.dict.wiktionary.generated.b.l.y;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBLY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("blythe", "{\"term\":\"blythe\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"From Old english (ca. 450-1100) \u0027blīþe\u0027 (merry)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of a number of places in England and the U.S.A\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"either derived from a nickname, or from the English places\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname, reinforced by the word blithe\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }