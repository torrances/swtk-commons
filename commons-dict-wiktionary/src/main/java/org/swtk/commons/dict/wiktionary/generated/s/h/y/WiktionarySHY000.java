package org.swtk.commons.dict.wiktionary.generated.s.h.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySHY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("shyness", "{\"term\":\"shyness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|shy|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being shy; a fear of social interactions\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"His \u0027\u0027shyness\u0027\u0027 kept him from asking her to the prom\", \"priority\":2}]}, \"synonyms\":{}}");

	add("shyster", "{\"term\":\"shyster\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"The origin is mostly likely from German \u0027scheißer\u0027 (lang\u003dde) from \u0027scheißen\u0027 (lang\u003dde) probably influenced by \u0027-ster\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who acts in a disreputable, unethical, or unscrupulous way, especially in the practice of law and politics\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Polly\u0027\u0027 (to security guard, referring to Dr. Feingarten): Are you going to let that \u0027\u0027shyster\u0027\u0027 in there\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Dr. Feingarten\u0027\u0027: I could sue you, Polly. A \u0027\u0027shyster\u0027\u0027 is a disreputable lawyer. I\u0027m a quack\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"From the motion picture \u0027w:S.O.B. SOB\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }