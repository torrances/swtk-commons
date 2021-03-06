package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"puff\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00837162\", \"00839336\", \"03863938\", \"04001232\", \"04040471\", \"06707855\", \"07644079\", \"11518288\"]}");
	add("{\"term\":\"puff adder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01731963\", \"01755673\"]}");
	add("{\"term\":\"puff batter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07643790\"]}");
	add("{\"term\":\"puff of air\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11518288\"]}");
	add("{\"term\":\"puff paste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07643540\"]}");
	add("{\"term\":\"puffball\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12989891\", \"13064686\"]}");
	add("{\"term\":\"puffbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01845145\"]}");
	add("{\"term\":\"puffed rice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07721302\"]}");
	add("{\"term\":\"puffed wheat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07721378\"]}");
	add("{\"term\":\"puffer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02657650\", \"07797948\"]}");
	add("{\"term\":\"pufferfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02657650\", \"07797948\"]}");
	add("{\"term\":\"puffery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06708926\"]}");
	add("{\"term\":\"puffin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02050268\"]}");
	add("{\"term\":\"puffiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04825154\", \"14338619\"]}");
	add("{\"term\":\"puffing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00836121\", \"00836527\"]}");
	add("{\"term\":\"puffinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02062943\"]}");
	add("{\"term\":\"puffinus puffinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02063222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }