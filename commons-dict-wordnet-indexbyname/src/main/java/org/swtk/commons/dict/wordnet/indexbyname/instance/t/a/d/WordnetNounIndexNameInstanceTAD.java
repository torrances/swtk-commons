package org.swtk.commons.dict.wordnet.indexbyname.instance.t.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13785325\"]}");
	add("{\"term\":\"tadalafil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04390624\"]}");
	add("{\"term\":\"tadarida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02151949\"]}");
	add("{\"term\":\"tadarida brasiliensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02152305\"]}");
	add("{\"term\":\"tadeus reichstein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11277385\"]}");
	add("{\"term\":\"tadeusz andrzej bonawentura kosciuszko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11129718\"]}");
	add("{\"term\":\"tadirida femorosacca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02152513\"]}");
	add("{\"term\":\"tadjik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09043331\"]}");
	add("{\"term\":\"tadorna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01851989\"]}");
	add("{\"term\":\"tadpole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02472103\"]}");
	add("{\"term\":\"tadpole shrimp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01998934\"]}");
	add("{\"term\":\"tadzhik\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06987050\", \"08501820\", \"09043331\", \"09753438\"]}");
	add("{\"term\":\"tadzhikistan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09043331\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }