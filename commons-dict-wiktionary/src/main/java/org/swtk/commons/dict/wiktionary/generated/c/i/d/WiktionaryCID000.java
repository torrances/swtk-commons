package org.swtk.commons.dict.wiktionary.generated.c.i.d;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cider", "{\"term\":\"cider\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\"], \"text\":\"From Middle english (1100-1500) \u0027cidre\u0027 or \u0027sidre\u0027 from Old french (842-ca. 1400) \u0027cisdre\u0027 or \u0027sidre\u0027 (beverage made from fermented apples) from {{m|la|sīcera}}, from Ancient greek (to 1453) \u0027σίκερα\u0027 (fermented liquor, strong drink) of origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alcoholic, sparkling (carbonated) beverage made from fermented apples\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A non-alcoholic still beverage consisting of the (usually unfiltered and still containing pulp) juice of early-harvest apples\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"She liked an aged \u0027\u0027cider\u0027\u0027. He liked a harder \u0027\u0027cider\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A non-alcoholic carbonated beverage made from apples\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A non-alcoholic drink, normally carbonated; equivalent to soft drink\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A cup, glass or serving of any of these beverages\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }