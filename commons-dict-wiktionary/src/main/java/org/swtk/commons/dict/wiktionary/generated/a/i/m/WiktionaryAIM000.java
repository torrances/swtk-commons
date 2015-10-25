package org.swtk.commons.dict.wiktionary.generated.a.i.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAIM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aimer", "{\"term\":\"aimer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|aim|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who aims; one who is responsible for aiming\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aimlessness", "{\"term\":\"aimlessness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|aimless|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being aimless, or without purpose or direction\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aimworthiness", "{\"term\":\"aimworthiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of having good aim (with a weapon\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }