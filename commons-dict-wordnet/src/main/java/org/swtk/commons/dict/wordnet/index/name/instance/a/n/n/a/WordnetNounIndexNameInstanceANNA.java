package org.swtk.commons.dict.wordnet.index.name.instance.a.n.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANNA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13726523\"]}");
	add("{\"term\":\"annaba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08724061\"]}");
	add("{\"term\":\"annalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09814238\"]}");
	add("{\"term\":\"annals\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06527653\", \"06609970\"]}");
	add("{\"term\":\"annam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09185985\"]}");
	add("{\"term\":\"annamese\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06950006\", \"09766522\"]}");
	add("{\"term\":\"annamite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06950006\"]}");
	add("{\"term\":\"annapolis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09116801\"]}");
	add("{\"term\":\"annapurna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09220823\", \"09550694\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }