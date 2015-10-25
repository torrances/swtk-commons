package org.swtk.commons.dict.wiktionary.generated.l.i.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLIQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("liquamen", "{\"term\":\"liquamen\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fish sauce used in Ancient Rome\", \"priority\":1}]}, \"synonyms\":{}}");

	add("liqueur", "{\"term\":\"liqueur\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}} \u0027liqueur\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A flavored alcoholic beverage that is usually very sweet and contains a high percentage of alcohol. Cordials are a type of liqueur manufactured using the infusion process as opposed to the essence and distillation processes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("liquidation", "{\"term\":\"liquidation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of exchange of an asset of lesser liquidity with a more liquid one, such as cash\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The selling of the assets of a business as part of the process of dissolving the business\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The store is having a \u0027\u0027liquidation\u0027\u0027 sale, everything must go as they go out of business\", \"priority\":3}]}, \"synonyms\":{}}");

	add("liquidity", "{\"term\":\"liquidity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or property of being liquid\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An asset\u0027s property of being able to be sold without affecting its value; the degree to which it can be easily converted into cash\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Some stocks are traded so rarely that they lack \u0027\u0027liquidity\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Availability of cash over short term: ability to service short-term debt\", \"priority\":4}]}, \"synonyms\":{}}");

	add("liquidizer", "{\"term\":\"liquidizer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A machine to chop or puree food; a blender\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1976\u0027\u0027, \u0027Australian Journal of Plant Physiology\u0027, volume 3, issues 1-3, page 154\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"tissue was disrupted using a Moulinex \u0027\u0027liquidizer\u0027\u0027 and 0-5% bovine serum albumin was added to the isolating and resuspending media\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Rosamunde Pilcher, \u0027Flowers In the Rain \u0026amp; Other Stories\u0027 (ISBN 1250032229\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"She bought herself a second-hand Mini and in no time at all was busy as a bee, driving herself around London with pots and pans, cooking knives and \u0027\u0027liquidizers\u0027\u0027 all piled up on the back seat\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Leah Leneman, \u0027The Tofu Cookbook: Over 150 quick and easy recipes\u0027 (ISBN 0007524463\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Place a cupful of the soaked beans in a \u0027\u0027liquidizer\u0027\u0027, add a cupful of cold water and blend\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }