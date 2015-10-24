package org.swtk.commons.dict.wiktionary.generated.o.c.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOCA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ocarina", "{\"term\":\"ocarina\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Borrowed from Italian \u0027ocarina\u0027 (\u0026quot;little goose\u0026quot;), due to the musical instrument’s resemblance to the animal.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woodwind musical instrument that is closed at both sides to produce an enclosed space, and punctured with finger holes\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }