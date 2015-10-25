package org.swtk.commons.dict.wiktionary.generated.f.u.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFUE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fuel", "{\"term\":\"fuel\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"Old french (842-ca. 1400) \u0027fouaille\u0027 from \u0027feu\u0027 (fire)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Substance consumed to provide energy through combustion, or through chemical or nuclear reaction\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Substance that provides nourishment for a living organism; food\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Something that stimulates, encourages or maintains an action\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"His books were \u0027\u0027fuel\u0027\u0027 for the revolution\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Money is the \u0027\u0027fuel\u0027\u0027 for economy\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"That film was nightmare \u0027\u0027fuel\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }