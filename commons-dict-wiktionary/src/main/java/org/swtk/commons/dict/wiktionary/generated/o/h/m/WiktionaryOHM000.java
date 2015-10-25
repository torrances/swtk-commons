package org.swtk.commons.dict.wiktionary.generated.o.h.m;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOHM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ohmage", "{\"term\":\"ohmage\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ohm|age|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An amount of electrical resistance measured in ohms\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ohmmeter", "{\"term\":\"ohmmeter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A portable device for measuring relatively small values of electrical resistance\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }