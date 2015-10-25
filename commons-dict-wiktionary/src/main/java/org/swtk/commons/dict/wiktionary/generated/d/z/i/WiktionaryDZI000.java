package org.swtk.commons.dict.wiktionary.generated.d.z.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDZI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dziggetai", "{\"term\":\"dziggetai\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Mongolian\"], \"text\":\"From Mongolian \u0027чихтэй|tr\u003dčixtéi\u0027 (eared)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Mongolian wild ass, a subspecies of the onager\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }