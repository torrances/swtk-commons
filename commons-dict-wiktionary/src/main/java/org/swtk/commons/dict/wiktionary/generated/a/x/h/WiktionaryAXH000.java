package org.swtk.commons.dict.wiktionary.generated.a.x.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAXH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("axhandle", "{\"term\":\"axhandle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|ax|handle|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The handle of an ax\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }