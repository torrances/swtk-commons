package org.swtk.commons.dict.wiktionary.generated.f.e.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFEV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fever", "{\"term\":\"fever\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Middle english (1100-1500) from Old french (842-ca. 1400) \u0027fievre\u0027 reinforced by native Old english (ca. 450-1100) {{m|ang|fēfor}}, from Latin \u0027febris\u0027 (a fever) from {{m|la|ferveō||to be hot, burn, boil}}; or perhaps literally \u0027a trembling\u0027, akin to Ancient Greek {{m|grc|φέβομαι||to flee in terror}}, \u0027φόβος\u0027 (flight, panic fear, fear, terror)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A higher than normal body temperature of a person (or, generally, a mammal), usually caused by disease\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"quot;I have a \u0027\u0027fever\u0027\u0027. I think I\u0027ve the flu.\u0026quot\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any of various diseases\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"scarlet feve\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A state of excitement (of a person or people\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Shakespear\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"an envious \u0027\u0027fever\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A group of stingrays\", \"priority\":8}]}, \"synonyms\":{}}");

	add("feverishness", "{\"term\":\"feverishness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|feverish|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being feverish\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }