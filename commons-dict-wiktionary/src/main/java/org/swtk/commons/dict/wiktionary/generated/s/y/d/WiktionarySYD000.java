package org.swtk.commons.dict.wiktionary.generated.s.y.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySYD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sydneyite", "{\"term\":\"sydneyite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Sydney|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of Sydney, Australia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A native or resident of Sydney, Nova Scotia, Canada\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }