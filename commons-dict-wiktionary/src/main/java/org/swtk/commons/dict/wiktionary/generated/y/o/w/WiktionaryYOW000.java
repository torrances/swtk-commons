package org.swtk.commons.dict.wiktionary.generated.y.o.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYOW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yowie", "{\"term\":\"yowie\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From \u0027lang\u003dkld|yuwi\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unidentified yeti-like animal said to exist in parts of Australia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }