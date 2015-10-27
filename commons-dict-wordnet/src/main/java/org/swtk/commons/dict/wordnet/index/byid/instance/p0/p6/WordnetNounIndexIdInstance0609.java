package org.swtk.commons.dict.wordnet.index.byid.instance.p0.p6;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexIdInstance0609 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("06090110", "{\"term\":\"physiology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05012229\", \"06090110\"]}");
	add("06091190", "{\"term\":\"neurophysiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06091190\"]}");
	add("06091421", "{\"term\":\"neuroscience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06091421\"]}");
	add("06091613", "{\"term\":\"brain science\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06091613\"]}");
	add("06091724", "{\"term\":\"cognitive neuroscience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06091724\"]}");
	add("06091898", "{\"term\":\"hemodynamics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06091898\"]}");
	add("06092047", "{\"term\":\"kinesiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092047\"]}");
	add("06092198", "{\"term\":\"myology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092198\"]}");
	add("06092297", "{\"term\":\"palaeoecology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092297\"]}");
	add("06092297", "{\"term\":\"paleoecology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092297\"]}");
	add("06092422", "{\"term\":\"radiobiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092422\"]}");
	add("06092560", "{\"term\":\"sociobiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092560\"]}");
	add("06092831", "{\"term\":\"zoological science\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092831\"]}");
	add("06092831", "{\"term\":\"zoology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06092831\", \"08009721\"]}");
	add("06094057", "{\"term\":\"chemical science\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06094057\"]}");
	add("06094057", "{\"term\":\"chemistry\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13863157\", \"14604732\", \"06094057\"]}");
	add("06098583", "{\"term\":\"organic chemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06098583\"]}");
	add("06098902", "{\"term\":\"inorganic chemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06098902\"]}");
	add("06099035", "{\"term\":\"physical chemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099035\"]}");
	add("06099316", "{\"term\":\"phytochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099316\"]}");
	add("06099445", "{\"term\":\"electrochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099445\"]}");
	add("06099652", "{\"term\":\"femtochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099652\"]}");
	add("06099892", "{\"term\":\"geochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099892\"]}");
	add("06099985", "{\"term\":\"photochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099985\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> ids() { 		return map.keySet(); 	} }