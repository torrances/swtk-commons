package org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12663361\"]}");
	add("{\"term\":\"gear\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03435869\", \"03436153\", \"03436655\", \"03435461\"]}");
	add("{\"term\":\"gear box\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03436480\"]}");
	add("{\"term\":\"gear case\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03436480\"]}");
	add("{\"term\":\"gear lever\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03437039\"]}");
	add("{\"term\":\"gear mechanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03436153\"]}");
	add("{\"term\":\"gear wheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03435461\"]}");
	add("{\"term\":\"gearbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03436480\"]}");
	add("{\"term\":\"geared wheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03435461\"]}");
	add("{\"term\":\"gearing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03436655\"]}");
	add("{\"term\":\"gearset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03436971\"]}");
	add("{\"term\":\"gearshift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03437039\"]}");
	add("{\"term\":\"gearstick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03437039\"]}");
	add("{\"term\":\"geartrain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03436655\"]}");
	add("{\"term\":\"geastraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13065301\"]}");
	add("{\"term\":\"geastrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13065787\"]}");
	add("{\"term\":\"geastrum coronatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13065970\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }