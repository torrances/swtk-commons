package org.swtk.commons.dict.wiktionary.generated.l.y.m;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLYM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lyme", "{\"term\":\"lyme\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lyme disease\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lymph", "{\"term\":\"lymph\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From French \u0027lymphe\u0027 from Latin \u0027lympha\u0027 (water, water nymph) from Ancient greek (to 1453) \u0027νύμφη\u0027 (nymph) (English \u0027nymph\u0027 , of unknown origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Pure water\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A colourless, watery, bodily fluid carried by the lymphatic system, that consists mainly of white blood cells\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Discharge from a sore, inflammation etc\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, \u0027Super-Cannes\u0027, Fourth Estate 2011, p. 268\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"She lay face-down, an infected puncture point on the inside of her thigh oozing a faint \u0027\u0027lymph\", \"priority\":5}]}, \"synonyms\":{}}");

	add("lymphoblast", "{\"term\":\"lymphoblast\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lymph|alt1\u003dlympho-|blast|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An immature lymphocyte; they proliferate uncontrollably in lymphoblastic leukemia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lymphocyte", "{\"term\":\"lymphocyte\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lymph|alt1\u003dlympho-|cyte|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of white blood cell or leukocyte that is divided into two principal groups and a null group; B-lymphocytes, which produce antibodies in the humoral immune response, T-lymphocytes, which participate in the cell-mediated immune response and the null group, which contains natural killer cells, cytotoxic cells that participate in the innate immune response\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lymphocytotoxicity", "{\"term\":\"lymphocytotoxicity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|lympho|cytotoxicity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being lymphocytotoxic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lymphoproliferation", "{\"term\":\"lymphoproliferation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the excessive production of lymphocytes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lymphoreticulosis", "{\"term\":\"lymphoreticulosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"reticulosis of the lymph nodes\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }