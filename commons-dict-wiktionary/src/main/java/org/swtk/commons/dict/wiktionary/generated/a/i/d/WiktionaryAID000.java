package org.swtk.commons.dict.wiktionary.generated.a.i.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aids", "{\"term\":\"aids\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"acquired immune deficiency syndrome\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aider", "{\"term\":\"aider\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|aid|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One that assists\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aidman", "{\"term\":\"aidman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|aid|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An army medical corpsman attached to a field unit\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }