package org.swtk.commons.dict.wiktionary.generated.d.a.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDAU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("daub", "{\"term\":\"daub\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"{{rfe|lang\u003den|The Old French entry doesn\u0027t say anything about whitewashing. Any connection to Proto-germanic {{m|gem-pro|*daupijaną||to dip {{gloss|in a liquid}}, to immerse}}?}}From Old french (842-ca. 1400) \u0027dauber\u0027 (whitewash)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Excrement or clay used as a bonding material in construction\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A soft coating of mud, plaster etc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A crude or amateurish painting\", \"priority\":3}]}, \"synonyms\":{}}");

	add("daughter", "{\"term\":\"daughter\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"German\", \"English\", \"middle english (1100-1500)\", \"Persian\", \"West Frisian\", \"mudhili gadaba\", \"ancient greek (to 1453)\", \"Armenian\", \"Lithuanian\", \"Dutch\", \"Sanskrit\", \"scots\", \"Swedish\", \"tokharian b\", \"tokharian a\"], \"text\":\"From Middle english (1100-1500) {{m|enm|doughter}}, from Old english (ca. 450-1100) {{m|ang|dōhtor}}, from Proto-germanic {{m|gem-pro|*duhtēr}} (compare Scots {{m|sco|dochter}}, West frisian {{m|fy|dochter}}, Dutch {{m|nl|dochter}}, German {{m|de|Tochter}}, Swedish {{m|sv|dotter}}), from Proto-indo-european {{m|ine-pro|*dʰugh₂tḗr}} (compare Ancient greek (to 1453) {{m|grc|θυγάτηρ|sc\u003dpolytonic}}, Mudhili gadaba {{m|cel-gau|duxtīr}}, Tokharian a {{m|xto|ckācar}}, Tokharian b {{m|txb|tkācer}}, Lithuanian {{m|lt|duktė̃}}, Armenian {{m|hy|դուստր}}, Persian {{m|fa|دختر|tr\u003ddoχtar|sc\u003dfa-Arab}}, Sanskrit {{m|sa|दुहितृ|sc\u003dDeva|tr\u003dduhitṛ}}).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One’s female offspring\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I already have a son, so I would like to have a \u0027\u0027daughter\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A female descendant\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A daughter language\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A nuclide left over from radioactive decay\", \"priority\":5}]}, \"synonyms\":{}}");

	add("daughterboard", "{\"term\":\"daughterboard\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|daughter|board|lang\u003den}} (modelled on \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A circuit board that is an extension of a motherboard or other card\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dauntlessness", "{\"term\":\"dauntlessness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The characteristic of being dauntless; fearlessness\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dauphinoise", "{\"term\":\"dauphinoise\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"French \u0027dauphinoise\u0027 from the w:Dauphiné|Dauphiné area of France, near the Italian border, whence this dish comes.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dish of sliced potatoes baked in milk, cream and cheese. It is also known as \u0027w:gratin gratin dauphinois\u0027.Category:en:Foods\", \"priority\":1}]}, \"synonyms\":{}}");

	add("daurade", "{\"term\":\"daurade\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"French\", \"Latin\"], \"text\":\"From French \u0027daurade\u0027 itself borrowed, through the intermediate of an Italian text, from Spanish \u0027dorada\u0027 partially from Latin {{m|la|aurāta}}, and influenced by the verb \u0027dorar\u0027 (gild, give a golden color) compare \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"sea brea\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }