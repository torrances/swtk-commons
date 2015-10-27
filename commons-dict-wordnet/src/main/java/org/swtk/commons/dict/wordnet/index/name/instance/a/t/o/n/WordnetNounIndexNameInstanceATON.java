package org.swtk.commons.dict.wordnet.index.name.instance.a.t.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09535010\"]}");
	add("{\"term\":\"atonalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06877064\"]}");
	add("{\"term\":\"atonality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06877064\"]}");
	add("{\"term\":\"atonement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00095941\", \"13313810\"]}");
	add("{\"term\":\"atonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14569447\"]}");
	add("{\"term\":\"atonicity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14569447\"]}");
	add("{\"term\":\"atony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14569447\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }