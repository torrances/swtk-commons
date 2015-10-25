package org.swtk.commons.dict.wiktionary.generated.n.u.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNUB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nubia", "{\"term\":\"nubia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old nubian\"], \"text\":\"From the name of the {{w|Noba}} tribe, from Old nubian\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An ancient kingdom in the valley of the upper Nile bordering present Egypt and Sudan\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nubia", "{\"term\":\"nubia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A light, knitted head scarf worn by women\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }