package org.swtk.commons.dict.wiktionary.generated.u.t.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUTT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("utterer", "{\"term\":\"utterer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|utter|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who utters something\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1961\u0027\u0027, \u0027Harvard Law Review\u0027 (volume 74, page 457\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Some maintain that arbitration avoids prejudiced juries and sympathy verdicts, but such remarks may merely reflect their \u0027\u0027utterers\u0027\u0027 antijury bias\", \"priority\":3}]}, \"synonyms\":{}}");

	add("utterness", "{\"term\":\"utterness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|utter|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being utter\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"We were appalled by the \u0027\u0027utterness\u0027\u0027 of the destruction\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }