package org.swtk.commons.dict.wiktionary.generated.u.p.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUPM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("upmass", "{\"term\":\"upmass\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|up|mass|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The payload mass carried up to orbit from Earth\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }