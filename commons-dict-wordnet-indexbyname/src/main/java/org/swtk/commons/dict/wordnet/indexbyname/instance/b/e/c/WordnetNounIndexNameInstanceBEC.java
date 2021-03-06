package org.swtk.commons.dict.wordnet.indexbyname.instance.b.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bechamel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07853338\"]}");
	add("{\"term\":\"bechamel sauce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07853338\"]}");
	add("{\"term\":\"bechtel crab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12656716\"]}");
	add("{\"term\":\"bechuana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09713014\"]}");
	add("{\"term\":\"beck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06890058\"]}");
	add("{\"term\":\"becker muscular dystrophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14184557\"]}");
	add("{\"term\":\"becket\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02821642\", \"10859617\"]}");
	add("{\"term\":\"becket bend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04196135\"]}");
	add("{\"term\":\"beckett\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10859950\"]}");
	add("{\"term\":\"beckley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09178463\"]}");
	add("{\"term\":\"beckman thermometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02821822\"]}");
	add("{\"term\":\"becomingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04907774\"]}");
	add("{\"term\":\"becquerel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10860159\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }