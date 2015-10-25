package org.swtk.commons.dict.wiktionary.generated.u.t.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUTE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("uterus", "{\"term\":\"uterus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027uterus\u0027 (womb, belly)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An organ of the female reproductive system in which the young are conceived and develop until birth; the womb\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }