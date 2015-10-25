package org.swtk.commons.dict.wiktionary.generated.o.d.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryODD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oddball", "{\"term\":\"oddball\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Compound of {{compound|odd|ball|lang\u003den}}. Attested since the 1940s, with the adjective appearing earlier than the noun.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An eccentric or unusual person\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oddness", "{\"term\":\"oddness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|odd|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the state or quality of being od\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"the result or product of being odd\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }