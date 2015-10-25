package org.swtk.commons.dict.wiktionary.generated.j.i.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJIC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jicama", "{\"term\":\"jicama\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\"], \"text\":\"From Mexican Spanish \u0027jícama\u0027 from \u0027xīcama\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The edible root of the yam bean, used in salads in Central America\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }