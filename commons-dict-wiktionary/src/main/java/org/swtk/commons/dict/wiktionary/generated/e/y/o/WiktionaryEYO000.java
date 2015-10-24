package org.swtk.commons.dict.wiktionary.generated.e.y.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEYO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eyot", "{\"term\":\"eyot\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027eyt\u0027 \u0027eit\u0027 from Old english (ca. 450-1100) {{m|ang|īġeoþ}}, {{m|ang|īgoþ}}, \u0027iggaþ\u0027 \u0027iggoþ\u0027 (ait, eyot, islet, small island) diminutive of {{m|ang|īġ}}, {{m|ang|ēġ}}, {{m|ang|īeġ||island}} which constitutes the first element of {{m|en|island}}. See also {{l|en|ait}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A little island, especially in a river or lake\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }