package org.swtk.commons.dict.wiktionary.generated.j.n.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJNA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jnana", "{\"term\":\"jnana\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027sc\u003ddeva|ज्ञान|tr\u003djñāna\u0027 (knowledge)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"knowledge, as acquired through meditation, that one\u0027s self (atman) is identical with Ultimate Reality Brahman\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"pure awareness that is free of conceptual encumbrances\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }