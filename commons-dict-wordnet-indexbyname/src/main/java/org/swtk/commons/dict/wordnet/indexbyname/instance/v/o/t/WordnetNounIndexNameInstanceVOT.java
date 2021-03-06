package org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"votary\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10779488\", \"10779650\", \"10779867\"]}");
	add("{\"term\":\"vote\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05865749\", \"08497673\", \"05193574\", \"00183062\", \"00184354\"]}");
	add("{\"term\":\"vote counter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10718595\"]}");
	add("{\"term\":\"vote of confidence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07268150\"]}");
	add("{\"term\":\"voter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10780008\"]}");
	add("{\"term\":\"voter turnout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05865749\"]}");
	add("{\"term\":\"voting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00184354\"]}");
	add("{\"term\":\"voting age\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15177634\"]}");
	add("{\"term\":\"voting booth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04549273\"]}");
	add("{\"term\":\"voting machine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04549381\"]}");
	add("{\"term\":\"voting precinct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08556293\"]}");
	add("{\"term\":\"voting right\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05195635\"]}");
	add("{\"term\":\"voting stock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13441394\"]}");
	add("{\"term\":\"voting system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05912729\"]}");
	add("{\"term\":\"voting trust\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13384877\"]}");
	add("{\"term\":\"votyak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06969534\", \"09664585\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }