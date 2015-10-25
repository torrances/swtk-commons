package org.swtk.commons.dict.wiktionary.generated.m.u.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMUA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("muay", "{\"term\":\"muay\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From w:Thai language|Thai \u0027มวย\u0027 (tr\u003dmuay)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of Muay Thai boxing. Two fighters trying to defeat each other in a match, usually in a ring with a referee and Muay Thai specific rules\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }