package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jag\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00750789\", \"03597088\", \"03597242\", \"09343732\"]}");
	add("{\"term\":\"jagannath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09553647\"]}");
	add("{\"term\":\"jagannatha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09553647\"]}");
	add("{\"term\":\"jagatai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06940824\"]}");
	add("{\"term\":\"jagganath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09553647\"]}");
	add("{\"term\":\"jaggary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15087522\"]}");
	add("{\"term\":\"jaggedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04779930\"]}");
	add("{\"term\":\"jagger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11098640\"]}");
	add("{\"term\":\"jaggery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15087522\"]}");
	add("{\"term\":\"jagghery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15087522\"]}");
	add("{\"term\":\"jaghatai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06940824\"]}");
	add("{\"term\":\"jagua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12688343\"]}");
	add("{\"term\":\"jaguar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02131577\"]}");
	add("{\"term\":\"jaguarondi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02128341\"]}");
	add("{\"term\":\"jaguarundi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02128341\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }