package org.swtk.commons.dict.wiktionary.generated.y.e.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYET000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yeti", "{\"term\":\"yeti\", \"etymology\":{\"influencers\":[], \"languages\":[\"Tibetan\", \"English\"], \"text\":\"From Tibetan {{m|bo|གཡའ་དྲེད||rock bear}}, compound of {{m|bo|གཡའ||rocky or rocky place}} and {{m|bo|དྲེད||bear}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unidentified humanoid animal said to live in the Himalayas\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }