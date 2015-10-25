package org.swtk.commons.dict.wiktionary.generated.w.e.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWES000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("west", "{\"term\":\"west\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"Catalan\", \"English\", \"Spanish\", \"French\", \"old french (842-ca. 1400)\", \"Galician\", \"Italian\"], \"text\":\"From Old english (ca. 450-1100) \u0027west\u0027 from Proto-germanic {{m|gem-pro|*westrą}}. Compare Latin \u0027vesper\u0027 West Frisian and Dutch \u0027west\u0027 German \u0027west\u0027 Danish \u0027vest\u0027 Cognates include Old french (842-ca. 1400) {{m|fro|west}}, French {{m|fr|ouest}}, Spanish {{m|es|oeste}}, Catalan {{m|ca|oest}}, Galician {{m|gl|oeste}}, Italian {{m|it|ovest}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the four principal compass points, specifically 270°, conventionally directed to the left on maps; the direction of the setting sun at an equinox\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wesley", "{\"term\":\"wesley\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Several places in England, from Old english (ca. 450-1100) \u0027west\u0027 (west) + {{m|ang|lēah||wood, clearing}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"w:John John Wesley, founder of Methodism\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname since the 18th century, today often without any religious connotations\", \"priority\":2}]}, \"synonyms\":{}}");

	add("western", "{\"term\":\"western\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) \u0027westerne\u0027 from Proto-germanic {{m|gem-pro|*westrōnijaz}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a (\u0027film or movie, novel\", \"priority\":1}]}, \"synonyms\":{}}");

	add("westside", "{\"term\":\"westside\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|west|side|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The western side of a building, street, area etc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("westward", "{\"term\":\"westward\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) \u0027westweard\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The western region or countries; the west\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }