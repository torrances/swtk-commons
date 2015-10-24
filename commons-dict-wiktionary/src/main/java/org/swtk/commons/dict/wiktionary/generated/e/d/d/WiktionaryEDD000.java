package org.swtk.commons.dict.wiktionary.generated.e.d.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEDD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eddish", "{\"term\":\"eddish\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"Origin uncertain; but probably from Middle english (1100-1500) \u0027eddish\u0027 lang\u003denm}}, ultimately from Old english (ca. 450-1100) \u0027edisc\u0027 (an eddish or aftermath; pasture; enclosed pasture, park) equivalent to {{confix|ed|ish|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An aftergrowth of grass (or other plants) which grows after it has been been mowed; also, a field of such growth\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1913\u0027\u0027, DH Lawrence, Sons and Lovers\u0027, chapter\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The hay was gathered from the fields, and the cattle turned onto the \u0027\u0027eddish\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }