package org.swtk.commons.dict.wordnet.index.name.instance.f.l.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flood\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"07417630\", \"01260222\", \"00330645\", \"03370220\", \"13797906\", \"11475008\"]}");
	add("{\"term\":\"floodgate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04251743\", \"06257997\"]}");
	add("{\"term\":\"floodhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11475653\"]}");
	add("{\"term\":\"flooding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00703671\"]}");
	add("{\"term\":\"floodlight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03370220\"]}");
	add("{\"term\":\"floodplain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09304820\"]}");
	add("{\"term\":\"floor\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"03371147\", \"03371310\", \"05183868\", \"07993043\", \"09305269\", \"09304990\", \"09305114\", \"06670863\", \"03370837\", \"03370438\"]}");
	add("{\"term\":\"floorboard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03371567\", \"03371476\"]}");
	add("{\"term\":\"flooring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14895521\", \"03370438\"]}");
	add("{\"term\":\"floorshow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00521728\"]}");
	add("{\"term\":\"floorwalker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10117031\"]}");
	add("{\"term\":\"floozie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10682754\"]}");
	add("{\"term\":\"floozy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10682754\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }