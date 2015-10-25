package org.swtk.commons.dict.wiktionary.generated.r.i.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRIS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("rishabha", "{\"term\":\"rishabha\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The founder of Jainism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("risker", "{\"term\":\"risker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|risk|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who risks or hazards something\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }