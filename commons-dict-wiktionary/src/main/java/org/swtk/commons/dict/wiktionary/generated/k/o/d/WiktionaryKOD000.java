package org.swtk.commons.dict.wiktionary.generated.k.o.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKOD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kodomo", "{\"term\":\"kodomo\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"Japanese\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Japanese manga or anime specifically made for children\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }