package org.swtk.commons.dict.wiktionary.generated.l.l.o;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLLO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lloyd", "{\"term\":\"lloyd\", \"etymology\":{\"influencers\":[], \"languages\":[\"Welsh\", \"English\"], \"text\":\"From Welsh \u0027llwyd\u0027 (gray, gray-haired)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"of Welsh origin, from a nickname for someone with gray hair\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }