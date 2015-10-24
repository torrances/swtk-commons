package org.swtk.commons.dict.wiktionary.generated.o.x.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOXF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oxfordian", "{\"term\":\"oxfordian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Oxford|ian|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or resident of Oxford\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One who believes that , 17th Earl of Oxford, wrote the plays traditionally attributed to\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }