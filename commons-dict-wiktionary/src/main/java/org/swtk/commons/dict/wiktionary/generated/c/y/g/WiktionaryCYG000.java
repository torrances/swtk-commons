package org.swtk.commons.dict.wiktionary.generated.c.y.g;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCYG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cygnet", "{\"term\":\"cygnet\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Middle english (1100-1500) \u0027cignet\u0027 \u0027signet\u0027 from Anglo-norman \u0027cignet\u0027 diminutive of Old french (842-ca. 1400) \u0027cigne\u0027 (swan) from Latin \u0027cygnus\u0027 \u0027cycnus\u0027 (swan) from Ancient greek (to 1453) \u0027κύκνος\u0027 (swan)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The immature young of a swan\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }