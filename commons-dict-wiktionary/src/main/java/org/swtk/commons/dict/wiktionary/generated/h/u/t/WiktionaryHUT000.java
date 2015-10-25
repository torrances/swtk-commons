package org.swtk.commons.dict.wiktionary.generated.h.u.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hutch", "{\"term\":\"hutch\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"frankish\", \"old french (842-ca. 1400)\", \"Proto-Germanic\"], \"text\":\"Middle english (1100-1500) \u0027hucche\u0027 (storage chest) variation of Middle english (1100-1500) \u0027whucce\u0027 from Old english (ca. 450-1100) \u0027hwicce, hwice\u0027 \u0026quot;box, chest\u0026quot;. Spelling influenced by Old french (842-ca. 1400) {{m|fro|huche||chest}}, from {{m|la|hūtica}}, from a different Proto-germanic root, from Frankish *\u0027\u0027 () from Proto-Germanic {{m|gem-pro|*hudjā-}}, {{m|gem-pro|*hudjan-||box, hut, hutch}}. Akin to Old english (ca. 450-1100) \u0027hydan|hȳdan\u0027 \u0026quot;to conceal, hide\u0026quot;. More at hide\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cage in which a rabbit or rabbits are kept\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1960\u0027\u0027, w:Harper Harper Lee, \u0027w:To Kill a To Kill a Mockingbird\u0027, chapter 16\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"To reach the courtroom, on the second floor, one passed sundry sunless county cubbyholes: the tax assessor,... the circuit clerk, the judge of probate lived in cool dim \u0027\u0027hutches\u0027\u0027 that smelle\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A piece of furniture in which items may be displayed\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A measure of two Winchester bushels\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The case of a flour bolt\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A car on low wheels, in which coal is drawn in the mine and hoisted out of the pit\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A jig or trough for ore dressing or washing ore\", \"priority\":8}]}, \"synonyms\":{}}");

	add("huttonite", "{\"term\":\"huttonite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monoclinic-prismatic mineral containing oxygen, silicon, and thorium\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }