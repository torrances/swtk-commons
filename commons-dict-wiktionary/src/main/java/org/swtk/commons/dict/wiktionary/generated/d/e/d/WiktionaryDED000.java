package org.swtk.commons.dict.wiktionary.generated.d.e.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDED000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dedicatee", "{\"term\":\"dedicatee\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|dedicate|ee|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone to whom something is dedicate\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dedication", "{\"term\":\"dedication\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"Originated 1350–1400 from Middle english (1100-1500) \u0027dedicacioun\u0027 from Old french (842-ca. 1400) \u0027dedicacion\u0027 (lang\u003dfro) from Latin \u0027dedicatio\u0027 equivalent to \u0027dedicatus|dédicātus\u0027+\u0027-ion|-iōn\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of dedicating or the state of being dedicated\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A note addressed to a patron or friend, prefixed to a work of art as a token of respect, esteem, or affection\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A ceremony marking an official completion or opening\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The deliberate or negligent surrender of all rights to property\", \"priority\":4}]}, \"synonyms\":{}}");

	add("dedicator", "{\"term\":\"dedicator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"one who dedicates\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dedifferentiation", "{\"term\":\"dedifferentiation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|de|differentiation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The loss or reversal of differentiation\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dedovshchina", "{\"term\":\"dedovshchina\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"From Russian \u0027дедовщи́на\u0027 () - дед + -ов- + -щин- + ending - lit.: \u0027\u0026quot;grandfatherism\u0026quot;\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"hazing, the name given to the informal system of subjection and bullying of new junior conscripts, formerly to the Soviet armed Armed Forces and today to the Russian, Ukrainian, etc. armed forces\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deducer", "{\"term\":\"deducer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|deduce|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, deduces\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deductee", "{\"term\":\"deductee\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|deduct|ee|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One from whom tax is deducted\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deductibility", "{\"term\":\"deductibility\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|deductible|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The ability to be deducted, such as from one\u0027s taxe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"There is no doubt about the \u0027\u0027deductibility\u0027\u0027 of these expenses\", \"priority\":2}]}, \"synonyms\":{}}");

	add("deductivism", "{\"term\":\"deductivism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|deductive|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The use of deductive reasoning\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }