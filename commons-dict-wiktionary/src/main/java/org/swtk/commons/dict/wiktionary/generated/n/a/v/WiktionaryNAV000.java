package org.swtk.commons.dict.wiktionary.generated.n.a.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNAV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("navy", "{\"term\":\"navy\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"Persian\", \"old french (842-ca. 1400)\", \"Latin\", \"Tamil\", \"anglo-norman\"], \"text\":\"From Anglo-norman Old french (842-ca. 1400) \u0027navie\u0027 from Latin {{m|la|nāvigia}} \u0026lt; {{m|la|nāvigium}}, from Latin {{m|la|nāvigō}}, {{m|la|nāvis||boat}}, from Proto-indo-european {{m|ine-pro|*néh₂us}}. Compare Ancient Greek \u0027ναῦς\u0027 (ship) Persian \u0027ناو\u0027 (boat, warship) Tamil \u0027நாவாய்\u0027 Old english (ca. 450-1100) {{m|ang|nōwend||mariner, sailor}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A country\u0027s entire sea force, including ships and personnel\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d10|passage\u003dThe skipper Mr. Cooke had hired at Far Harbor was a God-fearing man with a luke warm interest in his new billet and employer, and had only been prevailed upon to take charge of the yacht after the offer of an emolument equal to half a year\u0027s sea pay of an ensign in the \u0027\u0027navy\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A governmental department in charge of a country\u0027s sea force\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A dark blue colour, usually called \u0027\u0027navy blue\", \"priority\":4}]}, \"synonyms\":{}}");

	add("navajoite", "{\"term\":\"navajoite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Navajo|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monoclinic-prismatic dark brown mineral containing hydrogen, oxygen, and vanadium\", \"priority\":1}]}, \"synonyms\":{}}");

	add("navalism", "{\"term\":\"navalism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|naval|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"naval militarism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("navelwort", "{\"term\":\"navelwort\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|navel|wort|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A European perennial succulent herb with round, peltate leaves with a central depression\", \"priority\":1}]}, \"synonyms\":{}}");

	add("navigability", "{\"term\":\"navigability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being navigable\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }