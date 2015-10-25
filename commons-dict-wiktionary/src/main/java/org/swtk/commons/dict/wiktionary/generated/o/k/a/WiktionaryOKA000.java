package org.swtk.commons.dict.wiktionary.generated.o.k.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOKA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("okara", "{\"term\":\"okara\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027おから\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a food made from soybean pulp; a by-product of soy milk production\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }