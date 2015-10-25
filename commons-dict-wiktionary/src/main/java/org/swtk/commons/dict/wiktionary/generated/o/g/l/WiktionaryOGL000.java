package org.swtk.commons.dict.wiktionary.generated.o.g.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOGL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ogler", "{\"term\":\"ogler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ogle|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who ogles\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }